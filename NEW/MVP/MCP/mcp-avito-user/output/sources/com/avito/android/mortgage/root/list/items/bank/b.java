package com.avito.android.mortgage.root.list.items.bank;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BankBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f202302a;

    public b(l lVar) {
        this.f202302a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((k) this.f202302a.get());
    }
}
