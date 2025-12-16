package com.avito.android.reputation.di;

import Nm0.C14591c;
import com.avito.android.reputation.links.GrayStateLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReputationDeeplinkHandlerModule_ProvideGrayStateLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f254746a;

    public n(m mVar) {
        this.f254746a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = this.f254746a;
        d.f254731a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GrayStateLink.class, new C14591c(), new C43834a.b.C11809b(mVar));
    }
}
