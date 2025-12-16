package com.avito.android.select.sectioned_multiselect.core.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_list.i f266624a;

    public g(com.avito.android.select.sectioned_multiselect.Items.section_list.i iVar) {
        this.f266624a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select.sectioned_multiselect.Items.section_list.h hVar = (com.avito.android.select.sectioned_multiselect.Items.section_list.h) this.f266624a.get();
        d.f266618a.getClass();
        return new com.avito.android.recycler.data_aware.i(hVar, null, false, null, 14, null);
    }
}
