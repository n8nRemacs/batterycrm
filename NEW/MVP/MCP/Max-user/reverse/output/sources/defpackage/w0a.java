package defpackage;

import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import org.webrtc.IceCandidate;

/* loaded from: classes2.dex */
public abstract class w0a {
    public static final boolean a = (Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE).equalsIgnoreCase(new String[]{"HUAWEI CHM-U01 hwCHM-H"}[0]);

    public static Point a(int i, int i2) {
        if (i <= 1280 && i2 <= 720) {
            return new Point(i, i2);
        }
        int iMax = Math.max(i, i2);
        if (iMax > 1280) {
            float f = 1280.0f / iMax;
            i = Math.round(i * f);
            i2 = Math.round(i2 * f);
        }
        return new Point(i, i2);
    }

    public static String b(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        String subtypeName;
        subtypeName = "unknown";
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            subtypeName = activeNetworkInfo != null ? activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName() : "unknown";
            if (telephonyManager != null && (activeNetworkInfo == null || activeNetworkInfo.getType() != 1)) {
                StringBuilder sbO = ho7.o(subtypeName, ".");
                sbO.append(telephonyManager.getNetworkOperatorName());
                return sbO.toString();
            }
        }
        return subtypeName;
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "Ø";
        }
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    public static void d(b7d b7dVar, String str, String str2) {
        HashMap map = new HashMap(3);
        map.put("param", str + "_" + str2);
        b7dVar.log(b7d.COLLECTOR_WEBRTC, "callSpecError", map);
    }

    public static String e(IceCandidate iceCandidate) {
        String str = iceCandidate.sdp;
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit == null) {
            return iceCandidate.sdp;
        }
        StringBuilder sb = new StringBuilder();
        int i = 3;
        for (String str2 : strArrSplit) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    sb.append(str2);
                } else {
                    sb.append("9");
                }
            } else if (str2.contains(":")) {
                sb.append("::");
            } else {
                sb.append("0.0.0.0");
            }
            i = "raddr".equals(str2) ? 1 : "rport".equals(str2) ? 2 : 3;
        }
        return sb.toString();
    }

    public static void f() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
    }

    public static String g(Boolean bool) {
        return bool.booleanValue() ? "yes" : "no";
    }
}
