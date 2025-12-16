package com.avito.android.advert_core.discount.item.contact;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f83355a;

    public c(f fVar) {
        this.f83355a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f83355a.get());
    }
}
