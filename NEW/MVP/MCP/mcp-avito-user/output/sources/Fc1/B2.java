package Fc1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.text.C43044a;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class B2 {
    @Y61.k
    public static final String a(int i12) {
        StringBuilder sb2 = new StringBuilder("#");
        C43044a.a(16);
        String string = Integer.toString((i12 >> 24) & 255, 16);
        if (string.length() == 1) {
            string = "0".concat(string);
        }
        if (kotlin.jvm.internal.L.f(string, "ff")) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            string = "";
        }
        sb2.append(string);
        C43044a.a(16);
        String string2 = Integer.toString((i12 >> 16) & 255, 16);
        if (string2.length() == 1) {
            string2 = "0".concat(string2);
        }
        sb2.append(string2);
        C43044a.a(16);
        String string3 = Integer.toString((i12 >> 8) & 255, 16);
        if (string3.length() == 1) {
            string3 = "0".concat(string3);
        }
        sb2.append(string3);
        C43044a.a(16);
        String string4 = Integer.toString(i12 & 255, 16);
        if (string4.length() == 1) {
            string4 = "0".concat(string4);
        }
        sb2.append(string4);
        return sb2.toString().toUpperCase(Locale.ROOT);
    }

    @Y61.l
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static final String b(@Y61.k Application application) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
