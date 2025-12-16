package com.avito.android.candy;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CandyCarRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final v f114889a;

    /* renamed from: b, reason: collision with root package name */
    public final k f114890b;

    /* renamed from: c, reason: collision with root package name */
    public final s f114891c;

    public g(v vVar, k kVar, s sVar) {
        this.f114889a = vVar;
        this.f114890b = kVar;
        this.f114891c = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f114889a.getClass();
        return new f(new u(), (j) this.f114890b.get(), (r) this.f114891c.get());
    }
}
