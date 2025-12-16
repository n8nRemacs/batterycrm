package com.avito.android.gig_slot_show_qr.ui;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotShowQrIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f160952a;

    public h(C30102l3 c30102l3) {
        this.f160952a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f160952a.get());
    }
}
