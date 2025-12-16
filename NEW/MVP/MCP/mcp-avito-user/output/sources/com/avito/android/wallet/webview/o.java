package com.avito.android.wallet.webview;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletWebViewIntentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f329439a;

    public o(C30102l3 c30102l3) {
        this.f329439a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Context) this.f329439a.get());
    }
}
