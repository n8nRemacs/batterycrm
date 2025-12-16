package com.avito.android.advert.item.parking;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.parking.c;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.user_address_public.api.AdditionalInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsParkingAddressPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/parking/d;", "Lcom/avito/android/advert/item/parking/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.advert.item.parking.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c.a f78152b;

    /* compiled from: AdvertDetailsParkingAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsParkingAddressItem f78154m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem) {
            super(0);
            this.f78154m = advertDetailsParkingAddressItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f78152b.q0(this.f78154m.f78137g);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsParkingAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            d.this.f78152b.a(str, true);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsParkingAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f78157m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsParkingAddressItem f78158n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem) {
            super(0);
            this.f78157m = str;
            this.f78158n = advertDetailsParkingAddressItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.a aVar = d.this.f78152b;
            AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem = this.f78158n;
            MultiAddressesInfo multiAddressesInfo = advertDetailsParkingAddressItem.f78138h;
            ParkingAddressShowOnMapParams parkingAddressShowOnMapParams = advertDetailsParkingAddressItem.f78137g;
            aVar.L0(this.f78157m, multiAddressesInfo, parkingAddressShowOnMapParams.f78145c, parkingAddressShowOnMapParams.f78144b, parkingAddressShowOnMapParams.f78147e);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsParkingAddressPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.parking.d$d, reason: collision with other inner class name */
    public static final class C2313d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsParkingAddressItem f78160m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2313d(AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem) {
            super(0);
            this.f78160m = advertDetailsParkingAddressItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f78152b.q0(this.f78160m.f78137g);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k c.a aVar) {
        this.f78152b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ArrayList arrayList;
        g gVar = (g) eVar;
        AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem = (AdvertDetailsParkingAddressItem) aVar;
        gVar.L00(advertDetailsParkingAddressItem.f78134d);
        AdditionalInfo additionalInfo = advertDetailsParkingAddressItem.f78136f;
        List<String> listC = additionalInfo.c();
        if (listC == null || listC.size() <= 1 || advertDetailsParkingAddressItem.f78135e.size() <= 1) {
            arrayList = null;
        } else {
            List<String> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.add(new ChipsAssignments(i13, (String) obj));
                i13 = i14;
            }
        }
        gVar.LE(new e(this, gVar, advertDetailsParkingAddressItem), arrayList);
        List<String> listC2 = additionalInfo.c();
        k(gVar, advertDetailsParkingAddressItem.f78135e, listC2 != null ? (String) C42745f0.G(listC2) : null, additionalInfo.getTextButtonShowMap(), advertDetailsParkingAddressItem);
    }

    public final void k(g gVar, List<MultiAddressesItem> list, String str, String str2, AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem) {
        MultiAddressesItem multiAddressesItem;
        String locality;
        Object next;
        if (str != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((MultiAddressesItem) next).getAssignment(), str)) {
                        break;
                    }
                }
            }
            multiAddressesItem = (MultiAddressesItem) next;
        } else {
            multiAddressesItem = (MultiAddressesItem) C42745f0.G(list);
        }
        if (multiAddressesItem != null) {
            String house = multiAddressesItem.getComponents().getHouse();
            if (house == null || house.length() == 0) {
                locality = multiAddressesItem.getComponents().getLocality();
            } else {
                locality = multiAddressesItem.getComponents().getLocality() + " , " + multiAddressesItem.getComponents().getHouse();
            }
            gVar.KM(locality, new a(advertDetailsParkingAddressItem), new b());
            gVar.fO(new c(locality, advertDetailsParkingAddressItem), multiAddressesItem.h());
            gVar.mN(str2, new C2313d(advertDetailsParkingAddressItem));
        }
    }
}
