package com.avito.android.order.feature;

import com.avito.android.order.feature.mvi.v;
import com.avito.android.order.feature.mvi.w;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: OrderViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f209590a;

    /* renamed from: b, reason: collision with root package name */
    public final w f209591b;

    public h(Provider provider, w wVar) {
        this.f209590a = provider;
        this.f209591b = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f209590a.get(), (v) this.f209591b.get());
    }
}
