package com.avito.android.select.new_metro.di;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gq0.InterfaceC40721a;

/* compiled from: SelectMetroBaseModule_GetAnalyticsInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC40721a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f266168a;

    public f(u uVar) {
        this.f266168a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f266168a.get();
        e.f266167a.getClass();
        return new gq0.e(interfaceC28373a);
    }
}
