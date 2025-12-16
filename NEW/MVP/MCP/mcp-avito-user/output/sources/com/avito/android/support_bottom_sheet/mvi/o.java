package com.avito.android.support_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SupportDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final i f292496a;

    public o(i iVar) {
        this.f292496a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((h) this.f292496a.get(), null, 2, null);
    }
}
