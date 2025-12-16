package com.avito.android.advert.item.advertdetails.mvi;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerItem;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem;
import com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.arch.mvi.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.section.horizontal.adapter.HorizontalSectionAdapterItem;
import com.avito.android.section.vertical.adapter.SectionVerticalAdapterItem;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import k4.C42501e;
import k4.InterfaceC42499c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertDetailsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/advertdetails/mvi/f;", "Lcom/avito/android/arch/mvi/u;", "Lk4/c;", "Lk4/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements u<InterfaceC42499c, C42501e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.f f72710b;

    @Inject
    public f(@k com.avito.android.advert.item.safedeal.trust_factors.f fVar) {
        this.f72710b = fVar;
    }

    public static final <T extends com.avito.conveyor_item.a> T b(T t12, InterfaceC42499c interfaceC42499c) {
        T sectionVerticalAdapterItem;
        if (t12 instanceof AdvertItem) {
            InterfaceC42499c.g gVar = (InterfaceC42499c.g) interfaceC42499c;
            if (L.f(((AdvertItem) t12).f268425c, gVar.f406068a)) {
                return AdvertItem.b((AdvertItem) t12, null, gVar.f406069b, null, null, Integer.MAX_VALUE, -1, -1);
            }
        }
        if (t12 instanceof SerpConstructorAdvertItem) {
            InterfaceC42499c.g gVar2 = (InterfaceC42499c.g) interfaceC42499c;
            if (L.f(t12.getF77565c(), gVar2.f406068a)) {
                SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) t12;
                return serpConstructorAdvertItem.copy(((-16385) & 1) != 0 ? serpConstructorAdvertItem.id : 0L, ((-16385) & 2) != 0 ? serpConstructorAdvertItem.stringId : null, ((-16385) & 4) != 0 ? serpConstructorAdvertItem.size : null, ((-16385) & 8) != 0 ? serpConstructorAdvertItem.title : null, ((-16385) & 16) != 0 ? serpConstructorAdvertItem.price : null, ((-16385) & 32) != 0 ? serpConstructorAdvertItem.deepLink : null, ((-16385) & 64) != 0 ? serpConstructorAdvertItem.imageList : null, ((-16385) & 128) != 0 ? serpConstructorAdvertItem.galleryItemsList : null, ((-16385) & 256) != 0 ? serpConstructorAdvertItem.badgeBar : null, ((-16385) & 512) != 0 ? serpConstructorAdvertItem.badgeSticker : null, ((-16385) & 1024) != 0 ? serpConstructorAdvertItem.isDelivery : false, ((-16385) & 2048) != 0 ? serpConstructorAdvertItem.hasDiscount : false, ((-16385) & 4096) != 0 ? serpConstructorAdvertItem.nativeVideoABCategory : null, ((-16385) & 8192) != 0 ? serpConstructorAdvertItem.exposureParams : null, ((-16385) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.freeForm : null, ((-16385) & 32768) != 0 ? serpConstructorAdvertItem.reserved : null, ((-16385) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpConstructorAdvertItem.isViewed : false, ((-16385) & 131072) != 0 ? serpConstructorAdvertItem.isFavorite : gVar2.f406069b, ((-16385) & 262144) != 0 ? serpConstructorAdvertItem.canBeHidden : false, ((-16385) & 524288) != 0 ? serpConstructorAdvertItem.isHidden : false, ((-16385) & 1048576) != 0 ? serpConstructorAdvertItem.analyticsContext : null, ((-16385) & 2097152) != 0 ? serpConstructorAdvertItem.verticalAlias : null, ((-16385) & 4194304) != 0 ? serpConstructorAdvertItem.favoritesToast : null, ((-16385) & 8388608) != 0 ? serpConstructorAdvertItem.displayType : null, ((-16385) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpConstructorAdvertItem.analyticParams : null, ((-16385) & 33554432) != 0 ? serpConstructorAdvertItem.additionalAnalyticsParams : null, ((-16385) & 67108864) != 0 ? serpConstructorAdvertItem.isExternalAd : false, ((-16385) & 134217728) != 0 ? serpConstructorAdvertItem.hasVideo : false, ((-16385) & 268435456) != 0 ? serpConstructorAdvertItem.hasRealtyLayout : false, ((-16385) & 536870912) != 0 ? serpConstructorAdvertItem.isRedesign : false, ((-16385) & 1073741824) != 0 ? serpConstructorAdvertItem.isStrRedesign : false, ((-16385) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? serpConstructorAdvertItem.isUnavailable : false, (32767 & 1) != 0 ? serpConstructorAdvertItem.isExtendedGallery : false, (32767 & 2) != 0 ? serpConstructorAdvertItem.cvViewed : null, (32767 & 4) != 0 ? serpConstructorAdvertItem.isCvHidden : null, (32767 & 8) != 0 ? serpConstructorAdvertItem.categoryId : null, (32767 & 16) != 0 ? serpConstructorAdvertItem.sellerInfo : null, (32767 & 32) != 0 ? serpConstructorAdvertItem.sellerOnline : null, (32767 & 64) != 0 ? serpConstructorAdvertItem.newAdvertBadge : null, (32767 & 128) != 0 ? serpConstructorAdvertItem.hasStablePosition : false, (32767 & 256) != 0 ? serpConstructorAdvertItem.isFeatured : false, (32767 & 512) != 0 ? serpConstructorAdvertItem.featuredSectionTitle : null, (32767 & 1024) != 0 ? serpConstructorAdvertItem.featuredSectionPosition : 0, (32767 & 2048) != 0 ? serpConstructorAdvertItem.featuredSectionType : null, (32767 & 4096) != 0 ? serpConstructorAdvertItem.xHash : null, (32767 & 8192) != 0 ? serpConstructorAdvertItem.galleryConfig : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.gigShiftId : null);
            }
        }
        if (t12 instanceof HorizontalSectionAdapterItem) {
            HorizontalSectionAdapterItem horizontalSectionAdapterItem = (HorizontalSectionAdapterItem) t12;
            List<PersistableSpannedItem> list = horizontalSectionAdapterItem.f264684h;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((PersistableSpannedItem) b((PersistableSpannedItem) it.next(), interfaceC42499c));
            }
            sectionVerticalAdapterItem = new HorizontalSectionAdapterItem(horizontalSectionAdapterItem.f264678b, horizontalSectionAdapterItem.f264679c, horizontalSectionAdapterItem.f264680d, horizontalSectionAdapterItem.f264681e, horizontalSectionAdapterItem.f264682f, horizontalSectionAdapterItem.f264683g, arrayList, horizontalSectionAdapterItem.f264685i, horizontalSectionAdapterItem.f264686j, horizontalSectionAdapterItem.f264687k);
        } else {
            if (!(t12 instanceof SectionVerticalAdapterItem)) {
                return t12;
            }
            SectionVerticalAdapterItem sectionVerticalAdapterItem2 = (SectionVerticalAdapterItem) t12;
            List<PersistableSpannedItem> list2 = sectionVerticalAdapterItem2.f264929b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PersistableSpannedItem) b((PersistableSpannedItem) it2.next(), interfaceC42499c));
            }
            sectionVerticalAdapterItem = new SectionVerticalAdapterItem(arrayList2, sectionVerticalAdapterItem2.f264930c, sectionVerticalAdapterItem2.f264931d, sectionVerticalAdapterItem2.f264932e, sectionVerticalAdapterItem2.f264933f);
        }
        return sectionVerticalAdapterItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem] */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r11v39, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v42, types: [com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem] */
    /* JADX WARN: Type inference failed for: r11v46, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerItem] */
    @Override // com.avito.android.arch.mvi.u
    public final C42501e a(InterfaceC42499c interfaceC42499c, C42501e c42501e) {
        ArrayList arrayList;
        Object next;
        C42501e c42501eA;
        InterfaceC42499c interfaceC42499c2 = interfaceC42499c;
        C42501e c42501e2 = c42501e;
        boolean z12 = interfaceC42499c2 instanceof InterfaceC42499c.b;
        List<C42501e.a> list = c42501e2.f406080a;
        int i12 = 6;
        if (z12) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((C42501e.a) obj).f406083a.equals(((InterfaceC42499c.b) interfaceC42499c2).f406062a)) {
                    arrayList2.add(obj);
                }
            }
            InterfaceC42499c.b bVar = (InterfaceC42499c.b) interfaceC42499c2;
            c42501eA = C42501e.a(c42501e2, C42745f0.i0(new C42501e.a(bVar.f406062a, bVar.f406063b), arrayList2), null, null, 6);
        } else {
            int i13 = 10;
            if (interfaceC42499c2 instanceof InterfaceC42499c.k) {
                List<C42501e.a> list2 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                for (C42501e.a aVar : list2) {
                    List<com.avito.conveyor_item.a> list3 = aVar.f406084b;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list3, 10));
                    for (com.avito.conveyor_item.a aVar2 : list3) {
                        String f77565c = aVar2.getF77565c();
                        PersistableSpannedItem persistableSpannedItem = ((InterfaceC42499c.k) interfaceC42499c2).f406075a;
                        if (L.f(f77565c, persistableSpannedItem.getF77565c())) {
                            aVar2 = persistableSpannedItem;
                        }
                        arrayList4.add(aVar2);
                    }
                    arrayList3.add(new C42501e.a(aVar.f406083a, arrayList4));
                }
                c42501eA = C42501e.a(c42501e2, arrayList3, null, null, 6);
            } else {
                int i14 = 0;
                if (interfaceC42499c2 instanceof InterfaceC42499c.h) {
                    List<C42501e.a> list4 = list;
                    ArrayList arrayList5 = new ArrayList(C42745f0.q(list4, 10));
                    for (C42501e.a aVar3 : list4) {
                        List<com.avito.conveyor_item.a> list5 = aVar3.f406084b;
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(list5, 10));
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            ?? B12 = (com.avito.conveyor_item.a) it.next();
                            if (B12 instanceof AdvertDetailsGalleryItem) {
                                B12 = AdvertDetailsGalleryItem.b((AdvertDetailsGalleryItem) B12, ((InterfaceC42499c.h) interfaceC42499c2).f406070a, 0, 16776703);
                            }
                            arrayList6.add(B12);
                        }
                        arrayList5.add(new C42501e.a(aVar3.f406083a, arrayList6));
                    }
                    c42501eA = C42501e.a(c42501e2, arrayList5, null, null, 6);
                } else if (interfaceC42499c2 instanceof InterfaceC42499c.g) {
                    List<C42501e.a> list6 = list;
                    ArrayList arrayList7 = new ArrayList(C42745f0.q(list6, 10));
                    for (C42501e.a aVar4 : list6) {
                        List<com.avito.conveyor_item.a> list7 = aVar4.f406084b;
                        ArrayList arrayList8 = new ArrayList(C42745f0.q(list7, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList8.add(b((com.avito.conveyor_item.a) it2.next(), interfaceC42499c2));
                        }
                        arrayList7.add(new C42501e.a(aVar4.f406083a, arrayList8));
                    }
                    c42501eA = C42501e.a(c42501e2, arrayList7, null, null, 6);
                } else if (interfaceC42499c2 instanceof InterfaceC42499c.f) {
                    List<C42501e.a> list8 = list;
                    ArrayList arrayList9 = new ArrayList(C42745f0.q(list8, 10));
                    for (C42501e.a aVar5 : list8) {
                        List<com.avito.conveyor_item.a> list9 = aVar5.f406084b;
                        ExpandItemsButtonItem expandItemsButtonItem = ((InterfaceC42499c.f) interfaceC42499c2).f406067a;
                        if (list9.contains(expandItemsButtonItem)) {
                            aVar5 = new C42501e.a(aVar5.f406083a, expandItemsButtonItem.f83565i);
                        }
                        arrayList9.add(aVar5);
                    }
                    c42501eA = C42501e.a(c42501e2, arrayList9, null, null, 6);
                } else {
                    if (!(interfaceC42499c2 instanceof InterfaceC42499c.n)) {
                        boolean z13 = interfaceC42499c2 instanceof InterfaceC42499c.l;
                        com.avito.android.advert.item.safedeal.trust_factors.f fVar = this.f72710b;
                        if (z13) {
                            ((InterfaceC42499c.l) interfaceC42499c2).getClass();
                            TrustFactorsItem trustFactorsItemB = fVar.b(null);
                            if (trustFactorsItemB == null) {
                                return c42501e2;
                            }
                            List<C42501e.a> list10 = list;
                            ArrayList arrayList10 = new ArrayList(C42745f0.q(list10, 10));
                            for (C42501e.a aVar6 : list10) {
                                List<com.avito.conveyor_item.a> list11 = aVar6.f406084b;
                                ArrayList arrayList11 = new ArrayList(C42745f0.q(list11, 10));
                                for (com.avito.conveyor_item.a aVar7 : list11) {
                                    if (aVar7 instanceof CombinedButtonsItem) {
                                        aVar7 = trustFactorsItemB;
                                    }
                                    arrayList11.add(aVar7);
                                }
                                arrayList10.add(new C42501e.a(aVar6.f406083a, arrayList11));
                            }
                            return C42501e.a(c42501e2, arrayList10, null, null, 6);
                        }
                        if (interfaceC42499c2 instanceof InterfaceC42499c.m) {
                            Iterator<C42501e.a> it3 = list.iterator();
                            loop12: while (true) {
                                if (!it3.hasNext()) {
                                    i14 = -1;
                                    break;
                                }
                                List<com.avito.conveyor_item.a> list12 = it3.next().f406084b;
                                if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                                    Iterator it4 = list12.iterator();
                                    while (it4.hasNext()) {
                                        if (((com.avito.conveyor_item.a) it4.next()) instanceof TrustFactorsItem) {
                                            break loop12;
                                        }
                                    }
                                }
                                i14++;
                            }
                            if (i14 < 0) {
                                return c42501e2;
                            }
                            C42501e.a aVar8 = list.get(i14);
                            Iterator it5 = aVar8.f406084b.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it5.next();
                                if (((com.avito.conveyor_item.a) next) instanceof AdvertDetailsGapItem) {
                                    break;
                                }
                            }
                            com.avito.conveyor_item.a aVar9 = (com.avito.conveyor_item.a) next;
                            ArrayList arrayListA = com.avito.android.advert.item.safedeal.trust_factors.g.a(fVar, ((InterfaceC42499c.m) interfaceC42499c2).f406076a);
                            if (aVar9 != null) {
                                arrayListA = C42745f0.h0(arrayListA, Collections.singletonList(aVar9));
                            }
                            ArrayList arrayList12 = new ArrayList(list);
                            arrayList12.set(i14, new C42501e.a(aVar8.f406083a, arrayListA));
                            return C42501e.a(c42501e2, C42745f0.M0(arrayList12), null, null, 6);
                        }
                        if (interfaceC42499c2 instanceof InterfaceC42499c.j) {
                            InterfaceC42499c.j jVar = (InterfaceC42499c.j) interfaceC42499c2;
                            List<C42501e.a> list13 = list;
                            ArrayList arrayList13 = new ArrayList(C42745f0.q(list13, 10));
                            for (C42501e.a aVar10 : list13) {
                                List<com.avito.conveyor_item.a> list14 = aVar10.f406084b;
                                RealtyQuizBannerItem realtyQuizBannerItem = jVar.f406074a;
                                if (list14.contains(realtyQuizBannerItem)) {
                                    ArrayList arrayList14 = new ArrayList(aVar10.f406084b);
                                    arrayList14.remove(realtyQuizBannerItem);
                                    aVar10 = new C42501e.a(aVar10.f406083a, C42745f0.M0(arrayList14));
                                }
                                arrayList13.add(aVar10);
                            }
                            return C42501e.a(c42501e2, arrayList13, null, null, 6);
                        }
                        if (interfaceC42499c2 instanceof InterfaceC42499c.e) {
                            List<C42501e.a> list15 = list;
                            ArrayList arrayList15 = new ArrayList(C42745f0.q(list15, 10));
                            for (C42501e.a aVar11 : list15) {
                                List<com.avito.conveyor_item.a> list16 = aVar11.f406084b;
                                ArrayList arrayList16 = new ArrayList(C42745f0.q(list16, 10));
                                Iterator it6 = list16.iterator();
                                while (it6.hasNext()) {
                                    ?? A12 = (com.avito.conveyor_item.a) it6.next();
                                    InterfaceC42499c.e eVar = (InterfaceC42499c.e) interfaceC42499c2;
                                    if (L.f(A12.getF77565c(), eVar.f406066a.f83916d)) {
                                        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
                                        A12 = AdvertDetailsPpRecallPromoItem.a(eVar.f406066a, 0, 163, String.valueOf(163), false, false, 114681);
                                    }
                                    arrayList16.add(A12);
                                }
                                arrayList15.add(new C42501e.a(aVar11.f406083a, arrayList16));
                            }
                            return C42501e.a(c42501e2, arrayList15, null, null, 6);
                        }
                        if (!(interfaceC42499c2 instanceof InterfaceC42499c.i)) {
                            if (!(interfaceC42499c2 instanceof InterfaceC42499c.C11603c)) {
                                if (interfaceC42499c2 instanceof InterfaceC42499c.d) {
                                    return C42501e.a(c42501e2, C42784z0.f406748b, null, null, 4);
                                }
                                if (!(interfaceC42499c2 instanceof InterfaceC42499c.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                InterfaceC42499c.a aVar12 = (InterfaceC42499c.a) interfaceC42499c2;
                                return C42501e.a(c42501e2, null, aVar12.f406060a, aVar12.f406061b, 1);
                            }
                            List<C42501e.a> list17 = list;
                            ArrayList arrayList17 = new ArrayList(C42745f0.q(list17, 10));
                            for (C42501e.a aVar13 : list17) {
                                List<com.avito.conveyor_item.a> list18 = aVar13.f406084b;
                                ArrayList arrayList18 = new ArrayList(C42745f0.q(list18, 10));
                                Iterator it7 = list18.iterator();
                                while (it7.hasNext()) {
                                    ?? B13 = (com.avito.conveyor_item.a) it7.next();
                                    if (B13 instanceof BuzzoolaCreditBannerItem) {
                                        B13 = BuzzoolaCreditBannerItem.b((BuzzoolaCreditBannerItem) B13, 0, ((InterfaceC42499c.C11603c) interfaceC42499c2).f406064a, 63);
                                    }
                                    arrayList18.add(B13);
                                }
                                arrayList17.add(new C42501e.a(aVar13.f406083a, arrayList18));
                            }
                            return C42501e.a(c42501e2, arrayList17, null, null, 6);
                        }
                        InterfaceC42499c.i iVar = (InterfaceC42499c.i) interfaceC42499c2;
                        com.avito.android.deeplink_handler.handler.bundle.a aVar14 = iVar.f406072a;
                        if (!((aVar14 != null ? aVar14.f134520a : null) instanceof PpRecallDeeplink)) {
                            return c42501e2;
                        }
                        Bundle bundle = aVar14.f134522c;
                        boolean z14 = bundle != null ? bundle.getBoolean("ppRecallWidgetResultTag", false) : false;
                        List<C42501e.a> list19 = list;
                        ArrayList arrayList19 = new ArrayList(C42745f0.q(list19, 10));
                        for (C42501e.a aVar15 : list19) {
                            List<com.avito.conveyor_item.a> list20 = aVar15.f406084b;
                            ArrayList arrayList20 = new ArrayList(C42745f0.q(list20, i13));
                            Iterator it8 = list20.iterator();
                            while (it8.hasNext()) {
                                ?? A13 = (com.avito.conveyor_item.a) it8.next();
                                if (A13 instanceof AdvertDetailsPpRecallPromoItem) {
                                    arrayList = arrayList20;
                                    A13 = AdvertDetailsPpRecallPromoItem.a((AdvertDetailsPpRecallPromoItem) A13, 0, 0L, null, iVar.f406073b, z14, 32767);
                                } else {
                                    arrayList = arrayList20;
                                }
                                arrayList.add(A13);
                                arrayList20 = arrayList;
                            }
                            arrayList19.add(new C42501e.a(aVar15.f406083a, arrayList20));
                            i12 = 6;
                            i13 = 10;
                        }
                        return C42501e.a(c42501e2, arrayList19, null, null, i12);
                    }
                    List<C42501e.a> list21 = list;
                    ArrayList arrayList21 = new ArrayList(C42745f0.q(list21, 10));
                    for (C42501e.a aVar16 : list21) {
                        List<com.avito.conveyor_item.a> list22 = aVar16.f406084b;
                        ArrayList arrayList22 = new ArrayList(C42745f0.q(list22, 10));
                        Iterator it9 = list22.iterator();
                        while (it9.hasNext()) {
                            ?? A14 = (com.avito.conveyor_item.a) it9.next();
                            if (A14 instanceof AdvertVideoCallRequestItem) {
                                AdvertVideoCallRequestItem.Type type = AdvertVideoCallRequestItem.Type.f80683b;
                                A14 = AdvertVideoCallRequestItem.a((AdvertVideoCallRequestItem) A14, 0, ((InterfaceC42499c.n) interfaceC42499c2).f406077a, 103);
                            }
                            arrayList22.add(A14);
                        }
                        arrayList21.add(new C42501e.a(aVar16.f406083a, arrayList22));
                    }
                    c42501eA = C42501e.a(c42501e2, arrayList21, null, null, 6);
                }
            }
        }
        return c42501eA;
    }
}
