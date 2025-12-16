package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: Log.java */
/* renamed from: com.google.android.exoplayer2.util.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36605v {

    /* compiled from: Log.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.util.v$a */
    public @interface a {
    }

    @Pure
    public static void a(String str, @j.P Throwable th2) {
        String strB = b(th2);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        strB.replace("\n", "\n  ");
    }

    @j.P
    @Pure
    public static String b(@j.P Throwable th2) {
        if (th2 == null) {
            return null;
        }
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "UnknownHostException (no network)";
            }
        }
        return Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }
}
