package com.avito.android.select.sectioned_multiselect.core.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f266559a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f266560b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f266561c;

    public e(Provider<InterfaceC28373a> provider, Provider<Gson> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f266559a = provider;
        this.f266560b = provider2;
        this.f266561c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f266559a.get(), this.f266560b.get(), this.f266561c.get());
    }
}
