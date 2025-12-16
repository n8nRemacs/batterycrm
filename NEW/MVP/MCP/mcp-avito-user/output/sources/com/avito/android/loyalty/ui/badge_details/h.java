package com.avito.android.loyalty.ui.badge_details;

import bX.InterfaceC25576a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f183263a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f183264b;

    public h(Provider<InterfaceC25576a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f183263a = provider;
        this.f183264b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f183263a.get(), this.f183264b.get());
    }
}
