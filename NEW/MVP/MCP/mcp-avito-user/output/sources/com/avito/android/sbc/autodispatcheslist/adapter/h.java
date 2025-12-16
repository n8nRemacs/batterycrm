package com.avito.android.sbc.autodispatcheslist.adapter;

import com.avito.android.C30566f2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final m f259057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30566f2> f259058b;

    public h(m mVar, Provider provider) {
        this.f259057a = mVar;
        this.f259058b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((i) this.f259057a.get(), this.f259058b.get());
    }
}
