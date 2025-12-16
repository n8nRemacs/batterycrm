package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes6.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final long f361812a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f361813b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public static com.google.android.gms.stats.d f361814c;

    @j.B
    public static void a(Context context) {
        if (f361814c == null) {
            com.google.android.gms.stats.d dVar = new com.google.android.gms.stats.d(context);
            f361814c = dVar;
            synchronized (dVar.f355615a) {
                dVar.f355621g = true;
            }
        }
    }

    public static void b(@j.N Intent intent) {
        synchronized (f361813b) {
            try {
                if (f361814c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f361814c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName c(@j.N Context context, @j.N Intent intent) {
        synchronized (f361813b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f361814c.a(f361812a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
