package com.avito.android.imv_cars_details.presentation.items.title_Item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvCarsDetailsTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/title_Item/ImvCarsDetailsTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170242b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f170243c;

    /* compiled from: ImvCarsDetailsTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsTitleItem createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsTitleItem[] newArray(int i12) {
            return new ImvCarsDetailsTitleItem[i12];
        }
    }

    public ImvCarsDetailsTitleItem(@k String str, @k String str2) {
        this.f170242b = str;
        this.f170243c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124056b() {
        return getF170102b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170102b() {
        return this.f170242b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170242b);
        parcel.writeString(this.f170243c);
    }

    public /* synthetic */ ImvCarsDetailsTitleItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ImvCarsDetailsTitleItem.class.getName() : str, str2);
    }
}
