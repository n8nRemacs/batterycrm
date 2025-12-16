package com.avito.android.serp.adapter.mini_menu.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import js0.InterfaceC42421a;

/* compiled from: MiniMenuElementPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42421a> f270370a;

    public k(Provider<InterfaceC42421a> provider) {
        this.f270370a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f270370a.get());
    }
}
