package com.avito.android.beduin.di;

import Ui.InterfaceC15523b;
import ci.C27198b;
import ci.InterfaceC27197a;
import javax.inject.Provider;
import oj.InterfaceC44784a;

/* compiled from: BeduinComponentsFormModule_ProvideComponentsFormAggregatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28851m implements dagger.internal.h<InterfaceC27197a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f103939a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f103940b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f103941c;

    public C28851m(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f103939a = provider;
        this.f103940b = fVar;
        this.f103941c = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.common.form.store.b bVar = this.f103939a.get();
        InterfaceC15523b interfaceC15523b = (InterfaceC15523b) this.f103940b.get();
        InterfaceC44784a interfaceC44784a = (InterfaceC44784a) this.f103941c.get();
        C28850l.f103938a.getClass();
        return new C27198b(bVar, interfaceC15523b, interfaceC44784a);
    }
}
