package com.avito.android.wallet.page.mvi;

import com.avito.android.wallet.page.mvi.component.k;
import com.avito.android.wallet.page.mvi.component.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPageViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f328227a;

    public i(l lVar) {
        this.f328227a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((k) this.f328227a.get(), null, 2, null);
    }
}
