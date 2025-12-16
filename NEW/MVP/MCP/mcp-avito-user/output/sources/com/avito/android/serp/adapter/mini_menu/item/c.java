package com.avito.android.serp.adapter.mini_menu.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MiniMenuElementBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f270355a;

    public c(Provider<h> provider) {
        this.f270355a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f270355a.get());
    }
}
