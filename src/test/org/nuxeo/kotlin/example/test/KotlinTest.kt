package org.nuxeo.kotlin.example.test

import org.junit.Assert.assertEquals
import org.junit.Test

class HelloTest {
    @Test fun testAssert(): Unit {
        assertEquals("Same", "Same")
    }
}