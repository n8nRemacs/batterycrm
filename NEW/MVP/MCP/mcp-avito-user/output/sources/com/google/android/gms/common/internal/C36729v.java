package com.google.android.gms.common.internal;

import aZ0.InterfaceC19845a;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import v61.InterfaceC49173d;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36729v {
    public C36729v() {
        throw new AssertionError("Uninstantiable");
    }

    @RX0.a
    public static void a(@j.N String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @RX0.a
    public static void b(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    @RX0.a
    public static void c(boolean z12, @j.N String str, @j.N Object... objArr) {
        if (!z12) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @RX0.a
    public static void d(@j.N Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(androidx.camera.core.Q.a("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    @RX0.a
    public static void e(@j.N String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @j.N
    @InterfaceC19845a
    @InterfaceC49173d
    @RX0.a
    public static void f(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    @j.N
    @InterfaceC19845a
    @InterfaceC49173d
    @RX0.a
    public static void g(@j.P String str, @j.N String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    @RX0.a
    public static void h() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    @RX0.a
    public static void i(@j.N String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @j.N
    @InterfaceC19845a
    @InterfaceC49173d
    @RX0.a
    public static void j(@j.P Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @j.N
    @InterfaceC19845a
    @InterfaceC49173d
    @RX0.a
    public static void k(@j.N Object obj, @j.N String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @RX0.a
    public static void l(@j.N String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    @RX0.a
    public static void m(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }
}
