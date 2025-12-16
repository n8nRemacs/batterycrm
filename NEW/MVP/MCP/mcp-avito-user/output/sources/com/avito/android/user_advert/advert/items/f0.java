package com.avito.android.user_advert.advert.items;

import com.avito.android.user_advert.advert.u1;
import java.util.Set;

/* compiled from: MyDetailsDeeplinkStreamHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class f0 implements dagger.internal.h<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f309374a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f309375b;

    public f0(dagger.internal.l lVar, dagger.internal.A a12) {
        this.f309374a = lVar;
        this.f309375b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e0((u1) this.f309374a.f393949a, (Set) this.f309375b.get());
    }
}
