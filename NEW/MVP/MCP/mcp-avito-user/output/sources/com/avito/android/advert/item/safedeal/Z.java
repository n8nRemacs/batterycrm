package com.avito.android.advert.item.safedeal;

import Hr.InterfaceC14024a;
import an.InterfaceC19913b;
import com.avito.android.Z0;
import javax.inject.Provider;

/* compiled from: NavigatorAfterCartItemAdded_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f78782a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f78783b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f78784c;

    public Z(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f78782a = provider;
        this.f78783b = uVar;
        this.f78784c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f78782a.get(), (InterfaceC19913b) this.f78783b.get(), (Z0) this.f78784c.get());
    }
}
