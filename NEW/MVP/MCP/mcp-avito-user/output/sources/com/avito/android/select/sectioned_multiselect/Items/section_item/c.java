package com.avito.android.select.sectioned_multiselect.Items.section_item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f266328a;

    public c(Provider<d> provider) {
        this.f266328a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f266328a.get());
    }
}
