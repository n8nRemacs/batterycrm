package com.avito.android.advert.item.auto_credits;

import Me.i;
import com.avito.android.advert.item.auto_credits.c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAutoLoansPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f72899a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72900b;

    public f(dagger.internal.f fVar, u uVar) {
        this.f72899a = uVar;
        this.f72900b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f72899a.get(), (c.a) this.f72900b.get());
    }
}
