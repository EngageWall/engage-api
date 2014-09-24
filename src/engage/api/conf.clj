(ns engage.api.conf
  (:import [org.slf4j LoggerFactory]
           [ch.qos.logback.classic.joran JoranConfigurator]
           [ch.qos.logback.core.util StatusPrinter])
  (:require [nomad :refer [defconfig]]
            [clojure.java.io :as io]
            [clojure.tools.logging :as log]))

(api-config)

(defconfig api-config
  (io/file "conf/config.edn"))

(defn load-logback []
  (let [logback-file (-> (api-config) :logback :file io/file)
        context (LoggerFactory/getILoggerFactory)
        configurator (doto (JoranConfigurator.)
                       (.setContext context))]
    (.reset context)
    (.doConfigure configurator logback-file)
    (StatusPrinter/printInCaseOfErrorsOrWarnings context)
    (log/info "Loaded logback configuration")))
