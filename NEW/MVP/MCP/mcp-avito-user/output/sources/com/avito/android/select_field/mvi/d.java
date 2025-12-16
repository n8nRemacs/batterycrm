package com.avito.android.select_field.mvi;

import com.avito.android.select_field.model.SelectFieldArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectFieldActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f267191a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.select_field.interactor.c f267192b;

    public d(l lVar, com.avito.android.select_field.interactor.c cVar) {
        this.f267191a = lVar;
        this.f267192b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SelectFieldArguments) this.f267191a.f393949a, (com.avito.android.select_field.interactor.a) this.f267192b.get());
    }
}
