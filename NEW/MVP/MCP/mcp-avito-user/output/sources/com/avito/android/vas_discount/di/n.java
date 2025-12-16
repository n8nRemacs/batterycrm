package com.avito.android.vas_discount.di;

import com.avito.android.vas_discount.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: PickerModule_ProvideUserAdvertItemViewProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<InterfaceC49849a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319669a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49850b> f319670b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319671c;

    public n(i iVar, Provider<InterfaceC49850b> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f319669a = iVar;
        this.f319670b = provider;
        this.f319671c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49850b interfaceC49850bX1 = ((a.c.C9906c) this.f319670b).f319649a.x1();
        com.avito.android.util.text.a aVarE = ((a.c.C9905a) this.f319671c).f319647a.e();
        this.f319669a.getClass();
        return InterfaceC49850b.a.a(interfaceC49850bX1, null, new InterfaceC49850b.InterfaceC12859b.a(aVarE, null, 2, null), 15);
    }
}
