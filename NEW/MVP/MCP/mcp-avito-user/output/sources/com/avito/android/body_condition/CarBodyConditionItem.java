package com.avito.android.body_condition;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.CarBodyCondition;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CarBodyConditionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/body_condition/CarBodyConditionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarBodyConditionItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<CarBodyConditionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f106797b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CarBodyCondition f106798c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106799d;

    /* compiled from: CarBodyConditionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarBodyConditionItem> {
        @Override // android.os.Parcelable.Creator
        public final CarBodyConditionItem createFromParcel(Parcel parcel) {
            return new CarBodyConditionItem(parcel.readString(), (CarBodyCondition) parcel.readParcelable(CarBodyConditionItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CarBodyConditionItem[] newArray(int i12) {
            return new CarBodyConditionItem[i12];
        }
    }

    public CarBodyConditionItem(@Y61.k String str, @Y61.k CarBodyCondition carBodyCondition, boolean z12) {
        this.f106797b = str;
        this.f106798c = carBodyCondition;
        this.f106799d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106797b() {
        return this.f106797b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f106797b);
        parcel.writeParcelable(this.f106798c, i12);
        parcel.writeInt(this.f106799d ? 1 : 0);
    }

    public /* synthetic */ CarBodyConditionItem(String str, CarBodyCondition carBodyCondition, boolean z12, int i12, C42822w c42822w) {
        this(str, carBodyCondition, (i12 & 4) != 0 ? false : z12);
    }
}
