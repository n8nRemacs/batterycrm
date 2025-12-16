package com.avito.android.autoteka.data.choosingProduct;

import com.avito.android.autoteka.data.i;
import com.avito.android.autoteka.data.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaChoosingPurchaseInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f96109a;

    public d(j jVar) {
        this.f96109a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((i) this.f96109a.get());
    }
}
