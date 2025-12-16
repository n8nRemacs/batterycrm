package com.avito.android.captcha.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CaptchaEventsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f114966a;

    /* renamed from: b, reason: collision with root package name */
    public final f f114967b;

    public d(dagger.internal.f fVar, f fVar2) {
        this.f114966a = fVar;
        this.f114967b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f114966a.get();
        this.f114967b.getClass();
        return new c(interfaceC28373a, new e());
    }
}
