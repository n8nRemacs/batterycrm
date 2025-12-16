package com.avito.android.vas_discount.v2.di;

import com.avito.android.vas_discount.v2.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: VasDiscountV2Module_ProvideUserAdvertItemViewProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<InterfaceC49849a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49850b> f319787a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319788b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<b> f319789c;

    public k(Provider<InterfaceC49850b> provider, Provider<com.avito.android.util.text.a> provider2, Provider<b> provider3) {
        this.f319787a = provider;
        this.f319788b = provider2;
        this.f319789c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49850b interfaceC49850bX1 = ((a.c.e) this.f319787a).f319777a.x1();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) ((a.c.C9911a) this.f319788b).get();
        b bVar = this.f319789c.get();
        d.f319779a.getClass();
        return InterfaceC49850b.a.a(interfaceC49850bX1, bVar, new InterfaceC49850b.InterfaceC12859b.a(aVar, null, 2, null), 14);
    }
}
