package com.avito.android.notification_center.list.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ErrorSnippetItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207610a;

    public b(u uVar) {
        this.f207610a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f207610a.get());
    }
}
