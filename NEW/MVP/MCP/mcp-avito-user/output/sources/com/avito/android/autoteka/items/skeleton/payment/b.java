package com.avito.android.autoteka.items.skeleton.payment;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSkeletonBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f97021a;

    public b(d dVar) {
        this.f97021a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f97021a.getClass();
        return new a(new c());
    }
}
