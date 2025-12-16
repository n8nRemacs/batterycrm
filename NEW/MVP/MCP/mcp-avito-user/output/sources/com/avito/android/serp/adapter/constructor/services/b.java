package com.avito.android.serp.adapter.constructor.services;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.constructor.rich.InterfaceC34722a;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.util.R0;
import com.avito.android.video_snippets.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpConstructorAdvertServicesRichBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34722a> f269747a;

    /* renamed from: b, reason: collision with root package name */
    public final u f269748b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269749c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<p> f269750d;

    /* renamed from: e, reason: collision with root package name */
    public final l f269751e;

    /* renamed from: f, reason: collision with root package name */
    public final u f269752f;

    /* renamed from: g, reason: collision with root package name */
    public final u f269753g;

    /* renamed from: h, reason: collision with root package name */
    public final u f269754h;

    /* renamed from: i, reason: collision with root package name */
    public final u f269755i;

    /* renamed from: j, reason: collision with root package name */
    public final u f269756j;

    public b(Provider provider, u uVar, Provider provider2, Provider provider3, l lVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6) {
        this.f269747a = provider;
        this.f269748b = uVar;
        this.f269749c = provider2;
        this.f269750d = provider3;
        this.f269751e = lVar;
        this.f269752f = uVar2;
        this.f269753g = uVar3;
        this.f269754h = uVar4;
        this.f269755i = uVar5;
        this.f269756j = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f269747a.get(), (InterfaceC25659b) this.f269748b.get(), this.f269749c.get(), this.f269750d.get(), (RecyclerView.t) this.f269751e.f393949a, (C36135w2) this.f269752f.get(), (RecyclerView.t) this.f269753g.get(), (g) this.f269754h.get(), (com.avito.android.pinch_to_zoom.b) this.f269755i.get(), (R0) this.f269756j.get());
    }
}
