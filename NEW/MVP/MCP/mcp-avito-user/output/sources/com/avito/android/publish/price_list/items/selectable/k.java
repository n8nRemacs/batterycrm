package com.avito.android.publish.price_list.items.selectable;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectablePriceListItemRe23Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238688a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f238689b;

    public k(dagger.internal.u uVar, Provider provider) {
        this.f238688a = uVar;
        this.f238689b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((l) this.f238688a.get(), this.f238689b.get());
    }
}
