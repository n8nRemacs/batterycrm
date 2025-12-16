package com.avito.android.deeplink;

import com.avito.android.deep_linking.links.NotificationCenterMainLandingLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: NotificationCenterListDeeplinkHandlerModule_ProvideNotificationCenterLandingMainDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30.b f134104a;

    public c(C30.b bVar) {
        this.f134104a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30.b bVar = this.f134104a;
        b.f134103a.getClass();
        return new C43834a(NotificationCenterMainLandingLink.class, null, new C43834a.b.C11809b(bVar));
    }
}
