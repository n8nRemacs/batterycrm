package com.avito.android.gig_slot_show_qr.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotShowQrInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OG.a> f160881a;

    public b(Provider<OG.a> provider) {
        this.f160881a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f160881a.get());
    }
}
