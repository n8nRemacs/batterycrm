package com.avito.android.installments.fakedoor.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakedoorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f172573a;

    /* renamed from: b, reason: collision with root package name */
    public final b f172574b;

    /* renamed from: c, reason: collision with root package name */
    public final i f172575c;

    public g(d dVar, b bVar, i iVar) {
        this.f172573a = dVar;
        this.f172574b = bVar;
        this.f172575c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f172573a.get();
        a aVar = (a) this.f172574b.get();
        this.f172575c.getClass();
        h hVar = new h();
        TN.c.f15631d.getClass();
        return new f("InstallmentsFakedoor", TN.c.f15632e, new e(cVar, aVar, hVar));
    }
}
