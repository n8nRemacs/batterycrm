package com.avito.android.lf_levels.ui.items.business_tool;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LfBusinessToolItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175411a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f175412b;

    public c(u uVar, Provider provider) {
        this.f175411a = uVar;
        this.f175412b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f175411a.get(), this.f175412b.get());
    }
}
