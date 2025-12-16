package com.google.android.gms.measurement.internal;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class N2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f354812c;

    public N2(M2 m22, zzo zzoVar) {
        this.f354811b = zzoVar;
        this.f354812c = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        M2 m22 = this.f354812c;
        m22.f354801a.Q();
        m22.f354801a.H(this.f354811b);
    }
}
