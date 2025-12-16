package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import j.N;
import j.P;
import j.k0;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    @P
    public static q f348792b;

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final b f348793a;

    public q(Context context) {
        b bVarA = b.a(context);
        this.f348793a = bVarA;
        bVarA.b();
        bVarA.c();
    }

    public static synchronized q a(@N Context context) {
        q qVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (q.class) {
            qVar = f348792b;
            if (qVar == null) {
                qVar = new q(applicationContext);
                f348792b = qVar;
            }
        }
        return qVar;
        return qVar;
    }

    public final synchronized void b() {
        b bVar = this.f348793a;
        ReentrantLock reentrantLock = bVar.f348780a;
        reentrantLock.lock();
        try {
            bVar.f348781b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
