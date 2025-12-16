package com.avito.android.blueprint.select;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishSelectBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105660b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f105661c;

    public b(Provider<c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<l<SimpleTestGroupWithNone>> provider3) {
        this.f105659a = provider;
        this.f105660b = provider2;
        this.f105661c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105659a.get(), this.f105660b.get(), this.f105661c.get());
    }
}
