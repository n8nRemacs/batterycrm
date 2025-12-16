package com.avito.android.lf_levels.ui.items.business_tools_header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LfBusinessToolHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175432a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f175433b;

    public c(u uVar, Provider provider) {
        this.f175432a = uVar;
        this.f175433b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f175432a.get(), this.f175433b.get());
    }
}
