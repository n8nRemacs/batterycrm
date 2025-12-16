package com.avito.android.mortgage.sending_confirm.mvi;

import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendingConfirmBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f203557a;

    public d(l lVar) {
        this.f203557a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SendingConfirmArguments) this.f203557a.f393949a);
    }
}
