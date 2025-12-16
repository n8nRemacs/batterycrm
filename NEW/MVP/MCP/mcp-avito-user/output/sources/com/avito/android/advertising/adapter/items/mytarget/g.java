package com.avito.android.advertising.adapter.items.mytarget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyTargetGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f87623a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87624b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f87623a = provider;
        this.f87624b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f87623a.get(), (com.avito.android.advertising.a) this.f87624b.f393949a);
    }
}
