package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.UnsupportedPlatformActionLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideUnsupportedPlatformActionDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195284a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action.f f195285b;

    public A0(C32379e0 c32379e0, com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action.f fVar) {
        this.f195284a = c32379e0;
        this.f195285b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action.f fVar = this.f195285b;
        this.f195284a.getClass();
        return new C43834a(UnsupportedPlatformActionLink.class, null, new C43834a.b.C11809b(fVar));
    }
}
