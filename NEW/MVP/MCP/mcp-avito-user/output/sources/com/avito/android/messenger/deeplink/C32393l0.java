package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.ChannelCallLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideChannelCallDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32393l0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195526a;

    /* renamed from: b, reason: collision with root package name */
    public final r f195527b;

    public C32393l0(C32379e0 c32379e0, r rVar) {
        this.f195526a = c32379e0;
        this.f195527b = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f195526a.getClass();
        return new C43834a(ChannelCallLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ChannelCallLink.class), this.f195527b));
    }
}
