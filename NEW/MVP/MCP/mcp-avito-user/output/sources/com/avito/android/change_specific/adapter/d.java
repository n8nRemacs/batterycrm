package com.avito.android.change_specific.adapter;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f117898a;

    public d(dagger.internal.u uVar) {
        this.f117898a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f117898a.get());
    }
}
