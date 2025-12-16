package com.avito.android.vas_performance.ui.items.info;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f321690a;

    public c(Provider<d> provider) {
        this.f321690a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f321690a.get());
    }
}
