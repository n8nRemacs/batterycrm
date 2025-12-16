package com.avito.android.home.appending_item.loader;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppendingLoaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/appending_item/loader/AppendingLoaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppendingLoaderItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<AppendingLoaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f162211b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f162212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162213d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162214e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f162215f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f162216g;

    /* compiled from: AppendingLoaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppendingLoaderItem> {
        @Override // android.os.Parcelable.Creator
        public final AppendingLoaderItem createFromParcel(Parcel parcel) {
            return new AppendingLoaderItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppendingLoaderItem[] newArray(int i12) {
            return new AppendingLoaderItem[i12];
        }
    }

    public AppendingLoaderItem(long j12, @k String str, int i12, boolean z12, boolean z13) {
        this.f162211b = j12;
        this.f162212c = str;
        this.f162213d = i12;
        this.f162214e = z12;
        this.f162215f = z13;
        this.f162216g = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF68263k() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f162211b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF150573c() {
        return this.f162213d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270144b() {
        return this.f162212c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84437p() {
        return this.f162216g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f162211b);
        parcel.writeString(this.f162212c);
        parcel.writeInt(this.f162213d);
        parcel.writeInt(this.f162214e ? 1 : 0);
        parcel.writeInt(this.f162215f ? 1 : 0);
    }

    public /* synthetic */ AppendingLoaderItem(long j12, String str, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(j12, str, i12, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? false : z13);
    }
}
