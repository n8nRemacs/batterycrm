package com.avito.android.code_check.code_confirm.timer.mvi;

import Ko.InterfaceC14336b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TimerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f118793a;

    /* renamed from: b, reason: collision with root package name */
    public final h f118794b;

    public f(c cVar, h hVar) {
        this.f118793a = cVar;
        this.f118794b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e("CodeCheckTimer", InterfaceC14336b.a.f9655a, new d((a) this.f118793a.get(), (g) this.f118794b.get()));
    }
}
