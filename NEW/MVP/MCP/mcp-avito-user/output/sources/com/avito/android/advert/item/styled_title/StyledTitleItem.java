package com.avito.android.advert.item.styled_title;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StyledTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/styled_title/StyledTitleItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StyledTitleItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<StyledTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80482c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f80483d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80484e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80485f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f80486g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f80487h;

    /* compiled from: StyledTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StyledTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final StyledTitleItem createFromParcel(Parcel parcel) {
            return new StyledTitleItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final StyledTitleItem[] newArray(int i12) {
            return new StyledTitleItem[i12];
        }
    }

    public StyledTitleItem(@k String str, int i12, @k String str2, long j12, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80481b = str;
        this.f80482c = i12;
        this.f80483d = str2;
        this.f80484e = j12;
        this.f80485f = i13;
        this.f80486g = serpDisplayType;
        this.f80487h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new StyledTitleItem(this.f80481b, this.f80482c, this.f80483d, this.f80484e, this.f80485f, null, this.f80487h, 32, null);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80486g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79364b() {
        return this.f80484e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79365c() {
        return this.f80485f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79366d() {
        return this.f80483d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79367e() {
        return this.f80487h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80481b);
        parcel.writeInt(this.f80482c);
        parcel.writeString(this.f80483d);
        parcel.writeLong(this.f80484e);
        parcel.writeInt(this.f80485f);
        parcel.writeString(this.f80486g.name());
        parcel.writeString(this.f80487h.name());
    }

    public /* synthetic */ StyledTitleItem(String str, int i12, String str2, long j12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        this(str, i12, str2, j12, i13, (i14 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
