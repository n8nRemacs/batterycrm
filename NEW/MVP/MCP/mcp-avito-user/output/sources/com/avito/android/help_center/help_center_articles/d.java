package com.avito.android.help_center.help_center_articles;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.help_center.C30753j;
import com.avito.android.help_center.InterfaceC30751h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterArticlesDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30753j f161682a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161683b;

    public d(C30753j c30753j, dv.b bVar) {
        this.f161682a = c30753j;
        this.f161683b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC30751h) this.f161682a.get(), (a.InterfaceC4053a) this.f161683b.get());
    }
}
