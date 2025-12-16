package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C36855c2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C36997w5 f355052a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f355053b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355054c;

    public C36855c2(C36997w5 c36997w5) {
        C36729v.j(c36997w5);
        this.f355052a = c36997w5;
    }

    @j.l0
    public final void a() {
        C36997w5 c36997w5 = this.f355052a;
        c36997w5.R();
        c36997w5.zzl().e();
        c36997w5.zzl().e();
        if (this.f355053b) {
            c36997w5.zzj().f354897n.b("Unregistering connectivity change receiver");
            this.f355053b = false;
            this.f355054c = false;
            try {
                c36997w5.f355449l.f354709a.unregisterReceiver(this);
            } catch (IllegalArgumentException e12) {
                c36997w5.zzj().f354889f.c("Failed to unregister the network broadcast receiver", e12);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @j.K
    public final void onReceive(Context context, Intent intent) {
        C36997w5 c36997w5 = this.f355052a;
        c36997w5.R();
        String action = intent.getAction();
        c36997w5.zzj().f354897n.c("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c36997w5.zzj().f354892i.c("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        Z1 z12 = c36997w5.f355439b;
        C36997w5.n(z12);
        boolean zM2 = z12.m();
        if (this.f355054c != zM2) {
            this.f355054c = zM2;
            c36997w5.zzl().n(new RunnableC36883g2(this, zM2));
        }
    }
}
