package com.avito.android.serp.adapter.search_bar;

import com.avito.android.di.module.V7;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SearchBarItemInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.search_bar.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34824c implements dagger.internal.h<C34823b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f271631a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f271632b;

    /* renamed from: c, reason: collision with root package name */
    public final V7 f271633c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f271634d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f271635e;

    public C34824c(Provider provider, Provider provider2, V7 v72, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f271631a = provider;
        this.f271632b = provider2;
        this.f271633c = v72;
        this.f271634d = lVar;
        this.f271635e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34823b(dagger.internal.g.b(this.f271631a), this.f271632b.get(), (SuggestParamsConverter) this.f271633c.get(), (PresentationType) this.f271634d.f393949a, (SearchParams) this.f271635e.f393949a);
    }
}
