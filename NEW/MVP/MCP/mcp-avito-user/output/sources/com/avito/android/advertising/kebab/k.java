package com.avito.android.advertising.kebab;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HiddenAdStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f87841a;

    public k(C30214v6 c30214v6) {
        this.f87841a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((AK0.l) this.f87841a.get());
    }
}
