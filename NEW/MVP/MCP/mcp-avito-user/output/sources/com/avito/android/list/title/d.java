package com.avito.android.list.title;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TitleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181654a;

    public d(u uVar) {
        this.f181654a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((b) this.f181654a.get());
    }
}
