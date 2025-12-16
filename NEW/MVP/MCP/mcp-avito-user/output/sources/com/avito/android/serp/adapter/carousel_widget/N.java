package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.carousel_image.CarouselImageItem;
import com.avito.android.serp.adapter.carousel_show_more.CarouselShowMoreItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CarouselWidgetItem f269301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(CarouselWidgetItem carouselWidgetItem) {
        super(0);
        this.f269301l = carouselWidgetItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CarouselWidgetItem carouselWidgetItem = this.f269301l;
        for (PersistableSerpItem persistableSerpItem : carouselWidgetItem.f269249f) {
            if (persistableSerpItem instanceof AdvertItem) {
                ((AdvertItem) persistableSerpItem).f268421a1 = null;
            } else if (persistableSerpItem instanceof SerpConstructorAdvertItem) {
                ((SerpConstructorAdvertItem) persistableSerpItem).setItemClickListener(null);
            }
        }
        for (PersistableSerpItem persistableSerpItem2 : C42745f0.h0(carouselWidgetItem.f269251h, carouselWidgetItem.f269250g)) {
            if (persistableSerpItem2 instanceof CarouselShowMoreItem) {
                ((CarouselShowMoreItem) persistableSerpItem2).f269142g = null;
            } else if (persistableSerpItem2 instanceof CarouselImageItem) {
                ((CarouselImageItem) persistableSerpItem2).f269113g = null;
            }
        }
        return G0.f406611a;
    }
}
