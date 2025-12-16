package com.avito.android.rating_ui.aspects;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAspectsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249870a;

    public c(u uVar) {
        this.f249870a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f249870a.get());
    }
}
