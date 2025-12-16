package com.avito.android.vas_performance.screens.visual_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321288a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321289b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual_v2.domain.d f321290c;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.vas_performance.screens.visual_v2.domain.d dVar) {
        this.f321288a = lVar;
        this.f321289b = lVar2;
        this.f321290c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(((Long) this.f321288a.f393949a).longValue(), (String) this.f321289b.f393949a, (com.avito.android.vas_performance.screens.visual_v2.domain.c) this.f321290c.get());
    }
}
