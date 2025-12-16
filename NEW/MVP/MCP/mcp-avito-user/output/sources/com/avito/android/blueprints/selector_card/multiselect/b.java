package com.avito.android.blueprints.selector_card.multiselect;

import bj.InterfaceC25659b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: MultiselectSelectorCardGroupBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106631a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f106632b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106633c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f106631a = provider;
        this.f106632b = provider2;
        this.f106633c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106631a.get(), this.f106632b.get(), (InterfaceC25659b) this.f106633c.get());
    }
}
