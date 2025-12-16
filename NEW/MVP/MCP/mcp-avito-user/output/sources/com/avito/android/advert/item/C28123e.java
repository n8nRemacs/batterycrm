package com.avito.android.advert.item;

import com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner;
import com.avito.android.advert_core.blocks.AdvertDetailsBlockItem;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: AdvertDetailsBlocksPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C28123e extends C42801a implements Y41.p<com.avito.android.advert.item.similars.t, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(com.avito.android.advert.item.similars.t tVar, Continuation<? super kotlin.G0> continuation) {
        AdvertSerpCommercialBanner advertSerpCommercialBanner;
        AdvertSerpCommercialBanner advertSerpCommercialBanner2;
        I1 i12;
        com.avito.android.advert.item.similars.t tVar2 = tVar;
        C28129g c28129g = (C28129g) this.receiver;
        c28129g.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(tVar2.f80337a);
        if (!c28129g.f75659t) {
            com.avito.android.advert.item.commercials.a aVar = tVar2.f80338b;
            if (aVar != null && (advertSerpCommercialBanner2 = aVar.f74323a) != null) {
                if ((advertSerpCommercialBanner2.getCommercialSerpItem() instanceof CommercialVideoBannerItem) && (i12 = c28129g.f75653n) != null) {
                    i12.f0();
                }
                arrayList.add(advertSerpCommercialBanner2);
            }
            if (aVar != null && (advertSerpCommercialBanner = aVar.f74324b) != null) {
                arrayList.add(advertSerpCommercialBanner);
            }
            I1 i13 = c28129g.f75653n;
            if (i13 != null) {
                i13.f0();
            }
        }
        ArrayList arrayList2 = c28129g.f75654o;
        Iterator it = arrayList2.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (((AdvertDetailsBlockItem) it.next()).f83011b == AdvertDetailsBlockId.COMPLEMENTARY_ITEMS) {
                break;
            }
            i14++;
        }
        c28129g.f75655p = arrayList;
        if (i14 > -1) {
            arrayList2.set(i14, AdvertDetailsBlockItem.a((AdvertDetailsBlockItem) arrayList2.get(i14), c28129g.f75655p));
        }
        c28129g.i(i14, true);
        return kotlin.G0.f406611a;
    }
}
