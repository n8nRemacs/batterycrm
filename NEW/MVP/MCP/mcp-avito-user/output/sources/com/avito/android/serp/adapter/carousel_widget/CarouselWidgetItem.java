package com.avito.android.serp.adapter.carousel_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import lr0.InterfaceC43821a;
import okhttp3.internal.http2.Http2Connection;
import qs0.InterfaceC47435a;

/* compiled from: CarouselWidgetItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/CarouselWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Llr0/a;", "Lqs0/a;", "Action", "Analytics", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselWidgetItem implements PersistableSerpItem, InterfaceC43821a, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<CarouselWidgetItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f269244A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f269245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f269246c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f269247d;

    /* renamed from: e, reason: collision with root package name */
    public final int f269248e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f269249f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f269250g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f269251h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f269252i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f269253j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final AttributedText f269254k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AttributedText f269255l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f269256m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f269257n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Action f269258o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f269259p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final ItemsCarouselWidget.ButtonColors f269260q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final SerpDisplayType f269261r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final ItemsCarouselWidget.BackgroundImage f269262s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final ItemsCarouselWidget.Button f269263t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final Timer f269264u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f269265v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final Analytics f269266w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final ItemsRequestParams f269267x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.remote.model.widget_analytics.Analytics f269268y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final Settings f269269z;

    /* compiled from: CarouselWidgetItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/CarouselWidgetItem$Action;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f269270b;

        /* compiled from: CarouselWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action((DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@Y61.k DeepLink deepLink) {
            this.f269270b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Action) && kotlin.jvm.internal.L.f(this.f269270b, ((Action) obj).f269270b);
        }

        public final int hashCode() {
            return this.f269270b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(deepLink="), this.f269270b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f269270b, i12);
        }
    }

    /* compiled from: CarouselWidgetItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/CarouselWidgetItem$Analytics;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Analytics implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f269271b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f269272c;

        /* compiled from: CarouselWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Analytics> {
            @Override // android.os.Parcelable.Creator
            public final Analytics createFromParcel(Parcel parcel) {
                return new Analytics(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@Y61.l Long l12, @Y61.l String str) {
            this.f269271b = l12;
            this.f269272c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return kotlin.jvm.internal.L.f(this.f269271b, analytics.f269271b) && kotlin.jvm.internal.L.f(this.f269272c, analytics.f269272c);
        }

        public final int hashCode() {
            Long l12 = this.f269271b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f269272c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Analytics(mcid=");
            sb2.append(this.f269271b);
            sb2.append(", cwid=");
            return C22026a.c(sb2, this.f269272c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.f269271b;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f269272c);
        }
    }

    /* compiled from: CarouselWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iL2 = 0;
            while (iL2 != i14) {
                iL2 = com.avito.android.actions_sheet.a.l(CarouselWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iL3 = 0;
            while (iL3 != i15) {
                iL3 = com.avito.android.actions_sheet.a.l(CarouselWidgetItem.class, parcel, arrayList2, iL3, 1);
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            int iL4 = 0;
            while (iL4 != i16) {
                iL4 = com.avito.android.actions_sheet.a.l(CarouselWidgetItem.class, parcel, arrayList3, iL4, 1);
            }
            return new CarouselWidgetItem(string, i12, z12, i13, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readString(), (ItemsCarouselWidget.ButtonColors) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString()), (ItemsCarouselWidget.BackgroundImage) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (ItemsCarouselWidget.Button) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (Timer) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? Analytics.CREATOR.createFromParcel(parcel) : null, (ItemsRequestParams) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (com.avito.android.remote.model.widget_analytics.Analytics) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(CarouselWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetItem[] newArray(int i12) {
            return new CarouselWidgetItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselWidgetItem(@Y61.k String str, int i12, boolean z12, int i13, @Y61.k List<? extends PersistableSerpItem> list, @Y61.k List<? extends PersistableSerpItem> list2, @Y61.k List<? extends PersistableSerpItem> list3, @Y61.l String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l UniversalColor universalColor, @Y61.l UniversalImage universalImage, @Y61.l Action action, @Y61.l String str4, @Y61.l ItemsCarouselWidget.ButtonColors buttonColors, @Y61.l SerpDisplayType serpDisplayType, @Y61.l ItemsCarouselWidget.BackgroundImage backgroundImage, @Y61.l ItemsCarouselWidget.Button button, @Y61.l Timer timer, boolean z13, @Y61.l Analytics analytics, @Y61.l ItemsRequestParams itemsRequestParams, @Y61.l com.avito.android.remote.model.widget_analytics.Analytics analytics2, @Y61.l Settings settings) {
        this.f269245b = str;
        this.f269246c = i12;
        this.f269247d = z12;
        this.f269248e = i13;
        this.f269249f = list;
        this.f269250g = list2;
        this.f269251h = list3;
        this.f269252i = str2;
        this.f269253j = str3;
        this.f269254k = attributedText;
        this.f269255l = attributedText2;
        this.f269256m = universalColor;
        this.f269257n = universalImage;
        this.f269258o = action;
        this.f269259p = str4;
        this.f269260q = buttonColors;
        this.f269261r = serpDisplayType;
        this.f269262s = backgroundImage;
        this.f269263t = button;
        this.f269264u = timer;
        this.f269265v = z13;
        this.f269266w = analytics;
        this.f269267x = itemsRequestParams;
        this.f269268y = analytics2;
        this.f269269z = settings;
        this.f269244A = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselWidgetItem)) {
            return false;
        }
        CarouselWidgetItem carouselWidgetItem = (CarouselWidgetItem) obj;
        return kotlin.jvm.internal.L.f(this.f269245b, carouselWidgetItem.f269245b) && this.f269246c == carouselWidgetItem.f269246c && this.f269247d == carouselWidgetItem.f269247d && this.f269248e == carouselWidgetItem.f269248e && kotlin.jvm.internal.L.f(this.f269249f, carouselWidgetItem.f269249f) && kotlin.jvm.internal.L.f(this.f269250g, carouselWidgetItem.f269250g) && kotlin.jvm.internal.L.f(this.f269251h, carouselWidgetItem.f269251h) && kotlin.jvm.internal.L.f(this.f269252i, carouselWidgetItem.f269252i) && kotlin.jvm.internal.L.f(this.f269253j, carouselWidgetItem.f269253j) && kotlin.jvm.internal.L.f(this.f269254k, carouselWidgetItem.f269254k) && kotlin.jvm.internal.L.f(this.f269255l, carouselWidgetItem.f269255l) && kotlin.jvm.internal.L.f(this.f269256m, carouselWidgetItem.f269256m) && kotlin.jvm.internal.L.f(this.f269257n, carouselWidgetItem.f269257n) && kotlin.jvm.internal.L.f(this.f269258o, carouselWidgetItem.f269258o) && kotlin.jvm.internal.L.f(this.f269259p, carouselWidgetItem.f269259p) && kotlin.jvm.internal.L.f(this.f269260q, carouselWidgetItem.f269260q) && this.f269261r == carouselWidgetItem.f269261r && kotlin.jvm.internal.L.f(this.f269262s, carouselWidgetItem.f269262s) && kotlin.jvm.internal.L.f(this.f269263t, carouselWidgetItem.f269263t) && kotlin.jvm.internal.L.f(this.f269264u, carouselWidgetItem.f269264u) && this.f269265v == carouselWidgetItem.f269265v && kotlin.jvm.internal.L.f(this.f269266w, carouselWidgetItem.f269266w) && kotlin.jvm.internal.L.f(this.f269267x, carouselWidgetItem.f269267x) && kotlin.jvm.internal.L.f(this.f269268y, carouselWidgetItem.f269268y) && kotlin.jvm.internal.L.f(this.f269269z, carouselWidgetItem.f269269z);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272527e() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270313h() {
        return this.f269269z;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270316k() {
        return this.f269246c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270307b() {
        return this.f269245b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270315j() {
        return this.f269244A;
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.appcompat.app.r.e(this.f269248e, androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f269246c, this.f269245b.hashCode() * 31, 31), 31, this.f269247d), 31), 31, this.f269249f), 31, this.f269250g), 31, this.f269251h);
        String str = this.f269252i;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f269253j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f269254k;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f269255l;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalColor universalColor = this.f269256m;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalImage universalImage = this.f269257n;
        int iHashCode6 = (iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Action action = this.f269258o;
        int iHashCode7 = (iHashCode6 + (action == null ? 0 : action.f269270b.hashCode())) * 31;
        String str3 = this.f269259p;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ItemsCarouselWidget.ButtonColors buttonColors = this.f269260q;
        int iHashCode9 = (iHashCode8 + (buttonColors == null ? 0 : buttonColors.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.f269261r;
        int iHashCode10 = (iHashCode9 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        ItemsCarouselWidget.BackgroundImage backgroundImage = this.f269262s;
        int iHashCode11 = (iHashCode10 + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31;
        ItemsCarouselWidget.Button button = this.f269263t;
        int iHashCode12 = (iHashCode11 + (button == null ? 0 : button.hashCode())) * 31;
        Timer timer = this.f269264u;
        int i12 = androidx.appcompat.app.r.i((iHashCode12 + (timer == null ? 0 : timer.hashCode())) * 31, 31, this.f269265v);
        Analytics analytics = this.f269266w;
        int iHashCode13 = (i12 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        ItemsRequestParams itemsRequestParams = this.f269267x;
        int iHashCode14 = (iHashCode13 + (itemsRequestParams == null ? 0 : itemsRequestParams.hashCode())) * 31;
        com.avito.android.remote.model.widget_analytics.Analytics analytics2 = this.f269268y;
        int iHashCode15 = (iHashCode14 + (analytics2 == null ? 0 : analytics2.hashCode())) * 31;
        Settings settings = this.f269269z;
        return iHashCode15 + (settings != null ? settings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselWidgetItem(stringId=");
        sb2.append(this.f269245b);
        sb2.append(", spanCount=");
        sb2.append(this.f269246c);
        sb2.append(", isVerticalMain=");
        sb2.append(this.f269247d);
        sb2.append(", index=");
        sb2.append(this.f269248e);
        sb2.append(", items=");
        sb2.append(this.f269249f);
        sb2.append(", preAdditionalItems=");
        sb2.append(this.f269250g);
        sb2.append(", postAdditionalItems=");
        sb2.append(this.f269251h);
        sb2.append(", title=");
        sb2.append(this.f269252i);
        sb2.append(", subtitle=");
        sb2.append(this.f269253j);
        sb2.append(", attributedTitle=");
        sb2.append(this.f269254k);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f269255l);
        sb2.append(", backgroundColor=");
        sb2.append(this.f269256m);
        sb2.append(", image=");
        sb2.append(this.f269257n);
        sb2.append(", headerButtonAction=");
        sb2.append(this.f269258o);
        sb2.append(", headerButtonStyle=");
        sb2.append(this.f269259p);
        sb2.append(", headerButtonColors=");
        sb2.append(this.f269260q);
        sb2.append(", displayType=");
        sb2.append(this.f269261r);
        sb2.append(", backgroundImage=");
        sb2.append(this.f269262s);
        sb2.append(", button=");
        sb2.append(this.f269263t);
        sb2.append(", timer=");
        sb2.append(this.f269264u);
        sb2.append(", isInSalesHeaderWidget=");
        sb2.append(this.f269265v);
        sb2.append(", analytics=");
        sb2.append(this.f269266w);
        sb2.append(", itemsRequestParams=");
        sb2.append(this.f269267x);
        sb2.append(", widgetsAnalytics=");
        sb2.append(this.f269268y);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f269269z, ')');
    }

    @Override // lr0.InterfaceC43821a
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final ItemsRequestParams getF269267x() {
        return this.f269267x;
    }

    @Override // lr0.InterfaceC43821a
    public final boolean v1() {
        return this.f269249f.isEmpty() && this.f269267x != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f269245b);
        parcel.writeInt(this.f269246c);
        parcel.writeInt(this.f269247d ? 1 : 0);
        parcel.writeInt(this.f269248e);
        Iterator itJ = C0.j(this.f269249f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f269250g, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        Iterator itJ3 = C0.j(this.f269251h, parcel);
        while (itJ3.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ3.next(), i12);
        }
        parcel.writeString(this.f269252i);
        parcel.writeString(this.f269253j);
        parcel.writeParcelable(this.f269254k, i12);
        parcel.writeParcelable(this.f269255l, i12);
        parcel.writeParcelable(this.f269256m, i12);
        parcel.writeParcelable(this.f269257n, i12);
        Action action = this.f269258o;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f269259p);
        parcel.writeParcelable(this.f269260q, i12);
        SerpDisplayType serpDisplayType = this.f269261r;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeParcelable(this.f269262s, i12);
        parcel.writeParcelable(this.f269263t, i12);
        parcel.writeParcelable(this.f269264u, i12);
        parcel.writeInt(this.f269265v ? 1 : 0);
        Analytics analytics = this.f269266w;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f269267x, i12);
        parcel.writeParcelable(this.f269268y, i12);
        parcel.writeParcelable(this.f269269z, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    @Override // lr0.InterfaceC43821a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem y0(@Y61.k java.util.ArrayList r32, @Y61.l com.avito.android.deep_linking.links.DeepLink r33) {
        /*
            r31 = this;
            r0 = r31
            r3 = r33
            r1 = 0
            com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem$Action r2 = r0.f269258o
            if (r3 == 0) goto L18
            if (r2 == 0) goto L11
            com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem$Action r4 = new com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem$Action
            r4.<init>(r3)
            goto L12
        L11:
            r4 = r1
        L12:
            if (r4 != 0) goto L15
            goto L18
        L15:
            r19 = r4
            goto L1a
        L18:
            r19 = r2
        L1a:
            com.avito.android.remote.model.inset.ItemsCarouselWidget$Button r7 = r0.f269263t
            if (r3 == 0) goto L31
            if (r7 == 0) goto L2b
            r2 = 0
            r4 = 0
            r5 = 5
            r6 = 0
            r1 = r7
            r3 = r33
            com.avito.android.remote.model.inset.ItemsCarouselWidget$Button r1 = com.avito.android.remote.model.inset.ItemsCarouselWidget.Button.copy$default(r1, r2, r3, r4, r5, r6)
        L2b:
            if (r1 != 0) goto L2e
            goto L31
        L2e:
            r24 = r1
            goto L33
        L31:
            r24 = r7
        L33:
            com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem r1 = new com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem
            r5 = r1
            com.avito.android.remote.model.widget_analytics.Analytics r2 = r0.f269268y
            r29 = r2
            com.avito.android.remote.model.widget_settings.Settings r2 = r0.f269269z
            r30 = r2
            java.lang.String r6 = r0.f269245b
            int r7 = r0.f269246c
            boolean r8 = r0.f269247d
            int r9 = r0.f269248e
            java.util.List<com.avito.android.serp.adapter.PersistableSerpItem> r11 = r0.f269250g
            java.util.List<com.avito.android.serp.adapter.PersistableSerpItem> r12 = r0.f269251h
            java.lang.String r13 = r0.f269252i
            java.lang.String r14 = r0.f269253j
            com.avito.android.remote.model.text.AttributedText r15 = r0.f269254k
            com.avito.android.remote.model.text.AttributedText r2 = r0.f269255l
            r16 = r2
            com.avito.android.remote.model.UniversalColor r2 = r0.f269256m
            r17 = r2
            com.avito.android.remote.model.UniversalImage r2 = r0.f269257n
            r18 = r2
            java.lang.String r2 = r0.f269259p
            r20 = r2
            com.avito.android.remote.model.inset.ItemsCarouselWidget$ButtonColors r2 = r0.f269260q
            r21 = r2
            com.avito.android.remote.model.SerpDisplayType r2 = r0.f269261r
            r22 = r2
            com.avito.android.remote.model.inset.ItemsCarouselWidget$BackgroundImage r2 = r0.f269262s
            r23 = r2
            com.avito.android.remote.model.sales.utils.Timer r2 = r0.f269264u
            r25 = r2
            boolean r2 = r0.f269265v
            r26 = r2
            com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem$Analytics r2 = r0.f269266w
            r27 = r2
            com.avito.android.remote.model.inset.ItemsRequestParams r2 = r0.f269267x
            r28 = r2
            r10 = r32
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem.y0(java.util.ArrayList, com.avito.android.deep_linking.links.DeepLink):com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem");
    }

    public CarouselWidgetItem(String str, int i12, boolean z12, int i13, List list, List list2, List list3, String str2, String str3, AttributedText attributedText, AttributedText attributedText2, UniversalColor universalColor, UniversalImage universalImage, Action action, String str4, ItemsCarouselWidget.ButtonColors buttonColors, SerpDisplayType serpDisplayType, ItemsCarouselWidget.BackgroundImage backgroundImage, ItemsCarouselWidget.Button button, Timer timer, boolean z13, Analytics analytics, ItemsRequestParams itemsRequestParams, com.avito.android.remote.model.widget_analytics.Analytics analytics2, Settings settings, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? UUID.randomUUID().toString() : str, i12, (i14 & 4) != 0 ? false : z12, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? C42784z0.f406748b : list, (i14 & 32) != 0 ? C42784z0.f406748b : list2, (i14 & 64) != 0 ? C42784z0.f406748b : list3, str2, str3, attributedText, attributedText2, (i14 & 2048) != 0 ? null : universalColor, (i14 & 4096) != 0 ? null : universalImage, (i14 & 8192) != 0 ? null : action, str4, buttonColors, (65536 & i14) != 0 ? null : serpDisplayType, backgroundImage, button, timer, (1048576 & i14) != 0 ? false : z13, (2097152 & i14) != 0 ? null : analytics, (4194304 & i14) != 0 ? null : itemsRequestParams, (8388608 & i14) != 0 ? null : analytics2, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : settings);
    }
}
