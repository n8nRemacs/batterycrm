package com.avito.android.service_orders.list.blueprints.snippet_item;

import com.avito.android.B2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListSnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f279335a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f279336b;

    public b(Provider<c> provider, Provider<B2> provider2) {
        this.f279335a = provider;
        this.f279336b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f279335a.get(), this.f279336b.get());
    }
}
