package com.avito.android.persistence.messenger;

import java.util.concurrent.Callable;

/* compiled from: LastKnownUserDao_Impl.java */
/* loaded from: classes15.dex */
class U0 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0 f215309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0 f215310c;

    public U0(W0 w02, X0 x02) {
        this.f215310c = w02;
        this.f215309b = x02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        W0 w02 = this.f215310c;
        MessengerDatabase_Impl messengerDatabase_Impl = w02.f215330a;
        messengerDatabase_Impl.c();
        try {
            w02.f215331b.e(this.f215309b);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
