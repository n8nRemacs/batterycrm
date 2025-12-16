package com.avito.android.serp.adapter.title;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupTitleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272447a;

    public b(u uVar) {
        this.f272447a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f272447a.get());
    }
}
