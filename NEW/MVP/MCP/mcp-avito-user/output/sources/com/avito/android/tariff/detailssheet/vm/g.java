package com.avito.android.tariff.detailssheet.vm;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffDetailsSheetRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f297439a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f297440b;

    public g(Provider<WB0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f297439a = provider;
        this.f297440b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f297439a.get(), this.f297440b.get());
    }
}
