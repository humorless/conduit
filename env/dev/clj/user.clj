(ns user
  (:require [conduit.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [conduit.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'conduit.core/repl-server))

(defn stop []
  (mount/stop-except #'conduit.core/repl-server))

(defn restart []
  (stop)
  (start))


