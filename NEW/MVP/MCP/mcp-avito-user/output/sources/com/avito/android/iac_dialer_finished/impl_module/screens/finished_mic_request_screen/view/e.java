package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacFinishedMicRequestScreenViewFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f166817a;

    public e(C30102l3 c30102l3) {
        this.f166817a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f166817a.get());
    }
}
