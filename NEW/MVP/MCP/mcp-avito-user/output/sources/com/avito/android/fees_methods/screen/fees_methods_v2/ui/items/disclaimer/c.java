package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2DisclaimerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158347a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f158348b;

    public c(u uVar, Provider provider) {
        this.f158347a = uVar;
        this.f158348b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f158347a.get(), this.f158348b.get());
    }
}
