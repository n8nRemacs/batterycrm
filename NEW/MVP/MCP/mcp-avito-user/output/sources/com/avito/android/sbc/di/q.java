package com.avito.android.sbc.di;

import com.avito.android.C30566f2;
import com.avito.android.C30743h2;
import com.avito.android.deep_linking.links.SbcDispatchesLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbcDeeplinkHandlerModule_ProvideSbcDispatchesLinkHandlerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260023a;

    /* renamed from: b, reason: collision with root package name */
    public final C30743h2 f260024b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.n f260025c;

    public q(l lVar, C30743h2 c30743h2, com.avito.android.sbc.deeplink.n nVar) {
        this.f260023a = lVar;
        this.f260024b = c30743h2;
        this.f260025c = nVar;
    }

    public static C43834a a(l lVar, C30566f2 c30566f2, com.avito.android.sbc.deeplink.n nVar) {
        lVar.getClass();
        kotlin.reflect.n<Object> nVar2 = C30566f2.f155067o[3];
        return new C43834a(SbcDispatchesLink.class, ((Boolean) c30566f2.f155071e.a().invoke()).booleanValue() ? new com.avito.android.sbc.deeplink.o() : null, new C43834a.b.C11809b(nVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f260023a, (C30566f2) this.f260024b.get(), this.f260025c);
    }
}
