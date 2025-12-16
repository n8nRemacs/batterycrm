package com.avito.android.advert_core.pp_recall_promo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.CloseBannerPayload;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertDetailsPpRecallPromoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "EventData", "ImageInformation", "SelectItem", "SubmitButtonEventData", "SubmitButtonInformation", "WidgetStyle", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPpRecallPromoItem implements BlockItem, l1, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsPpRecallPromoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f83914b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f83916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f83917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AttributedText f83918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageInformation f83919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final WidgetStyle f83920h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f83921i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SubmitButtonInformation f83922j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AttributedText f83923k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<SelectItem> f83924l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final CloseBannerPayload f83925m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final EventData f83926n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final EventData f83927o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f83928p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f83929q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f83930r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83931s;

    /* renamed from: t, reason: collision with root package name */
    public final long f83932t;

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$EventData;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EventData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<EventData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f83933b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f83934c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f83935d;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EventData> {
            @Override // android.os.Parcelable.Creator
            public final EventData createFromParcel(Parcel parcel) {
                return new EventData(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventData[] newArray(int i12) {
                return new EventData[i12];
            }
        }

        public EventData(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
            this.f83933b = str;
            this.f83934c = str2;
            this.f83935d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventData)) {
                return false;
            }
            EventData eventData = (EventData) obj;
            return L.f(this.f83933b, eventData.f83933b) && L.f(this.f83934c, eventData.f83934c) && L.f(this.f83935d, eventData.f83935d);
        }

        public final int hashCode() {
            String str = this.f83933b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83934c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f83935d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EventData(reBannerName=");
            sb2.append(this.f83933b);
            sb2.append(", placement=");
            sb2.append(this.f83934c);
            sb2.append(", pageType=");
            return C22026a.c(sb2, this.f83935d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83933b);
            parcel.writeString(this.f83934c);
            parcel.writeString(this.f83935d);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$ImageInformation;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageInformation implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ImageInformation> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f83936b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83937c;

        /* renamed from: d, reason: collision with root package name */
        public final int f83938d;

        /* renamed from: e, reason: collision with root package name */
        public final int f83939e;

        /* renamed from: f, reason: collision with root package name */
        public final int f83940f;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
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
            this.f83936b = universalImage;
            this.f83937c = i12;
            this.f83938d = i13;
            this.f83939e = i14;
            this.f83940f = i15;
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
            return L.f(this.f83936b, imageInformation.f83936b) && this.f83937c == imageInformation.f83937c && this.f83938d == imageInformation.f83938d && this.f83939e == imageInformation.f83939e && this.f83940f == imageInformation.f83940f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f83940f) + androidx.appcompat.app.r.e(this.f83939e, androidx.appcompat.app.r.e(this.f83938d, androidx.appcompat.app.r.e(this.f83937c, this.f83936b.hashCode() * 31, 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageInformation(image=");
            sb2.append(this.f83936b);
            sb2.append(", marginTop=");
            sb2.append(this.f83937c);
            sb2.append(", marginBottom=");
            sb2.append(this.f83938d);
            sb2.append(", marginStart=");
            sb2.append(this.f83939e);
            sb2.append(", marginEnd=");
            return androidx.appcompat.app.r.t(sb2, this.f83940f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f83936b, i12);
            parcel.writeInt(this.f83937c);
            parcel.writeInt(this.f83938d);
            parcel.writeInt(this.f83939e);
            parcel.writeInt(this.f83940f);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$SelectItem;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectItem implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SelectItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f83941b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f83942c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f83943d;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectItem> {
            @Override // android.os.Parcelable.Creator
            public final SelectItem createFromParcel(Parcel parcel) {
                return new SelectItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SelectItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SelectItem[] newArray(int i12) {
                return new SelectItem[i12];
            }
        }

        public SelectItem(@Y61.k String str, @Y61.k String str2, @Y61.l DeepLink deepLink) {
            this.f83941b = str;
            this.f83942c = str2;
            this.f83943d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectItem)) {
                return false;
            }
            SelectItem selectItem = (SelectItem) obj;
            return L.f(this.f83941b, selectItem.f83941b) && L.f(this.f83942c, selectItem.f83942c) && L.f(this.f83943d, selectItem.f83943d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f83941b.hashCode() * 31, 31, this.f83942c);
            DeepLink deepLink = this.f83943d;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectItem(icon=");
            sb2.append(this.f83941b);
            sb2.append(", text=");
            sb2.append(this.f83942c);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f83943d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83941b);
            parcel.writeString(this.f83942c);
            parcel.writeParcelable(this.f83943d, i12);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$SubmitButtonEventData;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitButtonEventData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SubmitButtonEventData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f83944b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f83945c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f83946d;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SubmitButtonEventData> {
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonEventData createFromParcel(Parcel parcel) {
                return new SubmitButtonEventData(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubmitButtonEventData[] newArray(int i12) {
                return new SubmitButtonEventData[i12];
            }
        }

        public SubmitButtonEventData(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
            this.f83944b = str;
            this.f83945c = str2;
            this.f83946d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitButtonEventData)) {
                return false;
            }
            SubmitButtonEventData submitButtonEventData = (SubmitButtonEventData) obj;
            return L.f(this.f83944b, submitButtonEventData.f83944b) && L.f(this.f83945c, submitButtonEventData.f83945c) && L.f(this.f83946d, submitButtonEventData.f83946d);
        }

        public final int hashCode() {
            String str = this.f83944b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83945c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f83946d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubmitButtonEventData(reBannerName=");
            sb2.append(this.f83944b);
            sb2.append(", placement=");
            sb2.append(this.f83945c);
            sb2.append(", pageType=");
            return C22026a.c(sb2, this.f83946d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83944b);
            parcel.writeString(this.f83945c);
            parcel.writeString(this.f83946d);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$SubmitButtonInformation;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitButtonInformation implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SubmitButtonInformation> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f83947b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f83948c;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SubmitButtonInformation> {
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonInformation createFromParcel(Parcel parcel) {
                return new SubmitButtonInformation(parcel.readString(), (DeepLink) parcel.readParcelable(SubmitButtonInformation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SubmitButtonInformation[] newArray(int i12) {
                return new SubmitButtonInformation[i12];
            }
        }

        public SubmitButtonInformation(@Y61.k String str, @Y61.l DeepLink deepLink) {
            this.f83947b = str;
            this.f83948c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitButtonInformation)) {
                return false;
            }
            SubmitButtonInformation submitButtonInformation = (SubmitButtonInformation) obj;
            return L.f(this.f83947b, submitButtonInformation.f83947b) && L.f(this.f83948c, submitButtonInformation.f83948c);
        }

        public final int hashCode() {
            int iHashCode = this.f83947b.hashCode() * 31;
            DeepLink deepLink = this.f83948c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubmitButtonInformation(text=");
            sb2.append(this.f83947b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f83948c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83947b);
            parcel.writeParcelable(this.f83948c, i12);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/AdvertDetailsPpRecallPromoItem$WidgetStyle;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WidgetStyle implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<WidgetStyle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f83949b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f83950c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f83951d;

        /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WidgetStyle> {
            @Override // android.os.Parcelable.Creator
            public final WidgetStyle createFromParcel(Parcel parcel) {
                return new WidgetStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UniversalColor) parcel.readParcelable(WidgetStyle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final WidgetStyle[] newArray(int i12) {
                return new WidgetStyle[i12];
            }
        }

        public WidgetStyle() {
            this(null, null, null, 7, null);
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
            return L.f(this.f83949b, widgetStyle.f83949b) && L.f(this.f83950c, widgetStyle.f83950c) && L.f(this.f83951d, widgetStyle.f83951d);
        }

        public final int hashCode() {
            Integer num = this.f83949b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f83950c;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            UniversalColor universalColor = this.f83951d;
            return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WidgetStyle(radialGradientAttr=");
            sb2.append(this.f83949b);
            sb2.append(", linearGradientAttr=");
            sb2.append(this.f83950c);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f83951d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Integer num = this.f83949b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f83950c;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeParcelable(this.f83951d, i12);
        }

        public WidgetStyle(@InterfaceC42150f @Y61.l Integer num, @InterfaceC42150f @Y61.l Integer num2, @Y61.l UniversalColor universalColor) {
            this.f83949b = num;
            this.f83950c = num2;
            this.f83951d = universalColor;
        }

        public /* synthetic */ WidgetStyle(Integer num, Integer num2, UniversalColor universalColor, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : universalColor);
        }
    }

    /* compiled from: AdvertDetailsPpRecallPromoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPpRecallPromoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPpRecallPromoItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsPpRecallPromoItem.class.getClassLoader());
            ImageInformation imageInformationCreateFromParcel = ImageInformation.CREATOR.createFromParcel(parcel);
            WidgetStyle widgetStyleCreateFromParcel = WidgetStyle.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            SubmitButtonInformation submitButtonInformationCreateFromParcel = SubmitButtonInformation.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AdvertDetailsPpRecallPromoItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SelectItem.CREATOR, parcel, arrayList, iC2, 1);
                i13 = i13;
                attributedText2 = attributedText2;
            }
            return new AdvertDetailsPpRecallPromoItem(i12, j12, string, string2, attributedText, imageInformationCreateFromParcel, widgetStyleCreateFromParcel, string3, submitButtonInformationCreateFromParcel, attributedText2, arrayList, (CloseBannerPayload) parcel.readParcelable(AdvertDetailsPpRecallPromoItem.class.getClassLoader()), parcel.readInt() == 0 ? null : EventData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EventData.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPpRecallPromoItem[] newArray(int i12) {
            return new AdvertDetailsPpRecallPromoItem[i12];
        }
    }

    public AdvertDetailsPpRecallPromoItem(int i12, long j12, @Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k ImageInformation imageInformation, @Y61.k WidgetStyle widgetStyle, @Y61.k String str3, @Y61.k SubmitButtonInformation submitButtonInformation, @Y61.k AttributedText attributedText2, @Y61.k List<SelectItem> list, @Y61.k CloseBannerPayload closeBannerPayload, @Y61.l EventData eventData, @Y61.l EventData eventData2, boolean z12, boolean z13, boolean z14) {
        this.f83914b = i12;
        this.f83915c = j12;
        this.f83916d = str;
        this.f83917e = str2;
        this.f83918f = attributedText;
        this.f83919g = imageInformation;
        this.f83920h = widgetStyle;
        this.f83921i = str3;
        this.f83922j = submitButtonInformation;
        this.f83923k = attributedText2;
        this.f83924l = list;
        this.f83925m = closeBannerPayload;
        this.f83926n = eventData;
        this.f83927o = eventData2;
        this.f83928p = z12;
        this.f83929q = z13;
        this.f83930r = z14;
        this.f83931s = SerpViewType.f268585e;
        this.f83932t = j12;
    }

    public static AdvertDetailsPpRecallPromoItem a(AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem, int i12, long j12, String str, boolean z12, boolean z13, int i13) {
        int i14 = (i13 & 1) != 0 ? advertDetailsPpRecallPromoItem.f83914b : i12;
        long j13 = (i13 & 2) != 0 ? advertDetailsPpRecallPromoItem.f83915c : j12;
        String str2 = (i13 & 4) != 0 ? advertDetailsPpRecallPromoItem.f83916d : str;
        String str3 = advertDetailsPpRecallPromoItem.f83917e;
        AttributedText attributedText = advertDetailsPpRecallPromoItem.f83918f;
        ImageInformation imageInformation = advertDetailsPpRecallPromoItem.f83919g;
        WidgetStyle widgetStyle = advertDetailsPpRecallPromoItem.f83920h;
        String str4 = advertDetailsPpRecallPromoItem.f83921i;
        SubmitButtonInformation submitButtonInformation = advertDetailsPpRecallPromoItem.f83922j;
        AttributedText attributedText2 = advertDetailsPpRecallPromoItem.f83923k;
        List<SelectItem> list = advertDetailsPpRecallPromoItem.f83924l;
        CloseBannerPayload closeBannerPayload = advertDetailsPpRecallPromoItem.f83925m;
        EventData eventData = advertDetailsPpRecallPromoItem.f83926n;
        EventData eventData2 = advertDetailsPpRecallPromoItem.f83927o;
        boolean z14 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? advertDetailsPpRecallPromoItem.f83928p : true;
        boolean z15 = (32768 & i13) != 0 ? advertDetailsPpRecallPromoItem.f83929q : z12;
        boolean z16 = (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? advertDetailsPpRecallPromoItem.f83930r : z13;
        advertDetailsPpRecallPromoItem.getClass();
        return new AdvertDetailsPpRecallPromoItem(i14, j13, str2, str3, attributedText, imageInformation, widgetStyle, str4, submitButtonInformation, attributedText2, list, closeBannerPayload, eventData, eventData2, z14, z15, z16);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return a(this, i12, 0L, null, false, false, 131070);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPpRecallPromoItem)) {
            return false;
        }
        AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem = (AdvertDetailsPpRecallPromoItem) obj;
        return this.f83914b == advertDetailsPpRecallPromoItem.f83914b && this.f83915c == advertDetailsPpRecallPromoItem.f83915c && L.f(this.f83916d, advertDetailsPpRecallPromoItem.f83916d) && L.f(this.f83917e, advertDetailsPpRecallPromoItem.f83917e) && L.f(this.f83918f, advertDetailsPpRecallPromoItem.f83918f) && L.f(this.f83919g, advertDetailsPpRecallPromoItem.f83919g) && L.f(this.f83920h, advertDetailsPpRecallPromoItem.f83920h) && L.f(this.f83921i, advertDetailsPpRecallPromoItem.f83921i) && L.f(this.f83922j, advertDetailsPpRecallPromoItem.f83922j) && L.f(this.f83923k, advertDetailsPpRecallPromoItem.f83923k) && L.f(this.f83924l, advertDetailsPpRecallPromoItem.f83924l) && L.f(this.f83925m, advertDetailsPpRecallPromoItem.f83925m) && L.f(this.f83926n, advertDetailsPpRecallPromoItem.f83926n) && L.f(this.f83927o, advertDetailsPpRecallPromoItem.f83927o) && this.f83928p == advertDetailsPpRecallPromoItem.f83928p && this.f83929q == advertDetailsPpRecallPromoItem.f83929q && this.f83930r == advertDetailsPpRecallPromoItem.f83930r;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80368b() {
        return this.f83915c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80370d() {
        return this.f83914b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80369c() {
        return this.f83916d;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272894p() {
        return this.f83932t;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80372f() {
        return this.f83931s;
    }

    public final int hashCode() {
        int iHashCode = (this.f83925m.hashCode() + H.e(com.avito.android.actions_sheet.a.b((this.f83922j.hashCode() + H.d((this.f83920h.hashCode() + ((this.f83919g.hashCode() + com.avito.android.actions_sheet.a.b(H.d(H.d(androidx.appcompat.app.r.g(Integer.hashCode(this.f83914b) * 31, 31, this.f83915c), 31, this.f83916d), 31, this.f83917e), 31, this.f83918f)) * 31)) * 31, 31, this.f83921i)) * 31, 31, this.f83923k), 31, this.f83924l)) * 31;
        EventData eventData = this.f83926n;
        int iHashCode2 = (iHashCode + (eventData == null ? 0 : eventData.hashCode())) * 31;
        EventData eventData2 = this.f83927o;
        return Boolean.hashCode(this.f83930r) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode2 + (eventData2 != null ? eventData2.hashCode() : 0)) * 31, 31, this.f83928p), 31, this.f83929q);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPpRecallPromoItem(spanCount=");
        sb2.append(this.f83914b);
        sb2.append(", id=");
        sb2.append(this.f83915c);
        sb2.append(", stringId=");
        sb2.append(this.f83916d);
        sb2.append(", title=");
        sb2.append(this.f83917e);
        sb2.append(", subtitle=");
        sb2.append(this.f83918f);
        sb2.append(", imageInformation=");
        sb2.append(this.f83919g);
        sb2.append(", widgetStyle=");
        sb2.append(this.f83920h);
        sb2.append(", phoneInputTitle=");
        sb2.append(this.f83921i);
        sb2.append(", buttonInfo=");
        sb2.append(this.f83922j);
        sb2.append(", bottomText=");
        sb2.append(this.f83923k);
        sb2.append(", bottomSheetInformation=");
        sb2.append(this.f83924l);
        sb2.append(", closeBannerPayload=");
        sb2.append(this.f83925m);
        sb2.append(", showBannerPayload=");
        sb2.append(this.f83926n);
        sb2.append(", submitButtonPayload=");
        sb2.append(this.f83927o);
        sb2.append(", isClosed=");
        sb2.append(this.f83928p);
        sb2.append(", primaryButtonIsLoading=");
        sb2.append(this.f83929q);
        sb2.append(", canBeClosedWithoutDialog=");
        return androidx.appcompat.app.r.x(sb2, this.f83930r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f83914b);
        parcel.writeLong(this.f83915c);
        parcel.writeString(this.f83916d);
        parcel.writeString(this.f83917e);
        parcel.writeParcelable(this.f83918f, i12);
        this.f83919g.writeToParcel(parcel, i12);
        this.f83920h.writeToParcel(parcel, i12);
        parcel.writeString(this.f83921i);
        this.f83922j.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f83923k, i12);
        Iterator itJ = C0.j(this.f83924l, parcel);
        while (itJ.hasNext()) {
            ((SelectItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f83925m, i12);
        EventData eventData = this.f83926n;
        if (eventData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventData.writeToParcel(parcel, i12);
        }
        EventData eventData2 = this.f83927o;
        if (eventData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventData2.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f83928p ? 1 : 0);
        parcel.writeInt(this.f83929q ? 1 : 0);
        parcel.writeInt(this.f83930r ? 1 : 0);
    }

    public /* synthetic */ AdvertDetailsPpRecallPromoItem(int i12, long j12, String str, String str2, AttributedText attributedText, ImageInformation imageInformation, WidgetStyle widgetStyle, String str3, SubmitButtonInformation submitButtonInformation, AttributedText attributedText2, List list, CloseBannerPayload closeBannerPayload, EventData eventData, EventData eventData2, boolean z12, boolean z13, boolean z14, int i13, C42822w c42822w) {
        this(i12, j12, (i13 & 4) != 0 ? String.valueOf(j12) : str, str2, attributedText, imageInformation, widgetStyle, str3, submitButtonInformation, attributedText2, list, closeBannerPayload, eventData, eventData2, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (32768 & i13) != 0 ? false : z13, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? false : z14);
    }
}
