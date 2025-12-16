package com.avito.android.imv_cars_details.di;

import com.avito.android.deep_linking.links.ImvCarsDetailsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ImvCarsDetailsDeepLinkHandlerModule_ProvideImvCarsDetailsDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final VM.b f169938a;

    public e(VM.b bVar) {
        this.f169938a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        VM.b bVar = this.f169938a;
        d.f169937a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ImvCarsDetailsLink.class, new VM.e(), new C43834a.b.C11809b(bVar));
    }
}
