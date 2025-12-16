package com.avito.android.blueprints.input;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: MultiStateInputItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.blueprints.input.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28878c implements dagger.internal.h<C28877b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f105942a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f105943b;

    public C28878c(Provider<d> provider, Provider<u3.l<SimpleTestGroupWithNone>> provider2) {
        this.f105942a = provider;
        this.f105943b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28877b(this.f105942a.get(), this.f105943b.get());
    }
}
