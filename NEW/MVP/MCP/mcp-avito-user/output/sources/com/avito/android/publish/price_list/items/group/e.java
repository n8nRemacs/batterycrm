package com.avito.android.publish.price_list.items.group;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListGroupItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238637a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f238638b;

    public e(u uVar, Provider provider) {
        this.f238637a = uVar;
        this.f238638b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f238637a.get(), this.f238638b.get());
    }
}
