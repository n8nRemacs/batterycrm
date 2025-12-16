package com.avito.android.multi_message_send.di;

import com.avito.android.multi_message_send.deeplink.MultiMessageBannerCloseDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;
import lv.C43834a;

/* compiled from: MultiMessageSendDeeplinkHandlerModule_ProvideMultiMessageBannerCloseDeeplinkMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* compiled from: MultiMessageSendDeeplinkHandlerModule_ProvideMultiMessageBannerCloseDeeplinkMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f206677a = new g();
    }

    public static g a() {
        return a.f206677a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f206676a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        kotlin.reflect.d dVarB = m0.f406844a.b(MultiMessageBannerCloseDeeplink.class);
        com.avito.android.multi_message_send.deeplink.a aVar = new com.avito.android.multi_message_send.deeplink.a();
        c11807a.getClass();
        return C43834a.C11807a.a(dVarB, aVar);
    }
}
