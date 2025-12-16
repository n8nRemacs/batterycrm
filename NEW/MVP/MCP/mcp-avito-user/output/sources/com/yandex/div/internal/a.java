package com.yandex.div.internal;

import android.os.Looper;
import j.P;
import java.util.Objects;

/* compiled from: Assert.java */
/* loaded from: classes7.dex */
public class a {
    public static void a() {
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        if (mainLooper == looperMyLooper) {
            return;
        }
        "Code run not in main thread!".concat(" ");
        Objects.toString(mainLooper);
        Objects.toString(looperMyLooper);
    }

    public static String b(@P Object obj, @P String str, @P Object obj2) {
        String strConcat = "";
        if (str != null && !str.equals("")) {
            strConcat = str.concat(" ");
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(strConcat, "expected: ");
            sbZ.append(c(obj, strValueOf));
            sbZ.append(" but was: ");
            sbZ.append(c(obj2, strValueOf2));
            return sbZ.toString();
        }
        return strConcat + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    public static String c(@P Object obj, @P String str) {
        return androidx.media3.exoplayer.analytics.m.l(obj == null ? "null" : obj.getClass().getName(), "<", str, ">");
    }
}
