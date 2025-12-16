package com.avito.android.realty_agency.checkerboard;

import com.avito.android.realty_agency.checkerboard.mvi.w;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41341a;

/* compiled from: CheckerboardViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.realty_agency.checkerboard.mvi.x f251358a;

    /* renamed from: b, reason: collision with root package name */
    public final u f251359b;

    public p(com.avito.android.realty_agency.checkerboard.mvi.x xVar, u uVar) {
        this.f251358a = xVar;
        this.f251359b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((w) this.f251358a.get(), (InterfaceC41341a) this.f251359b.get());
    }
}
