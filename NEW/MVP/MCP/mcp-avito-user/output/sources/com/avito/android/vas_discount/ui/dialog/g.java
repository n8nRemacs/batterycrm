package com.avito.android.vas_discount.ui.dialog;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DiscountPickerViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DiscountResponse> f319698a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319699b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f319700c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f319698a = provider;
        this.f319699b = uVar;
        this.f319700c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f319698a.get(), (com.avito.android.vas_discount.business.d) this.f319699b.get(), this.f319700c.get());
    }
}
