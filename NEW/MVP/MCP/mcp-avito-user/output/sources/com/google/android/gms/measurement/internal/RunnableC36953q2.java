package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36953q2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzby f355318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC36932n2 f355319c;

    public RunnableC36953q2(ServiceConnectionC36932n2 serviceConnectionC36932n2, zzby zzbyVar, ServiceConnectionC36932n2 serviceConnectionC36932n22) {
        this.f355318b = zzbyVar;
        this.f355319c = serviceConnectionC36932n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC36932n2 serviceConnectionC36932n2 = this.f355319c;
        C36939o2 c36939o2 = serviceConnectionC36932n2.f355276c;
        I2 i22 = c36939o2.f355291a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        zzby zzbyVar = this.f355318b;
        S1 s12 = i22.f354717i;
        Bundle bundle = new Bundle();
        bundle.putString("package_name", serviceConnectionC36932n2.f355275b);
        try {
            if (zzbyVar.zza(bundle) == null) {
                I2.c(s12);
                s12.f354889f.b("Install Referrer Service returned a null response");
            }
        } catch (Exception e12) {
            I2.c(s12);
            s12.f354889f.c("Exception occurred while retrieving the Install Referrer", e12.getMessage());
        }
        A2 a23 = c36939o2.f355291a.f354718j;
        I2.c(a23);
        a23.e();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
