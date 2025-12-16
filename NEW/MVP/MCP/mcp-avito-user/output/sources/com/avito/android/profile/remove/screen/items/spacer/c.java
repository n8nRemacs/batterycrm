package com.avito.android.profile.remove.screen.items.spacer;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpacerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224117a;

    public c(u uVar) {
        this.f224117a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f224117a.get());
    }
}
