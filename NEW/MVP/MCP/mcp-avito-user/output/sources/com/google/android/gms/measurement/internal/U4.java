package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class U4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q4 f354937b;

    public U4(Q4 q42) {
        this.f354937b = q42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q4 q42 = this.f354937b;
        C36996w4.t(q42.f354864d, new ComponentName(q42.f354864d.f355183a.f354709a, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
