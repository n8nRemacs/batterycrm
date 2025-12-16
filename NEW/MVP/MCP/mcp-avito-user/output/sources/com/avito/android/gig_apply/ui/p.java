package com.avito.android.gig_apply.ui;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: GigSlotIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f160016a;

    public p(C30102l3 c30102l3) {
        this.f160016a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Context) this.f160016a.get());
    }
}
