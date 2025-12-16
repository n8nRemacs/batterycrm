package com.avito.android.cpt.activation.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126406a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126407b;

    public c(u uVar, Provider provider) {
        this.f126406a = uVar;
        this.f126407b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f126406a.get(), this.f126407b.get());
    }
}
