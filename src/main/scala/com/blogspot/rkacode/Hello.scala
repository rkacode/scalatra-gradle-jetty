package com.blogspot.rkacode

import org.scalatra.ScalatraServlet


class Hello extends ScalatraServlet {

  get("/world") {
    <h1>Hello world</h1>
  }

}
