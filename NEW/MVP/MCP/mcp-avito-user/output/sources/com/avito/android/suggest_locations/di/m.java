package com.avito.android.suggest_locations.di;

import com.avito.android.suggest_locations.deeplink.SuggestLocationsAddressLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SuggestLocationsAddressLinkHandlerModule_ProvideSuggestLocationsAddressLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.suggest_locations.deeplink.c f292325a;

    public m(com.avito.android.suggest_locations.deeplink.c cVar) {
        this.f292325a = cVar;
    }

    public static C43834a a(com.avito.android.suggest_locations.deeplink.c cVar) {
        l.f292324a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SuggestLocationsAddressLink.class, new SuggestLocationsAddressLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SuggestLocationsAddressLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292325a);
    }
}
