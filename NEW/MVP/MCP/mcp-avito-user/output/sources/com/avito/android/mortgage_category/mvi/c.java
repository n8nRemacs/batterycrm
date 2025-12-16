package com.avito.android.mortgage_category.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageCategoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_category.mvi.domain.b f204920a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_category.mvi.domain.e f204921b;

    /* renamed from: c, reason: collision with root package name */
    public final I10.c f204922c;

    public c(com.avito.android.mortgage_category.mvi.domain.b bVar, com.avito.android.mortgage_category.mvi.domain.e eVar, I10.c cVar) {
        this.f204920a = bVar;
        this.f204921b = eVar;
        this.f204922c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage_category.mvi.domain.a) this.f204920a.get(), (com.avito.android.mortgage_category.mvi.domain.d) this.f204921b.get(), (I10.a) this.f204922c.get());
    }
}
