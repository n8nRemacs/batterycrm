package com.avito.android.advert.item.disclaimer_pd;

import com.avito.android.advert.item.InterfaceC28153o;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DisclaimerPDPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75229a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f75230b;

    public f(dagger.internal.f fVar, u uVar) {
        this.f75229a = uVar;
        this.f75230b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Ax.e) this.f75229a.get(), (InterfaceC28153o) this.f75230b.get());
    }
}
