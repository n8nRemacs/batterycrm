package com.avito.android.travel_file_download_deeplink.di;

import com.avito.android.travel_file_download_deeplink.TravelFileDownloadDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FileDownloadDeeplinkModule_ProvideFileDownloadDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.travel_file_download_deeplink.deeplink.c f301756a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.travel_file_download_deeplink.deeplink.e f301757b;

    public d(com.avito.android.travel_file_download_deeplink.deeplink.c cVar, com.avito.android.travel_file_download_deeplink.deeplink.e eVar) {
        this.f301756a = cVar;
        this.f301757b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f301757b.getClass();
        com.avito.android.travel_file_download_deeplink.deeplink.d dVar = new com.avito.android.travel_file_download_deeplink.deeplink.d();
        com.avito.android.travel_file_download_deeplink.deeplink.c cVar = this.f301756a;
        c.f301755a.getClass();
        return new C43834a(TravelFileDownloadDeeplink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TravelFileDownloadDeeplink.class), cVar));
    }
}
