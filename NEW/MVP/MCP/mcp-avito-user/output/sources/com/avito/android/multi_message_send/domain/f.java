package com.avito.android.multi_message_send.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetContentItemsUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f206690a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A20.a> f206691b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f206692c;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f206690a = lVar;
        this.f206691b = provider;
        this.f206692c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Long) this.f206690a.f393949a).longValue(), this.f206691b.get(), this.f206692c.get());
    }
}
