package com.avito.android.messenger.deeplink;

import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideFlowerRedirectLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.t0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32408t0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195570a;

    /* renamed from: b, reason: collision with root package name */
    public final U f195571b;

    public C32408t0(C32379e0 c32379e0, U u12) {
        this.f195570a = c32379e0;
        this.f195571b = u12;
    }

    public static C43834a a(C32379e0 c32379e0, U u12) {
        c32379e0.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FlowerRedirectLink.class, new W(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FlowerRedirectLink.class), u12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f195570a, this.f195571b);
    }
}
