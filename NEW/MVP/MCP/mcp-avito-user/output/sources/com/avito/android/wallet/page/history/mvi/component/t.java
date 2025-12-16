package com.avito.android.wallet.page.history.mvi.component;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentHistoryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final p f328055a;

    public t(p pVar) {
        this.f328055a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((o) this.f328055a.get());
    }
}
