package com.google.android.gms.measurement.internal;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class V2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f354947c;

    public V2(M2 m22, zzo zzoVar) {
        this.f354946b = zzoVar;
        this.f354947c = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        M2 m22 = this.f354947c;
        m22.f354801a.Q();
        m22.f354801a.J(this.f354946b);
    }
}
