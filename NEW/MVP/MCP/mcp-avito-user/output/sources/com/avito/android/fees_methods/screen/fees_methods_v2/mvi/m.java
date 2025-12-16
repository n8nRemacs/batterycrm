package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.data.c f158307a;

    public m(com.avito.android.fees_methods.screen.fees_methods_v2.data.c cVar) {
        this.f158307a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.fees_methods.screen.fees_methods_v2.data.a) this.f158307a.get());
    }
}
