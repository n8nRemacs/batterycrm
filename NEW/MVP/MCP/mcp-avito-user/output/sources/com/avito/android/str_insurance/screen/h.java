package com.avito.android.str_insurance.screen;

import com.avito.android.str_insurance.screen.mvi.i;
import com.avito.android.str_insurance.screen.mvi.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final j f288725a;

    public h(j jVar) {
        this.f288725a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((i) this.f288725a.get(), null, 2, null);
    }
}
