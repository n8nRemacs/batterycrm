package com.avito.android.advert.item.cv_state.interactor;

import Zf.InterfaceC19551a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCvStateInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19551a> f75084a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.cv_state.mapper.b f75085b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f75086c;

    public c(Provider provider, com.avito.android.advert.item.cv_state.mapper.b bVar, Provider provider2) {
        this.f75084a = provider;
        this.f75085b = bVar;
        this.f75086c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f75084a));
        this.f75085b.getClass();
        return new b(eVarA, new com.avito.android.advert.item.cv_state.mapper.a(), this.f75086c.get());
    }
}
