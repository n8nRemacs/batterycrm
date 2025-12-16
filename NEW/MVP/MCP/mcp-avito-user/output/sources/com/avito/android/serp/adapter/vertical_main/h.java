package com.avito.android.serp.adapter.vertical_main;

import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerticalFilterFitter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272935a;

    public h(u uVar) {
        this.f272935a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((M) this.f272935a.get());
    }
}
