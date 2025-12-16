package com.avito.android.beduin.common.storage;

import com.avito.android.di.module.C30214v6;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f103500a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f103501b;

    public n(C30214v6 c30214v6, Provider provider) {
        this.f103500a = c30214v6;
        this.f103501b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((AK0.l) this.f103500a.get(), this.f103501b.get());
    }
}
