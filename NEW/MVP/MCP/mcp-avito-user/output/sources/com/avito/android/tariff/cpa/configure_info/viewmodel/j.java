package com.avito.android.tariff.cpa.configure_info.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaConfigureInfoRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f294542a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294543b;

    public j(Provider<WB0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f294542a = provider;
        this.f294543b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f294542a.get(), this.f294543b.get());
    }
}
