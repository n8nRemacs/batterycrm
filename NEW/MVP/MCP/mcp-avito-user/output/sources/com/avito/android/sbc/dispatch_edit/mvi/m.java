package com.avito.android.sbc.dispatch_edit.mvi;

import com.avito.android.sbc.di.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcDispatchEditReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.sbc.di.x f260147a;

    /* renamed from: b, reason: collision with root package name */
    public final w f260148b;

    public m(com.avito.android.sbc.di.x xVar, w wVar) {
        this.f260147a = xVar;
        this.f260148b = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.sbc.utils.h) this.f260147a.get(), (com.avito.android.sbc.utils.a) this.f260148b.get());
    }
}
