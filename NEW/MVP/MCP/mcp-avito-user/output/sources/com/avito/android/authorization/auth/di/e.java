package com.avito.android.authorization.auth.di;

import android.app.Activity;
import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthModule_ProvideContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92932a;

    public e(dagger.internal.l lVar) {
        this.f92932a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f92932a.f393949a;
        d.f92931a.getClass();
        return activity;
    }
}
