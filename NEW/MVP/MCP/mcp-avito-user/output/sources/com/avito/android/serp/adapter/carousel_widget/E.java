package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Iterator;
import javax.inject.Inject;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import mr0.C44124a;
import mr0.C44125b;

/* compiled from: CarouselWidgetAnalyticsInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/E;", "Lcom/avito/android/serp/adapter/carousel_widget/D;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f269273a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f269274b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H f269275c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f269276d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f269277e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f269278f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f269279g;

    @Inject
    public E(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l SearchParams searchParams, @Y61.k com.avito.android.remote.H h12, @Y61.l String str) {
        this.f269273a = gVar;
        this.f269274b = interfaceC28373a;
        this.f269275c = h12;
        this.f269276d = str;
        String strA = C35800g5.a(new C35792f5(str));
        this.f269277e = strA;
        this.f269278f = strA != null ? C43066x.h0(strA, "cross_category_sale", false) : false ? "carousel_sale" : "carousel";
        this.f269279g = searchParams != null ? searchParams.getCategoryId() : null;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.D
    public final void a(@Y61.l CarouselWidgetItem carouselWidgetItem, @Y61.k String str, @Y61.k String str2) {
        CarouselWidgetItem.Analytics analytics;
        CarouselWidgetItem.Analytics analytics2;
        this.f269274b.c(new C44124a(this.f269275c.getF253025a(), e(carouselWidgetItem), androidx.appcompat.app.r.r(str, ", click on ", str2), this.f269277e, this.f269279g, (carouselWidgetItem == null || (analytics2 = carouselWidgetItem.f269266w) == null) ? null : analytics2.f269271b, (carouselWidgetItem == null || (analytics = carouselWidgetItem.f269266w) == null) ? null : analytics.f269272c, carouselWidgetItem != null ? Integer.valueOf(carouselWidgetItem.f269248e + 1) : null, "click on button", str2));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.D
    public final void b(@Y61.l CarouselWidgetItem carouselWidgetItem, @Y61.k String str, @Y61.k String str2) {
        CarouselWidgetItem.Analytics analytics;
        CarouselWidgetItem.Analytics analytics2;
        if (carouselWidgetItem != null && carouselWidgetItem.f269247d) {
            Iterator<PersistableSerpItem> it = carouselWidgetItem.f269249f.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (kotlin.jvm.internal.L.f(String.valueOf(it.next().getF272342b()), str2)) {
                    break;
                } else {
                    i12++;
                }
            }
            d.a.a(this.f269273a, Integer.valueOf(i12), carouselWidgetItem.f269265v ? "salesHeader_widget_carousel" : this.f269278f, androidx.appcompat.app.r.r(str, ", click on ", str2), null, null, null, null, carouselWidgetItem.f269268y, 120);
        }
        this.f269274b.c(new C44124a(this.f269275c.getF253025a(), e(carouselWidgetItem), androidx.appcompat.app.r.r(str, ", click on ", str2), this.f269277e, this.f269279g, (carouselWidgetItem == null || (analytics2 = carouselWidgetItem.f269266w) == null) ? null : analytics2.f269271b, (carouselWidgetItem == null || (analytics = carouselWidgetItem.f269266w) == null) ? null : analytics.f269272c, carouselWidgetItem != null ? Integer.valueOf(carouselWidgetItem.f269248e + 1) : null, "click on item", str2));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.D
    public final void c(@Y61.l CarouselWidgetItem carouselWidgetItem, @Y61.k String str) {
        CarouselWidgetItem.Analytics analytics;
        CarouselWidgetItem.Analytics analytics2;
        this.f269274b.c(new C44124a(this.f269275c.getF253025a(), e(carouselWidgetItem), str, this.f269277e, this.f269279g, (carouselWidgetItem == null || (analytics2 = carouselWidgetItem.f269266w) == null) ? null : analytics2.f269271b, (carouselWidgetItem == null || (analytics = carouselWidgetItem.f269266w) == null) ? null : analytics.f269272c, carouselWidgetItem != null ? Integer.valueOf(carouselWidgetItem.f269248e + 1) : null, "click on header", null));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.D
    public final void d(@Y61.l CarouselWidgetItem carouselWidgetItem, @Y61.k String str, int i12) {
        CarouselWidgetItem.Analytics analytics;
        CarouselWidgetItem.Analytics analytics2;
        String str2;
        if (carouselWidgetItem != null && carouselWidgetItem.f269247d) {
            if (carouselWidgetItem.f269265v) {
                str2 = "salesHeader_widget_carousel";
            } else {
                SerpDisplayType serpDisplayType = carouselWidgetItem.f269261r;
                if (serpDisplayType == null || !serpDisplayType.isCarouselVacancy()) {
                    String str3 = this.f269277e;
                    str2 = str3 != null ? C43066x.h0(str3, "cross_category_sale", false) : false ? "carousel_sale" : "carousel";
                } else {
                    str2 = "seen_items";
                }
            }
            this.f269273a.h(i12, str2, str, null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : carouselWidgetItem.f269268y);
        }
        this.f269274b.c(new C44125b(this.f269275c.getF253025a(), e(carouselWidgetItem), str, this.f269277e, this.f269279g, (carouselWidgetItem == null || (analytics2 = carouselWidgetItem.f269266w) == null) ? null : analytics2.f269271b, (carouselWidgetItem == null || (analytics = carouselWidgetItem.f269266w) == null) ? null : analytics.f269272c, carouselWidgetItem != null ? Integer.valueOf(carouselWidgetItem.f269248e + 1) : null));
    }

    public final String e(CarouselWidgetItem carouselWidgetItem) {
        SerpDisplayType serpDisplayType;
        return (carouselWidgetItem == null || (serpDisplayType = carouselWidgetItem.f269261r) == null || !serpDisplayType.isCarouselVacancy()) ? this.f269276d == null ? "rec" : (carouselWidgetItem == null || !carouselWidgetItem.f269247d) ? "serp" : "vertical" : "vertical_recent_items";
    }
}
