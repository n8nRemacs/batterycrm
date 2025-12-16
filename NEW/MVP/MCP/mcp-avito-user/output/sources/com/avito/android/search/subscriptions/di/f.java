package com.avito.android.search.subscriptions.di;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionModule_ProvideDateFormat$_avito_search_subscriptions_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC35945t1<Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f263942a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.j> f263943b;

    public f(Provider<Locale> provider, Provider<com.avito.android.server_time.j> provider2) {
        this.f263942a = provider;
        this.f263943b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = this.f263942a.get();
        com.avito.android.server_time.j jVar = this.f263943b.get();
        int i12 = e.f263941a;
        return new com.avito.android.date_time_formatter.r("dd.MM.yyyy", locale, jVar);
    }
}
