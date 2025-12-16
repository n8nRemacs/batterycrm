package com.avito.android.help_center.di;

import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.help_center.D;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: HelpCenterDeeplinkHandlerModule_ProvideHelpCenterUrlDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D f161673a;

    public h(D d12) {
        this.f161673a = d12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = this.f161673a;
        d.f161669a.getClass();
        return new C43834a(HelpCenterUrlShowLink.class, null, new C43834a.b.C11809b(d12));
    }
}
