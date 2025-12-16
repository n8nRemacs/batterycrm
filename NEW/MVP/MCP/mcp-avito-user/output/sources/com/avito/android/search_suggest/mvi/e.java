package com.avito.android.search_suggest.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.search_suggest.SearchSuggestArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f264324a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.search_suggest.l f264325b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f264326c;

    public e(dagger.internal.l lVar, com.avito.android.search_suggest.l lVar2, Provider provider) {
        this.f264324a = lVar;
        this.f264325b = lVar2;
        this.f264326c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SearchSuggestArguments) this.f264324a.f393949a, (com.avito.android.search_suggest.g) this.f264325b.get(), this.f264326c.get());
    }
}
