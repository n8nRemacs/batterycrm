package com.avito.android.confirm_documents_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmDocumentsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final m f125664a;

    public u(m mVar) {
        this.f125664a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((l) this.f125664a.get(), null, 2, null);
    }
}
