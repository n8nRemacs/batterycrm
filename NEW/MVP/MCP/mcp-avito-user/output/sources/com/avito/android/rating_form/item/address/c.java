package com.avito.android.rating_form.item.address;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddressItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248273a;

    public c(u uVar) {
        this.f248273a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f248273a.get());
    }
}
