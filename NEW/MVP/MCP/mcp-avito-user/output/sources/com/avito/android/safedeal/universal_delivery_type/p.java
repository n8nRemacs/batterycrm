package com.avito.android.safedeal.universal_delivery_type;

import com.avito.android.safedeal.universal_delivery_type.mvi.t;
import com.avito.android.safedeal.universal_delivery_type.mvi.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: UniversalDeliveryTypeViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.di.m f256742a;

    /* renamed from: b, reason: collision with root package name */
    public final u f256743b;

    public p(com.avito.android.safedeal.universal_delivery_type.di.m mVar, u uVar) {
        this.f256742a = mVar;
        this.f256743b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((InterfaceC40691b) this.f256742a.get(), (t) this.f256743b.get());
    }
}
