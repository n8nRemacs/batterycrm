package com.avito.android.calltracking.di;

import com.avito.android.calltracking.C29286n;
import com.avito.android.deep_linking.links.CalltrackingDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CalltrackingDeeplinkHandlerModule_ProvideCalltrackingDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29286n f113664a;

    public c(C29286n c29286n) {
        this.f113664a = c29286n;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29286n c29286n = this.f113664a;
        b.f113663a.getClass();
        return new C43834a(CalltrackingDeeplink.class, null, new C43834a.b.C11809b(c29286n));
    }
}
