package com.avito.android.publish.free_delivery;

import com.avito.android.publish.free_delivery.mvi.n;
import com.avito.android.publish.free_delivery.mvi.o;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FreeDeliveryViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final o f235796a;

    public j(o oVar) {
        this.f235796a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f235796a.get();
        i2.f411430a.getClass();
        return new i(nVar, i2.a.f411433c);
    }
}
