package com.avito.android.publish.drafts.di;

import Zd0.C19544b;
import Zd0.InterfaceC19543a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.di.C33813d;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishDraftsAnalyticsModule_ProvidePublishEventTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<InterfaceC19543a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f235342a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f235343b;

    /* renamed from: c, reason: collision with root package name */
    public final C33813d f235344c;

    public e(dagger.internal.f fVar, Provider provider, C33813d c33813d) {
        this.f235342a = fVar;
        this.f235343b = provider;
        this.f235344c = c33813d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f235342a.get();
        C50213a c50213a = this.f235343b.get();
        this.f235344c.getClass();
        Gson gsonB = C33813d.b();
        int i12 = d.f235341a;
        return new C19544b(interfaceC28373a, c50213a, gsonB);
    }
}
