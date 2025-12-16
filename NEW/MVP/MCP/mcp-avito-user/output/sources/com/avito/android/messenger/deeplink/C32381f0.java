package com.avito.android.messenger.deeplink;

import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ChannelBottomSheetInputParserFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32381f0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195511a;

    /* renamed from: b, reason: collision with root package name */
    public final C32380f f195512b;

    public C32381f0(C32379e0 c32379e0, C32380f c32380f) {
        this.f195511a = c32379e0;
        this.f195512b = c32380f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32380f c32380f = this.f195512b;
        this.f195511a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ChannelBottomSheetInputLink.class, new C32384h(), new C43834a.b.C11809b(c32380f));
    }
}
