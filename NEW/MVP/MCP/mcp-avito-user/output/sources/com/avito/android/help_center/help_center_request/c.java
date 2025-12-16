package com.avito.android.help_center.help_center_request;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.help_center.C30753j;
import com.avito.android.help_center.InterfaceC30751h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterRequestDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30753j f161762a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161763b;

    public c(C30753j c30753j, dv.b bVar) {
        this.f161762a = c30753j;
        this.f161763b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC30751h) this.f161762a.get(), (a.InterfaceC4053a) this.f161763b.get());
    }
}
