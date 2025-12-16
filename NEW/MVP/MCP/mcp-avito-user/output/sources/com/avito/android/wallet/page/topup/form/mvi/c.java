package com.avito.android.wallet.page.topup.form.mvi;

import com.avito.android.wallet.page.topup.form.mvi.component.i;
import com.avito.android.wallet.page.topup.form.mvi.component.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopUpFormViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f328354a;

    public c(j jVar) {
        this.f328354a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((i) this.f328354a.get(), null, 2, null);
    }
}
