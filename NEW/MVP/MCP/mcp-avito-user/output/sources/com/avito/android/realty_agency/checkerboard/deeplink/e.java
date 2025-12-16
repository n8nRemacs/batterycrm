package com.avito.android.realty_agency.checkerboard.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CheckerboardLinkHandlerModule_ProvideCheckerboardLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f251103a;

    public e(f fVar) {
        this.f251103a = fVar;
    }

    public static C43834a a(f fVar) {
        d.f251102a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CheckerboardLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CheckerboardLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f251103a);
    }
}
