package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158290a;

    public f(u uVar) {
        this.f158290a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.fees_methods.screen.fees_methods_v2.domain.a) this.f158290a.get());
    }
}
