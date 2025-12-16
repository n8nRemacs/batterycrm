package com.avito.android.blueprint.input;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishInputBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105516a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105517b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f105518c;

    public b(Provider<c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<u3.l<SimpleTestGroupWithNone>> provider3) {
        this.f105516a = provider;
        this.f105517b = provider2;
        this.f105518c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105516a.get(), this.f105517b.get(), this.f105518c.get());
    }
}
