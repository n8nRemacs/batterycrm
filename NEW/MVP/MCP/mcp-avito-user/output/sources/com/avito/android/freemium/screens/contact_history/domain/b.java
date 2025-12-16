package com.avito.android.freemium.screens.contact_history.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetFreemiumContactHistoryUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZE.a> f158979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f158980b;

    /* renamed from: c, reason: collision with root package name */
    public final l f158981c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f158979a = provider;
        this.f158980b = provider2;
        this.f158981c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(((Long) this.f158981c.f393949a).longValue(), this.f158979a.get(), this.f158980b.get());
    }
}
