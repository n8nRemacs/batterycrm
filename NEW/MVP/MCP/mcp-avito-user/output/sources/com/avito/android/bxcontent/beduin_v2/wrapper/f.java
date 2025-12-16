package com.avito.android.bxcontent.beduin_v2.wrapper;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BxWrapperComponentModule_ProvideBxWrapperComponentFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final d f109599a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f109600b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f109601c;

    /* renamed from: d, reason: collision with root package name */
    public final u f109602d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f109603e;

    /* renamed from: f, reason: collision with root package name */
    public final n f109604f;

    public f(d dVar, dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, dagger.internal.l lVar3, n nVar) {
        this.f109599a = dVar;
        this.f109600b = lVar;
        this.f109601c = lVar2;
        this.f109602d = uVar;
        this.f109603e = lVar3;
        this.f109604f = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f109600b.f393949a;
        Y41.a aVar = (Y41.a) this.f109601c.f393949a;
        h hVar = (h) this.f109602d.get();
        Y41.a aVar2 = (Y41.a) this.f109603e.f393949a;
        m mVar = (m) this.f109604f.get();
        this.f109599a.getClass();
        return new c(lVar, aVar, hVar, new e(aVar2), mVar);
    }
}
