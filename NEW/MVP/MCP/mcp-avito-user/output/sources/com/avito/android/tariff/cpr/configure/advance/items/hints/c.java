package com.avito.android.tariff.cpr.configure.advance.items.hints;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureHintsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f295275a;

    /* renamed from: b, reason: collision with root package name */
    public final u f295276b;

    public c(u uVar, Provider provider) {
        this.f295275a = provider;
        this.f295276b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f295275a.get(), (i) this.f295276b.get());
    }
}
