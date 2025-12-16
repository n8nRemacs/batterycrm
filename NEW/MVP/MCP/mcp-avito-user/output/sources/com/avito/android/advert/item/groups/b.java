package com.avito.android.advert.item.groups;

import com.avito.android.advert_core.advert.o;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsGroupsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75803a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f75804b;

    public b(dagger.internal.f fVar, u uVar) {
        this.f75803a = uVar;
        this.f75804b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75803a.get(), (o) this.f75804b.get());
    }
}
