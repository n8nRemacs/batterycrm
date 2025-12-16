package com.avito.android.gsm_realty_trx_flow.impl_module.link;

import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GsmRealtyTrxFlowLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f161266a;

    public e(f fVar) {
        this.f161266a = fVar;
    }

    public static C43834a a(f fVar) {
        d.f161265a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GsmRealtyTrxFlowLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GsmRealtyTrxFlowLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f161266a);
    }
}
