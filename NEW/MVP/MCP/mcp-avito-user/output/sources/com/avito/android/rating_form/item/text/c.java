package com.avito.android.rating_form.item.text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248683a;

    public c(u uVar) {
        this.f248683a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f248683a.get());
    }
}
