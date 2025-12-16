package com.avito.android.cpt.mass_activation.di;

import com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CptMassActivationMappingsModule_ProvideCptMassActivationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.deeplink.c f126506a;

    public c(com.avito.android.cpt.mass_activation.deeplink.c cVar) {
        this.f126506a = cVar;
    }

    public static C43834a a(com.avito.android.cpt.mass_activation.deeplink.c cVar) {
        b.f126505a.getClass();
        return new C43834a(CptMassActivationEstimateLink.class, new com.avito.android.cpt.mass_activation.deeplink.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CptMassActivationEstimateLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126506a);
    }
}
