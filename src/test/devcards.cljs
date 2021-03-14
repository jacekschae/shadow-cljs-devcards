(ns test.devcards
  (:require [devcards.core :as dc :include-macros true]
            [devcards.system :refer [app-state prevent-> set-current-path!]]
            ["highlight.js" :as hljs]
            ["marked" :as marked]))

;; devcards uses global DevcardsSyntaxHighlighter and DevcardsMarked
;; ex. https://github.com/bhauman/devcards/blob/master/src/devcards/util/markdown.cljs#L28
;; therefore we need to define them
(js/goog.exportSymbol "DevcardsSyntaxHighlighter" hljs)
(js/goog.exportSymbol "DevcardsMarked" marked)

(defn ^:export init []
  (dc/start-devcard-ui!))