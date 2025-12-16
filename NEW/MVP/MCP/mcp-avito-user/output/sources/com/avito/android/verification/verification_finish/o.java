package com.avito.android.verification.verification_finish;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationFinishLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final vM0.d f325307a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f325308b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f325309c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f325310d;

    public o(vM0.d dVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f325307a = dVar;
        this.f325308b = bVar;
        this.f325309c = bVar2;
        this.f325310d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((InterfaceC49236c) this.f325307a.get(), (a.InterfaceC4053a) this.f325308b.get(), (a.b) this.f325309c.get(), (a.i) this.f325310d.get());
    }
}
