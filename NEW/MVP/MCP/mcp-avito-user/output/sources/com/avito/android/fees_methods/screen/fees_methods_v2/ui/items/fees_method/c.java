package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2FeesMethodItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158368a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f158369b;

    public c(u uVar, Provider provider) {
        this.f158368a = uVar;
        this.f158369b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f158368a.get(), this.f158369b.get());
    }
}
