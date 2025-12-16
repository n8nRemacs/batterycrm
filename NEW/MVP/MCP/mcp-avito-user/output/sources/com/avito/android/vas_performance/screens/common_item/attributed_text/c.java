package com.avito.android.vas_performance.screens.common_item.attributed_text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AttributedTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f320394a;

    public c(u uVar) {
        this.f320394a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f320394a.get());
    }
}
