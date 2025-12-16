package com.avito.android.analytics.clickstream;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import javax.inject.Provider;

/* compiled from: ClickStreamCrashReporterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28397w implements dagger.internal.h<C28396v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f89840a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f89841b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.error_reporting.f> f89842c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.error_reporting.memory.c f89843d;

    public C28397w(dagger.internal.f fVar, C30102l3 c30102l3, Provider provider, com.avito.android.error_reporting.memory.c cVar) {
        this.f89840a = fVar;
        this.f89841b = c30102l3;
        this.f89842c = provider;
        this.f89843d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f89840a.get();
        Context context = (Context) this.f89841b.get();
        h31.e eVarB = dagger.internal.g.b(this.f89842c);
        this.f89843d.getClass();
        return new C28396v(interfaceC28373a, context, eVarB, new com.avito.android.error_reporting.memory.b());
    }
}
