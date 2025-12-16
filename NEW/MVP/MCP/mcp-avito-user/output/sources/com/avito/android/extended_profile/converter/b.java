package com.avito.android.extended_profile.converter;

import com.avito.android.favorite.x;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileAdvertConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/converter/b;", "Lcom/avito/android/extended_profile/converter/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f149411a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.persistance.j f149412b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f149413c;

    @Inject
    public b(@Y61.k x xVar, @Y61.k com.avito.android.advert.viewed.persistance.j jVar, @Y61.k InterfaceC34904z0 interfaceC34904z0) {
        this.f149411a = xVar;
        this.f149412b = jVar;
        this.f149413c = interfaceC34904z0;
    }

    @Override // com.avito.android.extended_profile.converter.a
    @Y61.k
    public final AdvertItem a(@Y61.k SerpAdvert serpAdvert) {
        AdvertItem advertItemA = InterfaceC34904z0.a.a(this.f149413c, serpAdvert, false, false, SerpDisplayType.Grid, null, 0, null, null, false, 2038);
        boolean isFavorite = serpAdvert.getIsFavorite();
        x xVar = this.f149411a;
        String str = advertItemA.f268425c;
        advertItemA.f268380G = xVar.b(str, isFavorite);
        advertItemA.f268394N = this.f149412b.a(str);
        return advertItemA;
    }
}
