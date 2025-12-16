package com.avito.android.active_orders.adapter.stub;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.active_orders.adapter.HomeActiveOrdersItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HomeActiveOrdersStubItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders/adapter/stub/HomeActiveOrdersStubItem;", "Lcom/avito/android/active_orders/adapter/HomeActiveOrdersItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HomeActiveOrdersStubItem implements HomeActiveOrdersItem {

    @k
    public static final Parcelable.Creator<HomeActiveOrdersStubItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f68286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68287c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f68288d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68289e;

    /* compiled from: HomeActiveOrdersStubItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HomeActiveOrdersStubItem> {
        @Override // android.os.Parcelable.Creator
        public final HomeActiveOrdersStubItem createFromParcel(Parcel parcel) {
            return new HomeActiveOrdersStubItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HomeActiveOrdersStubItem[] newArray(int i12) {
            return new HomeActiveOrdersStubItem[i12];
        }
    }

    public HomeActiveOrdersStubItem(@k String str, int i12) {
        this.f68286b = str;
        this.f68287c = i12;
        this.f68288d = SerpViewType.f268585e;
        this.f68289e = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272743j() {
        return this.f68289e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f68287c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF313318b() {
        return this.f68286b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80600f() {
        return this.f68288d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f68286b);
        parcel.writeInt(this.f68287c);
    }

    public /* synthetic */ HomeActiveOrdersStubItem(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "home_active_orders_item_id" : str, i12);
    }
}
