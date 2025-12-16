package com.avito.android.advert.item.note;

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
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNoteItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/note/AdvertDetailsNoteItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsNoteItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsNoteItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77802b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77803c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f77804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77805e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77806f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77807g;

    /* compiled from: AdvertDetailsNoteItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsNoteItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNoteItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsNoteItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNoteItem[] newArray(int i12) {
            return new AdvertDetailsNoteItem[i12];
        }
    }

    public AdvertDetailsNoteItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @l String str2) {
        this.f77802b = j12;
        this.f77803c = str;
        this.f77804d = str2;
        this.f77805e = i12;
        this.f77806f = serpDisplayType;
        this.f77807g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        String str = this.f77804d;
        SerpDisplayType serpDisplayType = this.f77806f;
        return new AdvertDetailsNoteItem(i12, this.f77802b, serpDisplayType, this.f77807g, this.f77803c, str);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77806f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsNoteItem)) {
            return false;
        }
        AdvertDetailsNoteItem advertDetailsNoteItem = (AdvertDetailsNoteItem) obj;
        return this.f77802b == advertDetailsNoteItem.f77802b && L.f(this.f77803c, advertDetailsNoteItem.f77803c) && L.f(this.f77804d, advertDetailsNoteItem.f77804d) && this.f77805e == advertDetailsNoteItem.f77805e && this.f77806f == advertDetailsNoteItem.f77806f && this.f77807g == advertDetailsNoteItem.f77807g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f77802b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f77805e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f77803c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f77807g;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f77802b) * 31, 31, this.f77803c);
        String str = this.f77804d;
        return this.f77807g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77806f, r.e(this.f77805e, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsNoteItem(id=");
        sb2.append(this.f77802b);
        sb2.append(", stringId=");
        sb2.append(this.f77803c);
        sb2.append(", note=");
        sb2.append(this.f77804d);
        sb2.append(", spanCount=");
        sb2.append(this.f77805e);
        sb2.append(", displayType=");
        sb2.append(this.f77806f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77807g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77802b);
        parcel.writeString(this.f77803c);
        parcel.writeString(this.f77804d);
        parcel.writeInt(this.f77805e);
        parcel.writeString(this.f77806f.name());
        parcel.writeString(this.f77807g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsNoteItem(long j12, String str, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 17;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? null : str2);
    }
}
