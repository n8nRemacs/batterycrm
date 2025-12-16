package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Od0.InterfaceC14673a;
import com.avito.android.publish.details.InterfaceC33678b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HistoricalSuggestNewItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f233270a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233271b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14673a> f233272c;

    public h(Provider<InterfaceC33678b> provider, Provider<com.avito.android.details.a> provider2, Provider<InterfaceC14673a> provider3) {
        this.f233270a = provider;
        this.f233271b = provider2;
        this.f233272c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f233270a.get(), this.f233271b.get(), this.f233272c.get());
    }
}
