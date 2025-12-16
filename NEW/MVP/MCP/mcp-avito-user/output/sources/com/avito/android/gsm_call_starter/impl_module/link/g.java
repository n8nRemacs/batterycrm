package com.avito.android.gsm_call_starter.impl_module.link;

import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GsmCallStartLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f161237a;

    public g(h hVar) {
        this.f161237a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f161237a;
        f.f161236a.getClass();
        return new C43834a(GsmCallStartLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GsmCallStartLink.class), hVar));
    }
}
