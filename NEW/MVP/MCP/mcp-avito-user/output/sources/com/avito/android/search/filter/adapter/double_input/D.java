package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.InterfaceC34581l;
import javax.inject.Provider;

/* compiled from: DoubleInputPayloadItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f262219a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262220b;

    public D(dagger.internal.l lVar, Provider provider) {
        this.f262219a = lVar;
        this.f262220b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C((io.reactivex.rxjava3.core.z) this.f262219a.f393949a, this.f262220b.get());
    }
}
