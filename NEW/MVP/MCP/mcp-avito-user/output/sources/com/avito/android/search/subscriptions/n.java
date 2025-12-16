package com.avito.android.search.subscriptions;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionServiceInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f263996a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<VV.a> f263997b;

    public n(dagger.internal.l lVar, Provider provider) {
        this.f263996a = lVar;
        this.f263997b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Context) this.f263996a.f393949a, this.f263997b.get());
    }
}
