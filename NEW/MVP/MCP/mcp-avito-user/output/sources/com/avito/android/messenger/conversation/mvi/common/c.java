package com.avito.android.messenger.conversation.mvi.common;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import u3.l;

/* compiled from: AboveInputActionsVisibleControllerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f190170a;

    public c(u uVar) {
        this.f190170a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((l) this.f190170a.get());
    }
}
