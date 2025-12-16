package com.avito.android.advert.item.consultation.dynamic_content;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DynamicConsultationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74743a;

    public b(u uVar) {
        this.f74743a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f74743a.get());
    }
}
