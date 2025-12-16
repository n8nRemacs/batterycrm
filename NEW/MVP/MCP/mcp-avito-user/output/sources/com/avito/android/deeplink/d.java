package com.avito.android.deeplink;

import com.avito.android.deep_linking.links.NotificationCenterLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: NotificationCenterListDeeplinkHandlerModule_ProvideNotificationCenterListDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f134105a;

    public d(e eVar) {
        this.f134105a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f134105a;
        b.f134103a.getClass();
        return new C43834a(NotificationCenterLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(NotificationCenterLink.class), eVar));
    }
}
