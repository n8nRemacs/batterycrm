package com.avito.android.sbc.create.mvi.util;

import com.avito.android.sbc.create.mvi.H0;
import com.avito.android.sbc.create.mvi.I0;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MnzVasFooterActionButtonProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f259915a;

    public h(I0 i02) {
        this.f259915a = i02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((H0) this.f259915a.get());
    }
}
