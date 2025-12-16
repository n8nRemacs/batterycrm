package com.avito.android.success.konveyor.service;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessServicePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f291654a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291655b;

    public e(l lVar, Provider provider) {
        this.f291654a = provider;
        this.f291655b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f291654a.get(), (Y41.l) this.f291655b.f393949a);
    }
}
