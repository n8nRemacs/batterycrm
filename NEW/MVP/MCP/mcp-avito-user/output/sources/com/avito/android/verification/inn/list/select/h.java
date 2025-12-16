package com.avito.android.verification.inn.list.select;

import com.avito.android.deep_linking.links.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f324087a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<c> f324088b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f324089c;

    public h(Provider<w> provider, Provider<c> provider2, Provider<com.avito.android.util.text.a> provider3) {
        this.f324087a = provider;
        this.f324088b = provider2;
        this.f324089c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f324087a.get(), this.f324088b.get(), this.f324089c.get());
    }
}
