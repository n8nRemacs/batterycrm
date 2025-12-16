package com.avito.android.extended_profile;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Provider;

/* compiled from: ExtendedProfileDeeplinkHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30443f implements dagger.internal.h<C30395d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149961a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f149962b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f149963c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<SearchParams> f149964d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<r> f149965e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f149966f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f149967g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f149968h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<VD.b> f149969i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.extended_profile.di.E f149970j;

    public C30443f(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, com.avito.android.extended_profile.di.E e12) {
        this.f149961a = lVar;
        this.f149962b = lVar2;
        this.f149963c = lVar3;
        this.f149964d = provider;
        this.f149965e = provider2;
        this.f149966f = provider3;
        this.f149967g = provider4;
        this.f149968h = provider5;
        this.f149969i = provider6;
        this.f149970j = e12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30395d((String) this.f149961a.f393949a, (String) this.f149962b.f393949a, ((Boolean) this.f149963c.f393949a).booleanValue(), this.f149964d.get(), this.f149965e.get(), this.f149966f.get(), this.f149967g.get(), this.f149968h.get(), this.f149969i.get(), (String) this.f149970j.get());
    }
}
