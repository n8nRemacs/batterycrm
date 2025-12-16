package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.O0;
import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class d implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f167812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f167813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f167814d;

    public d(long j12, z zVar, String str) {
        this.f167814d = zVar;
        this.f167812b = str;
        this.f167813c = j12;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Void call() {
        z zVar = this.f167814d;
        O0 o02 = zVar.f167848e;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, this.f167812b);
        iVarA.g1(2, this.f167813c);
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
