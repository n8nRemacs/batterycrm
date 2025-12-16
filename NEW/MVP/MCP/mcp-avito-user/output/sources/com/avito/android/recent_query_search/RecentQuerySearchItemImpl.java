package com.avito.android.recent_query_search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecentQuerySearchItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recent_query_search/RecentQuerySearchItemImpl;", "Lcom/avito/android/recent_query_search/item/RecentQuerySearchItem;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecentQuerySearchItemImpl implements RecentQuerySearchItem {

    @Y61.k
    public static final Parcelable.Creator<RecentQuerySearchItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f252231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f252232c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f252233d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f252234e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchActionImpl f252235f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f252236g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f252237h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Analytics f252238i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Settings f252239j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h.b f252240k;

    /* renamed from: l, reason: collision with root package name */
    public final long f252241l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f252242m;

    /* renamed from: n, reason: collision with root package name */
    public final int f252243n;

    /* compiled from: RecentQuerySearchItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecentQuerySearchItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchItemImpl createFromParcel(Parcel parcel) {
            return new RecentQuerySearchItemImpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), SearchActionImpl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, (Analytics) parcel.readParcelable(RecentQuerySearchItemImpl.class.getClassLoader()), (Settings) parcel.readParcelable(RecentQuerySearchItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchItemImpl[] newArray(int i12) {
            return new RecentQuerySearchItemImpl[i12];
        }
    }

    public RecentQuerySearchItemImpl(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k SearchActionImpl searchActionImpl, boolean z12, boolean z13, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f252231b = str;
        this.f252232c = str2;
        this.f252233d = str3;
        this.f252234e = str4;
        this.f252235f = searchActionImpl;
        this.f252236g = z12;
        this.f252237h = z13;
        this.f252238i = analytics;
        this.f252239j = settings;
        this.f252240k = new h.b("recentQuerySearchWidget", null, null, null, null, analytics, 30, null);
        this.f252241l = a.C10492a.a(this);
        this.f252242m = SerpViewType.f268585e;
        this.f252243n = 6;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentQuerySearchItemImpl)) {
            return false;
        }
        RecentQuerySearchItemImpl recentQuerySearchItemImpl = (RecentQuerySearchItemImpl) obj;
        return L.f(this.f252231b, recentQuerySearchItemImpl.f252231b) && L.f(this.f252232c, recentQuerySearchItemImpl.f252232c) && L.f(this.f252233d, recentQuerySearchItemImpl.f252233d) && L.f(this.f252234e, recentQuerySearchItemImpl.f252234e) && L.f(this.f252235f, recentQuerySearchItemImpl.f252235f) && this.f252236g == recentQuerySearchItemImpl.f252236g && this.f252237h == recentQuerySearchItemImpl.f252237h && L.f(this.f252238i, recentQuerySearchItemImpl.f252238i) && L.f(this.f252239j, recentQuerySearchItemImpl.f252239j);
    }

    @Override // com.avito.android.recent_query_search.item.RecentQuerySearchItem
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF252238i() {
        return this.f252238i;
    }

    @Override // com.avito.android.recent_query_search.item.RecentQuerySearchItem
    @Y61.k
    /* renamed from: getDescription, reason: from getter */
    public final String getF252234e() {
        return this.f252234e;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF252237h() {
        return this.f252237h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76203b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.recent_query_search.item.RecentQuerySearchItem
    @Y61.k
    /* renamed from: getQuery, reason: from getter */
    public final String getF252233d() {
        return this.f252233d;
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF252239j() {
        return this.f252239j;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF252243n() {
        return this.f252243n;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF252231b() {
        return this.f252231b;
    }

    @Override // com.avito.android.recent_query_search.item.RecentQuerySearchItem
    @Y61.l
    /* renamed from: getTitle, reason: from getter */
    public final String getF252232c() {
        return this.f252232c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF252241l() {
        return this.f252241l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF252242m() {
        return this.f252242m;
    }

    public final int hashCode() {
        int iHashCode = this.f252231b.hashCode() * 31;
        String str = this.f252232c;
        int i12 = r.i(r.i((this.f252235f.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f252233d), 31, this.f252234e)) * 31, 31, this.f252236g), 31, this.f252237h);
        Analytics analytics = this.f252238i;
        int iHashCode2 = (i12 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f252239j;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.recent_query_search.item.RecentQuerySearchItem
    /* renamed from: k1, reason: from getter */
    public final SearchActionImpl getF252235f() {
        return this.f252235f;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF252240k() {
        return this.f252240k;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecentQuerySearchItemImpl(stringId=");
        sb2.append(this.f252231b);
        sb2.append(", title=");
        sb2.append(this.f252232c);
        sb2.append(", query=");
        sb2.append(this.f252233d);
        sb2.append(", description=");
        sb2.append(this.f252234e);
        sb2.append(", action=");
        sb2.append(this.f252235f);
        sb2.append(", isExternalAd=");
        sb2.append(this.f252236g);
        sb2.append(", hasStablePosition=");
        sb2.append(this.f252237h);
        sb2.append(", analytics=");
        sb2.append(this.f252238i);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f252239j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f252231b);
        parcel.writeString(this.f252232c);
        parcel.writeString(this.f252233d);
        parcel.writeString(this.f252234e);
        this.f252235f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f252236g ? 1 : 0);
        parcel.writeInt(this.f252237h ? 1 : 0);
        parcel.writeParcelable(this.f252238i, i12);
        parcel.writeParcelable(this.f252239j, i12);
    }

    public /* synthetic */ RecentQuerySearchItemImpl(String str, String str2, String str3, String str4, SearchActionImpl searchActionImpl, boolean z12, boolean z13, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, searchActionImpl, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? true : z13, (i12 & 128) != 0 ? null : analytics, (i12 & 256) != 0 ? null : settings);
    }
}
