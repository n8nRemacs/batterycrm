package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations;

import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CollectionsRecommendationWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f272704a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f272705b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f272706c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f272707d;

    public b(f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f272704a = fVar;
        this.f272705b = provider;
        this.f272706c = provider2;
        this.f272707d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f272704a.getClass();
        return new a(new e(), this.f272705b.get(), this.f272706c.get(), this.f272707d.get());
    }
}
