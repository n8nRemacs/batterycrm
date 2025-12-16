package com.avito.android.shift_list.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShiftListInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.shift_list.mvi.b f281043a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CG.a> f281044b;

    public b(com.avito.android.shift_list.mvi.b bVar, Provider provider) {
        this.f281043a = bVar;
        this.f281044b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.shift_list.mvi.a) this.f281043a.get(), this.f281044b.get());
    }
}
