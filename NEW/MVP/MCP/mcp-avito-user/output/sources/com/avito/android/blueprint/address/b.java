package com.avito.android.blueprint.address;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishAddressBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105361a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105362b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f105363c;

    public b(Provider<c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<l<SimpleTestGroupWithNone>> provider3) {
        this.f105361a = provider;
        this.f105362b = provider2;
        this.f105363c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105361a.get(), this.f105362b.get(), this.f105363c.get());
    }
}
