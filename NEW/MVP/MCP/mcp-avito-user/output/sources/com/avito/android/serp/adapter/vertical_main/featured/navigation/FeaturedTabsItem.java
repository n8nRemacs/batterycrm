package com.avito.android.serp.adapter.vertical_main.featured.navigation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.constructor_advert.ui.serp.constructor.u;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.Z;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qs0.InterfaceC47435a;

/* compiled from: FeaturedTabsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedTabsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lcom/avito/android/serp/adapter/Z;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/u;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class FeaturedTabsItem implements PersistableSerpItem, S2, Z, u, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<FeaturedTabsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272880b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<FeaturedNavigation> f272881c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f272882d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f272883e;

    /* renamed from: f, reason: collision with root package name */
    public final int f272884f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpDisplayType f272885g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f272886h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f272887i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f272888j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f272889k;

    /* renamed from: l, reason: collision with root package name */
    public final int f272890l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f272891m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Analytics f272892n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Settings f272893o;

    /* renamed from: p, reason: collision with root package name */
    public final long f272894p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final h.b f272895q;

    /* compiled from: FeaturedTabsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeaturedTabsItem> {
        @Override // android.os.Parcelable.Creator
        public final FeaturedTabsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FeaturedTabsItem.class, parcel, arrayList, iL2, 1);
            }
            return new FeaturedTabsItem(string, arrayList, parcel.readString(), SerpViewType.valueOf(parcel.readString()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), (Analytics) parcel.readParcelable(FeaturedTabsItem.class.getClassLoader()), (Settings) parcel.readParcelable(FeaturedTabsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeaturedTabsItem[] newArray(int i12) {
            return new FeaturedTabsItem[i12];
        }
    }

    /* compiled from: FeaturedTabsItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/FeaturedNavigation;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<FeaturedNavigation, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f272896l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(FeaturedNavigation featuredNavigation) {
            return featuredNavigation.getF272877b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedTabsItem(@k String str, @k List<? extends FeaturedNavigation> list, @k String str2, @k SerpViewType serpViewType, int i12, @k SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14, @k String str3, int i13, @k String str4, @l Analytics analytics, @l Settings settings) {
        this.f272880b = str;
        this.f272881c = list;
        this.f272882d = str2;
        this.f272883e = serpViewType;
        this.f272884f = i12;
        this.f272885g = serpDisplayType;
        this.f272886h = z12;
        this.f272887i = z13;
        this.f272888j = z14;
        this.f272889k = str3;
        this.f272890l = i13;
        this.f272891m = str4;
        this.f272892n = analytics;
        this.f272893o = settings;
        this.f272894p = getF258422b().hashCode();
        this.f272895q = new h.b(str4, str3, null, null, Collections.singletonMap("tabs", C42745f0.O(list, ",", null, null, b.f272896l, 30)), analytics, 12, null);
    }

    public static FeaturedTabsItem a(FeaturedTabsItem featuredTabsItem, String str) {
        return new FeaturedTabsItem(featuredTabsItem.f272880b, featuredTabsItem.f272881c, str, featuredTabsItem.f272883e, featuredTabsItem.f272884f, featuredTabsItem.f272885g, featuredTabsItem.f272886h, featuredTabsItem.f272887i, featuredTabsItem.f272888j, featuredTabsItem.f272889k, featuredTabsItem.f272890l, featuredTabsItem.f272891m, featuredTabsItem.f272892n, featuredTabsItem.f272893o);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeaturedTabsItem)) {
            return false;
        }
        FeaturedTabsItem featuredTabsItem = (FeaturedTabsItem) obj;
        return L.f(this.f272880b, featuredTabsItem.f272880b) && L.f(this.f272881c, featuredTabsItem.f272881c) && L.f(this.f272882d, featuredTabsItem.f272882d) && this.f272883e == featuredTabsItem.f272883e && this.f272884f == featuredTabsItem.f272884f && this.f272885g == featuredTabsItem.f272885g && this.f272886h == featuredTabsItem.f272886h && this.f272887i == featuredTabsItem.f272887i && this.f272888j == featuredTabsItem.f272888j && L.f(this.f272889k, featuredTabsItem.f272889k) && this.f272890l == featuredTabsItem.f272890l && L.f(this.f272891m, featuredTabsItem.f272891m) && L.f(this.f272892n, featuredTabsItem.f272892n) && L.f(this.f272893o, featuredTabsItem.f272893o);
    }

    @k
    public final FeaturedNavigation f() {
        for (FeaturedNavigation featuredNavigation : this.f272881c) {
            if (L.f(featuredNavigation.getF272877b(), this.f272882d)) {
                return featuredNavigation;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.avito.android.serp.adapter.Z
    public final int getFeaturedSectionPosition() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.Z
    @k
    public final String getFeaturedSectionTitle() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.Z
    @k
    public final String getFeaturedSectionType() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272457h() {
        return this.f272887i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF273036h() {
        return this.f272893o;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85688e() {
        return this.f272884f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258422b() {
        return this.f272880b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF273038j() {
        return this.f272894p;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85690g() {
        return this.f272883e;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f272890l, H.d(r.i(r.i(r.i(com.avito.android.actions_sheet.a.h(this.f272885g, r.e(this.f272884f, com.avito.android.actions_sheet.a.j(this.f272883e, H.d(H.e(this.f272880b.hashCode() * 31, 31, this.f272881c), 31, this.f272882d), 31), 31), 31), 31, this.f272886h), 31, this.f272887i), 31, this.f272888j), 31, this.f272889k), 31), 31, this.f272891m);
        Analytics analytics = this.f272892n;
        int iHashCode = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f272893o;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF273037i() {
        return this.f272895q;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeaturedTabsItem(stringId=");
        sb2.append(this.f272880b);
        sb2.append(", tabs=");
        sb2.append(this.f272881c);
        sb2.append(", selectedTabName=");
        sb2.append(this.f272882d);
        sb2.append(", viewType=");
        sb2.append(this.f272883e);
        sb2.append(", spanCount=");
        sb2.append(this.f272884f);
        sb2.append(", displayType=");
        sb2.append(this.f272885g);
        sb2.append(", isExternalAd=");
        sb2.append(this.f272886h);
        sb2.append(", hasStablePosition=");
        sb2.append(this.f272887i);
        sb2.append(", isFeatured=");
        sb2.append(this.f272888j);
        sb2.append(", featuredSectionTitle=");
        sb2.append(this.f272889k);
        sb2.append(", featuredSectionPosition=");
        sb2.append(this.f272890l);
        sb2.append(", featuredSectionType=");
        sb2.append(this.f272891m);
        sb2.append(", analytics=");
        sb2.append(this.f272892n);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272893o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272880b);
        Iterator itJ = C0.j(this.f272881c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f272882d);
        parcel.writeString(this.f272883e.name());
        parcel.writeInt(this.f272884f);
        parcel.writeString(this.f272885g.name());
        parcel.writeInt(this.f272886h ? 1 : 0);
        parcel.writeInt(this.f272887i ? 1 : 0);
        parcel.writeInt(this.f272888j ? 1 : 0);
        parcel.writeString(this.f272889k);
        parcel.writeInt(this.f272890l);
        parcel.writeString(this.f272891m);
        parcel.writeParcelable(this.f272892n, i12);
        parcel.writeParcelable(this.f272893o, i12);
    }

    public /* synthetic */ FeaturedTabsItem(String str, List list, String str2, SerpViewType serpViewType, int i12, SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14, String str3, int i13, String str4, Analytics analytics, Settings settings, int i14, C42822w c42822w) {
        this(str, list, str2, serpViewType, i12, serpDisplayType, (i14 & 64) != 0 ? false : z12, (i14 & 128) != 0 ? true : z13, (i14 & 256) != 0 ? true : z14, str3, i13, str4, (i14 & 4096) != 0 ? null : analytics, (i14 & 8192) != 0 ? null : settings);
    }
}
