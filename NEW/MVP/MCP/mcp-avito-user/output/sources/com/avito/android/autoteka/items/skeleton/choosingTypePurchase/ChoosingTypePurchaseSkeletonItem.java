package com.avito.android.autoteka.items.skeleton.choosingTypePurchase;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChoosingTypePurchaseSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/skeleton/choosingTypePurchase/ChoosingTypePurchaseSkeletonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChoosingTypePurchaseSkeletonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ChoosingTypePurchaseSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97005b;

    /* compiled from: ChoosingTypePurchaseSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChoosingTypePurchaseSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final ChoosingTypePurchaseSkeletonItem createFromParcel(Parcel parcel) {
            return new ChoosingTypePurchaseSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChoosingTypePurchaseSkeletonItem[] newArray(int i12) {
            return new ChoosingTypePurchaseSkeletonItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChoosingTypePurchaseSkeletonItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChoosingTypePurchaseSkeletonItem) && L.f(this.f97005b, ((ChoosingTypePurchaseSkeletonItem) obj).f97005b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85286b() {
        return getF96836b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96836b() {
        return this.f97005b;
    }

    public final int hashCode() {
        return this.f97005b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ChoosingTypePurchaseSkeletonItem(stringId="), this.f97005b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f97005b);
    }

    public ChoosingTypePurchaseSkeletonItem(@k String str) {
        this.f97005b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChoosingTypePurchaseSkeletonItem(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_CHOOSING_TYPE_PURCHASE_SKELETON";
        }
        this(str);
    }
}
