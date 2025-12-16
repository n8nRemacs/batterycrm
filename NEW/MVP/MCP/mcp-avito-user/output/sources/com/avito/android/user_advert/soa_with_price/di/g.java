package com.avito.android.user_advert.soa_with_price.di;

import com.avito.android.user_advert.soa_with_price.E;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceArguments;
import com.avito.android.user_advert.soa_with_price.di.h;
import com.avito.android.user_advert.soa_with_price.k;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CloseReasonSheetDialogModule_ProvideViewModelFactory$_avito_user_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final l f311889a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f311890b;

    /* renamed from: c, reason: collision with root package name */
    public final u f311891c;

    public g(l lVar, u uVar, Provider provider) {
        this.f311889a = lVar;
        this.f311890b = provider;
        this.f311891c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SoaWithPriceArguments soaWithPriceArguments = (SoaWithPriceArguments) this.f311889a.f393949a;
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((h.c.a) this.f311890b).get();
        k kVar = (k) this.f311891c.get();
        int i12 = c.f311884a;
        return new E(soaWithPriceArguments.f311843b, interfaceC35745a5, kVar);
    }
}
