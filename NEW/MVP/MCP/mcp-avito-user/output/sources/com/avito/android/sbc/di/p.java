package com.avito.android.sbc.di;

import com.avito.android.C30566f2;
import com.avito.android.C30743h2;
import com.avito.android.sbc.deeplink.DiscountDispatchVasDeepLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbcDeeplinkHandlerModule_ProvideDiscountDispatchVasFlowDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260020a;

    /* renamed from: b, reason: collision with root package name */
    public final C30743h2 f260021b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sbc.deeplink.l f260022c;

    public p(l lVar, C30743h2 c30743h2, com.avito.android.sbc.deeplink.l lVar2) {
        this.f260020a = lVar;
        this.f260021b = c30743h2;
        this.f260022c = lVar2;
    }

    public static C43834a a(l lVar, C30566f2 c30566f2, com.avito.android.sbc.deeplink.l lVar2) {
        lVar.getClass();
        kotlin.reflect.n<Object> nVar = C30566f2.f155067o[2];
        return new C43834a(DiscountDispatchVasDeepLink.class, ((Boolean) c30566f2.f155070d.a().invoke()).booleanValue() ? new com.avito.android.sbc.deeplink.j() : null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DiscountDispatchVasDeepLink.class), lVar2));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f260020a, (C30566f2) this.f260021b.get(), this.f260022c);
    }
}
