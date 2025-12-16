package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.measurement.internal.zzif;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class A5 implements Callable<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36997w5 f354525c;

    public A5(C36997w5 c36997w5, zzo zzoVar) {
        this.f354524b = zzoVar;
        this.f354525c = c36997w5;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Throwable {
        zzo zzoVar = this.f354524b;
        String str = zzoVar.f355567b;
        C36729v.j(str);
        C36997w5 c36997w5 = this.f354525c;
        zzif zzifVarA = c36997w5.A(str);
        zzif.zza zzaVar = zzif.zza.ANALYTICS_STORAGE;
        if (zzifVarA.e(zzaVar) && zzif.b(100, zzoVar.f355588w).e(zzaVar)) {
            return c36997w5.b(zzoVar).O();
        }
        c36997w5.zzj().f354897n.b("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
