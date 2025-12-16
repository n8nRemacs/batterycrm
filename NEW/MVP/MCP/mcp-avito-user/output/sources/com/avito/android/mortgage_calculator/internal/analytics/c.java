package com.avito.android.mortgage_calculator.internal.analytics;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;

/* compiled from: CalculatorAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f204289a;

    /* renamed from: b, reason: collision with root package name */
    public final C35801g6 f204290b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f204291c;

    public c(dagger.internal.u uVar, C35801g6 c35801g6, dagger.internal.u uVar2) {
        this.f204289a = uVar;
        this.f204290b = c35801g6;
        this.f204291c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f204289a.get();
        this.f204290b.getClass();
        return new b(interfaceC28373a, new C35793f6(), (Context) this.f204291c.get());
    }
}
