package com.avito.android.section.complementary;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComplementaryTitleWithActionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264647a;

    public j(u uVar) {
        this.f264647a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Vp0.b) this.f264647a.get());
    }
}
