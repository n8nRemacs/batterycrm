package com.avito.android.autoteka.items.fullScreenError.payment;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentErrorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f96784a;

    public b(e eVar) {
        this.f96784a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f96784a.get());
    }
}
