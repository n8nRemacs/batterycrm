package com.avito.android.verification.verification_input_inn;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationInputInnLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final vM0.d f325620a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f325621b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f325622c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f325623d;

    public j(vM0.d dVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f325620a = dVar;
        this.f325621b = bVar;
        this.f325622c = bVar2;
        this.f325623d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC49236c) this.f325620a.get(), (a.InterfaceC4053a) this.f325621b.get(), (a.b) this.f325622c.get(), (a.i) this.f325623d.get());
    }
}
