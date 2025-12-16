package com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f266356a;

    public c(Provider<d> provider) {
        this.f266356a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f266356a.get());
    }
}
