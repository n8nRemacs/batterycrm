package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.InterfaceC36717n;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class A0 implements AbstractC36699e.c, Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final C36616a.f f348956a;

    /* renamed from: b, reason: collision with root package name */
    public final C36628c f348957b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public InterfaceC36717n f348958c = null;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public Set f348959d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f348960e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36646i f348961f;

    public A0(C36646i c36646i, C36616a.f fVar, C36628c c36628c) {
        this.f348961f = c36646i;
        this.f348956a = fVar;
        this.f348957b = c36628c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.c
    public final void a(@j.N ConnectionResult connectionResult) {
        this.f348961f.f349134o.post(new RunnableC36682z0(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.Z0
    @j.l0
    public final void b(ConnectionResult connectionResult) {
        C36676w0 c36676w0 = (C36676w0) this.f348961f.f349130k.get(this.f348957b);
        if (c36676w0 != null) {
            c36676w0.o(connectionResult);
        }
    }
}
