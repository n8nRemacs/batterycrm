package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2HeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158397a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f158398b;

    public b(u uVar, Provider provider) {
        this.f158397a = uVar;
        this.f158398b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f158397a.get(), this.f158398b.get());
    }
}
