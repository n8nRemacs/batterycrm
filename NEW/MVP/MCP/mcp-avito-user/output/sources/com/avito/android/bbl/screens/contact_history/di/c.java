package com.avito.android.bbl.screens.contact_history.di;

import com.avito.android.bbl.screens.contact_history.deeplink.BblContactHistoryLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BblContactHistoryDeeplinkMappingsModule_ProvideBblContactHistoryMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.contact_history.deeplink.b f99639a;

    public c(com.avito.android.bbl.screens.contact_history.deeplink.b bVar) {
        this.f99639a = bVar;
    }

    public static C43834a a(com.avito.android.bbl.screens.contact_history.deeplink.b bVar) {
        b.f99638a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BblContactHistoryLink.class, new com.avito.android.bbl.screens.contact_history.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BblContactHistoryLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f99639a);
    }
}
