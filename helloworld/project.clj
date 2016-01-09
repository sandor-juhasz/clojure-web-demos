(defproject helloworld "0.1.0-SNAPSHOT"
  :description "Clojure Web Demos - Hello World"
  :url "https://github.com/sandor-juhasz/clojure-web-demos"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring { :handler helloworld.core/handler}
  :profiles { :dev { :dependencies [[ring/ring-mock "0.3.0"]]}}
  :main helloworld.core)
