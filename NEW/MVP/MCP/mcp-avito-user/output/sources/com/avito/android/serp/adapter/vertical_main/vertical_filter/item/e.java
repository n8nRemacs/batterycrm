package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import com.avito.android.serp.adapter.vertical_main.p;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f273555a;

    /* renamed from: b, reason: collision with root package name */
    public final u f273556b;

    public e(u uVar, Provider provider) {
        this.f273555a = provider;
        this.f273556b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f273555a.get(), (com.avito.android.lib.util.groupable_item.b) this.f273556b.get());
    }
}
