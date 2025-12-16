package com.avito.android.home.tags_item.tag;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionTagItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f162518a;

    public d(u uVar) {
        this.f162518a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f162518a.get());
    }
}
