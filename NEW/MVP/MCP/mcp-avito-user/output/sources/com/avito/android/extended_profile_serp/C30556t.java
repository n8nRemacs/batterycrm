package com.avito.android.extended_profile_serp;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_serp.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30556t implements dagger.internal.h<C30553p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.N> f153101a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f153102b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f153103c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ZA.a> f153104d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f153105e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Integer> f153106f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f153107g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<gD.f> f153108h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f153109i;

    public C30556t(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f153101a = provider;
        this.f153102b = provider2;
        this.f153103c = provider3;
        this.f153104d = provider4;
        this.f153105e = lVar;
        this.f153106f = provider5;
        this.f153107g = uVar;
        this.f153108h = provider6;
        this.f153109i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f153101a);
        R0 r02 = this.f153102b.get();
        SearchParamsConverter searchParamsConverter = this.f153103c.get();
        ZA.a aVar = this.f153104d.get();
        ExtendedProfileSerpConfig extendedProfileSerpConfig = (ExtendedProfileSerpConfig) this.f153105e.f393949a;
        int iIntValue = this.f153106f.get().intValue();
        com.avito.android.location.r rVar = (com.avito.android.location.r) this.f153107g.get();
        this.f153108h.get();
        return new C30553p(eVarB, r02, searchParamsConverter, aVar, extendedProfileSerpConfig, iIntValue, rVar, this.f153109i.get());
    }
}
