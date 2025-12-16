package com.avito.android.verification.storage;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f324889a;

    public c(C30214v6 c30214v6) {
        this.f324889a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((l) this.f324889a.get());
    }
}
