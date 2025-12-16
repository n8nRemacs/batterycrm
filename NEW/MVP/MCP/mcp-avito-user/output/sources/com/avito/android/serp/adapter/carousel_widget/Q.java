package com.avito.android.serp.adapter.carousel_widget;

import android.os.Parcelable;
import com.avito.android.di.module.InterfaceC30232x2;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.carousel_image.CarouselImageItem;
import com.avito.android.serp.adapter.carousel_show_more.CarouselShowMoreItem;
import com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: CarouselItemsWidgetPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/Q;", "Lcom/avito/android/serp/adapter/carousel_widget/I;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Q implements I {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f269309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D f269310c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Kundle f269311d;

    @Inject
    public Q(@Y61.l @InterfaceC30232x2 Kundle kundle, @Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k D d12) {
        this.f269309b = eVar;
        this.f269310c = d12;
        this.f269311d = kundle == null ? new Kundle() : kundle;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.I
    public final void I0(@Y61.l Parcelable parcelable, int i12) {
        this.f269311d.j(parcelable, "CAROUSEL_ITEMS_SAVED_STATE_KEY " + i12);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String strBO;
        String title;
        InterfaceC34698h interfaceC34698h = (InterfaceC34698h) eVar;
        CarouselWidgetItem carouselWidgetItem = (CarouselWidgetItem) aVar;
        interfaceC34698h.L4();
        String str = carouselWidgetItem.f269259p;
        Integer numJ = str != null ? com.avito.android.lib.util.f.j(str) : null;
        CarouselWidgetItem.Action action = carouselWidgetItem.f269258o;
        boolean z12 = (action != null ? action.f269270b : null) != null;
        ItemsCarouselWidget.ButtonColors buttonColors = carouselWidgetItem.f269260q;
        AttributedText attributedText = carouselWidgetItem.f269254k;
        if (attributedText != null) {
            strBO = interfaceC34698h.bO(attributedText, z12, numJ, buttonColors);
        } else {
            String str2 = carouselWidgetItem.f269252i;
            interfaceC34698h.zG(str2 == null ? "" : str2, z12, numJ, buttonColors);
            strBO = str2 == null ? "" : str2;
        }
        AttributedText attributedText2 = carouselWidgetItem.f269255l;
        if (attributedText2 != null) {
            interfaceC34698h.Y1(attributedText2);
        } else {
            interfaceC34698h.f(carouselWidgetItem.f269253j);
        }
        UniversalColor universalColor = carouselWidgetItem.f269256m;
        boolean z13 = carouselWidgetItem.f269265v;
        boolean zMx = interfaceC34698h.mx(universalColor, z13);
        SerpDisplayType serpDisplayType = carouselWidgetItem.f269261r;
        interfaceC34698h.il(serpDisplayType);
        ItemsCarouselWidget.BackgroundImage backgroundImage = carouselWidgetItem.f269262s;
        boolean zYV = interfaceC34698h.YV(backgroundImage != null ? backgroundImage.getImage() : null, z13);
        ItemsCarouselWidget.Button button = carouselWidgetItem.f269263t;
        interfaceC34698h.NS(button);
        Timer timer = carouselWidgetItem.f269264u;
        interfaceC34698h.I3(timer != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(timer.getEnds())) : null, timer != null ? timer.getStyle() : null);
        List<PersistableSerpItem> list = carouselWidgetItem.f269249f;
        for (PersistableSerpItem persistableSerpItem : list) {
            if (persistableSerpItem instanceof AdvertItem) {
                ((AdvertItem) persistableSerpItem).f268421a1 = new J(this, carouselWidgetItem, strBO);
            } else if (persistableSerpItem instanceof SerpConstructorAdvertItem) {
                ((SerpConstructorAdvertItem) persistableSerpItem).setItemClickListener(new K(this, carouselWidgetItem, strBO));
            }
        }
        List<PersistableSerpItem> list2 = carouselWidgetItem.f269250g;
        List<PersistableSerpItem> list3 = list2;
        List<PersistableSerpItem> list4 = carouselWidgetItem.f269251h;
        List<PersistableSerpItem> list5 = list4;
        Iterator it = C42745f0.h0(list5, list3).iterator();
        while (it.hasNext()) {
            PersistableSerpItem persistableSerpItem2 = (PersistableSerpItem) it.next();
            Iterator it2 = it;
            if (persistableSerpItem2 instanceof CarouselShowMoreItem) {
                ((CarouselShowMoreItem) persistableSerpItem2).f269142g = new L(this, carouselWidgetItem, strBO);
            } else if (persistableSerpItem2 instanceof CarouselImageItem) {
                ((CarouselImageItem) persistableSerpItem2).f269113g = new M(this, carouselWidgetItem, strBO);
            }
            it = it2;
        }
        interfaceC34698h.t(new N(carouselWidgetItem));
        UV0.c cVar = new UV0.c(list.isEmpty() ? C42784z0.f406748b : C42745f0.h0(list5, C42745f0.h0(list, list3)));
        interfaceC34698h.v20(O2.a(list2), O2.a(list4));
        interfaceC34698h.xc(cVar, carouselWidgetItem.hashCode(), serpDisplayType);
        interfaceC34698h.ce(cVar);
        interfaceC34698h.zb(cVar);
        interfaceC34698h.W4(this.f269311d.d(AK.c.g(carouselWidgetItem.hashCode(), "CAROUSEL_ITEMS_SAVED_STATE_KEY ")));
        if (button != null && (title = button.getTitle()) != null) {
            interfaceC34698h.a0(new O(this, carouselWidgetItem, strBO, title));
        }
        interfaceC34698h.M(carouselWidgetItem.f269257n);
        interfaceC34698h.I6(new P(this, carouselWidgetItem, strBO));
        interfaceC34698h.E10(serpDisplayType, zMx, zYV, z13);
        this.f269310c.d(carouselWidgetItem, strBO, i12);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.I
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Kundle getF269311d() {
        return this.f269311d;
    }

    public /* synthetic */ Q(Kundle kundle, h31.e eVar, D d12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : kundle, eVar, d12);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.I
    public final void J6(@Y61.l String str) {
    }
}
