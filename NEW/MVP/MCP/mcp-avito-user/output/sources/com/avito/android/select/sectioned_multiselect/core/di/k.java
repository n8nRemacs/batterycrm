package com.avito.android.select.sectioned_multiselect.core.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.select.sectioned_multiselect.core.P;
import com.avito.android.select.sectioned_multiselect.core.Q;
import com.avito.android.select.sectioned_multiselect.core.S;
import com.avito.android.select.sectioned_multiselect.core.T;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectModule_ProvideSectionedMultiselectStorageViewModel$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266632a;

    /* renamed from: b, reason: collision with root package name */
    public final T f266633b;

    public k(dagger.internal.l lVar, T t12) {
        this.f266632a = lVar;
        this.f266633b = t12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f266632a.f393949a;
        this.f266633b.getClass();
        S s5 = new S();
        d.f266618a.getClass();
        return (P) new P0(t02, s5).a(Q.class);
    }
}
