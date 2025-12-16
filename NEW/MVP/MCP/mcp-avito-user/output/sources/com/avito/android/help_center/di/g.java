package com.avito.android.help_center.di;

import com.avito.android.deep_linking.links.HelpCenterRequestLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: HelpCenterDeeplinkHandlerModule_ProvideHelpCenterRequestDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.help_center.help_center_request.c f161672a;

    public g(com.avito.android.help_center.help_center_request.c cVar) {
        this.f161672a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.help_center.help_center_request.c cVar = this.f161672a;
        d.f161669a.getClass();
        return new C43834a(HelpCenterRequestLink.class, null, new C43834a.b.C11809b(cVar));
    }
}
