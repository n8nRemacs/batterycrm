package com.avito.android.guests_selector.mvi;

import com.avito.android.guests_selector.GuestsSelectorOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f161531a;

    public e(dagger.internal.l lVar) {
        this.f161531a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((GuestsSelectorOpenParams) this.f161531a.f393949a);
    }
}
