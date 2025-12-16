package com.avito.android.vas_planning_checkout.item.disclaimer;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningDisclaimerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322958a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f322959b;

    public b(u uVar, Provider provider) {
        this.f322958a = uVar;
        this.f322959b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f322958a.get(), this.f322959b.get());
    }
}
