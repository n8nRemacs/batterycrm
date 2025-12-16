package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzph;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class P5 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f354852a;

    public P5(I2 i22) {
        this.f354852a = i22;
    }

    @Override // android.content.BroadcastReceiver
    @j.K
    public final void onReceive(Context context, Intent intent) {
        final I2 i22 = this.f354852a;
        if (intent == null) {
            S1 s12 = i22.f354717i;
            I2.c(s12);
            s12.f354892i.b("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            S1 s13 = i22.f354717i;
            I2.c(s13);
            s13.f354892i.b("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            S1 s14 = i22.f354717i;
            I2.c(s14);
            s14.f354892i.b("App receiver called with unknown action");
        } else if (zzph.zza() && i22.f354715g.o(null, E.f354567D0)) {
            S1 s15 = i22.f354717i;
            I2.c(s15);
            s15.f354897n.b("App receiver notified triggers are available");
            A2 a22 = i22.f354718j;
            I2.c(a22);
            a22.n(new Runnable() { // from class: com.google.android.gms.measurement.internal.R5
                @Override // java.lang.Runnable
                public final void run() {
                    I2 i23 = i22;
                    N5 n52 = i23.f354720l;
                    I2.d(n52);
                    if (n52.v0()) {
                        final C36967s3 c36967s3 = i23.f354724p;
                        I2.b(c36967s3);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.O5
                            @Override // java.lang.Runnable
                            public final void run() {
                                c36967s3.S();
                            }
                        }).start();
                    } else {
                        S1 s16 = i23.f354717i;
                        I2.c(s16);
                        s16.f354892i.b("registerTrigger called but app not eligible");
                    }
                }
            });
        }
    }
}
