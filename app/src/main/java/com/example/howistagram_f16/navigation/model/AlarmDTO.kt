package com.example.howistagram_f16.navigation.model

data class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,

    /*
    Kind types
    0 : Like alarm
    1 : Comment alarm
    2 : Follow alarm
    */
    var kind : Int? = null,
    var message : String? = null,
    var timestamp : Long? = null
)