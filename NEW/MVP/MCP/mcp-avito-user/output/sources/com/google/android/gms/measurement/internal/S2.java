package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class S2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzae f354898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f354899c;

    public S2(M2 m22, zzae zzaeVar) {
        this.f354898b = zzaeVar;
        this.f354899c = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        M2 m22 = this.f354899c;
        m22.f354801a.Q();
        zzae zzaeVar = this.f354898b;
        Object objH = zzaeVar.f355523d.h();
        C36997w5 c36997w5 = m22.f354801a;
        if (objH == null) {
            c36997w5.getClass();
            String str = zzaeVar.f355521b;
            C36729v.j(str);
            zzo zzoVarE = c36997w5.E(str);
            if (zzoVarE != null) {
                c36997w5.j(zzaeVar, zzoVarE);
                return;
            }
            return;
        }
        c36997w5.getClass();
        String str2 = zzaeVar.f355521b;
        C36729v.j(str2);
        zzo zzoVarE2 = c36997w5.E(str2);
        if (zzoVarE2 != null) {
            c36997w5.B(zzaeVar, zzoVarE2);
        }
    }
}
