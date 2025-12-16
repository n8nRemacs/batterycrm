package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: classes7.dex */
public class ActivityUtil {
    public static PendingIntent getActivities(Context context, int i12, Intent[] intentArr, int i13) {
        if (context == null) {
            Logger.w("ActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i12, intentArr, i13);
        } catch (RuntimeException e12) {
            Logger.e("ActivityUtil", "dealType rethrowFromSystemServer:", e12);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (activityManager = (ActivityManager) ContextCompat.getSystemService(context, "activity")) == null) {
            return false;
        }
        try {
            runningAppProcesses = activityManager.getRunningAppProcesses();
        } catch (RuntimeException e12) {
            Logger.w("ActivityUtil", "activityManager getRunningAppProcesses occur exception: ", e12);
            runningAppProcesses = null;
        }
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            String str = runningAppProcessInfo.processName;
            if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                Logger.v("ActivityUtil", "isForeground true");
                return true;
            }
        }
        return false;
    }
}
