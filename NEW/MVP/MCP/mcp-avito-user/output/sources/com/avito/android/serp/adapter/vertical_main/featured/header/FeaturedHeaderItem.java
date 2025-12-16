package com.avito.android.serp.adapter.vertical_main.featured.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.constructor_advert.ui.serp.constructor.u;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.Z;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: FeaturedHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/header/FeaturedHeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lcom/avito/android/serp/adapter/Z;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/u;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeaturedHeaderItem implements PersistableSerpItem, S2, Z, u, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<FeaturedHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272840b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272841c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f272842d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f272843e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f272844f;

    /* renamed from: g, reason: collision with root package name */
    public final int f272845g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpDisplayType f272846h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f272847i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f272848j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f272849k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f272850l;

    /* renamed from: m, reason: collision with root package name */
    public final int f272851m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f272852n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Analytics f272853o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Settings f272854p;

    /* renamed from: q, reason: collision with root package name */
    public final long f272855q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final h.b f272856r;

    /* compiled from: FeaturedHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeaturedHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final FeaturedHeaderItem createFromParcel(Parcel parcel) {
            return new FeaturedHeaderItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(FeaturedHeaderItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), (Analytics) parcel.readParcelable(FeaturedHeaderItem.class.getClassLoader()), (Settings) parcel.readParcelable(FeaturedHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeaturedHeaderItem[] newArray(int i12) {
            return new FeaturedHeaderItem[i12];
        }
    }

    public FeaturedHeaderItem(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @k SerpViewType serpViewType, int i12, @k SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14, @k String str4, int i13, @k String str5, @l Analytics analytics, @l Settings settings) {
        this.f272840b = str;
        this.f272841c = str2;
        this.f272842d = str3;
        this.f272843e = attributedText;
        this.f272844f = serpViewType;
        this.f272845g = i12;
        this.f272846h = serpDisplayType;
        this.f272847i = z12;
        this.f272848j = z13;
        this.f272849k = z14;
        this.f272850l = str4;
        this.f272851m = i13;
        this.f272852n = str5;
        this.f272853o = analytics;
        this.f272854p = settings;
        this.f272855q = a.C10492a.a(this);
        this.f272856r = new h.b(str5, str4, null, null, null, analytics, 28, null);
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
        if (!(obj instanceof FeaturedHeaderItem)) {
            return false;
        }
        FeaturedHeaderItem featuredHeaderItem = (FeaturedHeaderItem) obj;
        return L.f(this.f272840b, featuredHeaderItem.f272840b) && L.f(this.f272841c, featuredHeaderItem.f272841c) && L.f(this.f272842d, featuredHeaderItem.f272842d) && L.f(this.f272843e, featuredHeaderItem.f272843e) && this.f272844f == featuredHeaderItem.f272844f && this.f272845g == featuredHeaderItem.f272845g && this.f272846h == featuredHeaderItem.f272846h && this.f272847i == featuredHeaderItem.f272847i && this.f272848j == featuredHeaderItem.f272848j && this.f272849k == featuredHeaderItem.f272849k && L.f(this.f272850l, featuredHeaderItem.f272850l) && this.f272851m == featuredHeaderItem.f272851m && L.f(this.f272852n, featuredHeaderItem.f272852n) && L.f(this.f272853o, featuredHeaderItem.f272853o) && L.f(this.f272854p, featuredHeaderItem.f272854p);
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
    public final boolean getF270317l() {
        return this.f272848j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF280541o() {
        return this.f272854p;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270917g() {
        return this.f272845g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF221121b() {
        return this.f272840b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF280543q() {
        return this.f272855q;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270918h() {
        return this.f272844f;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f272840b.hashCode() * 31, 31, this.f272841c);
        String str = this.f272842d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f272843e;
        int iD3 = H.d(r.e(this.f272851m, H.d(r.i(r.i(r.i(com.avito.android.actions_sheet.a.h(this.f272846h, r.e(this.f272845g, com.avito.android.actions_sheet.a.j(this.f272844f, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31), 31), 31), 31, this.f272847i), 31, this.f272848j), 31, this.f272849k), 31, this.f272850l), 31), 31, this.f272852n);
        Analytics analytics = this.f272853o;
        int iHashCode2 = (iD3 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f272854p;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF280542p() {
        return this.f272856r;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeaturedHeaderItem(stringId=");
        sb2.append(this.f272840b);
        sb2.append(", title=");
        sb2.append(this.f272841c);
        sb2.append(", subtitle=");
        sb2.append(this.f272842d);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f272843e);
        sb2.append(", viewType=");
        sb2.append(this.f272844f);
        sb2.append(", spanCount=");
        sb2.append(this.f272845g);
        sb2.append(", displayType=");
        sb2.append(this.f272846h);
        sb2.append(", isExternalAd=");
        sb2.append(this.f272847i);
        sb2.append(", hasStablePosition=");
        sb2.append(this.f272848j);
        sb2.append(", isFeatured=");
        sb2.append(this.f272849k);
        sb2.append(", featuredSectionTitle=");
        sb2.append(this.f272850l);
        sb2.append(", featuredSectionPosition=");
        sb2.append(this.f272851m);
        sb2.append(", featuredSectionType=");
        sb2.append(this.f272852n);
        sb2.append(", analytics=");
        sb2.append(this.f272853o);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272854p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272840b);
        parcel.writeString(this.f272841c);
        parcel.writeString(this.f272842d);
        parcel.writeParcelable(this.f272843e, i12);
        parcel.writeString(this.f272844f.name());
        parcel.writeInt(this.f272845g);
        parcel.writeString(this.f272846h.name());
        parcel.writeInt(this.f272847i ? 1 : 0);
        parcel.writeInt(this.f272848j ? 1 : 0);
        parcel.writeInt(this.f272849k ? 1 : 0);
        parcel.writeString(this.f272850l);
        parcel.writeInt(this.f272851m);
        parcel.writeString(this.f272852n);
        parcel.writeParcelable(this.f272853o, i12);
        parcel.writeParcelable(this.f272854p, i12);
    }

    public /* synthetic */ FeaturedHeaderItem(String str, String str2, String str3, AttributedText attributedText, SerpViewType serpViewType, int i12, SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14, String str4, int i13, String str5, Analytics analytics, Settings settings, int i14, C42822w c42822w) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : attributedText, serpViewType, i12, serpDisplayType, (i14 & 128) != 0 ? false : z12, (i14 & 256) != 0 ? true : z13, (i14 & 512) != 0 ? true : z14, str4, i13, str5, analytics, settings);
    }
}
