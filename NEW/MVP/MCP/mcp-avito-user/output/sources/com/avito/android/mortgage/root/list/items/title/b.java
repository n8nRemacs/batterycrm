package com.avito.android.mortgage.root.list.items.title;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f202882a;

    public b(e eVar) {
        this.f202882a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f202882a.get());
    }
}
