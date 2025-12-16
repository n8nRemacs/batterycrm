package com.avito.android.serp.adapter.recomendations.restyle;

import com.avito.android.serp.adapter.recomendations.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExpandableSectionBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270573a;

    public b(u uVar) {
        this.f270573a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f270573a.get());
    }
}
