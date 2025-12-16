package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.O0;
import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.db.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class CallableC30893c implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f167810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167811c;

    public CallableC30893c(z zVar, long j12) {
        this.f167811c = zVar;
        this.f167810b = j12;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Void call() {
        z zVar = this.f167811c;
        O0 o02 = zVar.f167847d;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, this.f167810b);
        try {
            inAppCallsDatabase_Impl.c();
            try {
                iVarA.B3();
                inAppCallsDatabase_Impl.s();
                o02.c(iVarA);
                return null;
            } finally {
                inAppCallsDatabase_Impl.l();
            }
        } catch (Throwable th2) {
            o02.c(iVarA);
            throw th2;
        }
    }
}
