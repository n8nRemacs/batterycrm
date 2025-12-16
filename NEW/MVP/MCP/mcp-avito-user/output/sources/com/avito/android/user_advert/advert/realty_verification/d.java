package com.avito.android.user_advert.advert.realty_verification;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RealtyVerificationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f310595a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310596b;

    /* renamed from: c, reason: collision with root package name */
    public final u f310597c;

    public d(u uVar, u uVar2, u uVar3) {
        this.f310595a = uVar;
        this.f310596b = uVar2;
        this.f310597c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f310595a);
        return new c((com.avito.android.remote.error.f) this.f310597c.get(), (InterfaceC35745a5) this.f310596b.get(), eVarB);
    }
}
