package com.avito.android.confirm_documents_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmDocumentsModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125527a;

    public h(u uVar) {
        this.f125527a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f125527a.get();
        d.f125521a.getClass();
        return jVar;
    }
}
