package com.avito.android.cpt.activation.di;

import Kr.C14343a;
import com.avito.android.cpt.activation.deeplink.CptActivationEstimateLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CptActivationMappingsModule_ProvideCptActivationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final Kr.c f126228a;

    public c(Kr.c cVar) {
        this.f126228a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Kr.c cVar = this.f126228a;
        b.f126227a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CptActivationEstimateLink.class, new C14343a(), new C43834a.b.C11809b(cVar));
    }
}
