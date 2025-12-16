package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.SupportChatFormLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideSupportChatFormDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195590a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f195591b;

    public y0(C32379e0 c32379e0, T0 t02) {
        this.f195590a = c32379e0;
        this.f195591b = t02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = this.f195591b;
        this.f195590a.getClass();
        return new C43834a(SupportChatFormLink.class, null, new C43834a.b.C11809b(t02));
    }
}
