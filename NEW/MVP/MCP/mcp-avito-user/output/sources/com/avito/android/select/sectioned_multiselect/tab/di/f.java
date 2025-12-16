package com.avito.android.select.sectioned_multiselect.tab.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectTabModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.Items.section_list.i f266752a;

    public f(com.avito.android.select.sectioned_multiselect.Items.section_list.i iVar) {
        this.f266752a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select.sectioned_multiselect.Items.section_list.h hVar = (com.avito.android.select.sectioned_multiselect.Items.section_list.h) this.f266752a.get();
        e.f266751a.getClass();
        return new com.avito.android.recycler.data_aware.i(hVar, null, false, null, 14, null);
    }
}
