package com.avito.android.advert_details_items.search_suggests;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSearchSuggestsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/search_suggests/AdvertDetailsSearchSuggestsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSearchSuggestsItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsSearchSuggestsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85510b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85511c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f85512d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AdvertDetailsSearchSuggestItem> f85513e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f85514f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f85515g;

    /* renamed from: h, reason: collision with root package name */
    public final int f85516h;

    /* compiled from: AdvertDetailsSearchSuggestsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSearchSuggestsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSearchSuggestsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdvertDetailsSearchSuggestItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertDetailsSearchSuggestsItem(parcel.readInt(), j12, string, string2, parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSearchSuggestsItem[] newArray(int i12) {
            return new AdvertDetailsSearchSuggestsItem[i12];
        }
    }

    public AdvertDetailsSearchSuggestsItem(int i12, long j12, @k String str, @l String str2, @l String str3, @l String str4, @l List list) {
        this.f85510b = j12;
        this.f85511c = str;
        this.f85512d = str2;
        this.f85513e = list;
        this.f85514f = str3;
        this.f85515g = str4;
        this.f85516h = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSearchSuggestsItem(i12, this.f85510b, this.f85511c, this.f85512d, this.f85514f, this.f85515g, this.f85513e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSearchSuggestsItem)) {
            return false;
        }
        AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem = (AdvertDetailsSearchSuggestsItem) obj;
        return this.f85510b == advertDetailsSearchSuggestsItem.f85510b && L.f(this.f85511c, advertDetailsSearchSuggestsItem.f85511c) && L.f(this.f85512d, advertDetailsSearchSuggestsItem.f85512d) && L.f(this.f85513e, advertDetailsSearchSuggestsItem.f85513e) && L.f(this.f85514f, advertDetailsSearchSuggestsItem.f85514f) && L.f(this.f85515g, advertDetailsSearchSuggestsItem.f85515g) && this.f85516h == advertDetailsSearchSuggestsItem.f85516h;
    }

    public final boolean f() {
        List<AdvertDetailsSearchSuggestItem> list;
        String str = this.f85512d;
        return (str == null || str.length() == 0 || (list = this.f85513e) == null || list.isEmpty()) ? false : true;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF268422b() {
        return this.f85510b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272742i() {
        return this.f85516h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272735b() {
        return this.f85511c;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f85510b) * 31, 31, this.f85511c);
        String str = this.f85512d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<AdvertDetailsSearchSuggestItem> list = this.f85513e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f85514f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85515g;
        return Integer.hashCode(this.f85516h) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSearchSuggestsItem(id=");
        sb2.append(this.f85510b);
        sb2.append(", stringId=");
        sb2.append(this.f85511c);
        sb2.append(", title=");
        sb2.append(this.f85512d);
        sb2.append(", searchSuggests=");
        sb2.append(this.f85513e);
        sb2.append(", iid=");
        sb2.append(this.f85514f);
        sb2.append(", categoryId=");
        sb2.append(this.f85515g);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f85516h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f85510b);
        parcel.writeString(this.f85511c);
        parcel.writeString(this.f85512d);
        List<AdvertDetailsSearchSuggestItem> list = this.f85513e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdvertDetailsSearchSuggestItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.f85514f);
        parcel.writeString(this.f85515g);
        parcel.writeInt(this.f85516h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSearchSuggestsItem(long j12, String str, String str2, List list, String str3, String str4, int i12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 209;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, str4, list);
    }
}
