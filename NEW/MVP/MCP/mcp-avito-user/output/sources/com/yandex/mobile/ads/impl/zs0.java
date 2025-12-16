package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public class zs0 extends Exception implements rg {

    /* renamed from: a, reason: collision with root package name */
    public final int f392346a;

    /* renamed from: b, reason: collision with root package name */
    public final long f392347b;

    public zs0(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    @j.P
    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, zs0.class.getClassLoader());
            Throwable th2 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th2 == null ? new RemoteException(string2) : th2;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    public zs0(@j.P String str, @j.P Throwable th2, int i12, long j12) {
        super(str, th2);
        this.f392346a = i12;
        this.f392347b = j12;
    }

    public static String a(int i12) {
        return Integer.toString(i12, 36);
    }
}
