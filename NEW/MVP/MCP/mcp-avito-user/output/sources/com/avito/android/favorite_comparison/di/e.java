package com.avito.android.favorite_comparison.di;

import com.avito.android.favorite_comparison.FavoriteComparisonLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import sC.C48025b;
import sC.C48026c;

/* compiled from: FavoriteComparisonDeeplinkHandlerModule_ProvideNewsFeedLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f155299a;

    /* renamed from: b, reason: collision with root package name */
    public final C48025b f155300b;

    public e(d dVar, C48025b c48025b) {
        this.f155299a = dVar;
        this.f155300b = c48025b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C48025b c48025b = this.f155300b;
        this.f155299a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FavoriteComparisonLink.class, new C48026c(), new C43834a.b.C11809b(c48025b));
    }
}
