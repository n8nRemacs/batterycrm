package com.avito.android.user_advert.advert.items.number;

import com.avito.android.user_advert.di.C35482i;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyAdvertNumberItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309758a;

    /* renamed from: b, reason: collision with root package name */
    public final C35482i f309759b;

    public c(Provider provider, C35482i c35482i) {
        this.f309758a = provider;
        this.f309759b = c35482i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309758a.get(), (com.avito.android.date_time_formatter.b) this.f309759b.get());
    }
}
