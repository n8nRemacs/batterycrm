package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import tg0.InterfaceC48669b;
import zz.InterfaceC50647a;

/* compiled from: RatingDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f247124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<m> f247125b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.rating_persistence.llm_summary.m f247126c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.rating_persistence.aspects.g f247127d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.rating_persistence.sort.g f247128e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC48669b> f247129f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f247130g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f247131h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f247132i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<R0> f247133j;

    public k(Provider provider, Provider provider2, com.avito.android.rating_persistence.llm_summary.m mVar, com.avito.android.rating_persistence.aspects.g gVar, com.avito.android.rating_persistence.sort.g gVar2, Provider provider3, dagger.internal.l lVar, Provider provider4, dagger.internal.u uVar, Provider provider5) {
        this.f247124a = provider;
        this.f247125b = provider2;
        this.f247126c = mVar;
        this.f247127d = gVar;
        this.f247128e = gVar2;
        this.f247129f = provider3;
        this.f247130g = lVar;
        this.f247131h = provider4;
        this.f247132i = uVar;
        this.f247133j = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f247124a.get(), this.f247125b.get(), (com.avito.android.rating_persistence.llm_summary.h) this.f247126c.get(), (com.avito.android.rating_persistence.aspects.e) this.f247127d.get(), (com.avito.android.rating_persistence.sort.e) this.f247128e.get(), this.f247129f.get(), (RatingDetailsArguments) this.f247130g.f393949a, this.f247131h.get(), (c) this.f247132i.get(), this.f247133j.get());
    }
}
