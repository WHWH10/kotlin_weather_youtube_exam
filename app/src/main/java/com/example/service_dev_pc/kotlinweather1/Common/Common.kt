package com.example.service_dev_pc.kotlinweather1.Common

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by service_dev_pc on 2017-10-26.
 */

object Common{
    val API_KEY = "cd5cdde7540667a9e3ebaa0dabc2ac67"
    val API_LINK = "http://api.openweathermap.org/data/2.5/weather"

    fun apiRequest(lat:String, lng:String):String{
        var sb = StringBuilder(API_LINK)
        sb.append("?lat=${lat}&lon=${lng}&APPID=${API_KEY}&units=metric")
        return sb.toString()
    }

    fun unixTimeStampToDateTime(unixTimeStamp:Double):String{
        val dateFormat = SimpleDateFormat("HH:mm")
        val date = Date()
        date.time = unixTimeStamp.toLong()*1000
        return dateFormat.format(date)
    }

    fun getImage(icon:String):String{
        return "http://openweathermap.org/img/w/${icon}.png"
    }

    val dateNow:String
        get() {
            val dateFormat = SimpleDateFormat("dd MM yyyy HH:mm")
            val date=Date()
            return dateFormat.format(date)
        }
}