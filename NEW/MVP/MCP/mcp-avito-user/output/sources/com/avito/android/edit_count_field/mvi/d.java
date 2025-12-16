package com.avito.android.edit_count_field.mvi;

import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditCountFieldActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_count_field.interactor.c f146637a;

    /* renamed from: b, reason: collision with root package name */
    public final l f146638b;

    public d(com.avito.android.edit_count_field.interactor.c cVar, l lVar) {
        this.f146637a = cVar;
        this.f146638b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.edit_count_field.interactor.a) this.f146637a.get(), (EditCountFieldArguments) this.f146638b.f393949a);
    }
}
