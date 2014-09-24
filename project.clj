(defproject engage-api "0.1.0-SNAPSHOT"
  :description "Engage wall api"
  :url "https://github.com/EngageWall"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.match "0.2.1"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.cognitect/transit-clj "0.8.259"]
                 [jarohen/nomad "0.7.0"]
                 [http-kit "2.1.16"]
                 [liberator "0.12.1"]
                 [korma "0.4.0"]
                 [org.postgresql/postgresql "9.3-1102-jdbc41"]
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [ch.qos.logback/logback-core "1.1.2"]
                 [org.apache.logging.log4j/log4j-to-slf4j "2.0.2"]]
  :main ^:skip-aot engage-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
