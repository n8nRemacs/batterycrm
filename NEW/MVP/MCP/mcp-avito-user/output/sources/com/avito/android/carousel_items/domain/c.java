package com.avito.android.carousel_items.domain;

import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.carousel_items.CarouselItemsResult;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: CarouselItemsInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/carousel_items/CarouselItemsResult;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/carousel_items/domain/g;", "apply", "(Lcom/avito/android/remote/model/carousel_items/CarouselItemsResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f115274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ItemsRequestParams.ParamRecs f115275c;

    public c(e eVar, ItemsRequestParams.ParamRecs paramRecs) {
        this.f115274b = eVar;
        this.f115275c = paramRecs;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AdvertItem advertItemA;
        CarouselItemsResult carouselItemsResult = (CarouselItemsResult) obj;
        List<SerpElement> items = carouselItemsResult.getItems();
        ArrayList arrayList = new ArrayList();
        for (SerpElement serpElement : items) {
            if (serpElement instanceof SerpAdvert) {
                InterfaceC34904z0 interfaceC34904z0 = this.f115274b.f115280d;
                SerpAdvert serpAdvert = (SerpAdvert) serpElement;
                SerpDisplayType serpDisplayTypeFromString = SerpDisplayType.INSTANCE.fromString(this.f115275c.getDisplayType());
                if (serpDisplayTypeFromString == null) {
                    serpDisplayTypeFromString = SerpDisplayType.Grid;
                }
                advertItemA = InterfaceC34904z0.a.a(interfaceC34904z0, serpAdvert, false, false, serpDisplayTypeFromString, null, 0, null, null, false, 2036);
            } else {
                advertItemA = null;
            }
            if (advertItemA != null) {
                arrayList.add(advertItemA);
            }
        }
        return new P2.b(new g(arrayList, carouselItemsResult.getLink()));
    }
}
