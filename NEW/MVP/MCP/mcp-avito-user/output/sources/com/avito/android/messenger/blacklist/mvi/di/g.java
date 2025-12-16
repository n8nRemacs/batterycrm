package com.avito.android.messenger.blacklist.mvi.di;

import android.content.res.Resources;
import com.avito.android.messenger.blacklist.mvi.di.o;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: BlacklistFragmentModule_ProvideBlacklistDateFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.android.date_time_formatter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f186417a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f186418b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f186419c;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f186417a = provider;
        this.f186418b = lVar;
        this.f186419c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((o.b.e) this.f186417a).get();
        Resources resources = (Resources) this.f186418b.f393949a;
        Locale locale = (Locale) ((o.b.C5468b) this.f186419c).get();
        e.f186415a.getClass();
        return new com.avito.android.date_time_formatter.a(resources, fVar, locale);
    }
}
