package com.avito.android.serp.adapter.empty_search;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptySearchItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f269943a;

    public c(u uVar) {
        this.f269943a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((h) this.f269943a.get());
    }
}
