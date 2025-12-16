package com.avito.android.profile.pro.impl.network.response;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProDashboardResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "period", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Widgets;", "widgets", "<init>", "(Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Widgets;)V", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "c", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Widgets;", "d", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Widgets;", "CptOrders", "Data", "ItemPeriod", "ItemWidget", "ItemWidgetAttrText", "MetricItem", "MoreButton", "Performed", "Period", "StatisticsGeneral", "StatusData", "Total", "Widgets", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProDashboardResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ProDashboardResponse> CREATOR = new a();

    @c("period")
    @l
    private final Period period;

    @c("widgets")
    @k
    private final Widgets widgets;

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$CptOrders;", "Landroid/os/Parcelable;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "period", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;", "performed", "accepted", "<init>", "(Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;)V", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "d", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;", "getPerformed", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CptOrders implements Parcelable {

        @k
        public static final Parcelable.Creator<CptOrders> CREATOR = new a();

        @c("accepted")
        @l
        private final Performed accepted;

        @c("performed")
        @l
        private final Performed performed;

        @c("period")
        @l
        private final Period period;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CptOrders> {
            @Override // android.os.Parcelable.Creator
            public final CptOrders createFromParcel(Parcel parcel) {
                return new CptOrders(parcel.readInt() == 0 ? null : Period.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Performed.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Performed.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final CptOrders[] newArray(int i12) {
                return new CptOrders[i12];
            }
        }

        public CptOrders(@l Period period, @l Performed performed, @l Performed performed2) {
            this.period = period;
            this.performed = performed;
            this.accepted = performed2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Performed getAccepted() {
            return this.accepted;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Period getPeriod() {
            return this.period;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Period period = this.period;
            if (period == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                period.writeToParcel(parcel, i12);
            }
            Performed performed = this.performed;
            if (performed == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                performed.writeToParcel(parcel, i12);
            }
            Performed performed2 = this.accepted;
            if (performed2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                performed2.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;", "Landroid/os/Parcelable;", "T", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatusData;", "status", "data", "<init>", "(Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatusData;Landroid/os/Parcelable;)V", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatusData;", "getStatus", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatusData;", "Landroid/os/Parcelable;", "c", "()Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Data<T extends Parcelable> implements Parcelable {

        @k
        public static final Parcelable.Creator<Data<?>> CREATOR = new a();

        @c("data")
        @l
        private final T data;

        @c("status")
        @k
        private final StatusData status;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data<?>> {
            @Override // android.os.Parcelable.Creator
            public final Data<?> createFromParcel(Parcel parcel) {
                return new Data<>(StatusData.valueOf(parcel.readString()), parcel.readParcelable(Data.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data<?>[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@k StatusData statusData, @l T t12) {
            this.status = statusData;
            this.data = t12;
        }

        @l
        public final T c() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.status.name());
            parcel.writeParcelable(this.data, i12);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$ItemPeriod;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemPeriod implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemPeriod> CREATOR = new a();

        @c("title")
        @k
        private final AttributedText title;

        @c("value")
        @k
        private final List<Long> value;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemPeriod> {
            @Override // android.os.Parcelable.Creator
            public final ItemPeriod createFromParcel(Parcel parcel) {
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemPeriod.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new ItemPeriod(attributedText, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ItemPeriod[] newArray(int i12) {
                return new ItemPeriod[i12];
            }
        }

        public ItemPeriod(@k AttributedText attributedText, @k List<Long> list) {
            this.title = attributedText;
            this.value = list;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        public final List<Long> d() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.title, i12);
            Iterator itJ = C0.j(this.value, parcel);
            while (itJ.hasNext()) {
                parcel.writeLong(((Number) itJ.next()).longValue());
            }
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MetricItem;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/UniversalColor;", "barColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$ItemPeriod;", "periods", "Lcom/avito/android/remote/model/text/AttributedText;", "relativeValue", "", "slug", "title", "value", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "d", "()Lcom/avito/android/remote/model/UniversalImage;", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "g", "h", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MetricItem implements Parcelable {

        @k
        public static final Parcelable.Creator<MetricItem> CREATOR = new a();

        @c("barColor")
        @k
        private final List<UniversalColor> barColor;

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("periods")
        @k
        private final List<ItemPeriod> periods;

        @c("relativeValue")
        @l
        private final AttributedText relativeValue;

        @c("slug")
        @k
        private final String slug;

        @c("title")
        @k
        private final AttributedText title;

        @c("value")
        @l
        private final AttributedText value;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MetricItem> {
            @Override // android.os.Parcelable.Creator
            public final MetricItem createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MetricItem.class, parcel, arrayList, iL2, 1);
                }
                DeepLink deepLink = (DeepLink) parcel.readParcelable(MetricItem.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(MetricItem.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(ItemPeriod.CREATOR, parcel, arrayList2, iC2, 1);
                }
                return new MetricItem(arrayList, deepLink, universalImage, arrayList2, (AttributedText) parcel.readParcelable(MetricItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(MetricItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(MetricItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MetricItem[] newArray(int i12) {
                return new MetricItem[i12];
            }
        }

        public MetricItem(@k List<UniversalColor> list, @k DeepLink deepLink, @l UniversalImage universalImage, @k List<ItemPeriod> list2, @l AttributedText attributedText, @k String str, @k AttributedText attributedText2, @l AttributedText attributedText3) {
            this.barColor = list;
            this.deeplink = deepLink;
            this.icon = universalImage;
            this.periods = list2;
            this.relativeValue = attributedText;
            this.slug = str;
            this.title = attributedText2;
            this.value = attributedText3;
        }

        @k
        public final List<UniversalColor> c() {
            return this.barColor;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final UniversalImage getIcon() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        public final List<ItemPeriod> e() {
            return this.periods;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final AttributedText getRelativeValue() {
            return this.relativeValue;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getSlug() {
            return this.slug;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final AttributedText getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.barColor, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.deeplink, i12);
            parcel.writeParcelable(this.icon, i12);
            Iterator itJ2 = C0.j(this.periods, parcel);
            while (itJ2.hasNext()) {
                ((ItemPeriod) itJ2.next()).writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.relativeValue, i12);
            parcel.writeString(this.slug);
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.value, i12);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MoreButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MoreButton implements Parcelable {

        @k
        public static final Parcelable.Creator<MoreButton> CREATOR = new a();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("text")
        @l
        private final AttributedText text;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MoreButton> {
            @Override // android.os.Parcelable.Creator
            public final MoreButton createFromParcel(Parcel parcel) {
                return new MoreButton((DeepLink) parcel.readParcelable(MoreButton.class.getClassLoader()), (UniversalImage) parcel.readParcelable(MoreButton.class.getClassLoader()), (AttributedText) parcel.readParcelable(MoreButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MoreButton[] newArray(int i12) {
                return new MoreButton[i12];
            }
        }

        public MoreButton(@k DeepLink deepLink, @l UniversalImage universalImage, @l AttributedText attributedText) {
            this.deeplink = deepLink;
            this.icon = universalImage;
            this.text = attributedText;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final UniversalImage getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.deeplink, i12);
            parcel.writeParcelable(this.icon, i12);
            parcel.writeParcelable(this.text, i12);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Performed;", "Landroid/os/Parcelable;", "", "count", "ordersValue", "", "ordersValuesRelative", "<init>", "(JJLjava/lang/Double;)V", "J", "getCount", "()J", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Performed implements Parcelable {

        @k
        public static final Parcelable.Creator<Performed> CREATOR = new a();

        @c("count")
        private final long count;

        @c("ordersValue")
        private final long ordersValue;

        @c("ordersValuesRelative")
        @l
        private final Double ordersValuesRelative;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Performed> {
            @Override // android.os.Parcelable.Creator
            public final Performed createFromParcel(Parcel parcel) {
                return new Performed(parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Performed[] newArray(int i12) {
                return new Performed[i12];
            }
        }

        public Performed(long j12, long j13, @l Double d12) {
            this.count = j12;
            this.ordersValue = j13;
            this.ordersValuesRelative = d12;
        }

        /* renamed from: c, reason: from getter */
        public final long getOrdersValue() {
            return this.ordersValue;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Double getOrdersValuesRelative() {
            return this.ordersValuesRelative;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.count);
            parcel.writeLong(this.ordersValue);
            Double d12 = this.ordersValuesRelative;
            if (d12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
            }
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Period;", "Landroid/os/Parcelable;", "Ljava/util/Date;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "Ljava/util/Date;", "c", "()Ljava/util/Date;", "d", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Period implements Parcelable {

        @k
        public static final Parcelable.Creator<Period> CREATOR = new a();

        @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @k
        private final Date from;

        @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        @k
        private final Date to;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Period> {
            @Override // android.os.Parcelable.Creator
            public final Period createFromParcel(Parcel parcel) {
                return new Period((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Period[] newArray(int i12) {
                return new Period[i12];
            }
        }

        public Period(@k Date date, @k Date date2) {
            this.from = date;
            this.to = date2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Date getFrom() {
            return this.from;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Date getTo() {
            return this.to;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.from);
            parcel.writeSerializable(this.to);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatisticsGeneral;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MetricItem;", "metrics", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MoreButton;", "moreButton", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Total;", "totals", "<init>", "(Ljava/util/List;Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MoreButton;Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MoreButton;", "d", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$MoreButton;", "getTotals", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatisticsGeneral implements Parcelable {

        @k
        public static final Parcelable.Creator<StatisticsGeneral> CREATOR = new a();

        @c("metrics")
        @l
        private final List<MetricItem> metrics;

        @c("moreButton")
        @l
        private final MoreButton moreButton;

        @c("totals")
        @l
        private final List<Total> totals;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StatisticsGeneral> {
            @Override // android.os.Parcelable.Creator
            public final StatisticsGeneral createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int iC2 = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC3 = 0;
                    while (iC3 != i12) {
                        iC3 = com.avito.android.actions_sheet.a.c(MetricItem.CREATOR, parcel, arrayList, iC3, 1);
                    }
                }
                MoreButton moreButtonCreateFromParcel = parcel.readInt() == 0 ? null : MoreButton.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(Total.CREATOR, parcel, arrayList3, iC2, 1);
                    }
                    arrayList2 = arrayList3;
                }
                return new StatisticsGeneral(arrayList, moreButtonCreateFromParcel, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final StatisticsGeneral[] newArray(int i12) {
                return new StatisticsGeneral[i12];
            }
        }

        public StatisticsGeneral(@l List<MetricItem> list, @l MoreButton moreButton, @l List<Total> list2) {
            this.metrics = list;
            this.moreButton = moreButton;
            this.totals = list2;
        }

        @l
        public final List<MetricItem> c() {
            return this.metrics;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final MoreButton getMoreButton() {
            return this.moreButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            List<MetricItem> list = this.metrics;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((MetricItem) itA.next()).writeToParcel(parcel, i12);
                }
            }
            MoreButton moreButton = this.moreButton;
            if (moreButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                moreButton.writeToParcel(parcel, i12);
            }
            List<Total> list2 = this.totals;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Total) itA2.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProDashboardResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatusData;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusData {

        /* renamed from: b, reason: collision with root package name */
        public static final StatusData f222844b;

        /* renamed from: c, reason: collision with root package name */
        public static final StatusData f222845c;

        /* renamed from: d, reason: collision with root package name */
        public static final StatusData f222846d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ StatusData[] f222847e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222848f;

        static {
            StatusData statusData = new StatusData("SUCCESS", 0);
            f222844b = statusData;
            StatusData statusData2 = new StatusData("ERROR", 1);
            f222845c = statusData2;
            StatusData statusData3 = new StatusData("ZERO", 2);
            f222846d = statusData3;
            StatusData[] statusDataArr = {statusData, statusData2, statusData3};
            f222847e = statusDataArr;
            f222848f = kotlin.enums.c.a(statusDataArr);
        }

        public StatusData() {
            throw null;
        }

        public static StatusData valueOf(String str) {
            return (StatusData) Enum.valueOf(StatusData.class, str);
        }

        public static StatusData[] values() {
            return (StatusData[]) f222847e.clone();
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Total;", "Landroid/os/Parcelable;", "", "slug", "", "value", "<init>", "(Ljava/lang/String;D)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "D", "getValue", "()D", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Total implements Parcelable {

        @k
        public static final Parcelable.Creator<Total> CREATOR = new a();

        @c("slug")
        @k
        private final String slug;

        @c("value")
        private final double value;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Total> {
            @Override // android.os.Parcelable.Creator
            public final Total createFromParcel(Parcel parcel) {
                return new Total(parcel.readString(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Total[] newArray(int i12) {
                return new Total[i12];
            }
        }

        public Total(@k String str, double d12) {
            this.slug = str;
            this.value = d12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeDouble(this.value);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Widgets;", "Landroid/os/Parcelable;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$CptOrders;", "cptOrders", "", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$ItemWidgetAttrText;", "otherAttrText", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$StatisticsGeneral;", "statisticsGeneral", "<init>", "(Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;Ljava/util/List;Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;)V", "Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;", "c", "()Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$Data;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Widgets implements Parcelable {

        @k
        public static final Parcelable.Creator<Widgets> CREATOR = new a();

        @c("cptOrders")
        @l
        private final Data<CptOrders> cptOrders;

        @c("other2")
        @l
        private final List<ItemWidgetAttrText> otherAttrText;

        @c("statisticsGeneral")
        @l
        private final Data<StatisticsGeneral> statisticsGeneral;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Widgets> {
            @Override // android.os.Parcelable.Creator
            public final Widgets createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Data<?> dataCreateFromParcel = parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(ItemWidgetAttrText.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new Widgets(dataCreateFromParcel, arrayList, parcel.readInt() != 0 ? Data.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Widgets[] newArray(int i12) {
                return new Widgets[i12];
            }
        }

        public Widgets(@l Data<CptOrders> data, @l List<ItemWidgetAttrText> list, @l Data<StatisticsGeneral> data2) {
            this.cptOrders = data;
            this.otherAttrText = list;
            this.statisticsGeneral = data2;
        }

        @l
        public final Data<CptOrders> c() {
            return this.cptOrders;
        }

        @l
        public final List<ItemWidgetAttrText> d() {
            return this.otherAttrText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        public final Data<StatisticsGeneral> e() {
            return this.statisticsGeneral;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Data<CptOrders> data = this.cptOrders;
            if (data == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                data.writeToParcel(parcel, i12);
            }
            List<ItemWidgetAttrText> list = this.otherAttrText;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((ItemWidgetAttrText) itA.next()).writeToParcel(parcel, i12);
                }
            }
            Data<StatisticsGeneral> data2 = this.statisticsGeneral;
            if (data2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                data2.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProDashboardResponse> {
        @Override // android.os.Parcelable.Creator
        public final ProDashboardResponse createFromParcel(Parcel parcel) {
            return new ProDashboardResponse(parcel.readInt() == 0 ? null : Period.CREATOR.createFromParcel(parcel), Widgets.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProDashboardResponse[] newArray(int i12) {
            return new ProDashboardResponse[i12];
        }
    }

    public ProDashboardResponse(@l Period period, @k Widgets widgets) {
        this.period = period;
        this.widgets = widgets;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Widgets getWidgets() {
        return this.widgets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Period period = this.period;
        if (period == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            period.writeToParcel(parcel, i12);
        }
        this.widgets.writeToParcel(parcel, i12);
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$ItemWidget;", "Landroid/os/Parcelable;", "", "slug", "severity", "title", "description", "", "value", "valueType", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkAction", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getSeverity", "getTitle", "getDescription", "Ljava/lang/Float;", "getValue", "()Ljava/lang/Float;", "getValueType", "getAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplinkAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemWidget implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemWidget> CREATOR = new a();

        @c("action")
        @l
        private final String action;

        @c("deeplinkAction")
        @l
        private final DeepLink deeplinkAction;

        @c("description")
        @l
        private final String description;

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("severity")
        @l
        private final String severity;

        @c("slug")
        @k
        private final String slug;

        @c("title")
        @l
        private final String title;

        @c("value")
        @l
        private final Float value;

        @c("valueType")
        @l
        private final String valueType;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemWidget> {
            @Override // android.os.Parcelable.Creator
            public final ItemWidget createFromParcel(Parcel parcel) {
                return new ItemWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ItemWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ItemWidget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ItemWidget[] newArray(int i12) {
                return new ItemWidget[i12];
            }
        }

        public ItemWidget(@k String str, @l String str2, @l String str3, @l String str4, @l Float f12, @l String str5, @l String str6, @l DeepLink deepLink, @l UniversalImage universalImage) {
            this.slug = str;
            this.severity = str2;
            this.title = str3;
            this.description = str4;
            this.value = f12;
            this.valueType = str5;
            this.action = str6;
            this.deeplinkAction = deepLink;
            this.icon = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeString(this.severity);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            Float f12 = this.value;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeString(this.valueType);
            parcel.writeString(this.action);
            parcel.writeParcelable(this.deeplinkAction, i12);
            parcel.writeParcelable(this.icon, i12);
        }

        public /* synthetic */ ItemWidget(String str, String str2, String str3, String str4, Float f12, String str5, String str6, DeepLink deepLink, UniversalImage universalImage, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : f12, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : deepLink, (i12 & 256) == 0 ? universalImage : null);
        }
    }

    /* compiled from: ProDashboardResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lcom/avito/android/profile/pro/impl/network/response/ProDashboardResponse$ItemWidgetAttrText;", "Landroid/os/Parcelable;", "", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkAction", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "severity", "slug", "valueType", "title", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "e", "()Lcom/avito/android/remote/model/UniversalImage;", "getSeverity", "getSlug", "h", "f", "g", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemWidgetAttrText implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemWidgetAttrText> CREATOR = new a();

        @c("action")
        @l
        private final String action;

        @c("deeplinkAction")
        @l
        private final DeepLink deeplinkAction;

        @c("description")
        @l
        private final AttributedText description;

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("severity")
        @l
        private final String severity;

        @c("slug")
        @k
        private final String slug;

        @c("title")
        @l
        private final AttributedText title;

        @c("value")
        @l
        private final AttributedText value;

        @c("valueType")
        @l
        private final AttributedText valueType;

        /* compiled from: ProDashboardResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemWidgetAttrText> {
            @Override // android.os.Parcelable.Creator
            public final ItemWidgetAttrText createFromParcel(Parcel parcel) {
                return new ItemWidgetAttrText(parcel.readString(), (DeepLink) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemWidgetAttrText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ItemWidgetAttrText[] newArray(int i12) {
                return new ItemWidgetAttrText[i12];
            }
        }

        public ItemWidgetAttrText(@l String str, @l DeepLink deepLink, @l AttributedText attributedText, @l UniversalImage universalImage, @l String str2, @k String str3, @l AttributedText attributedText2, @l AttributedText attributedText3, @l AttributedText attributedText4) {
            this.action = str;
            this.deeplinkAction = deepLink;
            this.description = attributedText;
            this.icon = universalImage;
            this.severity = str2;
            this.slug = str3;
            this.valueType = attributedText2;
            this.title = attributedText3;
            this.value = attributedText4;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final DeepLink getDeeplinkAction() {
            return this.deeplinkAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final UniversalImage getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final AttributedText getValue() {
            return this.value;
        }

        @l
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        public final String getSeverity() {
            return this.severity;
        }

        @k
        public final String getSlug() {
            return this.slug;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final AttributedText getValueType() {
            return this.valueType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.action);
            parcel.writeParcelable(this.deeplinkAction, i12);
            parcel.writeParcelable(this.description, i12);
            parcel.writeParcelable(this.icon, i12);
            parcel.writeString(this.severity);
            parcel.writeString(this.slug);
            parcel.writeParcelable(this.valueType, i12);
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.value, i12);
        }

        public /* synthetic */ ItemWidgetAttrText(String str, DeepLink deepLink, AttributedText attributedText, UniversalImage universalImage, String str2, String str3, AttributedText attributedText2, AttributedText attributedText3, AttributedText attributedText4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? null : str2, str3, (i12 & 64) != 0 ? null : attributedText2, (i12 & 128) != 0 ? null : attributedText3, (i12 & 256) != 0 ? null : attributedText4);
        }
    }
}
