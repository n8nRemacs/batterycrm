package com.avito.android.list.banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BannerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181541a;

    public b(u uVar) {
        this.f181541a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((h) this.f181541a.get());
    }
}
