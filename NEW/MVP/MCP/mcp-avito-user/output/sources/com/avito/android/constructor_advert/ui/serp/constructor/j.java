package com.avito.android.constructor_advert.ui.serp.constructor;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: ConstructorAdvertDimensionProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f125822a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f125823b;

    public j(dagger.internal.u uVar, Provider provider) {
        this.f125822a = provider;
        this.f125823b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f125822a.get(), ((Integer) this.f125823b.get()).intValue());
    }
}
