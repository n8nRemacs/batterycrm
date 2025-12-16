package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.PricePoll;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsPollItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/ImvCarsDetailsPollItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvCarsDetailsPollItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsPollItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PricePoll f170140c;

    /* compiled from: ImvCarsDetailsPollItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsPollItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsPollItem createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsPollItem(parcel.readString(), (PricePoll) parcel.readParcelable(ImvCarsDetailsPollItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsPollItem[] newArray(int i12) {
            return new ImvCarsDetailsPollItem[i12];
        }
    }

    public ImvCarsDetailsPollItem(@k String str, @k PricePoll pricePoll) {
        this.f170139b = str;
        this.f170140c = pricePoll;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsPollItem)) {
            return false;
        }
        ImvCarsDetailsPollItem imvCarsDetailsPollItem = (ImvCarsDetailsPollItem) obj;
        return L.f(this.f170139b, imvCarsDetailsPollItem.f170139b) && L.f(this.f170140c, imvCarsDetailsPollItem.f170140c);
    }

    @Override // TV0.a
    public final long getId() {
        return getF163652b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163652b() {
        return this.f170139b;
    }

    public final int hashCode() {
        return this.f170140c.hashCode() + (this.f170139b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ImvCarsDetailsPollItem(stringId=" + this.f170139b + ", poll=" + this.f170140c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170139b);
        parcel.writeParcelable(this.f170140c, i12);
    }
}
