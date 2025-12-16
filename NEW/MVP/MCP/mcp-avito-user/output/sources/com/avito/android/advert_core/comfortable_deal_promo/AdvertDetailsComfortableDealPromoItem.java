package com.avito.android.advert_core.comfortable_deal_promo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "AnalyticsEvent", "Button", "ImageInformation", "WidgetStyle", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsComfortableDealPromoItem implements BlockItem, l1, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsComfortableDealPromoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f83053b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83054c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f83055d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f83056e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f83057f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ImageInformation f83058g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final WidgetStyle f83059h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<Button> f83060i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final AnalyticsEvent f83061j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83062k;

    /* renamed from: l, reason: collision with root package name */
    public final long f83063l;

    /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$AnalyticsEvent;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "I", "c", "()I", "d", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsEvent implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AnalyticsEvent> CREATOR = new a();

        @com.google.gson.annotations.c("eid")
        private final int id;

        @com.google.gson.annotations.c("params")
        @Y61.l
        private final Map<String, String> params;

        @com.google.gson.annotations.c("version")
        private final int version;

        /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AnalyticsEvent> {
            @Override // android.os.Parcelable.Creator
            public final AnalyticsEvent createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new AnalyticsEvent(i12, i13, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final AnalyticsEvent[] newArray(int i12) {
                return new AnalyticsEvent[i12];
            }
        }

        public AnalyticsEvent(int i12, int i13, @Y61.l Map<String, String> map) {
            this.id = i12;
            this.version = i13;
            this.params = map;
        }

        /* renamed from: c, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: d, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsEvent)) {
                return false;
            }
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
            return this.id == analyticsEvent.id && this.version == analyticsEvent.version && L.f(this.params, analyticsEvent.params);
        }

        @Y61.l
        public final Map<String, String> getParams() {
            return this.params;
        }

        public final int hashCode() {
            int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
            Map<String, String> map = this.params;
            return iE2 + (map == null ? 0 : map.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticsEvent(id=");
            sb2.append(this.id);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", params=");
            return r.w(sb2, this.params, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.id);
            parcel.writeInt(this.version);
            Map<String, String> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$Button;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f83065b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f83066c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AnalyticsEvent f83067d;

        /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() == 0 ? null : AnalyticsEvent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l AnalyticsEvent analyticsEvent) {
            this.f83065b = str;
            this.f83066c = deepLink;
            this.f83067d = analyticsEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f83065b, button.f83065b) && L.f(this.f83066c, button.f83066c) && L.f(this.f83067d, button.f83067d);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f83066c, this.f83065b.hashCode() * 31, 31);
            AnalyticsEvent analyticsEvent = this.f83067d;
            return iE2 + (analyticsEvent == null ? 0 : analyticsEvent.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "Button(text=" + this.f83065b + ", deeplink=" + this.f83066c + ", onClickEvent=" + this.f83067d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83065b);
            parcel.writeParcelable(this.f83066c, i12);
            AnalyticsEvent analyticsEvent = this.f83067d;
            if (analyticsEvent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analyticsEvent.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$ImageInformation;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageInformation implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ImageInformation> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f83068b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83069c;

        /* renamed from: d, reason: collision with root package name */
        public final int f83070d;

        /* renamed from: e, reason: collision with root package name */
        public final int f83071e;

        /* renamed from: f, reason: collision with root package name */
        public final int f83072f;

        /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageInformation> {
            @Override // android.os.Parcelable.Creator
            public final ImageInformation createFromParcel(Parcel parcel) {
                return new ImageInformation((UniversalImage) parcel.readParcelable(ImageInformation.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageInformation[] newArray(int i12) {
                return new ImageInformation[i12];
            }
        }

        public ImageInformation(@Y61.k UniversalImage universalImage, int i12, int i13, int i14, int i15) {
            this.f83068b = universalImage;
            this.f83069c = i12;
            this.f83070d = i13;
            this.f83071e = i14;
            this.f83072f = i15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageInformation)) {
                return false;
            }
            ImageInformation imageInformation = (ImageInformation) obj;
            return L.f(this.f83068b, imageInformation.f83068b) && this.f83069c == imageInformation.f83069c && this.f83070d == imageInformation.f83070d && this.f83071e == imageInformation.f83071e && this.f83072f == imageInformation.f83072f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f83072f) + r.e(this.f83071e, r.e(this.f83070d, r.e(this.f83069c, this.f83068b.hashCode() * 31, 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageInformation(image=");
            sb2.append(this.f83068b);
            sb2.append(", marginTop=");
            sb2.append(this.f83069c);
            sb2.append(", marginBottom=");
            sb2.append(this.f83070d);
            sb2.append(", marginStart=");
            sb2.append(this.f83071e);
            sb2.append(", marginEnd=");
            return r.t(sb2, this.f83072f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f83068b, i12);
            parcel.writeInt(this.f83069c);
            parcel.writeInt(this.f83070d);
            parcel.writeInt(this.f83071e);
            parcel.writeInt(this.f83072f);
        }
    }

    /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$WidgetStyle;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WidgetStyle implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<WidgetStyle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f83073b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f83074c;

        /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WidgetStyle> {
            @Override // android.os.Parcelable.Creator
            public final WidgetStyle createFromParcel(Parcel parcel) {
                return new WidgetStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(WidgetStyle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final WidgetStyle[] newArray(int i12) {
                return new WidgetStyle[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WidgetStyle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetStyle)) {
                return false;
            }
            WidgetStyle widgetStyle = (WidgetStyle) obj;
            return L.f(this.f83073b, widgetStyle.f83073b) && L.f(this.f83074c, widgetStyle.f83074c);
        }

        public final int hashCode() {
            Integer num = this.f83073b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            UniversalColor universalColor = this.f83074c;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WidgetStyle(linearGradientAttr=");
            sb2.append(this.f83073b);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f83074c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Integer num = this.f83073b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.f83074c, i12);
        }

        public WidgetStyle(@InterfaceC42150f @Y61.l Integer num, @Y61.l UniversalColor universalColor) {
            this.f83073b = num;
            this.f83074c = universalColor;
        }

        public /* synthetic */ WidgetStyle(Integer num, UniversalColor universalColor, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : universalColor);
        }
    }

    /* compiled from: AdvertDetailsComfortableDealPromoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsComfortableDealPromoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsComfortableDealPromoItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsComfortableDealPromoItem.class.getClassLoader());
            ImageInformation imageInformationCreateFromParcel = parcel.readInt() == 0 ? null : ImageInformation.CREATOR.createFromParcel(parcel);
            WidgetStyle widgetStyleCreateFromParcel = parcel.readInt() == 0 ? null : WidgetStyle.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDetailsComfortableDealPromoItem(i12, j12, string, string2, attributedText, imageInformationCreateFromParcel, widgetStyleCreateFromParcel, arrayList, parcel.readInt() != 0 ? AnalyticsEvent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsComfortableDealPromoItem[] newArray(int i12) {
            return new AdvertDetailsComfortableDealPromoItem[i12];
        }
    }

    public AdvertDetailsComfortableDealPromoItem(int i12, long j12, @Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l ImageInformation imageInformation, @Y61.l WidgetStyle widgetStyle, @Y61.k List<Button> list, @Y61.l AnalyticsEvent analyticsEvent) {
        this.f83053b = i12;
        this.f83054c = j12;
        this.f83055d = str;
        this.f83056e = str2;
        this.f83057f = attributedText;
        this.f83058g = imageInformation;
        this.f83059h = widgetStyle;
        this.f83060i = list;
        this.f83061j = analyticsEvent;
        this.f83062k = SerpViewType.f268585e;
        this.f83063l = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsComfortableDealPromoItem(i12, this.f83054c, this.f83055d, this.f83056e, this.f83057f, this.f83058g, this.f83059h, this.f83060i, this.f83061j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsComfortableDealPromoItem)) {
            return false;
        }
        AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem = (AdvertDetailsComfortableDealPromoItem) obj;
        return this.f83053b == advertDetailsComfortableDealPromoItem.f83053b && this.f83054c == advertDetailsComfortableDealPromoItem.f83054c && L.f(this.f83055d, advertDetailsComfortableDealPromoItem.f83055d) && L.f(this.f83056e, advertDetailsComfortableDealPromoItem.f83056e) && L.f(this.f83057f, advertDetailsComfortableDealPromoItem.f83057f) && L.f(this.f83058g, advertDetailsComfortableDealPromoItem.f83058g) && L.f(this.f83059h, advertDetailsComfortableDealPromoItem.f83059h) && L.f(this.f83060i, advertDetailsComfortableDealPromoItem.f83060i) && L.f(this.f83061j, advertDetailsComfortableDealPromoItem.f83061j);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF171235b() {
        return this.f83054c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272259o() {
        return this.f83053b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323985b() {
        return this.f83055d;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272978g() {
        return this.f83063l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272258n() {
        return this.f83062k;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.g(Integer.hashCode(this.f83053b) * 31, 31, this.f83054c), 31, this.f83055d), 31, this.f83056e);
        AttributedText attributedText = this.f83057f;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ImageInformation imageInformation = this.f83058g;
        int iHashCode2 = (iHashCode + (imageInformation == null ? 0 : imageInformation.hashCode())) * 31;
        WidgetStyle widgetStyle = this.f83059h;
        int iE2 = H.e((iHashCode2 + (widgetStyle == null ? 0 : widgetStyle.hashCode())) * 31, 31, this.f83060i);
        AnalyticsEvent analyticsEvent = this.f83061j;
        return iE2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsComfortableDealPromoItem(spanCount=" + this.f83053b + ", id=" + this.f83054c + ", stringId=" + this.f83055d + ", title=" + this.f83056e + ", subtitle=" + this.f83057f + ", imageInformation=" + this.f83058g + ", style=" + this.f83059h + ", buttons=" + this.f83060i + ", onShowEvent=" + this.f83061j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f83053b);
        parcel.writeLong(this.f83054c);
        parcel.writeString(this.f83055d);
        parcel.writeString(this.f83056e);
        parcel.writeParcelable(this.f83057f, i12);
        ImageInformation imageInformation = this.f83058g;
        if (imageInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageInformation.writeToParcel(parcel, i12);
        }
        WidgetStyle widgetStyle = this.f83059h;
        if (widgetStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetStyle.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.f83060i, parcel);
        while (itJ.hasNext()) {
            ((Button) itJ.next()).writeToParcel(parcel, i12);
        }
        AnalyticsEvent analyticsEvent = this.f83061j;
        if (analyticsEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsEvent.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ AdvertDetailsComfortableDealPromoItem(int i12, long j12, String str, String str2, AttributedText attributedText, ImageInformation imageInformation, WidgetStyle widgetStyle, List list, AnalyticsEvent analyticsEvent, int i13, C42822w c42822w) {
        this(i12, j12, (i13 & 4) != 0 ? String.valueOf(j12) : str, str2, attributedText, imageInformation, widgetStyle, list, analyticsEvent);
    }
}
