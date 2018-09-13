package com.smile.love.utils


import com.smile.love.user.User

import scala.collection.mutable.ListBuffer

class OnlineHelper {
    var listBuffer=  new ListBuffer[User]
}
object OnlineHelper {
    val onlineHelper = new OnlineHelper
    def  addUser(user:User):Unit={
        onlineHelper.listBuffer += user
    }
    def removeUser(user:User): Unit ={
        onlineHelper.listBuffer-=user
    }
    def count():Int = {
        onlineHelper.listBuffer.size
    }
    def isOnline(user:User):Boolean = {
        onlineHelper.listBuffer.contains(user)
    }
}
