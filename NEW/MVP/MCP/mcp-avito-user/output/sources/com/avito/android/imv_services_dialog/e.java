package com.avito.android.imv_services_dialog;

import com.avito.android.imv_services_dialog.mvi.f;
import com.avito.android.imv_services_dialog.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvServicesDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f170787a;

    public e(g gVar) {
        this.f170787a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f170787a.get(), null, 2, null);
    }
}
