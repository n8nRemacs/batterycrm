package com.avito.android.advert.item.developer.button;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import h5.InterfaceC40772a;

/* compiled from: DeveloperButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75174a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f75175b;

    public b(dagger.internal.f fVar, u uVar) {
        this.f75174a = uVar;
        this.f75175b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75174a.get(), (InterfaceC40772a) this.f75175b.get());
    }
}
