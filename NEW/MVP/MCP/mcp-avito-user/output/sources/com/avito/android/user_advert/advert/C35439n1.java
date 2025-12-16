package com.avito.android.user_advert.advert;

import com.avito.android.lib.beduin_v2.beduin_item.a;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.beduin.v2.avito.component.items_controller.h;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: MyAdvertDetailsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.n1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C35439n1 extends C42801a implements Y41.r<BannerState, com.avito.android.lib.beduin_v2.beduin_item.a, UV0.c<? extends com.avito.conveyor_item.a>, Continuation<? super UV0.c<com.avito.conveyor_item.a>>, Object>, SuspendFunction {
    @Override // Y41.r
    public final Object invoke(BannerState bannerState, com.avito.android.lib.beduin_v2.beduin_item.a aVar, UV0.c<? extends com.avito.conveyor_item.a> cVar, Continuation<? super UV0.c<com.avito.conveyor_item.a>> continuation) {
        BannerState bannerState2 = bannerState;
        com.avito.android.lib.beduin_v2.beduin_item.a aVar2 = aVar;
        C35436m1 c35436m1 = (C35436m1) this.receiver;
        int i12 = C35436m1.f310544u;
        c35436m1.getClass();
        ArrayList arrayList = new ArrayList();
        for (com.avito.conveyor_item.a aVar3 : cVar.f16399b) {
            if (aVar3 instanceof CH0.a) {
                com.avito.android.lib.beduin_v2.beduin_item.stateless.a aVar4 = null;
                if (aVar2 instanceof a.C5176a) {
                    BannerState.BannerData bannerData = bannerState2.f215641e;
                    if (bannerData instanceof BannerState.BannerData.Content) {
                        Map<String, h.a> items = ((com.avito.beduin.v2.avito.component.items_controller.h) ((a.C5176a) aVar2).f175437a.f334562a.getState()).getItems();
                        com.avito.android.lib.beduin_v2.beduin_item.stateless.a aVar5 = ((BannerState.BannerData.Content) bannerData).f215645e;
                        if (items.containsKey(aVar5.f175461b)) {
                            aVar4 = aVar5;
                        }
                    }
                }
                if (aVar4 != null) {
                    arrayList.add(aVar4);
                }
            } else {
                arrayList.add(aVar3);
            }
        }
        return new UV0.c(arrayList);
    }
}
