package com.avito.android.profile_settings_extended.adapter.item_selections;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import jc0.C42356b;

/* compiled from: SelectionsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f229625a;

    /* renamed from: b, reason: collision with root package name */
    public final C42356b f229626b;

    /* renamed from: c, reason: collision with root package name */
    public final u f229627c;

    public f(Provider provider, C42356b c42356b, u uVar) {
        this.f229625a = provider;
        this.f229626b = c42356b;
        this.f229627c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f229625a.get(), this.f229626b, (com.avito.konveyor.a) this.f229627c.get());
    }
}
