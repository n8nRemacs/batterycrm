package com.avito.android.publish.details.di;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideMultiselectItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.g0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33724g0 implements dagger.internal.h<com.avito.android.blueprints.publish.multiselect.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f234550b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234551c;

    public C33724g0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234549a = uVar;
        this.f234550b = provider;
        this.f234551c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234549a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f234550b.get();
        Q1 q12 = (Q1) this.f234551c.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprints.publish.multiselect.g(aVar, interfaceC35807h4, q12);
    }
}
