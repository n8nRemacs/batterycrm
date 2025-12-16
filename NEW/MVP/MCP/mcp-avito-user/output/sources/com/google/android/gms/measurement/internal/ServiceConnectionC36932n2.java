package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC36932n2 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final String f355275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36939o2 f355276c;

    public ServiceConnectionC36932n2(C36939o2 c36939o2, String str) {
        this.f355276c = c36939o2;
        this.f355275b = str;
    }

    @Override // android.content.ServiceConnection
    @j.K
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C36939o2 c36939o2 = this.f355276c;
        if (iBinder == null) {
            S1 s12 = c36939o2.f355291a.f354717i;
            I2.c(s12);
            s12.f354892i.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zzbyVarZza = zzcb.zza(iBinder);
            if (zzbyVarZza == null) {
                S1 s13 = c36939o2.f355291a.f354717i;
                I2.c(s13);
                s13.f354892i.b("Install Referrer Service implementation was not found");
            } else {
                S1 s14 = c36939o2.f355291a.f354717i;
                I2.c(s14);
                s14.f354897n.b("Install Referrer Service connected");
                A2 a22 = c36939o2.f355291a.f354718j;
                I2.c(a22);
                a22.n(new RunnableC36953q2(this, zzbyVarZza, this));
            }
        } catch (RuntimeException e12) {
            S1 s15 = c36939o2.f355291a.f354717i;
            I2.c(s15);
            s15.f354892i.c("Exception occurred while calling Install Referrer API", e12);
        }
    }

    @Override // android.content.ServiceConnection
    @j.K
    public final void onServiceDisconnected(ComponentName componentName) {
        S1 s12 = this.f355276c.f355291a.f354717i;
        I2.c(s12);
        s12.f354897n.b("Install Referrer Service disconnected");
    }
}
