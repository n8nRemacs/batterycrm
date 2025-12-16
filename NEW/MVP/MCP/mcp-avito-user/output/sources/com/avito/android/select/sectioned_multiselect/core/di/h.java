package com.avito.android.select.sectioned_multiselect.core.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f266625a;

    public h(u uVar) {
        this.f266625a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f266625a.get();
        d.f266618a.getClass();
        return jVar;
    }
}
