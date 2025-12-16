package com.avito.android.publish.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.W0;
import com.avito.android.publish.Y0;
import com.avito.android.publish.analytics.C33537x;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.C33810a;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishModule_ProvideSubmissionPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235127a;

    /* renamed from: b, reason: collision with root package name */
    public final C33537x f235128b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f235129c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235130d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<PublishDraftRepository> f235131e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.publish.drafts.E> f235132f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f235133g;

    /* renamed from: h, reason: collision with root package name */
    public final V f235134h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.publish.drafts.K> f235135i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f235136j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<C0> f235137k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f235138l;

    public E(C33824o c33824o, C33537x c33537x, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, V v12, Provider provider6, dagger.internal.u uVar, Provider provider7, Provider provider8) {
        this.f235127a = c33824o;
        this.f235128b = c33537x;
        this.f235129c = provider;
        this.f235130d = provider2;
        this.f235131e = provider3;
        this.f235132f = provider4;
        this.f235133g = provider5;
        this.f235134h = v12;
        this.f235135i = provider6;
        this.f235136j = uVar;
        this.f235137k = provider7;
        this.f235138l = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33535v interfaceC33535v = (InterfaceC33535v) this.f235128b.get();
        C50213a c50213a = (C50213a) ((C33810a.c.n) this.f235129c).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33810a.c.u) this.f235130d).get();
        PublishDraftRepository publishDraftRepository = (PublishDraftRepository) ((C33810a.c.p) this.f235131e).get();
        com.avito.android.publish.drafts.E e12 = (com.avito.android.publish.drafts.E) ((C33810a.c.q) this.f235132f).get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C33810a.c.C7094c) this.f235133g).get();
        Gson gson = (Gson) this.f235134h.get();
        com.avito.android.publish.drafts.K k12 = (com.avito.android.publish.drafts.K) ((C33810a.c.s) this.f235135i).get();
        W0.b bVar = (W0.b) this.f235136j.get();
        C0 c02 = this.f235137k.get();
        InterfaceC41196a interfaceC41196a = (InterfaceC41196a) ((C33810a.c.g) this.f235138l).get();
        this.f235127a.getClass();
        return new Y0(c02, interfaceC35745a5, interfaceC33535v, c50213a, publishDraftRepository, e12, gson, c12, k12, bVar, interfaceC41196a);
    }
}
