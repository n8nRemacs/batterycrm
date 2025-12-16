package com.avito.android.publish.price_list.items.selected;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectedPriceListItemsRe23Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238732a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f238733b;

    public k(dagger.internal.u uVar, Provider provider) {
        this.f238732a = uVar;
        this.f238733b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((l) this.f238732a.get(), this.f238733b.get());
    }
}
