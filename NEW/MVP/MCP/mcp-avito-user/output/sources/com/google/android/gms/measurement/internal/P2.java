package com.google.android.gms.measurement.internal;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class P2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzae f354842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f354843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f354844d;

    public P2(M2 m22, zzae zzaeVar, zzo zzoVar) {
        this.f354842b = zzaeVar;
        this.f354843c = zzoVar;
        this.f354844d = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        M2 m22 = this.f354844d;
        m22.f354801a.Q();
        zzae zzaeVar = this.f354842b;
        Object objH = zzaeVar.f355523d.h();
        zzo zzoVar = this.f354843c;
        if (objH == null) {
            m22.f354801a.j(zzaeVar, zzoVar);
        } else {
            m22.f354801a.B(zzaeVar, zzoVar);
        }
    }
}
