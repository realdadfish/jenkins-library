package com.example

class Util {
    static String serverTime(context) {
        return context.sh(script: "date", returnStdout: true).trim()
    }
}
