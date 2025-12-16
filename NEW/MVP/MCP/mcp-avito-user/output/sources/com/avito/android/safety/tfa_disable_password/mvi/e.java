package com.avito.android.safety.tfa_disable_password.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TfaDisablePasswordBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f258118a;

    public e(dagger.internal.l lVar) {
        this.f258118a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(((Boolean) this.f258118a.f393949a).booleanValue());
    }
}
