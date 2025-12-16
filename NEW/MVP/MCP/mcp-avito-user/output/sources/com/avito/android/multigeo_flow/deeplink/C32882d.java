package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: JobMultiGeoAddDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.multigeo_flow.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32882d implements dagger.internal.h<C32881c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f206825a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f206826b;

    public C32882d(dagger.internal.f fVar, Provider provider) {
        this.f206825a = fVar;
        this.f206826b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32881c((com.avito.android.deeplink_handler.handler.composite.a) this.f206825a.get(), this.f206826b.get());
    }
}
