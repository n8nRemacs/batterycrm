package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.UnpinChannelLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideUnpinChannelDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class z0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195594a;

    /* renamed from: b, reason: collision with root package name */
    public final X0 f195595b;

    public z0(C32379e0 c32379e0, X0 x02) {
        this.f195594a = c32379e0;
        this.f195595b = x02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        X0 x02 = this.f195595b;
        this.f195594a.getClass();
        return new C43834a(UnpinChannelLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UnpinChannelLink.class), x02));
    }
}
