package com.avito.android.blueprints.publish.header;

import com.avito.android.Q1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106209a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f106210b;

    public d(Provider<e> provider, Provider<Q1> provider2) {
        this.f106209a = provider;
        this.f106210b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f106209a.get(), this.f106210b.get());
    }
}
