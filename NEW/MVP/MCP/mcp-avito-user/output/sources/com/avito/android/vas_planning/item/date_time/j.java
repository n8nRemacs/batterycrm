package com.avito.android.vas_planning.item.date_time;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningDateTimePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f322383a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f322384b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f322383a = provider;
        this.f322384b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f322383a.get(), (com.avito.android.vas_planning.b) this.f322384b.f393949a);
    }
}
