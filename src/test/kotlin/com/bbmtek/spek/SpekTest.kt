package com.bbmtek.spek

import org.assertj.core.api.Assertions.fail
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class SpekTest : Spek({
    it("fails", {
        fail("com.bbmtek.spek.SpekTest fails")
    })
})
