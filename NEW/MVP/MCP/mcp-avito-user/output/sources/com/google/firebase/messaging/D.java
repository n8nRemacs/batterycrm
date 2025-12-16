package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter.java */
@RX0.a
/* loaded from: classes6.dex */
public class D {

    /* renamed from: e, reason: collision with root package name */
    public static D f361736e;

    /* renamed from: a, reason: collision with root package name */
    @j.B
    @j.P
    public String f361737a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f361738b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f361739c = null;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f361740d = new ArrayDeque();

    public static synchronized D a() {
        try {
            if (f361736e == null) {
                f361736e = new D();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f361736e;
    }

    public final boolean b(Context context) {
        if (this.f361739c == null) {
            this.f361739c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f361738b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f361739c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f361738b == null) {
            this.f361738b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f361738b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f361738b.booleanValue();
    }
}
