package com.avito.android.loyalty.ui.quality_service.items.grade_info;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GradeInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f183903a;

    public d(g gVar) {
        this.f183903a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f183903a.get());
    }
}
