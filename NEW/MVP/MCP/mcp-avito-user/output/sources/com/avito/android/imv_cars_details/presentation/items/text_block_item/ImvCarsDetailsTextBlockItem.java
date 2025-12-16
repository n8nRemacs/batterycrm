package com.avito.android.imv_cars_details.presentation.items.text_block_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvCarsDetailsTextBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/ImvCarsDetailsTextBlockItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsTextBlockItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsTextBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170227b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170228c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f170229d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f170230e;

    /* compiled from: ImvCarsDetailsTextBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsTextBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsTextBlockItem createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsTextBlockItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsTextBlockItem[] newArray(int i12) {
            return new ImvCarsDetailsTextBlockItem[i12];
        }
    }

    public ImvCarsDetailsTextBlockItem(@k String str, @l String str2, @l String str3, @l String str4) {
        this.f170227b = str;
        this.f170228c = str2;
        this.f170229d = str3;
        this.f170230e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF170227b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170227b() {
        return this.f170227b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170227b);
        parcel.writeString(this.f170228c);
        parcel.writeString(this.f170229d);
        parcel.writeString(this.f170230e);
    }

    public /* synthetic */ ImvCarsDetailsTextBlockItem(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ImvCarsDetailsTextBlockItem.class.getName() : str, str2, str3, str4);
    }
}
