package com.avito.android.comfortable_deal.stages_transition.item.reasonslist;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonsListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f122911a;

    /* renamed from: b, reason: collision with root package name */
    public final l f122912b;

    public b(e eVar, l lVar) {
        this.f122911a = eVar;
        this.f122912b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f122911a.getClass();
        return new a(new d(), (Y41.l) this.f122912b.f393949a);
    }
}
