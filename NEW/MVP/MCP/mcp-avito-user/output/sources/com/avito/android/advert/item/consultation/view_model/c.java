package com.avito.android.advert.item.consultation.view_model;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ow.InterfaceC44946a;

/* compiled from: ConsultationDataViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f74834a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44946a> f74835b;

    public c(Provider<InterfaceC35745a5> provider, Provider<InterfaceC44946a> provider2) {
        this.f74834a = provider;
        this.f74835b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f74834a.get(), g.a(w.a(this.f74835b)));
    }
}
