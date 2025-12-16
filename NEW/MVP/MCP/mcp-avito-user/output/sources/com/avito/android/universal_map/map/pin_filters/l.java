package com.avito.android.universal_map.map.pin_filters;

import Vi.C15684a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Provider;
import oG0.InterfaceC44637a;

/* compiled from: UniversalMapPinFiltersViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f305759a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C15684a> f305760b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f305761c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC44637a> f305762d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC39737b> f305763e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f305764f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f305765g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305766h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.tracker.c> f305767i;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f305759a = provider;
        this.f305760b = provider2;
        this.f305761c = provider3;
        this.f305762d = provider4;
        this.f305763e = provider5;
        this.f305764f = lVar;
        this.f305765g = lVar2;
        this.f305766h = provider6;
        this.f305767i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f305759a.get(), this.f305760b.get(), this.f305761c.get(), this.f305762d.get(), this.f305763e.get(), (String) this.f305764f.f393949a, (Map) this.f305765g.f393949a, this.f305766h.get(), this.f305767i.get());
    }
}
