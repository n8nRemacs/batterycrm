package com.avito.android.bxcontent.favorites_unviewed;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.N1;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.timestamp_storage.di.b;
import com.avito.android.timestamp_storage.domain.d;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.g;

/* compiled from: FavoritesUnviewedStartupTask_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class a implements h<FavoritesUnviewedStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f111073a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<N1> f111074b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d> f111075c;

    /* renamed from: d, reason: collision with root package name */
    public final f f111076d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<g<SimpleTestGroupWithNone>> f111077e;

    /* renamed from: f, reason: collision with root package name */
    public final b f111078f;

    public a(Provider provider, Provider provider2, Provider provider3, f fVar, Provider provider4, b bVar) {
        this.f111073a = provider;
        this.f111074b = provider2;
        this.f111075c = provider3;
        this.f111076d = fVar;
        this.f111077e = provider4;
        this.f111078f = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FavoritesUnviewedStartupTask(this.f111073a.get(), this.f111074b.get(), this.f111075c.get(), (InterfaceC28373a) this.f111076d.get(), this.f111077e.get(), (BE0.a) this.f111078f.get());
    }
}
