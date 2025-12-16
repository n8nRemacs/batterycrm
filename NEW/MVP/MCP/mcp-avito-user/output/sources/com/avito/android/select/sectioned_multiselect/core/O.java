package com.avito.android.select.sectioned_multiselect.core;

import android.content.res.Resources;

/* compiled from: SectionedMultiselectDialogPresenterResourceProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266515a;

    public O(dagger.internal.l lVar) {
        this.f266515a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new N((Resources) this.f266515a.f393949a);
    }
}
