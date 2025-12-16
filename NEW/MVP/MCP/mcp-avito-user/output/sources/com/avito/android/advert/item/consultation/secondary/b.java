package com.avito.android.advert.item.consultation.secondary;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SecondaryConsultationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74803a;

    public b(u uVar) {
        this.f74803a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f74803a.get());
    }
}
