package com.avito.android.publish.restriction;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: RestrictionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b> f239098a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f239099b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f239100c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f239101d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Q1> f239102e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f239103f;

    public j(Provider<b> provider, Provider<InterfaceC39749a> provider2, Provider<InterfaceC35745a5> provider3, Provider<InterfaceC28373a> provider4, Provider<Q1> provider5, Provider<com.avito.android.deep_linking.x> provider6) {
        this.f239098a = provider;
        this.f239099b = provider2;
        this.f239100c = provider3;
        this.f239101d = provider4;
        this.f239102e = provider5;
        this.f239103f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f239098a.get(), this.f239099b.get(), this.f239100c.get(), this.f239101d.get(), this.f239102e.get(), this.f239103f.get());
    }
}
