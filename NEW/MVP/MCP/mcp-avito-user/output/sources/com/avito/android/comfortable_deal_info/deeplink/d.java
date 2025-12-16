package com.avito.android.comfortable_deal_info.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealInfoDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f123469a;

    public d(dv.b bVar) {
        this.f123469a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f123469a.get());
    }
}
