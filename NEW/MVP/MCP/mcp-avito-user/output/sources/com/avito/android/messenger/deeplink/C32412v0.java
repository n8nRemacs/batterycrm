package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.PinChannelLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvidePinChannelDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.v0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32412v0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195576a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f195577b;

    public C32412v0(C32379e0 c32379e0, H0 h02) {
        this.f195576a = c32379e0;
        this.f195577b = h02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H0 h02 = this.f195577b;
        this.f195576a.getClass();
        return new C43834a(PinChannelLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PinChannelLink.class), h02));
    }
}
