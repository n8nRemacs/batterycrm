package com.avito.android.wallet.page;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPageIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f327817a;

    public e(l lVar) {
        this.f327817a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f327817a.f393949a);
    }
}
