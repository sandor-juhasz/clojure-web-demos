(ns helloworld.core
  (:require [ring.adapter.jetty :refer (run-jetty)])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<html><body><h1>Hello World!</h1></body></html>"})

(defn -main [& args]
  (println "Hello World demo web application")
  (run-jetty handler {:port 8081 :join? false}))
