package com.google.android.play.core.appupdate.internal;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class A extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f358015c;

    public A(C c12) {
        this.f358015c = c12;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        D d12 = this.f358015c.f358016b;
        d12.f358019b.c("unlinkToDeath", new Object[0]);
        d12.f358030m.asBinder().unlinkToDeath(d12.f358027j, 0);
        d12.f358030m = null;
        d12.f358024g = false;
    }
}
