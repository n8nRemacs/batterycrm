package com.avito.android.model_card.screen.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetModelCardContentUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final DZ.b f198064a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<FZ.b> f198065b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f198066c;

    public c(DZ.b bVar, Provider provider, Provider provider2) {
        this.f198064a = bVar;
        this.f198065b = provider;
        this.f198066c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f198064a.get(), this.f198065b.get(), this.f198066c.get());
    }
}
