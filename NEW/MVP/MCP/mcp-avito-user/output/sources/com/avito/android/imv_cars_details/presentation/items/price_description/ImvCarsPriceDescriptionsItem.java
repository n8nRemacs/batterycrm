package com.avito.android.imv_cars_details.presentation.items.price_description;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.imv_cars_details.models.ImvPriceDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvCarsPriceDescriptionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/price_description/ImvCarsPriceDescriptionsItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsPriceDescriptionsItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsPriceDescriptionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170197b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ImvPriceDetails f170198c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ImvPriceDetails f170199d;

    /* compiled from: ImvCarsPriceDescriptionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsPriceDescriptionsItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsPriceDescriptionsItem createFromParcel(Parcel parcel) {
            return new ImvCarsPriceDescriptionsItem(parcel.readString(), (ImvPriceDetails) parcel.readParcelable(ImvCarsPriceDescriptionsItem.class.getClassLoader()), (ImvPriceDetails) parcel.readParcelable(ImvCarsPriceDescriptionsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsPriceDescriptionsItem[] newArray(int i12) {
            return new ImvCarsPriceDescriptionsItem[i12];
        }
    }

    public ImvCarsPriceDescriptionsItem(@Y61.k String str, @l ImvPriceDetails imvPriceDetails, @l ImvPriceDetails imvPriceDetails2) {
        this.f170197b = str;
        this.f170198c = imvPriceDetails;
        this.f170199d = imvPriceDetails2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF170076b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170076b() {
        return this.f170197b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170197b);
        parcel.writeParcelable(this.f170198c, i12);
        parcel.writeParcelable(this.f170199d, i12);
    }

    public /* synthetic */ ImvCarsPriceDescriptionsItem(String str, ImvPriceDetails imvPriceDetails, ImvPriceDetails imvPriceDetails2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ImvCarsPriceDescriptionsItem.class.getName() : str, imvPriceDetails, imvPriceDetails2);
    }
}
