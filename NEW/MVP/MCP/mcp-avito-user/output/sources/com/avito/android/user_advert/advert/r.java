package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertActionsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<C35446q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43640a> f310585a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310586b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310587c;

    public r(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f310585a = provider;
        this.f310586b = provider2;
        this.f310587c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f310585a);
        return new C35446q((com.avito.android.remote.error.f) this.f310587c.get(), this.f310586b.get(), eVarB);
    }
}
