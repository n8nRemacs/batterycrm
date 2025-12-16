package com.avito.android.verification.inn.list.inn_info;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InnInfoItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f324027a;

    public g(Provider<d> provider) {
        this.f324027a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f324027a.get());
    }
}
