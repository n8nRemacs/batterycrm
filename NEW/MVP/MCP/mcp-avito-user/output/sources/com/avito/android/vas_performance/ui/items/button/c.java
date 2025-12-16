package com.avito.android.vas_performance.ui.items.button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ButtonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f321607a;

    public c(Provider<e> provider) {
        this.f321607a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f321607a.get());
    }
}
