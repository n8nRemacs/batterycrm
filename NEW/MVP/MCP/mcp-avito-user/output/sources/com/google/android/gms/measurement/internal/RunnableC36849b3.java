package com.google.android.gms.measurement.internal;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36849b3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznb f355042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f355043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f355044d;

    public RunnableC36849b3(M2 m22, zznb zznbVar, zzo zzoVar) {
        this.f355042b = zznbVar;
        this.f355043c = zzoVar;
        this.f355044d = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        M2 m22 = this.f355044d;
        m22.f354801a.Q();
        zznb zznbVar = this.f355042b;
        Object objH = zznbVar.h();
        zzo zzoVar = this.f355043c;
        if (objH == null) {
            m22.f354801a.s(zznbVar.f355555c, zzoVar);
        } else {
            m22.f354801a.o(zznbVar, zzoVar);
        }
    }
}
