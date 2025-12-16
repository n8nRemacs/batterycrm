package com.avito.android.item_map.view;

import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lW.C43693c;
import lW.InterfaceC43691a;
import pO.InterfaceC46983a;

/* compiled from: ItemMapPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173473a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L> f173474b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173475c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33034d> f173476d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.location.find.o> f173477e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.item_map.routes.k> f173478f;

    /* renamed from: g, reason: collision with root package name */
    public final C43693c f173479g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f173480h;

    /* renamed from: i, reason: collision with root package name */
    public final D2 f173481i;

    public J(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C43693c c43693c, dagger.internal.u uVar, D2 d22) {
        this.f173473a = lVar;
        this.f173474b = provider;
        this.f173475c = provider2;
        this.f173476d = provider3;
        this.f173477e = provider4;
        this.f173478f = provider5;
        this.f173479g = c43693c;
        this.f173480h = uVar;
        this.f173481i = d22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new I((ItemMapState) this.f173473a.f393949a, this.f173474b.get(), this.f173475c.get(), this.f173476d.get(), this.f173477e.get(), this.f173478f.get(), (InterfaceC43691a) this.f173479g.get(), (InterfaceC46983a) this.f173480h.get(), (B2) this.f173481i.get());
    }
}
