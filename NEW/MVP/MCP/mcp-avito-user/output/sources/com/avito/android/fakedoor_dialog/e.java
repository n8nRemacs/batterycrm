package com.avito.android.fakedoor_dialog;

import com.avito.android.fakedoor_dialog.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakeDoorDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fakedoor_dialog.mvi.h f155121a;

    public e(com.avito.android.fakedoor_dialog.mvi.h hVar) {
        this.f155121a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((g) this.f155121a.get(), null, 2, null);
    }
}
