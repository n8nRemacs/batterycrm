package com.avito.android.loyalty.ui.items.action;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183647a;

    public c(u uVar) {
        this.f183647a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f183647a.get());
    }
}
