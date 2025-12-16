package com.avito.android.iac_dialer_watcher.impl_module.db;

import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.db.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class CallableC30892b implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f167808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167809c;

    public CallableC30892b(z zVar, A a12) {
        this.f167809c = zVar;
        this.f167808b = a12;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Void call() {
        z zVar = this.f167809c;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        inAppCallsDatabase_Impl.c();
        try {
            zVar.f167846c.e(this.f167808b);
            inAppCallsDatabase_Impl.s();
            inAppCallsDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            inAppCallsDatabase_Impl.l();
            throw th2;
        }
    }
}
