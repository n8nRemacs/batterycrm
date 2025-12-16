package com.avito.android.user_advert.deeplink;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertRestorationV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43640a> f310679a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310680b;

    public B(Provider<InterfaceC43640a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f310679a = provider;
        this.f310680b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f310679a.get(), this.f310680b.get());
    }
}
