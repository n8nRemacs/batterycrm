package com.avito.android.gig_shift_action.mvi;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: GigShiftActionReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f160521a;

    public v(Provider<Resources> provider) {
        this.f160521a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f160521a.get());
    }
}
