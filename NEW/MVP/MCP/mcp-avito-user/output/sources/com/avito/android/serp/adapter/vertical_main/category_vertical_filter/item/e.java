package com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item;

import com.avito.android.serp.adapter.vertical_main.p;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryVerticalFilterPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f272684a;

    public e(Provider<p> provider) {
        this.f272684a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f272684a.get());
    }
}
