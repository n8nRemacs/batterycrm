package com.avito.android.advert.deeplinks.want_to_buy;

import com.avito.android.advert.deeplinks.AdvertWantToBuyRequestLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AdvertWantToBuyRequestLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f69069a;

    public k(i iVar) {
        this.f69069a = iVar;
    }

    public static C43834a a(i iVar) {
        j.f69068a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertWantToBuyRequestLink.class, new l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AdvertWantToBuyRequestLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f69069a);
    }
}
