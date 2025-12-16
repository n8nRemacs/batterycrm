package com.avito.android.gig_shift_cancel.mvi;

import android.content.res.Resources;

/* compiled from: GigShiftCancelReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f160693a;

    public w(dagger.internal.u uVar) {
        this.f160693a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((Resources) this.f160693a.get());
    }
}
