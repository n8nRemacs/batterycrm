package com.avito.android.comparison.items.diff_switch_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DiffSwitchItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f123934a;

    public c(f fVar) {
        this.f123934a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f123934a.get());
    }
}
