package com.avito.android.code_check.code_confirm.timer.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TimerReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118796a;

    public h(u uVar) {
        this.f118796a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.lib.design.ticking_button.d) this.f118796a.get());
    }
}
