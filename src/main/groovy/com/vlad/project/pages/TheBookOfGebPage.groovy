package com.vlad.project.pages

import geb.Page

class TheBookOfGebPage extends Page {

    static at = { title.startsWith("The Book Of Geb") }
}