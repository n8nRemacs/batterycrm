package com.avito.android.advert.item.developer.trust;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import h5.InterfaceC40772a;

/* compiled from: DeveloperTrustBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75192a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f75193b;

    public b(dagger.internal.f fVar, u uVar) {
        this.f75192a = uVar;
        this.f75193b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75192a.get(), (InterfaceC40772a) this.f75193b.get());
    }
}
