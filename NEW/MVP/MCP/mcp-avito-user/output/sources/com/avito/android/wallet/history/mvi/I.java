package com.avito.android.wallet.history.mvi;

/* compiled from: WalletHistoryViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.history.mvi.components.j f327549a;

    public I(com.avito.android.wallet.history.mvi.components.j jVar) {
        this.f327549a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H((com.avito.android.wallet.history.mvi.components.i) this.f327549a.get(), null, 2, null);
    }
}
