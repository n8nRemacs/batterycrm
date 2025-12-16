package com.avito.android.serp.adapter.promo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: PromoHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/promo/PromoHeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lqs0/a;", "BadgeData", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoHeaderItem implements PersistableSerpItem, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<PromoHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f270455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f270456c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PromoHeaderWidget.Button f270457d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f270458e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ToolbarConfig f270459f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f270460g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<PromoHeaderWidget.Image> f270461h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ArrayList f270462i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f270463j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Analytics f270464k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Object f270465l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Settings f270466m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270467n = SerpViewType.f268585e;

    /* renamed from: o, reason: collision with root package name */
    public final int f270468o = 6;

    /* compiled from: PromoHeaderItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/promo/PromoHeaderItem$BadgeData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class BadgeData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BadgeData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f270469b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f270470c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f270471d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final DockingBadgeEdgeType f270472e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DockingBadgeEdgeType f270473f;

        /* compiled from: PromoHeaderItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BadgeData> {
            @Override // android.os.Parcelable.Creator
            public final BadgeData createFromParcel(Parcel parcel) {
                return new BadgeData(parcel.readString(), (UniversalColor) parcel.readParcelable(BadgeData.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BadgeData.class.getClassLoader()), DockingBadgeEdgeType.valueOf(parcel.readString()), DockingBadgeEdgeType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeData[] newArray(int i12) {
                return new BadgeData[i12];
            }
        }

        public BadgeData(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.k DockingBadgeEdgeType dockingBadgeEdgeType, @Y61.k DockingBadgeEdgeType dockingBadgeEdgeType2) {
            this.f270469b = str;
            this.f270470c = universalColor;
            this.f270471d = universalColor2;
            this.f270472e = dockingBadgeEdgeType;
            this.f270473f = dockingBadgeEdgeType2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadgeData)) {
                return false;
            }
            BadgeData badgeData = (BadgeData) obj;
            return L.f(this.f270469b, badgeData.f270469b) && L.f(this.f270470c, badgeData.f270470c) && L.f(this.f270471d, badgeData.f270471d) && this.f270472e == badgeData.f270472e && this.f270473f == badgeData.f270473f;
        }

        public final int hashCode() {
            return this.f270473f.hashCode() + ((this.f270472e.hashCode() + com.avito.android.actions_sheet.a.i(this.f270471d, com.avito.android.actions_sheet.a.i(this.f270470c, this.f270469b.hashCode() * 31, 31), 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "BadgeData(title=" + this.f270469b + ", backgroundColor=" + this.f270470c + ", textColor=" + this.f270471d + ", startEdge=" + this.f270472e + ", endEdge=" + this.f270473f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f270469b);
            parcel.writeParcelable(this.f270470c, i12);
            parcel.writeParcelable(this.f270471d, i12);
            parcel.writeString(this.f270472e.name());
            parcel.writeString(this.f270473f.name());
        }
    }

    /* compiled from: PromoHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoHeaderItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            PromoHeaderWidget.Button button = (PromoHeaderWidget.Button) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            ToolbarConfig toolbarConfig = (ToolbarConfig) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PromoHeaderItem.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(BadgeData.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            String string = parcel.readString();
            Analytics analytics = (Analytics) parcel.readParcelable(PromoHeaderItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    i14 = i14;
                }
            }
            return new PromoHeaderItem(attributedText, attributedText2, button, universalColor, toolbarConfig, z12, arrayList, arrayList2, string, analytics, linkedHashMap, (Settings) parcel.readParcelable(PromoHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoHeaderItem[] newArray(int i12) {
            return new PromoHeaderItem[i12];
        }
    }

    public PromoHeaderItem(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l PromoHeaderWidget.Button button, @Y61.l UniversalColor universalColor, @Y61.l ToolbarConfig toolbarConfig, boolean z12, @Y61.l List list, @Y61.l ArrayList arrayList, @Y61.k String str, @Y61.l Analytics analytics, @Y61.l Map map, @Y61.l Settings settings) {
        this.f270455b = attributedText;
        this.f270456c = attributedText2;
        this.f270457d = button;
        this.f270458e = universalColor;
        this.f270459f = toolbarConfig;
        this.f270460g = z12;
        this.f270461h = list;
        this.f270462i = arrayList;
        this.f270463j = str;
        this.f270464k = analytics;
        this.f270465l = map;
        this.f270466m = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoHeaderItem)) {
            return false;
        }
        PromoHeaderItem promoHeaderItem = (PromoHeaderItem) obj;
        return L.f(this.f270455b, promoHeaderItem.f270455b) && L.f(this.f270456c, promoHeaderItem.f270456c) && L.f(this.f270457d, promoHeaderItem.f270457d) && L.f(this.f270458e, promoHeaderItem.f270458e) && L.f(this.f270459f, promoHeaderItem.f270459f) && this.f270460g == promoHeaderItem.f270460g && L.f(this.f270461h, promoHeaderItem.f270461h) && L.f(this.f270462i, promoHeaderItem.f270462i) && L.f(this.f270463j, promoHeaderItem.f270463j) && L.f(this.f270464k, promoHeaderItem.f270464k) && L.f(this.f270465l, promoHeaderItem.f270465l) && L.f(this.f270466m, promoHeaderItem.f270466m);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272893o() {
        return this.f270466m;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83914b() {
        return this.f270468o;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265384b() {
        return this.f270463j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83931s() {
        return this.f270467n;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f270455b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f270456c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        PromoHeaderWidget.Button button = this.f270457d;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        UniversalColor universalColor = this.f270458e;
        int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.f270459f;
        int i12 = r.i((iHashCode4 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31, 31, this.f270460g);
        List<PromoHeaderWidget.Image> list = this.f270461h;
        int iHashCode5 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList arrayList = this.f270462i;
        int iD2 = H.d((iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.f270463j);
        Analytics analytics = this.f270464k;
        int iHashCode6 = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Object obj = this.f270465l;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Settings settings = this.f270466m;
        return iHashCode7 + (settings != null ? settings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoHeaderItem(title=");
        sb2.append(this.f270455b);
        sb2.append(", subtitle=");
        sb2.append(this.f270456c);
        sb2.append(", button=");
        sb2.append(this.f270457d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f270458e);
        sb2.append(", toolbarConfig=");
        sb2.append(this.f270459f);
        sb2.append(", resetStyleOnScroll=");
        sb2.append(this.f270460g);
        sb2.append(", images=");
        sb2.append(this.f270461h);
        sb2.append(", badges=");
        sb2.append(this.f270462i);
        sb2.append(", stringId=");
        sb2.append(this.f270463j);
        sb2.append(", analytics=");
        sb2.append(this.f270464k);
        sb2.append(", additionalParams=");
        sb2.append(this.f270465l);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270466m, ')');
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f270455b, i12);
        parcel.writeParcelable(this.f270456c, i12);
        parcel.writeParcelable(this.f270457d, i12);
        parcel.writeParcelable(this.f270458e, i12);
        parcel.writeParcelable(this.f270459f, i12);
        parcel.writeInt(this.f270460g ? 1 : 0);
        List<PromoHeaderWidget.Image> list = this.f270461h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        ArrayList arrayList = this.f270462i;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((BadgeData) itY.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.f270463j);
        parcel.writeParcelable(this.f270464k, i12);
        ?? r22 = this.f270465l;
        if (r22 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r22.size());
            for (Map.Entry entry : r22.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeParcelable(this.f270466m, i12);
    }
}
