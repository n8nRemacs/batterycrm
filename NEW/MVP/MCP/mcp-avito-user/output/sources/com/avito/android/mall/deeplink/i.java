package com.avito.android.mall.deeplink;

import com.avito.android.deep_linking.links.MallMainLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MallLinkHandlerModule_ProvideMallMainLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f184265a;

    public i(k kVar) {
        this.f184265a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = this.f184265a;
        h.f184264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MallMainLink.class, new l(), new C43834a.b.C11809b(kVar));
    }
}
