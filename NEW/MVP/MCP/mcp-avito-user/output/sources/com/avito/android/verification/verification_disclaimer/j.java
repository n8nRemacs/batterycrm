package com.avito.android.verification.verification_disclaimer;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationDisclaimerLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final vM0.d f325068a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f325069b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f325070c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f325071d;

    public j(vM0.d dVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f325068a = dVar;
        this.f325069b = bVar;
        this.f325070c = bVar2;
        this.f325071d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC49236c) this.f325068a.get(), (a.InterfaceC4053a) this.f325069b.get(), (a.b) this.f325070c.get(), (a.i) this.f325071d.get());
    }
}
