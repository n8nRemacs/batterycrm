package com.avito.android.profile.pro.impl.screen.item.orders;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProOrdersBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f223369a;

    /* renamed from: b, reason: collision with root package name */
    public final u f223370b;

    public b(e eVar, u uVar) {
        this.f223369a = eVar;
        this.f223370b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f223369a.get(), (com.avito.konveyor.adapter.d) this.f223370b.get());
    }
}
