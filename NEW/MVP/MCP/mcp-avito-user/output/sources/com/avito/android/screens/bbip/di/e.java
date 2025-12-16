package com.avito.android.screens.bbip.di;

import com.avito.android.screens.bbip.deep_linking.BbipDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BbipDeeplinkMappingsModule_ProvideBbipDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip.deep_linking.c f260218a;

    public e(com.avito.android.screens.bbip.deep_linking.c cVar) {
        this.f260218a = cVar;
    }

    public static C43834a a(com.avito.android.screens.bbip.deep_linking.c cVar) {
        d.f260217a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BbipDeepLink.class, new com.avito.android.screens.bbip.deep_linking.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BbipDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f260218a);
    }
}
