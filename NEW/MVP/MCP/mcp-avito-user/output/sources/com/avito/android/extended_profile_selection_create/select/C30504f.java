package com.avito.android.extended_profile_selection_create.select;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.remote.D0;
import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSelectionCreateInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_selection_create.select.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30504f implements dagger.internal.h<C30499d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N> f152273a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D0> f152274b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f152275c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f152276d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f152277e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f152278f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f152279g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.extended_profile_selection_create.select.converter.b f152280h;

    public C30504f(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.l lVar, com.avito.android.extended_profile_selection_create.select.converter.b bVar) {
        this.f152273a = provider;
        this.f152274b = provider2;
        this.f152275c = provider3;
        this.f152276d = provider4;
        this.f152277e = provider5;
        this.f152278f = provider6;
        this.f152279g = lVar;
        this.f152280h = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f152273a);
        h31.e eVarB2 = dagger.internal.g.b(this.f152274b);
        h31.e eVarB3 = dagger.internal.g.b(this.f152275c);
        InterfaceC35863o4 interfaceC35863o4 = this.f152276d.get();
        R0 r02 = this.f152277e.get();
        SearchParamsConverter searchParamsConverter = this.f152278f.get();
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = (ExtendedProfileSelectionCreateConfig) this.f152279g.f393949a;
        this.f152280h.getClass();
        return new C30499d(eVarB, eVarB2, eVarB3, interfaceC35863o4, r02, searchParamsConverter, extendedProfileSelectionCreateConfig, new com.avito.android.extended_profile_selection_create.select.converter.a());
    }
}
