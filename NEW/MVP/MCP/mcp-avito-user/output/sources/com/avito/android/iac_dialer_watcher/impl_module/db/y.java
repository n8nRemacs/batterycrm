package com.avito.android.iac_dialer_watcher.impl_module.db;

import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class y implements Callable<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f167842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167843c;

    public y(z zVar, C c12) {
        this.f167843c = zVar;
        this.f167842b = c12;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Long call() {
        z zVar = this.f167843c;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        inAppCallsDatabase_Impl.c();
        try {
            Long lValueOf = Long.valueOf(zVar.f167845b.f(this.f167842b));
            inAppCallsDatabase_Impl.s();
            return lValueOf;
        } finally {
            inAppCallsDatabase_Impl.l();
        }
    }
}
