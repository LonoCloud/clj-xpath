(defproject com.github.jeffdik/clj-xpath "1.4.6-SNAPSHOT"
  :description          "Simplified XPath from Clojure."
  :url                  "http://github.com/kyleburton/clj-xpath"
  :lein-release         {:deploy-via :clojars}
  :license              {:name "Eclipse Public License - v 1.0"
                         :url "http://www.eclipse.org/legal/epl-v10.html"
                         :distribution :repo
                         :comments "Same as Clojure"}
  :repositories         {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :local-repo-classpath true
  :plugins [[lein-release/lein-release "1.0.4"]]
  :profiles             {:dev {:dependencies [[swank-clojure             "1.4.3"]
                                              [midje                     "1.4.0"]
                                              [org.clojure/clojure       "1.7.0"]
                                              [org.clojure/tools.logging "0.3.0"]
                                              [cider/cider-nrepl         "0.7.0"]]}
                         ;; NB: the use of ex-info prevents 1.3 from being supported
                         ;;:1.2 {:dependencies [[org.clojure/clojure "1.2.0"]]}
                         ;;:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
                         ;;:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
                         :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
                         :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
                         :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :aliases              {"all" ["with-profile" "1.5:1.6:1.7"]}
  :global-vars          {*warn-on-reflection* true})
