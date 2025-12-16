package com.avito.android.photo_list_view_group_selection.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhotoItemGroupSelectionModule_ProvideDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f218408a;

    public i(u uVar) {
        this.f218408a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f218408a.get();
        f.f218403a.getClass();
        return new C14699c(aVar);
    }
}
