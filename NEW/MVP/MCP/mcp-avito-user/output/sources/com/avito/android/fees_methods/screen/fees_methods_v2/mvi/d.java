package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158277a;

    public d(u uVar) {
        this.f158277a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.fees_methods.screen.fees_methods_v2.domain.a) this.f158277a.get());
    }
}
