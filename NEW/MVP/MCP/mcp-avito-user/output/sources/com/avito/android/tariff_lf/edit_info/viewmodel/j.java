package com.avito.android.tariff_lf.edit_info.viewmodel;

import bD0.InterfaceC25499a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EditInfoRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25499a> f299098a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299099b;

    public j(Provider<InterfaceC25499a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f299098a = provider;
        this.f299099b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f299098a.get(), this.f299099b.get());
    }
}
