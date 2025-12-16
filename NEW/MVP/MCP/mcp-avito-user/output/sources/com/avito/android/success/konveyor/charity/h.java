package com.avito.android.success.konveyor.charity;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessCharityBlockPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f291633a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291634b;

    public h(l lVar, Provider provider) {
        this.f291633a = provider;
        this.f291634b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f291633a.get(), (Y41.l) this.f291634b.f393949a);
    }
}
