package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.extended_profile_serp.InterfaceC30552o;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f153034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30552o> f153035b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.b> f153036c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.n> f153037d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC31062w> f153038e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f153039f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f153040g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f153041h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f153042i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<E> f153043j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<C29640d> f153044k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.extended_profile_ui_components.search_input.suggest.d f153045l;

    public p(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.u uVar, Provider provider6, Provider provider7, Provider provider8, Provider provider9, com.avito.android.extended_profile_ui_components.search_input.suggest.d dVar) {
        this.f153034a = lVar;
        this.f153035b = provider;
        this.f153036c = provider2;
        this.f153037d = provider3;
        this.f153038e = provider4;
        this.f153039f = provider5;
        this.f153040g = uVar;
        this.f153041h = provider6;
        this.f153042i = provider7;
        this.f153043j = provider8;
        this.f153044k = provider9;
        this.f153045l = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((ExtendedProfileSerpConfig) this.f153034a.f393949a, this.f153035b.get(), this.f153036c.get(), this.f153037d.get(), this.f153038e.get(), this.f153039f.get(), (com.avito.android.extended_profile_phone_dialog.g) this.f153040g.get(), this.f153041h.get(), this.f153042i.get(), this.f153043j.get(), this.f153044k.get(), (com.avito.android.extended_profile_ui_components.search_input.suggest.a) this.f153045l.get());
    }
}
