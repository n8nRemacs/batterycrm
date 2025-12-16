package com.avito.android.select.sectioned_multiselect.Items.section_list;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f266398a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f266399b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.e> f266400c;

    public c(e eVar, Provider provider, Provider provider2) {
        this.f266398a = eVar;
        this.f266399b = provider;
        this.f266400c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f266398a.getClass();
        return new b(new d(), this.f266399b.get(), this.f266400c.get());
    }
}
