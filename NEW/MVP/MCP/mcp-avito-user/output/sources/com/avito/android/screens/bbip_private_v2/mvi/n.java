package com.avito.android.screens.bbip_private_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private_v2.data.d f261112a;

    public n(com.avito.android.screens.bbip_private_v2.data.d dVar) {
        this.f261112a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.screens.bbip_private_v2.data.a) this.f261112a.get());
    }
}
