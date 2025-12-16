package com.avito.android.serp.adapter.vertical_main.featured.action;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.Z;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: FeaturedActionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/action/FeaturedActionItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lcom/avito/android/serp/adapter/Z;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeaturedActionItem implements PersistableSerpItem, S2, Z, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<FeaturedActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272802c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f272803d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272804e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f272805f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f272806g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f272807h;

    /* renamed from: i, reason: collision with root package name */
    public final int f272808i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f272809j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Map<String, String> f272810k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Analytics f272811l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Settings f272812m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final SerpViewType f272813n;

    /* renamed from: o, reason: collision with root package name */
    public final int f272814o;

    /* renamed from: p, reason: collision with root package name */
    public final long f272815p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final h.b f272816q;

    /* compiled from: FeaturedActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeaturedActionItem> {
        @Override // android.os.Parcelable.Creator
        public final FeaturedActionItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FeaturedActionItem.class.getClassLoader());
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new FeaturedActionItem(string, string2, deepLink, z12, z13, z14, string3, i12, string4, linkedHashMap, (Analytics) parcel.readParcelable(FeaturedActionItem.class.getClassLoader()), (Settings) parcel.readParcelable(FeaturedActionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeaturedActionItem[] newArray(int i12) {
            return new FeaturedActionItem[i12];
        }
    }

    public FeaturedActionItem(@k String str, @k String str2, @k DeepLink deepLink, boolean z12, boolean z13, boolean z14, @k String str3, int i12, @k String str4, @l Map<String, String> map, @l Analytics analytics, @l Settings settings) {
        this.f272801b = str;
        this.f272802c = str2;
        this.f272803d = deepLink;
        this.f272804e = z12;
        this.f272805f = z13;
        this.f272806g = z14;
        this.f272807h = str3;
        this.f272808i = i12;
        this.f272809j = str4;
        this.f272810k = map;
        this.f272811l = analytics;
        this.f272812m = settings;
        this.f272813n = SerpViewType.f268585e;
        this.f272814o = 6;
        this.f272815p = getF270622b().hashCode();
        this.f272816q = new h.b(str4, r.r(str, ", ", str2), null, null, map, analytics, 12, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.Z
    @k
    public final String getFeaturedSectionType() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272805f() {
        return this.f272805f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272812m() {
        return this.f272812m;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270628h() {
        return this.f272814o;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270622b() {
        return this.f272801b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272815p() {
        return this.f272815p;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270627g() {
        return this.f272813n;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272816q() {
        return this.f272816q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272801b);
        parcel.writeString(this.f272802c);
        parcel.writeParcelable(this.f272803d, i12);
        parcel.writeInt(this.f272804e ? 1 : 0);
        parcel.writeInt(this.f272805f ? 1 : 0);
        parcel.writeInt(this.f272806g ? 1 : 0);
        parcel.writeString(this.f272807h);
        parcel.writeInt(this.f272808i);
        parcel.writeString(this.f272809j);
        Map<String, String> map = this.f272810k;
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
        parcel.writeParcelable(this.f272811l, i12);
        parcel.writeParcelable(this.f272812m, i12);
    }

    public /* synthetic */ FeaturedActionItem(String str, String str2, DeepLink deepLink, boolean z12, boolean z13, boolean z14, String str3, int i12, String str4, Map map, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this(str, str2, deepLink, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? true : z13, (i13 & 32) != 0 ? true : z14, str3, i12, str4, (i13 & 512) != 0 ? null : map, analytics, settings);
    }
}
