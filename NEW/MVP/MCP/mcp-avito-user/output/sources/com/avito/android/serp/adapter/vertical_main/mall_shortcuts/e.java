package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MallShortcutsWidgetConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f272986a;

    public e(Provider<J0> provider) {
        this.f272986a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f272986a.get());
    }
}
