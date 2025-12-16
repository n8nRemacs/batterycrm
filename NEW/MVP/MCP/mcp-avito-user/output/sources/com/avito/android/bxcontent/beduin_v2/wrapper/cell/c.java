package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BxCellWrapperComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f109580a;

    /* renamed from: b, reason: collision with root package name */
    public final u f109581b;

    /* renamed from: c, reason: collision with root package name */
    public final k f109582c;

    public c(dagger.internal.l lVar, u uVar, k kVar) {
        this.f109580a = lVar;
        this.f109581b = uVar;
        this.f109582c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f109580a.f393949a;
        e eVar = (e) this.f109581b.get();
        this.f109582c.getClass();
        return new b(aVar, eVar, new j());
    }
}
