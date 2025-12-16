package com.avito.android.motivation_screen.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f206368a;

    public p(u uVar) {
        this.f206368a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.motivation_screen.domain.a) this.f206368a.get());
    }
}
