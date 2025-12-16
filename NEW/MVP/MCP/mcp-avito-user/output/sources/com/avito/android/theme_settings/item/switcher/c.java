package com.avito.android.theme_settings.item.switcher;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SwitcherItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301343a;

    public c(u uVar) {
        this.f301343a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f301343a.get());
    }
}
