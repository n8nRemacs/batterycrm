package com.avito.android.advert.item.select.benefits;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAutoSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79350a;

    /* renamed from: b, reason: collision with root package name */
    public final b f79351b;

    public e(u uVar, b bVar) {
        this.f79350a = uVar;
        this.f79351b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f79350a.get();
        this.f79351b.getClass();
        return new d(fVar, new a());
    }
}
