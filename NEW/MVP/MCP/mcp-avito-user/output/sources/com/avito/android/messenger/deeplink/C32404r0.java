package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelWithAvitoLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideCreateChannelWithAvitoDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.r0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32404r0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195562a;

    /* renamed from: b, reason: collision with root package name */
    public final P f195563b;

    public C32404r0(C32379e0 c32379e0, P p12) {
        this.f195562a = c32379e0;
        this.f195563b = p12;
    }

    public static C43834a a(C32379e0 c32379e0, P p12) {
        c32379e0.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CreateChannelWithAvitoLink.class, new CreateChannelWithAvitoLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CreateChannelWithAvitoLink.class), p12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f195562a, this.f195563b);
    }
}
