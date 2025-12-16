package com.avito.android.publish.slots.item_info.item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemInfoItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final p f244398a;

    public m(p pVar) {
        this.f244398a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((n) this.f244398a.get());
    }
}
