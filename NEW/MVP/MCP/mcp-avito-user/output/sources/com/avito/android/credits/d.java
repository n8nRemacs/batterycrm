package com.avito.android.credits;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;
import com.avito.android.util.Kundle;

/* compiled from: CreditBrokerAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f128849a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f128850b;

    /* renamed from: c, reason: collision with root package name */
    public final C35801g6 f128851c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f128852d;

    public d(dagger.internal.l lVar, dagger.internal.u uVar, C35801g6 c35801g6, dagger.internal.u uVar2) {
        this.f128849a = lVar;
        this.f128850b = uVar;
        this.f128851c = c35801g6;
        this.f128852d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f128849a.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f128850b.get();
        this.f128851c.getClass();
        return new b(str, interfaceC28373a, new C35793f6(), (Kundle) this.f128852d.get());
    }
}
