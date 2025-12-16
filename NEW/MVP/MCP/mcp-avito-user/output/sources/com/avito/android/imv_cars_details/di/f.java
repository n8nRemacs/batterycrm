package com.avito.android.imv_cars_details.di;

import com.avito.android.deep_linking.links.ImvCarsDetailsLinkV2;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ImvCarsDetailsDeepLinkHandlerModule_ProvideImvCarsDetailsDeeplinkV2HandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final VM.d f169939a;

    public f(VM.d dVar) {
        this.f169939a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f169937a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ImvCarsDetailsLinkV2.class, new VM.f(), new C43834a.b.C11809b(this.f169939a));
    }
}
