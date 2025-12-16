package com.avito.android.publish.screen.objects.domain;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectFillFormItemsClicksInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f239992a;

    /* renamed from: b, reason: collision with root package name */
    public final l f239993b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PublishParametersInteractor> f239994c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.details.b> f239995d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.a> f239996e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.publish.view.a> f239997f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f239998g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C50213a> f239999h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f240000i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.e> f240001j;

    /* renamed from: k, reason: collision with root package name */
    public final u f240002k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f240003l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<Q1> f240004m;

    public i(l lVar, l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f239992a = lVar;
        this.f239993b = lVar2;
        this.f239994c = provider;
        this.f239995d = provider2;
        this.f239996e = provider3;
        this.f239997f = provider4;
        this.f239998g = provider5;
        this.f239999h = provider6;
        this.f240000i = provider7;
        this.f240001j = provider8;
        this.f240002k = uVar;
        this.f240003l = provider9;
        this.f240004m = provider10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Boolean) this.f239992a.f393949a).booleanValue(), (ObjectFillFormScreenParams) this.f239993b.f393949a, this.f239994c.get(), this.f239995d.get(), this.f239996e.get(), this.f239997f.get(), this.f239998g.get(), this.f239999h.get(), this.f240000i.get(), this.f240001j.get(), (com.avito.android.publish.imv.f) this.f240002k.get(), this.f240003l.get(), this.f240004m.get());
    }
}
