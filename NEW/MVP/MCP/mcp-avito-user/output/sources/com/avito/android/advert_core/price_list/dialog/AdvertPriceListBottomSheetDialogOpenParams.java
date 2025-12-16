package com.avito.android.advert_core.price_list.dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListBottomSheetDialogOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/AdvertPriceListBottomSheetDialogOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertPriceListBottomSheetDialogOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<AdvertPriceListBottomSheetDialogOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PriceList f84056b;

    /* compiled from: AdvertPriceListBottomSheetDialogOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertPriceListBottomSheetDialogOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListBottomSheetDialogOpenParams createFromParcel(Parcel parcel) {
            return new AdvertPriceListBottomSheetDialogOpenParams((PriceList) parcel.readParcelable(AdvertPriceListBottomSheetDialogOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListBottomSheetDialogOpenParams[] newArray(int i12) {
            return new AdvertPriceListBottomSheetDialogOpenParams[i12];
        }
    }

    public AdvertPriceListBottomSheetDialogOpenParams(@k PriceList priceList) {
        this.f84056b = priceList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvertPriceListBottomSheetDialogOpenParams) && L.f(this.f84056b, ((AdvertPriceListBottomSheetDialogOpenParams) obj).f84056b);
    }

    public final int hashCode() {
        return this.f84056b.hashCode();
    }

    @k
    public final String toString() {
        return "AdvertPriceListBottomSheetDialogOpenParams(priceList=" + this.f84056b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f84056b, i12);
    }
}
