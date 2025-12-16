package com.avito.android.shift_list.mvi;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetGigerSlotsV1ResponseToItemsMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f281049a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f281050b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Application> f281051c;

    public b(Provider<com.avito.android.gig_snippet.a> provider, Provider<com.avito.android.deep_linking.x> provider2, Provider<Application> provider3) {
        this.f281049a = provider;
        this.f281050b = provider2;
        this.f281051c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f281049a.get(), this.f281050b.get(), this.f281051c.get());
    }
}
