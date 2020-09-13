(ns app.main
   (:require [reagent.core :as r]
             [reagent.dom :as rdom]))

(defn main! []
  (println "App loadeddd!"))

(defn app []
  [:p (str "Hellloo" "World!")])

(defn start []
  (js/console.log "Starting...")
  (rdom/render [app]
            (.getElementById js/document "app")))

(start)