package com.avito.android.home.appending_item.retry;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppendingRetryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/appending_item/retry/AppendingRetryItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class AppendingRetryItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<AppendingRetryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f162223b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f162224c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162225d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162226e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162227f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f162228g;

    /* compiled from: AppendingRetryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppendingRetryItem> {
        @Override // android.os.Parcelable.Creator
        public final AppendingRetryItem createFromParcel(Parcel parcel) {
            return new AppendingRetryItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppendingRetryItem[] newArray(int i12) {
            return new AppendingRetryItem[i12];
        }
    }

    public AppendingRetryItem(long j12, @k String str, int i12, boolean z12, boolean z13) {
        this.f162223b = j12;
        this.f162224c = str;
        this.f162225d = i12;
        this.f162226e = z12;
        this.f162227f = z13;
        this.f162228g = SerpViewType.f268585e;
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
        return this.f162223b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF162225d() {
        return this.f162225d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163001b() {
        return this.f162224c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF162228g() {
        return this.f162228g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f162223b);
        parcel.writeString(this.f162224c);
        parcel.writeInt(this.f162225d);
        parcel.writeInt(this.f162226e ? 1 : 0);
        parcel.writeInt(this.f162227f ? 1 : 0);
    }

    public /* synthetic */ AppendingRetryItem(long j12, String str, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(j12, str, i12, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? false : z13);
    }
}
