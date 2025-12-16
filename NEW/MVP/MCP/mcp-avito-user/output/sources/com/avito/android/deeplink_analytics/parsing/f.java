package com.avito.android.deeplink_analytics.parsing;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeeplinkParsingAnalyticsTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f134135a;

    /* renamed from: b, reason: collision with root package name */
    public final c f134136b;

    /* renamed from: c, reason: collision with root package name */
    public final S f134137c;

    public f(dagger.internal.f fVar, c cVar, S s5) {
        this.f134135a = fVar;
        this.f134136b = cVar;
        this.f134137c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134135a.get();
        this.f134136b.getClass();
        return new d(interfaceC28373a, new b(), (P) this.f134137c.get());
    }
}
