package com.avito.android.verification.verification_passport;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationCyberityLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f325702a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f325703b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f325704c;

    /* renamed from: d, reason: collision with root package name */
    public final vM0.d f325705d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f325706e;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, vM0.d dVar, dv.b bVar3) {
        this.f325702a = fVar;
        this.f325703b = bVar;
        this.f325704c = bVar2;
        this.f325705d = dVar;
        this.f325706e = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.deeplink_handler.handler.composite.a) this.f325702a.get(), (a.b) this.f325703b.get(), (a.InterfaceC4053a) this.f325704c.get(), (InterfaceC49236c) this.f325705d.get(), (a.i) this.f325706e.get());
    }
}
