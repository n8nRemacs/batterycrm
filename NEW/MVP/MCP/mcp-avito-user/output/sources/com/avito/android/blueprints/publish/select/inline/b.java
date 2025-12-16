package com.avito.android.blueprints.publish.select.inline;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: CheckboxSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106467a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f106468b;

    public b(Provider<c> provider, Provider<l<SimpleTestGroupWithNone>> provider2) {
        this.f106467a = provider;
        this.f106468b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106467a.get(), this.f106468b.get());
    }
}
