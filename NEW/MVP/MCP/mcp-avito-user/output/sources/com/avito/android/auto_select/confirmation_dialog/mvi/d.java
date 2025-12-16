package com.avito.android.auto_select.confirmation_dialog.mvi;

import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectConfirmationBottomSheetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f95896a;

    public d(l lVar) {
        this.f95896a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((AutoSelectContactConfirmation) this.f95896a.f393949a);
    }
}
