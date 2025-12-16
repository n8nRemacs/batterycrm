package com.avito.android.passport.remove_draft;

import com.avito.android.deep_linking.links.PassportRemoveDraftLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PassportRemoveDraftLinkHandlerModule_ProvidePassportRemoveDraftAsyncDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f213902a;

    public f(d dVar) {
        this.f213902a = dVar;
    }

    public static C43834a a(d dVar) {
        e.f213901a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportRemoveDraftLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportRemoveDraftLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f213902a);
    }
}
