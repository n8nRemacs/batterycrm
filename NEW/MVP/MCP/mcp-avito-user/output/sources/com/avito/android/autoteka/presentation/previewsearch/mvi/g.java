package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaPreviewSearchActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.previewSearch.a> f97645a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97646b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f97647c;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f97645a = provider;
        this.f97646b = provider2;
        this.f97647c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f97645a.get(), this.f97646b.get(), (AutotekaPreviewSearchDetails) this.f97647c.f393949a);
    }
}
