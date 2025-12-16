package com.avito.android.di.component;

import Jg.InterfaceC14195a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: AvlEntryModule_BindShortVideosGridBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.component.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29899f implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f139290a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14195a> f139291b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Ig.f> f139292c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f139293d;

    public C29899f(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f139290a = uVar;
        this.f139291b = provider;
        this.f139292c = provider2;
        this.f139293d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Jg.b bVar = (Jg.b) this.f139290a.get();
        InterfaceC14195a interfaceC14195a = this.f139291b.get();
        Ig.f fVar = this.f139292c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f139293d.get();
        C29898e.f139289a.getClass();
        return interfaceC14195a.a(bVar, fVar, interfaceC35745a5);
    }
}
