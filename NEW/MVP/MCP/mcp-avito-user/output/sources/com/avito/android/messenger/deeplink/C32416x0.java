package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.SendMessageByItemLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideSendMessageByItemDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32416x0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195585a;

    /* renamed from: b, reason: collision with root package name */
    public final R0 f195586b;

    public C32416x0(C32379e0 c32379e0, R0 r02) {
        this.f195585a = c32379e0;
        this.f195586b = r02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f195585a.getClass();
        return new C43834a(SendMessageByItemLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SendMessageByItemLink.class), this.f195586b));
    }
}
