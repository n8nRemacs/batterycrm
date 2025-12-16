package com.avito.android.publish.start_publish.blueprint;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryShortcutItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245350a;

    public c(u uVar) {
        this.f245350a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f245350a.get());
    }
}
