package com.avito.android.advert.item;

import com.avito.android.advert.item.auto_media.AdvertDetailsAutoMediaItem;
import com.avito.android.advert.item.auto_media.select_pixel.AdvertDetailsAutoMediaSelectPixelItem;
import com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner;
import com.avito.android.advert.item.similars.SimilarsStartMarkerItem;
import com.avito.android.advert.item.similars_button.AdvertDetailsSimilarsButtonItem;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: AdvertDetailsItemsPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class X extends C42801a implements Y41.p<com.avito.android.advert.item.similars.t, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(com.avito.android.advert.item.similars.t tVar, Continuation<? super kotlin.G0> continuation) {
        AdvertSerpCommercialBanner advertSerpCommercialBanner;
        AdvertSerpCommercialBanner advertSerpCommercialBanner2;
        I1 i12;
        int size;
        String id2;
        AdvertSerpCommercialBanner advertSerpCommercialBanner3;
        com.avito.android.advert.item.similars.t tVar2 = tVar;
        T t12 = (T) this.receiver;
        int i13 = T.f71797Z5;
        t12.getClass();
        ArrayList arrayList = new ArrayList();
        List<PersistableSpannedItem> list = tVar2.f80337a;
        arrayList.addAll(list);
        AdvertDetails advertDetails = t12.f71951V5;
        com.avito.android.advert.item.commercials.a aVar = tVar2.f80338b;
        if (advertDetails == null || !advertDetails.getAdvertisingDisabled()) {
            if (aVar != null && (advertSerpCommercialBanner2 = aVar.f74323a) != null) {
                if ((advertSerpCommercialBanner2.getCommercialSerpItem() instanceof CommercialVideoBannerItem) && (i12 = t12.f71968Y1) != null) {
                    i12.f0();
                }
                arrayList.add(advertSerpCommercialBanner2);
            }
            if (aVar != null && (advertSerpCommercialBanner = aVar.f74324b) != null) {
                arrayList.add(advertSerpCommercialBanner);
            }
        }
        t12.m1();
        Iterator it = t12.f71975Z1.iterator();
        int i14 = 0;
        while (true) {
            size = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (((PersistableSpannedItem) it.next()) instanceof SimilarsStartMarkerItem) {
                break;
            }
            i14++;
        }
        int size2 = t12.f71975Z1.size();
        int i15 = t12.f71909P5;
        if (i15 < 0 || i15 >= size2) {
            i15 = -1;
        }
        t12.f71982a2 = arrayList;
        if (i14 > -1) {
            t12.f71975Z1.remove(i15);
        }
        if (i15 > -1) {
            t12.f71975Z1.addAll(i15, t12.f71982a2);
            AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem = t12.s5;
            if (advertDetailsSimilarsButtonItem != null) {
                advertDetailsSimilarsButtonItem.f80341d = list.isEmpty();
            }
            AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem2 = t12.s5;
            if (advertDetailsSimilarsButtonItem2 != null) {
                if (aVar != null) {
                    advertSerpCommercialBanner3 = aVar.f74323a;
                    if (advertSerpCommercialBanner3 == null) {
                        advertSerpCommercialBanner3 = aVar.f74324b;
                    }
                } else {
                    advertSerpCommercialBanner3 = null;
                }
                if (advertSerpCommercialBanner3 != null && C42745f0.r(t12.f71975Z1, advertSerpCommercialBanner3)) {
                    t12.f71975Z1.remove(advertDetailsSimilarsButtonItem2);
                    t12.f71975Z1.add(t12.f71975Z1.indexOf(advertSerpCommercialBanner3), advertDetailsSimilarsButtonItem2);
                }
            }
            if (aVar != null) {
                AdvertSerpCommercialBanner advertSerpCommercialBanner4 = aVar.f74323a;
                if (advertSerpCommercialBanner4 == null) {
                    advertSerpCommercialBanner4 = aVar.f74324b;
                }
                if (advertSerpCommercialBanner4 != null) {
                    size = t12.f71975Z1.indexOf(advertSerpCommercialBanner4);
                }
            }
            if (size < 0) {
                size = t12.f71982a2.size() + i15;
            }
            AdvertDetailsAutoMediaItem advertDetailsAutoMediaItem = t12.f72128v2;
            if (advertDetailsAutoMediaItem != null) {
                t12.f71975Z1.remove(advertDetailsAutoMediaItem);
                t12.f71975Z1.addAll(size, C42745f0.j(t12.r0(10), advertDetailsAutoMediaItem, t12.r0(10)));
            }
            AdvertDetailsAutoMediaSelectPixelItem advertDetailsAutoMediaSelectPixelItem = t12.f72135w2;
            if (advertDetailsAutoMediaSelectPixelItem != null) {
                t12.f71975Z1.remove(advertDetailsAutoMediaSelectPixelItem);
                t12.f71975Z1.addAll(size - 1, C42745f0.j(advertDetailsAutoMediaSelectPixelItem));
            }
        }
        if (aVar != null) {
            AdvertSerpCommercialBanner advertSerpCommercialBanner5 = aVar.f74323a;
            if (advertSerpCommercialBanner5 == null) {
                advertSerpCommercialBanner5 = aVar.f74324b;
            }
            if (advertSerpCommercialBanner5 != null) {
                t12.f71975Z1.indexOf(advertSerpCommercialBanner5);
            }
        }
        t12.i(i15);
        AdvertDetails advertDetails2 = t12.f71951V5;
        if (advertDetails2 != null && (id2 = advertDetails2.getId()) != null) {
            t12.f71954W1.b(id2, t12.f71975Z1);
        }
        return kotlin.G0.f406611a;
    }
}
