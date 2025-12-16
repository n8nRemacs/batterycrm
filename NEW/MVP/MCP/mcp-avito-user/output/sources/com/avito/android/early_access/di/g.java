package com.avito.android.early_access.di;

import com.avito.android.early_access.A;
import com.avito.android.early_access.B;
import com.avito.android.early_access.deeplink.EarlyAccessStatusLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EarlyAccessHandlerModule_ProvideEarlyAccessStatusLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145313a;

    /* renamed from: b, reason: collision with root package name */
    public final A f145314b;

    public g(d dVar, A a12) {
        this.f145313a = dVar;
        this.f145314b = a12;
    }

    public static C43834a a(d dVar, A a12) {
        dVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EarlyAccessStatusLink.class, new B(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EarlyAccessStatusLink.class), a12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f145313a, this.f145314b);
    }
}
