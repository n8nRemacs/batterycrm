package com.avito.android.section.skeleton;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionSkeletonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final h f264872a;

    public c(h hVar) {
        this.f264872a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f264872a.get());
    }
}
