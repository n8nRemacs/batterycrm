package com.avito.android.verification.verification_input_bill_amount;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationInputBillAmountLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final vM0.d f325528a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f325529b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f325530c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f325531d;

    public f(vM0.d dVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f325528a = dVar;
        this.f325529b = bVar;
        this.f325530c = bVar2;
        this.f325531d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC49236c) this.f325528a.get(), (a.InterfaceC4053a) this.f325529b.get(), (a.b) this.f325530c.get(), (a.i) this.f325531d.get());
    }
}
