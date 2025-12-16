package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.O0;
import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class h implements Callable<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f167824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f167825c;

    public h(z zVar, long j12) {
        this.f167825c = zVar;
        this.f167824b = j12;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Integer call() {
        z zVar = this.f167825c;
        O0 o02 = zVar.f167852i;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, this.f167824b);
        try {
            inAppCallsDatabase_Impl.c();
            try {
                Integer numValueOf = Integer.valueOf(iVarA.B3());
                inAppCallsDatabase_Impl.s();
                return numValueOf;
            } finally {
                inAppCallsDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
