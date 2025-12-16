package com.avito.android.multi_message_send.di;

import com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MultiMessageSendDeeplinkHandlerModule_ProvideMultiMessageModalScreenDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.multi_message_send.deeplink.e f206678a;

    public h(com.avito.android.multi_message_send.deeplink.e eVar) {
        this.f206678a = eVar;
    }

    public static C43834a a(com.avito.android.multi_message_send.deeplink.e eVar) {
        f.f206676a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MultiMessageModalScreenDeeplink.class, new com.avito.android.multi_message_send.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MultiMessageModalScreenDeeplink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f206678a);
    }
}
