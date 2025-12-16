package com.avito.android.publish;

import Zd0.InterfaceC19543a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PhotoUploadObserverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f231924a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f231925b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f231926c;

    public L(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f231924a = provider;
        this.f231925b = uVar;
        this.f231926c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f231924a.get(), (InterfaceC35745a5) this.f231925b.get(), (InterfaceC19543a) this.f231926c.get());
    }
}
