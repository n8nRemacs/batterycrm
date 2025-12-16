package com.avito.android.home.appending_item.empty;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppendingEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/appending_item/empty/AppendingEmptyItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppendingEmptyItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<AppendingEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f162200b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f162201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162202d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162203e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f162204f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f162205g;

    /* compiled from: AppendingEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppendingEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final AppendingEmptyItem createFromParcel(Parcel parcel) {
            return new AppendingEmptyItem(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppendingEmptyItem[] newArray(int i12) {
            return new AppendingEmptyItem[i12];
        }
    }

    public AppendingEmptyItem(int i12, long j12, @k String str, @k String str2, boolean z12) {
        this.f162200b = j12;
        this.f162201c = str;
        this.f162202d = i12;
        this.f162203e = z12;
        this.f162204f = str2;
        this.f162205g = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF327326g() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF162223b() {
        return this.f162200b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF162225d() {
        return this.f162202d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162224c() {
        return this.f162201c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF162228g() {
        return this.f162205g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f162200b);
        parcel.writeString(this.f162201c);
        parcel.writeInt(this.f162202d);
        parcel.writeInt(this.f162203e ? 1 : 0);
        parcel.writeString(this.f162204f);
    }

    public /* synthetic */ AppendingEmptyItem(long j12, String str, int i12, boolean z12, String str2, int i13, C42822w c42822w) {
        this(i12, j12, str, str2, (i13 & 8) != 0 ? false : z12);
    }
}
