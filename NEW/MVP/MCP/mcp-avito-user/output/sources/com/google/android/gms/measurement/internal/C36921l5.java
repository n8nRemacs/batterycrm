package com.google.android.gms.measurement.internal;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36921l5 extends AbstractC36963s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36928m5 f355258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36921l5(C36928m5 c36928m5, InterfaceC36905j3 interfaceC36905j3) {
        super(interfaceC36905j3);
        this.f355258e = c36928m5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36963s
    @j.l0
    public final void c() {
        C36928m5 c36928m5 = this.f355258e;
        c36928m5.f355271d.e();
        C36879f5 c36879f5 = c36928m5.f355271d;
        c36879f5.f355183a.f354722n.getClass();
        c36928m5.a(SystemClock.elapsedRealtime(), false, false);
        I2 i22 = c36879f5.f355183a;
        C37005y c37005yI = i22.i();
        i22.f354722n.getClass();
        c37005yI.i(SystemClock.elapsedRealtime());
    }
}
