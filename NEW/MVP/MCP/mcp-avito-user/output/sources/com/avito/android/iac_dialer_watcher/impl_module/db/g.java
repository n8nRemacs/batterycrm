package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.O0;
import j.P;
import java.util.concurrent.Callable;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class g implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f167820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f167821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f167822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f167823e;

    public g(z zVar, long j12, long j13, String str) {
        this.f167823e = zVar;
        this.f167820b = j12;
        this.f167821c = j13;
        this.f167822d = str;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final Void call() {
        z zVar = this.f167823e;
        O0 o02 = zVar.f167851h;
        InAppCallsDatabase_Impl inAppCallsDatabase_Impl = zVar.f167844a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, this.f167820b);
        iVarA.g1(2, this.f167821c);
        iVarA.h4(3, this.f167822d);
        try {
            inAppCallsDatabase_Impl.c();
            try {
                iVarA.E2();
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
