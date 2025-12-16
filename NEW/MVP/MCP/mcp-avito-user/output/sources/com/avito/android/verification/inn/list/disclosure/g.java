package com.avito.android.verification.inn.list.disclosure;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclosureItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f323972a;

    public g(Provider<d> provider) {
        this.f323972a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f323972a.get());
    }
}
