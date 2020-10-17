package com.princeInc.Timer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.princeInc.Timer.util.NotificationUtil
import com.princeInc.Timer.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)


        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

    }
}