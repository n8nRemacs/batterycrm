package com.avito.android.select.sectioned_multiselect.container.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.select.sectioned_multiselect.core.P;
import com.avito.android.select.sectioned_multiselect.core.Q;
import com.avito.android.select.sectioned_multiselect.core.S;
import com.avito.android.select.sectioned_multiselect.core.T;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectContainerModule_Companion_ProvideSectionedMultiselectStorageViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final l f266443a;

    /* renamed from: b, reason: collision with root package name */
    public final T f266444b;

    public e(l lVar, T t12) {
        this.f266443a = lVar;
        this.f266444b = t12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f266443a.f393949a;
        this.f266444b.getClass();
        S s5 = new S();
        d.f266441a.getClass();
        return (P) new P0(t02, s5).a(Q.class);
    }
}
