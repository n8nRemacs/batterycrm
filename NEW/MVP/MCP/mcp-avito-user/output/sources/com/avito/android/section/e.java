package com.avito.android.section;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.util.C;
import javax.inject.Provider;

/* compiled from: SectionInsideItemsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f264651a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f264652b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f264653c;

    public e(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f264651a = provider;
        this.f264652b = uVar;
        this.f264653c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f264651a.get(), (com.avito.android.constructor_advert.ui.serp.constructor.f) this.f264652b.get(), (C) this.f264653c.get());
    }
}
