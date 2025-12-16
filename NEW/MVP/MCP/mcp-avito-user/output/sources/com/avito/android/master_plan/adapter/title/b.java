package com.avito.android.master_plan.adapter.title;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186016a;

    public b(u uVar) {
        this.f186016a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f186016a.get());
    }
}
