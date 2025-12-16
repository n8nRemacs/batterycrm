package com.avito.android.messenger_icebreakers_dialog.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MessengerIcebreakerDialogDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final s f197647a;

    public u(s sVar) {
        this.f197647a = sVar;
    }

    public static C43834a a(s sVar) {
        t.f197646a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MessengerIcebreakerDialogDeeplink.class, new v(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MessengerIcebreakerDialogDeeplink.class), sVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f197647a);
    }
}
