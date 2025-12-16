package com.google.android.play.core.appupdate.internal;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j.P;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f358045a;

    public s(String str) {
        this.f358045a = androidx.appcompat.app.r.l(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String d(String str, String str2, @P Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = androidx.media3.exoplayer.analytics.m.l(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return androidx.appcompat.app.r.r(str, " : ", str2);
    }

    public final void a(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            d(this.f358045a, str, objArr);
        }
    }

    public final void b(RemoteException remoteException, String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            d(this.f358045a, str, objArr);
        }
    }

    public final void c(String str, @P Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.f358045a, str, objArr);
        }
    }
}
