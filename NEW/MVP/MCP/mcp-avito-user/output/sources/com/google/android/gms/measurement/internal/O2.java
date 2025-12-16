package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class O2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f354829c;

    public O2(M2 m22, zzo zzoVar) {
        this.f354828b = zzoVar;
        this.f354829c = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        M2 m22 = this.f354829c;
        m22.f354801a.Q();
        C36997w5 c36997w5 = m22.f354801a;
        c36997w5.zzl().e();
        c36997w5.R();
        zzo zzoVar = this.f354828b;
        C36729v.f(zzoVar.f355567b);
        c36997w5.b(zzoVar);
    }
}
