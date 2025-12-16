package com.avito.android.advert.item.mortgage_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageSnippetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/mortgage_snippet/MortgageSnippetItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MortgageSnippetItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MortgageSnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77673b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f77674c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f77675d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f77676e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f77677f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77678g;

    /* renamed from: h, reason: collision with root package name */
    public final long f77679h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f77680i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public SerpDisplayType f77681j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f77682k;

    /* renamed from: l, reason: collision with root package name */
    public final long f77683l;

    /* compiled from: MortgageSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageSnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final MortgageSnippetItem createFromParcel(Parcel parcel) {
            return new MortgageSnippetItem(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageSnippetItem[] newArray(int i12) {
            return new MortgageSnippetItem[i12];
        }
    }

    public MortgageSnippetItem(boolean z12, @l String str, @l String str2, @l String str3, @l String str4, int i12, long j12, @k String str5, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77673b = z12;
        this.f77674c = str;
        this.f77675d = str2;
        this.f77676e = str3;
        this.f77677f = str4;
        this.f77678g = i12;
        this.f77679h = j12;
        this.f77680i = str5;
        this.f77681j = serpDisplayType;
        this.f77682k = serpViewType;
        this.f77683l = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MortgageSnippetItem(this.f77673b, this.f77674c, this.f77675d, this.f77676e, this.f77677f, i12, this.f77679h, this.f77680i, this.f77681j, this.f77682k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77681j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageSnippetItem)) {
            return false;
        }
        MortgageSnippetItem mortgageSnippetItem = (MortgageSnippetItem) obj;
        return this.f77673b == mortgageSnippetItem.f77673b && L.f(this.f77674c, mortgageSnippetItem.f77674c) && L.f(this.f77675d, mortgageSnippetItem.f77675d) && L.f(this.f77676e, mortgageSnippetItem.f77676e) && L.f(this.f77677f, mortgageSnippetItem.f77677f) && this.f77678g == mortgageSnippetItem.f77678g && this.f77679h == mortgageSnippetItem.f77679h && L.f(this.f77680i, mortgageSnippetItem.f77680i) && this.f77681j == mortgageSnippetItem.f77681j && this.f77682k == mortgageSnippetItem.f77682k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f77679h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f77678g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f77680i;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77570h() {
        return this.f77683l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f77682k;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f77673b) * 31;
        String str = this.f77674c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77675d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77676e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77677f;
        return this.f77682k.hashCode() + com.avito.android.actions_sheet.a.h(this.f77681j, H.d(r.g(r.e(this.f77678g, (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.f77679h), 31, this.f77680i), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageSnippetItem(isRedesign=");
        sb2.append(this.f77673b);
        sb2.append(", title=");
        sb2.append(this.f77674c);
        sb2.append(", paymentTemplate=");
        sb2.append(this.f77675d);
        sb2.append(", emptyPaymentTemplate=");
        sb2.append(this.f77676e);
        sb2.append(", actionTitle=");
        sb2.append(this.f77677f);
        sb2.append(", spanCount=");
        sb2.append(this.f77678g);
        sb2.append(", id=");
        sb2.append(this.f77679h);
        sb2.append(", stringId=");
        sb2.append(this.f77680i);
        sb2.append(", displayType=");
        sb2.append(this.f77681j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77682k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f77673b ? 1 : 0);
        parcel.writeString(this.f77674c);
        parcel.writeString(this.f77675d);
        parcel.writeString(this.f77676e);
        parcel.writeString(this.f77677f);
        parcel.writeInt(this.f77678g);
        parcel.writeLong(this.f77679h);
        parcel.writeString(this.f77680i);
        parcel.writeString(this.f77681j.name());
        parcel.writeString(this.f77682k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MortgageSnippetItem(boolean z12, String str, String str2, String str3, String str4, int i12, long j12, String str5, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 64) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 23;
        } else {
            j13 = j12;
        }
        this(z12, str, str2, str3, str4, i12, j13, (i13 & 128) != 0 ? String.valueOf(j13) : str5, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
