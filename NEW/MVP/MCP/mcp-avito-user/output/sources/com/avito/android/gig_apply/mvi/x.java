package com.avito.android.gig_apply.mvi;

import android.content.res.Resources;

/* compiled from: GigSlotOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f159794a;

    public x(dagger.internal.u uVar) {
        this.f159794a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w((Resources) this.f159794a.get());
    }
}
