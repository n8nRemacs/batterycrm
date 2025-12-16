package com.avito.android.publish.details.di;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideChipsMultiselectComposeItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class I implements dagger.internal.h<com.avito.android.compose_items.chips_multiselect.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233634a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f233635b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233636c;

    public I(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f233634a = uVar;
        this.f233635b = provider;
        this.f233636c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233634a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f233635b.get();
        Q1 q12 = (Q1) this.f233636c.get();
        B.f233608a.getClass();
        return new com.avito.android.compose_items.chips_multiselect.f(aVar, interfaceC35807h4, q12);
    }
}
