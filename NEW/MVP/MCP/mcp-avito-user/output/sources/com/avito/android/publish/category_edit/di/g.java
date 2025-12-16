package com.avito.android.publish.category_edit.di;

import androidx.fragment.app.DialogFragment;
import androidx.view.InterfaceC23487e;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryEditModule_ProvideRegistryOwnerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<InterfaceC23487e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f232354a;

    public g(l lVar) {
        this.f232354a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DialogFragment dialogFragment = (DialogFragment) this.f232354a.f393949a;
        c.f232350a.getClass();
        return dialogFragment;
    }
}
