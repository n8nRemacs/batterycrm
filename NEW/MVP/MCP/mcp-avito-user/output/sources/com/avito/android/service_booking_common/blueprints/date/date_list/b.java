package com.avito.android.service_booking_common.blueprints.date.date_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbDateListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f276334a;

    /* renamed from: b, reason: collision with root package name */
    public final u f276335b;

    public b(u uVar, Provider provider) {
        this.f276334a = provider;
        this.f276335b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276334a.get(), (com.avito.android.server_time.j) this.f276335b.get());
    }
}
