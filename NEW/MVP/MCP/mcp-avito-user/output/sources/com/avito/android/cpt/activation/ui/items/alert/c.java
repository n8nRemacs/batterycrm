package com.avito.android.cpt.activation.ui.items.alert;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationAlertItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126330a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126331b;

    public c(u uVar, Provider provider) {
        this.f126330a = uVar;
        this.f126331b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f126330a.get(), this.f126331b.get());
    }
}
