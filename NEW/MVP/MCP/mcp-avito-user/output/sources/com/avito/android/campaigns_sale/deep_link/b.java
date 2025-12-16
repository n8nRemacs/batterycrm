package com.avito.android.campaigns_sale.deep_link;

import com.avito.android.deep_linking.links.CampaignsSaleLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CampaignsSaleDeeplinkModule_ProvideFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f113883a;

    /* renamed from: b, reason: collision with root package name */
    public final e f113884b;

    public b(g gVar, e eVar) {
        this.f113883a = gVar;
        this.f113884b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f113883a.getClass();
        f fVar = new f();
        a.f113882a.getClass();
        return new C43834a(CampaignsSaleLink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CampaignsSaleLink.class), this.f113884b));
    }
}
