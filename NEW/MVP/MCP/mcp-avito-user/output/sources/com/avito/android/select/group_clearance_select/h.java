package com.avito.android.select.group_clearance_select;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupClearanceValuesMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265501a;

    public h(dagger.internal.l lVar) {
        this.f265501a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((GroupClearanceParams) this.f265501a.f393949a);
    }
}
