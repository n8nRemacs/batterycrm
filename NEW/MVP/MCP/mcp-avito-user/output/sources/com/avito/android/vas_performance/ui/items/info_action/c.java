package com.avito.android.vas_performance.ui.items.info_action;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InfoActionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f321699a;

    public c(Provider<d> provider) {
        this.f321699a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f321699a.get());
    }
}
