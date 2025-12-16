package com.avito.android.profile.user_profile.cards.avito_pro;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import f90.InterfaceC40251E;
import javax.inject.Provider;

/* compiled from: AvitoProCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f224816a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40251E> f224817b;

    public g(l lVar, Provider provider) {
        this.f224816a = lVar;
        this.f224817b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f224816a.f393949a, this.f224817b.get());
    }
}
