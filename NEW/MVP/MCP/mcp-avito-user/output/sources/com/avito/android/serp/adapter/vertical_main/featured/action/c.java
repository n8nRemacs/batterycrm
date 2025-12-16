package com.avito.android.serp.adapter.vertical_main.featured.action;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeaturedActionBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272819a;

    public c(u uVar) {
        this.f272819a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f272819a.get());
    }
}
