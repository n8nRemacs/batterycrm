package com.avito.android.extended_profile.di;

import com.avito.android.extended_profile.di.C30397b;
import com.avito.android.inline_filters.C31056p;
import com.avito.android.inline_filters.C31060u;
import com.avito.android.inline_filters.C31061v;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ExtendedProfileModule_ProvideInlineFiltersInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H implements dagger.internal.h<InterfaceC30995b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f149526a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f149527b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f149528c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31047g> f149529d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.inline_filters.T> f149530e;

    /* renamed from: f, reason: collision with root package name */
    public final C31061v f149531f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f149532g;

    public H(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C31061v c31061v, dagger.internal.l lVar) {
        this.f149526a = provider;
        this.f149527b = provider2;
        this.f149528c = provider3;
        this.f149529d = provider4;
        this.f149530e = provider5;
        this.f149531f = c31061v;
        this.f149532g = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f149526a);
        SearchParamsConverter searchParamsConverter = this.f149527b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C30397b.C4388b.Z) this.f149528c).get();
        InterfaceC31047g interfaceC31047g = this.f149529d.get();
        com.avito.android.inline_filters.T t12 = this.f149530e.get();
        this.f149531f.getClass();
        C31060u c31060u = new C31060u();
        SerpSpaceType serpSpaceType = (SerpSpaceType) this.f149532g.f393949a;
        r.f149945a.getClass();
        return new C31056p(eVarB, searchParamsConverter, interfaceC31047g, t12, c31060u, interfaceC35745a5, serpSpaceType, InlineFiltersSource.f170993b);
    }
}
