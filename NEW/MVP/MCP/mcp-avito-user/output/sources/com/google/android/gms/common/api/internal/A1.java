package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class A1 implements i.b, i.c {

    /* renamed from: a, reason: collision with root package name */
    public final C36616a f348962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f348963b;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public C36661o0 f348964p;

    public A1(C36616a c36616a, boolean z12) {
        this.f348962a = c36616a;
        this.f348963b = z12;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnected(@j.P Bundle bundle) {
        C36729v.k(this.f348964p, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f348964p.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36664q
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        boolean z12 = this.f348963b;
        C36729v.k(this.f348964p, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C36661o0 c36661o0 = this.f348964p;
        C36616a c36616a = this.f348962a;
        c36661o0.f349189a.lock();
        try {
            c36661o0.f349199x.b(connectionResult, c36616a, z12);
        } finally {
            c36661o0.f349189a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public final void onConnectionSuspended(int i12) {
        C36729v.k(this.f348964p, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f348964p.onConnectionSuspended(i12);
    }
}
