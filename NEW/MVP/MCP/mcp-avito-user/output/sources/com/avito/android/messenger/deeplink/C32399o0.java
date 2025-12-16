package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.ChannelsLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideChannelsDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32399o0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195536a;

    /* renamed from: b, reason: collision with root package name */
    public final C32417y f195537b;

    public C32399o0(C32379e0 c32379e0, C32417y c32417y) {
        this.f195536a = c32379e0;
        this.f195537b = c32417y;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32417y c32417y = this.f195537b;
        this.f195536a.getClass();
        return new C43834a(ChannelsLink.class, null, new C43834a.b.C11809b(c32417y));
    }
}
