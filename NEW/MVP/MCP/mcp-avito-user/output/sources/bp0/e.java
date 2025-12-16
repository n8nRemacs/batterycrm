package Bp0;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecommendationCardsParameterAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.analytics.c> f1728a;

    public e(Provider<com.avito.android.search.filter.analytics.c> provider) {
        this.f1728a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f1728a.get());
    }
}
