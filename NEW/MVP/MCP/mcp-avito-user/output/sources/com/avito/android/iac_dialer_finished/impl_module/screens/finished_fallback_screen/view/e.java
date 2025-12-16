package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.view;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacFinishedFallbackScreenViewFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f166627a;

    public e(C30102l3 c30102l3) {
        this.f166627a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f166627a.get());
    }
}
