package com.avito.android.publish.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.analytics.C33517c;
import com.avito.android.publish.analytics.InterfaceC33515a;
import com.google.gson.Gson;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishPhotoPickerAnalyticsModule_ProvidePublishPhotoPickerAnalyticTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class O implements dagger.internal.h<InterfaceC33515a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C50213a> f235156a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f235157b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f235158c;

    /* renamed from: d, reason: collision with root package name */
    public final C33813d f235159d;

    public O(Provider provider, dagger.internal.f fVar, dagger.internal.u uVar, C33813d c33813d) {
        this.f235156a = provider;
        this.f235157b = fVar;
        this.f235158c = uVar;
        this.f235159d = c33813d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C50213a c50213a = this.f235156a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f235157b.get();
        com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) this.f235158c.get();
        this.f235159d.getClass();
        Gson gsonB = C33813d.b();
        L.f235153a.getClass();
        return new C33517c(interfaceC28373a, c50213a, cVar, gsonB);
    }
}
