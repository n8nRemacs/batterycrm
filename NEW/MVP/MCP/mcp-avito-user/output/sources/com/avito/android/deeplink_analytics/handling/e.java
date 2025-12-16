package com.avito.android.deeplink_analytics.handling;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeeplinkHandlingAnalyticsTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f134117a;

    /* renamed from: b, reason: collision with root package name */
    public final c f134118b;

    /* renamed from: c, reason: collision with root package name */
    public final S f134119c;

    public e(f fVar, c cVar, S s5) {
        this.f134117a = fVar;
        this.f134118b = cVar;
        this.f134119c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134117a.get();
        this.f134118b.getClass();
        return new d(interfaceC28373a, new b(), (P) this.f134119c.get());
    }
}
