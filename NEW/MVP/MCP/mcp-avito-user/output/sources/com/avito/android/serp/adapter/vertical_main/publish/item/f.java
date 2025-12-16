package com.avito.android.serp.adapter.vertical_main.publish.item;

import com.avito.android.serp.adapter.vertical_main.q;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<q> f273129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.groupable_item.b> f273130b;

    public f(Provider<q> provider, Provider<com.avito.android.lib.util.groupable_item.b> provider2) {
        this.f273129a = provider;
        this.f273130b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f273129a.get(), this.f273130b.get());
    }
}
