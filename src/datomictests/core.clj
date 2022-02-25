(ns datomictests.core
  (:require [datalevin.core :as d])
  )

(def schema {:name {:db/valueType :db.type/string}
             :height {:db/valueType :db.type/float}})

(def conn (d/get-conn "/tmp/datalevin/mydb" schema))

(d/transact! conn [{:name "John" :height 1.73}
                   {:name "Peter" :height 1.92}])