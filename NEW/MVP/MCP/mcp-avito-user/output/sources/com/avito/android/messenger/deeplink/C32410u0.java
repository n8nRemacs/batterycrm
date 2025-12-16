package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideMarkChannelUnreadDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32410u0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195572a;

    /* renamed from: b, reason: collision with root package name */
    public final C32377d0 f195573b;

    public C32410u0(C32379e0 c32379e0, C32377d0 c32377d0) {
        this.f195572a = c32379e0;
        this.f195573b = c32377d0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32377d0 c32377d0 = this.f195573b;
        this.f195572a.getClass();
        return new C43834a(MarkChannelUnreadLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MarkChannelUnreadLink.class), c32377d0));
    }
}
