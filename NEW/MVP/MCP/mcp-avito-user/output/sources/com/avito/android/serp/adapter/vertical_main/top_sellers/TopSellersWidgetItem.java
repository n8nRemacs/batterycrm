package com.avito.android.serp.adapter.vertical_main.top_sellers;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.vertical_main.TopSeller;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: TopSellersWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/TopSellersWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopSellersWidgetItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<TopSellersWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273227c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<TopSeller> f273228d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Analytics f273229e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Map<String, String> f273230f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f273231g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f273232h;

    /* renamed from: i, reason: collision with root package name */
    public final long f273233i = a.C10492a.a(this);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f273234j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f273235k = 6;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f273236l = true;

    /* compiled from: TopSellersWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/TopSellersWidgetItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TopSellersWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<TopSellersWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final TopSellersWidgetItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(TopSellersWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            Analytics analytics = (Analytics) parcel.readParcelable(TopSellersWidgetItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new TopSellersWidgetItem(string, string2, arrayList, analytics, linkedHashMap, (Settings) parcel.readParcelable(TopSellersWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TopSellersWidgetItem[] newArray(int i12) {
            return new TopSellersWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public TopSellersWidgetItem(@k String str, @k String str2, @k List<TopSeller> list, @l Analytics analytics, @l Map<String, String> map, @l Settings settings) {
        this.f273226b = str;
        this.f273227c = str2;
        this.f273228d = list;
        this.f273229e = analytics;
        this.f273230f = map;
        this.f273231g = settings;
        this.f273232h = new h.b("top_sellers_widget", null, null, null, map, analytics, 14, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF252237h() {
        return this.f273236l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270081e() {
        return this.f273231g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270732f() {
        return this.f273235k;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270728b() {
        return this.f273226b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF270085i() {
        return this.f273233i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270731e() {
        return this.f273234j;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270084h() {
        return this.f273232h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273226b);
        parcel.writeString(this.f273227c);
        Iterator itJ = C0.j(this.f273228d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f273229e, i12);
        Map<String, String> map = this.f273230f;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeParcelable(this.f273231g, i12);
    }
}
