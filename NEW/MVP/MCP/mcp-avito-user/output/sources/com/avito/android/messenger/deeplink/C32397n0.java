package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.ChannelMapLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideChannelMapMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.n0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32397n0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195533a;

    /* renamed from: b, reason: collision with root package name */
    public final C32413w f195534b;

    public C32397n0(C32379e0 c32379e0, C32413w c32413w) {
        this.f195533a = c32379e0;
        this.f195534b = c32413w;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32413w c32413w = this.f195534b;
        this.f195533a.getClass();
        return new C43834a(ChannelMapLink.class, null, new C43834a.b.C11809b(c32413w));
    }
}
