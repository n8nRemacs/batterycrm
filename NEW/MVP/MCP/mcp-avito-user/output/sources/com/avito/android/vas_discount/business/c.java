package com.avito.android.vas_discount.business;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mL0.InterfaceC43978a;

/* compiled from: DiscountRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43978a> f319615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f319616b;

    public c(Provider<InterfaceC43978a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f319615a = provider;
        this.f319616b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f319615a.get(), this.f319616b.get());
    }
}
