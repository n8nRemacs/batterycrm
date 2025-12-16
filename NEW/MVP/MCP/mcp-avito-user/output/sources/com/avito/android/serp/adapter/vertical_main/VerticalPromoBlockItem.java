package com.avito.android.serp.adapter.vertical_main;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAnalyticParams;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: VerticalPromoBlockItem.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem;", "Lcom/avito/android/lib/util/groupable_item/a;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "<init>", "()V", "ContentStyle", "VerticalFilterItem", "VerticalPublishItem", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalPublishItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VerticalPromoBlockItem implements com.avito.android.lib.util.groupable_item.a, PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272525c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final GroupingOutput f272526d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272527e;

    public /* synthetic */ VerticalPromoBlockItem(C42822w c42822w) {
        this();
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W */
    public final boolean getF156653j() {
        return false;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF156654k() {
        return this.f272526d;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF285043q() {
        return this.f272527e;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF150589c() {
        return this.f272525c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78907f() {
        return this.f272524b;
    }

    /* compiled from: VerticalPromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalPublishItem;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class VerticalPublishItem extends VerticalPromoBlockItem {

        @Y61.k
        public static final Parcelable.Creator<VerticalPublishItem> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f272549f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f272550g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<Filter> f272551h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f272552i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final List<SearchFormWidgetSubmitParam> f272553j;

        /* renamed from: k, reason: collision with root package name */
        public final int f272554k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final String f272555l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final String f272556m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final Analytics f272557n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final Settings f272558o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final h.b f272559p;

        /* renamed from: q, reason: collision with root package name */
        public final long f272560q;

        /* compiled from: VerticalPromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VerticalPublishItem> {
            @Override // android.os.Parcelable.Creator
            public final VerticalPublishItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL3 = 0;
                    while (iL3 != i12) {
                        iL3 = com.avito.android.actions_sheet.a.l(VerticalPublishItem.class, parcel, arrayList, iL3, 1);
                    }
                }
                String string3 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(VerticalPublishItem.class, parcel, arrayList2, iL2, 1);
                }
                return new VerticalPublishItem(string, string2, arrayList, string3, arrayList2, parcel.readInt(), parcel.readString(), parcel.readString(), (Analytics) parcel.readParcelable(VerticalPublishItem.class.getClassLoader()), (Settings) parcel.readParcelable(VerticalPublishItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final VerticalPublishItem[] newArray(int i12) {
                return new VerticalPublishItem[i12];
            }
        }

        public VerticalPublishItem(String str, String str2, List list, String str3, List list2, int i12, String str4, String str5, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
            this(str, str2, (i13 & 4) != 0 ? C42784z0.f406748b : list, str3, list2, i12, str4, str5, analytics, settings);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // qs0.InterfaceC47435a
        @Y61.l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF285037k() {
            return this.f272558o;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF251976b() {
            return this.f272549f;
        }

        @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
        /* renamed from: getTrackId, reason: from getter */
        public final long getF285041o() {
            return this.f272560q;
        }

        @Override // is0.h
        @Y61.k
        /* renamed from: q1, reason: from getter */
        public final h.b getF285040n() {
            return this.f272559p;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f272549f);
            parcel.writeString(this.f272550g);
            List<Filter> list = this.f272551h;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            parcel.writeString(this.f272552i);
            Iterator itJ = C0.j(this.f272553j, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeInt(this.f272554k);
            parcel.writeString(this.f272555l);
            parcel.writeString(this.f272556m);
            parcel.writeParcelable(this.f272557n, i12);
            parcel.writeParcelable(this.f272558o, i12);
        }

        public VerticalPublishItem(@Y61.k String str, @Y61.k String str2, @Y61.l List<Filter> list, @Y61.l String str3, @Y61.k List<SearchFormWidgetSubmitParam> list2, @InterfaceC42150f int i12, @Y61.l String str4, @Y61.k String str5, @Y61.l Analytics analytics, @Y61.l Settings settings) {
            super(null);
            this.f272549f = str;
            this.f272550g = str2;
            this.f272551h = list;
            this.f272552i = str3;
            this.f272553j = list2;
            this.f272554k = i12;
            this.f272555l = str4;
            this.f272556m = str5;
            this.f272557n = analytics;
            this.f272558o = settings;
            this.f272559p = new h.b(str, null, null, null, null, analytics, 30, null);
            this.f272560q = a.C10492a.a(this);
        }
    }

    public VerticalPromoBlockItem() {
        this.f272524b = SerpViewType.f268585e;
        this.f272525c = 6;
        this.f272526d = new GroupingOutput();
        this.f272527e = true;
    }

    /* compiled from: VerticalPromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$ContentStyle;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ContentStyle implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ContentStyle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f272528b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f272529c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f272530d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f272531e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f272532f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Integer f272533g;

        /* compiled from: VerticalPromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContentStyle> {
            @Override // android.os.Parcelable.Creator
            public final ContentStyle createFromParcel(Parcel parcel) {
                return new ContentStyle(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final ContentStyle[] newArray(int i12) {
                return new ContentStyle[i12];
            }
        }

        public ContentStyle(@Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5) {
            this.f272528b = str;
            this.f272529c = num;
            this.f272530d = num2;
            this.f272531e = num3;
            this.f272532f = num4;
            this.f272533g = num5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentStyle)) {
                return false;
            }
            ContentStyle contentStyle = (ContentStyle) obj;
            return L.f(this.f272528b, contentStyle.f272528b) && L.f(this.f272529c, contentStyle.f272529c) && L.f(this.f272530d, contentStyle.f272530d) && L.f(this.f272531e, contentStyle.f272531e) && L.f(this.f272532f, contentStyle.f272532f) && L.f(this.f272533g, contentStyle.f272533g);
        }

        public final int hashCode() {
            String str = this.f272528b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f272529c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f272530d;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f272531e;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f272532f;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f272533g;
            return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentStyle(theme=");
            sb2.append(this.f272528b);
            sb2.append(", inputStyle=");
            sb2.append(this.f272529c);
            sb2.append(", chipsStyle=");
            sb2.append(this.f272530d);
            sb2.append(", segmentControlStyle=");
            sb2.append(this.f272531e);
            sb2.append(", allFiltersStyle=");
            sb2.append(this.f272532f);
            sb2.append(", submitButtonStyle=");
            return s.j(sb2, this.f272533g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f272528b);
            Integer num = this.f272529c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f272530d;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Integer num3 = this.f272531e;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            Integer num4 = this.f272532f;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num4);
            }
            Integer num5 = this.f272533g;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num5);
            }
        }

        public /* synthetic */ ContentStyle(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, num, num2, num3, num4, num5);
        }
    }

    /* compiled from: VerticalPromoBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class VerticalFilterItem extends VerticalPromoBlockItem {

        @Y61.k
        public static final Parcelable.Creator<VerticalFilterItem> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f272534f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f272535g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<Filter> f272536h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final SearchFormWidgetAction f272537i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final List<SearchFormWidgetSubmitParam> f272538j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final SearchFormWidgetAnalyticParams f272539k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Integer f272540l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final StyleBlock f272541m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final BottomContent f272542n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final ContentStyle f272543o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final Analytics f272544p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final Settings f272545q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f272546r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public final h.b f272547s;

        /* renamed from: t, reason: collision with root package name */
        public final long f272548t;

        /* compiled from: VerticalPromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VerticalFilterItem> {
            @Override // android.os.Parcelable.Creator
            public final VerticalFilterItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Settings settings;
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int iA2 = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(VerticalFilterItem.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                SearchFormWidgetAction searchFormWidgetAction = (SearchFormWidgetAction) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(VerticalFilterItem.class, parcel, arrayList3, iL3, 1);
                }
                SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = (SearchFormWidgetAnalyticParams) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                StyleBlock styleBlock = (StyleBlock) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                BottomContent bottomContent = (BottomContent) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                ContentStyle contentStyleCreateFromParcel = parcel.readInt() == 0 ? null : ContentStyle.CREATOR.createFromParcel(parcel);
                Analytics analytics = (Analytics) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                Settings settings2 = (Settings) parcel.readParcelable(VerticalFilterItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    settings = settings2;
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                        i14 = i14;
                        settings2 = settings2;
                    }
                    settings = settings2;
                    linkedHashMap = linkedHashMap2;
                }
                return new VerticalFilterItem(string, string2, arrayList, searchFormWidgetAction, arrayList3, searchFormWidgetAnalyticParams, numValueOf, styleBlock, bottomContent, contentStyleCreateFromParcel, analytics, settings, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final VerticalFilterItem[] newArray(int i12) {
                return new VerticalFilterItem[i12];
            }
        }

        public VerticalFilterItem(@Y61.k String str, @Y61.k String str2, @Y61.l List<Filter> list, @Y61.l SearchFormWidgetAction searchFormWidgetAction, @Y61.k List<SearchFormWidgetSubmitParam> list2, @Y61.l SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams, @Y61.l Integer num, @Y61.l StyleBlock styleBlock, @Y61.l BottomContent bottomContent, @Y61.l ContentStyle contentStyle, @Y61.l Analytics analytics, @Y61.l Settings settings, @Y61.l Map<String, String> map) {
            super(null);
            this.f272534f = str;
            this.f272535g = str2;
            this.f272536h = list;
            this.f272537i = searchFormWidgetAction;
            this.f272538j = list2;
            this.f272539k = searchFormWidgetAnalyticParams;
            this.f272540l = num;
            this.f272541m = styleBlock;
            this.f272542n = bottomContent;
            this.f272543o = contentStyle;
            this.f272544p = analytics;
            this.f272545q = settings;
            this.f272546r = map;
            this.f272547s = new h.b(str, null, null, null, map, analytics, 14, null);
            this.f272548t = a.C10492a.a(this);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // qs0.InterfaceC47435a
        @Y61.l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF285037k() {
            return this.f272545q;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF251976b() {
            return this.f272534f;
        }

        @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
        /* renamed from: getTrackId, reason: from getter */
        public final long getF285041o() {
            return this.f272548t;
        }

        @Override // is0.h
        @Y61.k
        /* renamed from: q1, reason: from getter */
        public final h.b getF285040n() {
            return this.f272547s;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f272534f);
            parcel.writeString(this.f272535g);
            List<Filter> list = this.f272536h;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            parcel.writeParcelable(this.f272537i, i12);
            Iterator itJ = C0.j(this.f272538j, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f272539k, i12);
            Integer num = this.f272540l;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.f272541m, i12);
            parcel.writeParcelable(this.f272542n, i12);
            ContentStyle contentStyle = this.f272543o;
            if (contentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                contentStyle.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f272544p, i12);
            parcel.writeParcelable(this.f272545q, i12);
            Map<String, String> map = this.f272546r;
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

        public VerticalFilterItem(String str, String str2, List list, SearchFormWidgetAction searchFormWidgetAction, List list2, SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams, Integer num, StyleBlock styleBlock, BottomContent bottomContent, ContentStyle contentStyle, Analytics analytics, Settings settings, Map map, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? C42784z0.f406748b : list, searchFormWidgetAction, list2, searchFormWidgetAnalyticParams, num, (i12 & 128) != 0 ? null : styleBlock, (i12 & 256) != 0 ? null : bottomContent, (i12 & 512) != 0 ? null : contentStyle, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) != 0 ? null : settings, (i12 & 4096) != 0 ? null : map);
        }
    }
}
