package com.avito.android.rating_ui.button;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingButtonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249990a;

    public c(u uVar) {
        this.f249990a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f249990a.get());
    }
}
