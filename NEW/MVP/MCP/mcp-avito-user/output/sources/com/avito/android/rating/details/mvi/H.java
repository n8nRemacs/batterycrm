package com.avito.android.rating.details.mvi;

import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;
import tg0.InterfaceC48669b;

/* compiled from: RatingDetailsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H implements dagger.internal.h<C34175a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.interactor.e> f247213a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f247214b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC48669b> f247215c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.rating_persistence.llm_summary.m f247216d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.rating_persistence.aspects.g f247217e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.rating_persistence.sort.g f247218f;

    /* renamed from: g, reason: collision with root package name */
    public final VD.d f247219g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f247220h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f247221i;

    public H(Provider provider, dagger.internal.u uVar, Provider provider2, com.avito.android.rating_persistence.llm_summary.m mVar, com.avito.android.rating_persistence.aspects.g gVar, com.avito.android.rating_persistence.sort.g gVar2, VD.d dVar, Provider provider3, dagger.internal.l lVar) {
        this.f247213a = provider;
        this.f247214b = uVar;
        this.f247215c = provider2;
        this.f247216d = mVar;
        this.f247217e = gVar;
        this.f247218f = gVar2;
        this.f247219g = dVar;
        this.f247220h = provider3;
        this.f247221i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34175a(this.f247213a.get(), (InterfaceC30274a) this.f247214b.get(), this.f247215c.get(), (com.avito.android.rating_persistence.llm_summary.h) this.f247216d.get(), (com.avito.android.rating_persistence.aspects.e) this.f247217e.get(), (com.avito.android.rating_persistence.sort.e) this.f247218f.get(), (VD.b) this.f247219g.get(), this.f247220h.get(), (RatingDetailsArguments) this.f247221i.f393949a);
    }
}
