package com.avito.android.lf_levels.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xR.InterfaceC49877a;

/* compiled from: LfLevelsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f175368a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49877a> f175369b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f175370c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f175368a = lVar;
        this.f175369b = provider;
        this.f175370c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f175368a.f393949a, this.f175369b.get(), this.f175370c.get());
    }
}
