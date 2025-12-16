package com.avito.android.cpt.pre_activation.di;

import com.avito.android.cpt.pre_activation.deeplink.PreActivationLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PreActivationMappingsModule_ProvidePreActivationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.pre_activation.deeplink.c f126709a;

    public d(com.avito.android.cpt.pre_activation.deeplink.c cVar) {
        this.f126709a = cVar;
    }

    public static C43834a a(com.avito.android.cpt.pre_activation.deeplink.c cVar) {
        c.f126708a.getClass();
        return new C43834a(PreActivationLink.class, new com.avito.android.cpt.pre_activation.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PreActivationLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f126709a);
    }
}
