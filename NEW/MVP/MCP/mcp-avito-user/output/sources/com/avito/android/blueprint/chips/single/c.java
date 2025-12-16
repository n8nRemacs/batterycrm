package com.avito.android.blueprint.chips.single;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishChipsSingleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f105431a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105432b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f105433c;

    public c(Provider<d> provider, Provider<com.avito.android.util.text.a> provider2, Provider<l<SimpleTestGroupWithNone>> provider3) {
        this.f105431a = provider;
        this.f105432b = provider2;
        this.f105433c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f105431a.get(), this.f105432b.get(), this.f105433c.get());
    }
}
