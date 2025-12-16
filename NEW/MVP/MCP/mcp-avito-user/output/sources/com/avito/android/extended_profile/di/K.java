package com.avito.android.extended_profile.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.InterfaceC30394c;
import com.avito.android.extended_profile.di.C30397b;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileModule_ProvideSearchInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<com.avito.android.extended_profile.search.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149535a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.N> f149536b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30394c> f149537c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.converter.a> f149538d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f149539e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f149540f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f149541g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f149542h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f149543i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.analytics.provider.f f149544j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<R0> f149545k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.location.a> f149546l;

    public K(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.u uVar, com.avito.android.analytics.provider.f fVar, Provider provider8, Provider provider9) {
        this.f149535a = lVar;
        this.f149536b = provider;
        this.f149537c = provider2;
        this.f149538d = provider3;
        this.f149539e = provider4;
        this.f149540f = provider5;
        this.f149541g = provider6;
        this.f149542h = provider7;
        this.f149543i = uVar;
        this.f149544j = fVar;
        this.f149545k = provider8;
        this.f149546l = provider9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f149535a.f393949a;
        h31.e eVarB = dagger.internal.g.b(this.f149536b);
        InterfaceC30394c interfaceC30394c = this.f149537c.get();
        com.avito.android.extended_profile.converter.a aVar = this.f149538d.get();
        SearchParamsConverter searchParamsConverter = this.f149539e.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C30397b.C4388b.C30400d) this.f149540f).get();
        com.avito.android.account.E e12 = (com.avito.android.account.E) ((C30397b.C4388b.C30398a) this.f149541g).get();
        com.avito.android.extended_profile_ux_feedback.b bVar = (com.avito.android.extended_profile_ux_feedback.b) ((C30397b.C4388b.A) this.f149542h).get();
        InterfaceC30995b interfaceC30995b = (InterfaceC30995b) this.f149543i.get();
        this.f149544j.getClass();
        com.avito.android.analytics.provider.e eVar = new com.avito.android.analytics.provider.e();
        R0 r02 = (R0) ((C30397b.C4388b.C30419w) this.f149545k).get();
        com.avito.android.extended_profile.location.a aVar2 = this.f149546l.get();
        r.f149945a.getClass();
        return new com.avito.android.extended_profile.search.k(str, eVarB, aVar, interfaceC30995b, searchParamsConverter, aVar2, interfaceC28373a, e12, bVar, interfaceC30394c, r02, eVar);
    }
}
