package com.avito.android.publish.details.di;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideMultiselectComposeItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.e0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33696e0 implements dagger.internal.h<com.avito.android.compose_items.multiselect.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233918a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f233919b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233920c;

    public C33696e0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f233918a = uVar;
        this.f233919b = provider;
        this.f233920c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233918a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f233919b.get();
        Q1 q12 = (Q1) this.f233920c.get();
        B.f233608a.getClass();
        return new com.avito.android.compose_items.multiselect.i(aVar, interfaceC35807h4, q12);
    }
}
