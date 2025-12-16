package com.avito.android.beduin.common.component.grid_layout.row;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinGridLayoutRowContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f101376a;

    public e(dagger.internal.f fVar) {
        this.f101376a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(g.a(w.a(this.f101376a)));
    }
}
