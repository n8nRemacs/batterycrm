package com.avito.android.screen_flow.handler;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ScreenFlowV1LinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f260200a;

    /* renamed from: b, reason: collision with root package name */
    public final u f260201b;

    public e(dagger.internal.f fVar, u uVar) {
        this.f260200a = fVar;
        this.f260201b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f260200a.get(), (a) this.f260201b.get());
    }
}
