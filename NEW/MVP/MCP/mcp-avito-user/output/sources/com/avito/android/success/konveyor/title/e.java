package com.avito.android.success.konveyor.title;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessTitlePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f291664a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291665b;

    public e(l lVar, Provider provider) {
        this.f291664a = provider;
        this.f291665b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f291664a.get(), (Y41.l) this.f291665b.f393949a);
    }
}
