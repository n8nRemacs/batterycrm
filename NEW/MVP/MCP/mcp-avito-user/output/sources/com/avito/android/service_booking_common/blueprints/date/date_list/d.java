package com.avito.android.service_booking_common.blueprints.date.date_list;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbDateListItemDecorator_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f276338a;

    public d(l lVar) {
        this.f276338a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Resources) this.f276338a.f393949a);
    }
}
