package com.avito.android.service_orders.list.blueprints;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersBannerItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersBannerItem;", "Lcom/avito/conveyor_item/a;", "a", "ServiceOrdersBannerItemStyle", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrdersBannerItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f279212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f279213c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f279214d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f279215e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ServiceOrdersBannerItemStyle f279216f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f279217g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f279218h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrdersBannerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersBannerItem$ServiceOrdersBannerItemStyle;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServiceOrdersBannerItemStyle {

        /* renamed from: c, reason: collision with root package name */
        public static final ServiceOrdersBannerItemStyle f279219c;

        /* renamed from: d, reason: collision with root package name */
        public static final ServiceOrdersBannerItemStyle f279220d;

        /* renamed from: e, reason: collision with root package name */
        public static final ServiceOrdersBannerItemStyle f279221e;

        /* renamed from: f, reason: collision with root package name */
        public static final ServiceOrdersBannerItemStyle f279222f;

        /* renamed from: g, reason: collision with root package name */
        public static final ServiceOrdersBannerItemStyle f279223g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ ServiceOrdersBannerItemStyle[] f279224h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f279225i;

        /* renamed from: b, reason: collision with root package name */
        public final int f279226b;

        static {
            ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle = new ServiceOrdersBannerItemStyle("ORANGE", 0, R.attr.bannerOrange);
            f279219c = serviceOrdersBannerItemStyle;
            ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle2 = new ServiceOrdersBannerItemStyle("RED", 1, R.attr.bannerRed);
            f279220d = serviceOrdersBannerItemStyle2;
            ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle3 = new ServiceOrdersBannerItemStyle("WARMGRAY", 2, R.attr.bannerWarmgray);
            f279221e = serviceOrdersBannerItemStyle3;
            ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle4 = new ServiceOrdersBannerItemStyle("WHITE", 3, R.attr.bannerWhite);
            f279222f = serviceOrdersBannerItemStyle4;
            ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle5 = new ServiceOrdersBannerItemStyle("VIOLET", 4, R.attr.bannerViolet);
            f279223g = serviceOrdersBannerItemStyle5;
            ServiceOrdersBannerItemStyle[] serviceOrdersBannerItemStyleArr = {serviceOrdersBannerItemStyle, serviceOrdersBannerItemStyle2, serviceOrdersBannerItemStyle3, serviceOrdersBannerItemStyle4, serviceOrdersBannerItemStyle5};
            f279224h = serviceOrdersBannerItemStyleArr;
            f279225i = kotlin.enums.c.a(serviceOrdersBannerItemStyleArr);
        }

        public ServiceOrdersBannerItemStyle(@InterfaceC42150f String str, int i12, int i13) {
            this.f279226b = i13;
        }

        public static ServiceOrdersBannerItemStyle valueOf(String str) {
            return (ServiceOrdersBannerItemStyle) Enum.valueOf(ServiceOrdersBannerItemStyle.class, str);
        }

        public static ServiceOrdersBannerItemStyle[] values() {
            return (ServiceOrdersBannerItemStyle[]) f279224h.clone();
        }
    }

    /* compiled from: ServiceOrdersBannerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersBannerItem$a;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f279227a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279228b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f279227a = str;
            this.f279228b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f279227a, aVar.f279227a) && L.f(this.f279228b, aVar.f279228b);
        }

        public final int hashCode() {
            return this.f279228b.hashCode() + (this.f279227a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceOrdersBannerItemAction(title=");
            sb2.append(this.f279227a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f279228b, ')');
        }
    }

    public ServiceOrdersBannerItem(@k String str, @k String str2, @k String str3, @k ArrayList arrayList, @k ServiceOrdersBannerItemStyle serviceOrdersBannerItemStyle, @k String str4, @l Long l12) {
        this.f279212b = str;
        this.f279213c = str2;
        this.f279214d = str3;
        this.f279215e = arrayList;
        this.f279216f = serviceOrdersBannerItemStyle;
        this.f279217g = str4;
        this.f279218h = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrdersBannerItem)) {
            return false;
        }
        ServiceOrdersBannerItem serviceOrdersBannerItem = (ServiceOrdersBannerItem) obj;
        return L.f(this.f279212b, serviceOrdersBannerItem.f279212b) && L.f(this.f279213c, serviceOrdersBannerItem.f279213c) && L.f(this.f279214d, serviceOrdersBannerItem.f279214d) && this.f279215e.equals(serviceOrdersBannerItem.f279215e) && this.f279216f == serviceOrdersBannerItem.f279216f && L.f(this.f279217g, serviceOrdersBannerItem.f279217g) && L.f(this.f279218h, serviceOrdersBannerItem.f279218h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return getF279212b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279212b() {
        return this.f279212b;
    }

    public final int hashCode() {
        int iD2 = H.d((this.f279216f.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f279215e, H.d(H.d(this.f279212b.hashCode() * 31, 31, this.f279213c), 31, this.f279214d), 31)) * 31, 31, this.f279217g);
        Long l12 = this.f279218h;
        return iD2 + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersBannerItem(stringId=");
        sb2.append(this.f279212b);
        sb2.append(", title=");
        sb2.append(this.f279213c);
        sb2.append(", subtitle=");
        sb2.append(this.f279214d);
        sb2.append(", actions=");
        sb2.append(this.f279215e);
        sb2.append(", style=");
        sb2.append(this.f279216f);
        sb2.append(", bannerType=");
        sb2.append(this.f279217g);
        sb2.append(", closeDayTimeGap=");
        return m.m(sb2, this.f279218h, ')');
    }
}
