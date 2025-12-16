package com.avito.android.extended_profile_widgets.adapter.categorizer;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xB.C49808b;

/* compiled from: CategorizerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f154337a;

    /* renamed from: b, reason: collision with root package name */
    public final C49808b f154338b;

    /* renamed from: c, reason: collision with root package name */
    public final u f154339c;

    public c(Provider provider, C49808b c49808b, u uVar) {
        this.f154337a = provider;
        this.f154338b = c49808b;
        this.f154339c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154337a.get(), this.f154338b, (com.avito.konveyor.a) this.f154339c.get());
    }
}
