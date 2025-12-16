package com.avito.android.status_doc.lifecycle;

import com.avito.android.status_doc.mvi.logic.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigStatusDocViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.status_doc.mvi.logic.h f284905a;

    public f(com.avito.android.status_doc.mvi.logic.h hVar) {
        this.f284905a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f284905a.get(), null, 2, null);
    }
}
