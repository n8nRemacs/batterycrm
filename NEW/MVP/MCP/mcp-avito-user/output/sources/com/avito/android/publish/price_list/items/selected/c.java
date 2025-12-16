package com.avito.android.publish.price_list.items.selected;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectedPriceListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238717a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f238718b;

    public c(dagger.internal.u uVar, Provider provider) {
        this.f238717a = uVar;
        this.f238718b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f238717a.get(), this.f238718b.get());
    }
}
