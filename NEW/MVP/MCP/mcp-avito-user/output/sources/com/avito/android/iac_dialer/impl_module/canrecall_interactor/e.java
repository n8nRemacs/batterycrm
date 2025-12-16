package com.avito.android.iac_dialer.impl_module.canrecall_interactor;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCanRecallInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<XL.a> f165936a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f165937b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165938c;

    public e(Provider<XL.a> provider, Provider<InterfaceC35745a5> provider2, Provider<R0> provider3) {
        this.f165936a = provider;
        this.f165937b = provider2;
        this.f165938c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f165936a.get(), this.f165937b.get(), this.f165938c.get());
    }
}
