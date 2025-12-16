package com.avito.android.user_viewed.domain.mapper;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import jK0.C42273c;
import jK0.C42275e;
import jK0.C42276f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: UserViewedAdvertMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/mapper/b;", "Lcom/avito/android/user_viewed/domain/mapper/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f318361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f318362b;

    @Inject
    public b(@Y61.k j jVar, @Y61.k d dVar) {
        this.f318361a = jVar;
        this.f318362b = dVar;
    }

    @Override // com.avito.android.user_viewed.domain.mapper.a
    @Y61.k
    public final UserViewedAdvert a(@Y61.k C42275e c42275e) {
        boolean z12;
        GeoReference geoReference;
        ArrayList arrayList;
        String id2 = c42275e.getId();
        int categoryId = (int) c42275e.getCategoryId();
        DeepLink deeplink = c42275e.getDeeplink();
        long timestamp = c42275e.getTimestamp();
        long viewedAt = c42275e.getViewedAt();
        Image images = c42275e.getImages();
        String title = c42275e.getTitle();
        String price = c42275e.getPrice();
        String address = c42275e.getAddress();
        boolean isActive = c42275e.getIsActive();
        boolean isFavorite = c42275e.getIsFavorite();
        C42276f geoReferences = c42275e.getGeoReferences();
        GeoReference geoReferenceA = geoReferences != null ? this.f318361a.a(geoReferences) : null;
        List<C42273c> listB = c42275e.b();
        if (listB != null) {
            List<C42273c> list = listB;
            geoReference = geoReferenceA;
            z12 = isFavorite;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                arrayList2.add(this.f318362b.a((C42273c) it.next()));
            }
            arrayList = arrayList2;
        } else {
            z12 = isFavorite;
            geoReference = geoReferenceA;
            arrayList = null;
        }
        return new UserViewedAdvert(id2, categoryId, deeplink, timestamp, viewedAt, images, title, price, address, isActive, z12, geoReference, arrayList);
    }
}
