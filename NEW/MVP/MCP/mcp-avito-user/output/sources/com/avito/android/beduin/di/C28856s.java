package com.avito.android.beduin.di;

import com.avito.android.C36135w2;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BeduinConstructorAdvertModule_ProvideConstructorAdvertConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28856s implements dagger.internal.h<com.avito.android.constructor_advert.ui.serp.constructor.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f103956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f103957b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f103958c;

    public C28856s(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f103956a = lVar;
        this.f103957b = provider;
        this.f103958c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f103956a.f393949a;
        C36135w2 c36135w2 = this.f103957b.get();
        com.avito.android.constructor_advert.ui.serp.constructor.m mVar = (com.avito.android.constructor_advert.ui.serp.constructor.m) this.f103958c.get();
        C28852n.f103953a.getClass();
        return new com.avito.android.constructor_advert.ui.serp.constructor.g(interfaceC40691b, c36135w2, mVar);
    }
}
