package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2LimitsInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158424a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f158425b;

    public b(u uVar, Provider provider) {
        this.f158424a = uVar;
        this.f158425b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f158424a.get(), this.f158425b.get());
    }
}
