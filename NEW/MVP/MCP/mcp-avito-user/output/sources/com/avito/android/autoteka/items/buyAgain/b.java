package com.avito.android.autoteka.items.buyAgain;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyAgainBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f96676a;

    public b(e eVar) {
        this.f96676a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f96676a.get());
    }
}
