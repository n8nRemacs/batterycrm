package com.avito.android.str_insurance.items.title;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f288603a;

    public d(g gVar) {
        this.f288603a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f288603a.get());
    }
}
