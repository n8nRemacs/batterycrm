package com.avito.android.delivery_location_suggest;

import Mn0.InterfaceC14512b;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: DeliveryLocationSuggestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f135212a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f135213b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f135214c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC14512b> f135215d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C44245a> f135216e;

    public q(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f135212a = uVar;
        this.f135213b = provider;
        this.f135214c = provider2;
        this.f135215d = provider3;
        this.f135216e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((InterfaceC31564a) this.f135212a.get(), this.f135213b.get(), this.f135214c.get(), this.f135215d.get(), this.f135216e.get());
    }
}
