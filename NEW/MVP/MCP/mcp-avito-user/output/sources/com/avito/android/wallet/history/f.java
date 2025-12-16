package com.avito.android.wallet.history;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletHistoryIntentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f327524a;

    public f(C30102l3 c30102l3) {
        this.f327524a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Context) this.f327524a.get());
    }
}
