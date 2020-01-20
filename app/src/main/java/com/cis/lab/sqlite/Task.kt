package com.cis.lab.androidsqlite

class Task {
    var id = 0
    var taskname: String = ""

    constructor(taskname: String) {
        this.taskname = taskname
    }
    constructor(id:Int,Taskname:String) {
        this.id = id
        this.taskname = taskname
    }
}