package com.google.android.play.core.assetpacks.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f358345a;

    public F(String str) {
        this.f358345a = androidx.appcompat.app.r.l(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String f(String str, String str2, @j.P Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = androidx.media3.exoplayer.analytics.m.l(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return androidx.appcompat.app.r.r(str, " : ", str2);
    }

    public final void a(String str, @j.P Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.f358345a, str, objArr);
        }
    }

    public final void b(String str, @j.P Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f358345a, str, objArr);
        }
    }

    public final void c(Exception exc, String str, @j.P Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f358345a, str, objArr);
        }
    }

    public final void d(String str, @j.P Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.f358345a, str, objArr);
        }
    }

    public final void e(String str, @j.P Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.f358345a, str, objArr);
        }
    }
}
