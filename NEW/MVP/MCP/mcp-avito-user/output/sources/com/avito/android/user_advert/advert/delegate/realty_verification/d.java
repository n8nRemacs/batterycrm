package com.avito.android.user_advert.advert.delegate.realty_verification;

import AK0.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RealtyVerificationDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308793a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308794b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308795c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308796d;

    /* renamed from: e, reason: collision with root package name */
    public final u f308797e;

    public d(u uVar, u uVar2, u uVar3, u uVar4, u uVar5) {
        this.f308793a = uVar;
        this.f308794b = uVar2;
        this.f308795c = uVar3;
        this.f308796d = uVar4;
        this.f308797e = uVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.user_advert.advert.realty_verification.a) this.f308793a.get(), (InterfaceC35745a5) this.f308794b.get(), (l) this.f308795c.get(), (InterfaceC28373a) this.f308796d.get(), (com.avito.android.analytics.provider.a) this.f308797e.get());
    }
}
