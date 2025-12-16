package com.avito.android.profile.remove.screen.items.list_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224103a;

    public c(u uVar) {
        this.f224103a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f224103a.get());
    }
}
