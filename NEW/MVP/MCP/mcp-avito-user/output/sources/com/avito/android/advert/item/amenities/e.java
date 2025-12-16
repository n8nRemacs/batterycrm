package com.avito.android.advert.item.amenities;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.hotel.model.Amenities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAmenitiesPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/amenities/e;", "Lcom/avito/android/advert/item/amenities/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G5.a f72758b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Z0 f72759c;

    @Inject
    public e(@k G5.a aVar) {
        this.f72758b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ArrayList arrayList;
        g gVar = (g) eVar;
        AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem = (AdvertDetailsAmenitiesItem) aVar;
        List<Amenities.AmenityGroup> list = advertDetailsAmenitiesItem.f72737h;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Amenities.Amenity> listC = ((Amenities.AmenityGroup) it.next()).c();
                if (listC == null) {
                    listC = C42784z0.f406748b;
                }
                C42745f0.h(listC, arrayList2);
            }
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((Amenities.Amenity) next).getAttributeId())) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        List<Amenities.Amenity> listE0 = arrayList != null ? C42745f0.E0(arrayList, advertDetailsAmenitiesItem.f72739j) : null;
        boolean z12 = (listE0 != null ? listE0.size() : 0) < (arrayList != null ? arrayList.size() : 0);
        gVar.b(advertDetailsAmenitiesItem.f72736g);
        gVar.s1(listE0);
        gVar.dN(z12);
        gVar.HD(advertDetailsAmenitiesItem.f72738i);
        gVar.qn(new d(advertDetailsAmenitiesItem, this));
    }

    @Override // com.avito.android.advert.item.amenities.c
    public final void c0() {
        this.f72759c = null;
    }

    @Override // com.avito.android.advert.item.amenities.c
    public final void j0(@k Z0 z02) {
        this.f72759c = z02;
    }
}
