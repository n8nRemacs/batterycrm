package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideCreateChannelDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32403q0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195552a;

    /* renamed from: b, reason: collision with root package name */
    public final N f195553b;

    public C32403q0(C32379e0 c32379e0, N n12) {
        this.f195552a = c32379e0;
        this.f195553b = n12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = this.f195553b;
        this.f195552a.getClass();
        return new C43834a(CreateChannelLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CreateChannelLink.class), n12));
    }
}
