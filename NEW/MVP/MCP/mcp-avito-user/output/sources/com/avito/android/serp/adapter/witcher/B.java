package com.avito.android.serp.adapter.witcher;

import com.avito.android.util.Kundle;
import javax.inject.Provider;
import rn0.InterfaceC47690b;

/* compiled from: WitcherItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f273751a;

    /* renamed from: b, reason: collision with root package name */
    public final C34893l f273752b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47690b> f273753c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f273754d;

    /* renamed from: e, reason: collision with root package name */
    public final C34884c f273755e;

    public B(dagger.internal.l lVar, C34893l c34893l, Provider provider, dagger.internal.u uVar, C34884c c34884c) {
        this.f273751a = lVar;
        this.f273752b = c34893l;
        this.f273753c = provider;
        this.f273754d = uVar;
        this.f273755e = c34884c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A((Kundle) this.f273751a.f393949a, (InterfaceC34891j) this.f273752b.get(), dagger.internal.g.b(this.f273753c), (M) this.f273754d.get(), (C34883b) this.f273755e.get());
    }
}
