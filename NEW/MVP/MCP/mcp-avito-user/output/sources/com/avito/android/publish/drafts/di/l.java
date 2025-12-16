package com.avito.android.publish.drafts.di;

import Zd0.InterfaceC19543a;
import android.app.Application;
import be0.C25640c;
import com.avito.android.photo_picker.C33272x;
import com.avito.android.photo_picker.C33273y;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.H;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDraftsModule_ProvidePublishDraftRepositoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<PublishDraftRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f235353a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f235354b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AK0.i> f235355c;

    /* renamed from: d, reason: collision with root package name */
    public final n f235356d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H0> f235357e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f235358f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<AttributesTreeConverter> f235359g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.app.work.e f235360h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<H> f235361i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235362j;

    /* renamed from: k, reason: collision with root package name */
    public final C33273y f235363k;

    /* renamed from: l, reason: collision with root package name */
    public final e f235364l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<String>> f235365m;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2, n nVar, Provider provider3, Provider provider4, Provider provider5, com.avito.android.app.work.e eVar, Provider provider6, Provider provider7, C33273y c33273y, e eVar2, Provider provider8) {
        this.f235353a = lVar;
        this.f235354b = provider;
        this.f235355c = provider2;
        this.f235356d = nVar;
        this.f235357e = provider3;
        this.f235358f = provider4;
        this.f235359g = provider5;
        this.f235360h = eVar;
        this.f235361i = provider6;
        this.f235362j = provider7;
        this.f235363k = c33273y;
        this.f235364l = eVar2;
        this.f235365m = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f235353a.f393949a;
        com.avito.android.photo_cache.b bVar = this.f235354b.get();
        AK0.i iVar = this.f235355c.get();
        Gson gson = (Gson) this.f235356d.get();
        H0 h02 = this.f235357e.get();
        CategoryParametersConverter categoryParametersConverter = this.f235358f.get();
        AttributesTreeConverter attributesTreeConverter = this.f235359g.get();
        com.avito.android.app.work.c cVar = (com.avito.android.app.work.c) this.f235360h.get();
        H h12 = this.f235361i.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f235362j.get();
        this.f235363k.getClass();
        C33272x c33272x = new C33272x();
        InterfaceC19543a interfaceC19543a = (InterfaceC19543a) this.f235364l.get();
        com.jakewharton.rxrelay3.c<String> cVar2 = this.f235365m.get();
        int i12 = h.f235345a;
        return new com.avito.android.publish.drafts.x(h02, new C25640c(iVar.a(application, "publish_drafts"), gson), categoryParametersConverter, attributesTreeConverter, cVar, h12, interfaceC35745a5, cVar2, new i(application, c33272x, bVar, interfaceC35745a5, interfaceC19543a));
    }
}
