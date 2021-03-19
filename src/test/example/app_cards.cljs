(ns example.app-cards
  (:require
    [example.app :as app]
    [reagent.core] ; needed for dc/defcard-rg
    [devcards.core :as dc]))

(dc/defcard-doc
  "# Markdown

  It's very easy to make some words **bold** and other words *italic* with Markdown.
  You can even [link to shadow-cljs!](https://github.com/thheller/shadow-cljs)")

(declare counter)

(dc/defcard-rg counter
  [app/app])