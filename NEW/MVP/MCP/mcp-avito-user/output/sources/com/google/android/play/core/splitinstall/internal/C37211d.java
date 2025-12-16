package com.google.android.play.core.splitinstall.internal;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37211d extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC37213f f358749c;

    public C37211d(ServiceConnectionC37213f serviceConnectionC37213f) {
        this.f358749c = serviceConnectionC37213f;
    }

    @Override // com.google.android.play.core.splitinstall.internal.t0
    public final void a() {
        C37214g c37214g = this.f358749c.f358756b;
        c37214g.f358760b.d("unlinkToDeath", new Object[0]);
        c37214g.f358771m.asBinder().unlinkToDeath(c37214g.f358768j, 0);
        c37214g.f358771m = null;
        c37214g.f358765g = false;
    }
}
