package com.avito.android.wallet.page.history.mvi;

import com.avito.android.wallet.page.history.mvi.component.i;
import com.avito.android.wallet.page.history.mvi.component.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentHistoryViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f328077a;

    public f(j jVar) {
        this.f328077a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f328077a.get(), null, 2, null);
    }
}
