package com.avito.android.screen_flow.handler;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ScreenFlowV2LinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f260202a;

    /* renamed from: b, reason: collision with root package name */
    public final u f260203b;

    public g(dagger.internal.f fVar, u uVar) {
        this.f260202a = fVar;
        this.f260203b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f260202a.get(), (a) this.f260203b.get());
    }
}
