package com.avito.android.extended_profile_selection_create.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateModule_ProvideSpanLookupFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<QH.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f152269a;

    public n(u uVar) {
        this.f152269a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = ((Integer) this.f152269a.get()).intValue();
        f.f152261a.getClass();
        return new QH.b(new g(iIntValue));
    }
}
