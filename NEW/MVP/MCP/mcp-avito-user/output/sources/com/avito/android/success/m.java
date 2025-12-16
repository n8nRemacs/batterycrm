package com.avito.android.success;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.mvi.i f291667a;

    public m(com.avito.android.success.mvi.i iVar) {
        this.f291667a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.success.mvi.h) this.f291667a.get(), null, 2, null);
    }
}
