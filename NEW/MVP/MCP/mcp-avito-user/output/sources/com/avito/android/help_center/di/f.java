package com.avito.android.help_center.di;

import com.avito.android.deep_linking.links.HelpCenterShowLink;
import com.avito.android.help_center.C30746c;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: HelpCenterDeeplinkHandlerModule_ProvideHelpCenterDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30746c f161671a;

    public f(C30746c c30746c) {
        this.f161671a = c30746c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30746c c30746c = this.f161671a;
        d.f161669a.getClass();
        return new C43834a(HelpCenterShowLink.class, null, new C43834a.b.C11809b(c30746c));
    }
}
