package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.signin.internal.zak;
import j.InterfaceC42151g;
import jY0.BinderC42328c;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.a1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC36624a1 extends BinderC42328c implements i.b, i.c {

    /* renamed from: u, reason: collision with root package name */
    public static final C36616a.AbstractC10618a f349069u = com.google.android.gms.signin.e.f355599a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f349070a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f349071b;

    /* renamed from: p, reason: collision with root package name */
    public final C36616a.AbstractC10618a f349072p;

    /* renamed from: q, reason: collision with root package name */
    public final Set f349073q;

    /* renamed from: r, reason: collision with root package name */
    public final C36703g f349074r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.android.gms.signin.f f349075s;

    /* renamed from: t, reason: collision with root package name */
    public Z0 f349076t;

    @j.l0
    public BinderC36624a1(Context context, Handler handler, @j.N C36703g c36703g) {
        C36616a.AbstractC10618a abstractC10618a = f349069u;
        this.f349070a = context;
        this.f349071b = handler;
        this.f349074r = c36703g;
        this.f349073q = c36703g.f349425b;
        this.f349072p = abstractC10618a;
    }

    @Override // jY0.BinderC42328c, jY0.InterfaceC42330e
    @InterfaceC42151g
    public final void T0(zak zakVar) {
        this.f349071b.post(new Y0(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    @j.l0
    public final void onConnected(@j.P Bundle bundle) {
        this.f349075s.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36664q
    @j.l0
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        this.f349076t.b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    @j.l0
    public final void onConnectionSuspended(int i12) {
        A0 a02 = (A0) this.f349076t;
        C36676w0 c36676w0 = (C36676w0) a02.f348961f.f349130k.get(a02.f348957b);
        if (c36676w0 != null) {
            if (c36676w0.f349240v) {
                c36676w0.o(new ConnectionResult(17));
            } else {
                c36676w0.onConnectionSuspended(i12);
            }
        }
    }
}
