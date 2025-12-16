package com.avito.android.home.tabs_item.skeleton;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SkeletonSectionTabsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f162490a;

    public e(u uVar) {
        this.f162490a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a) this.f162490a.get());
    }
}
