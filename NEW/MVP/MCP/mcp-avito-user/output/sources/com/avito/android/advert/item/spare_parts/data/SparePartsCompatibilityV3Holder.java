package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/SparePartsCompatibilityV3Holder;", "Landroid/os/Parcelable;", "Lcom/avito/android/advert/item/spare_parts/data/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparePartsCompatibilityV3Holder implements Parcelable, com.avito.android.advert.item.spare_parts.data.a {

    @k
    public static final Parcelable.Creator<SparePartsCompatibilityV3Holder> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CarCompatibility f80438b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final OtherCompatibility f80439c;

    /* compiled from: SparePartsV3Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsCompatibilityV3Holder> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsCompatibilityV3Holder createFromParcel(Parcel parcel) {
            return new SparePartsCompatibilityV3Holder(parcel.readInt() == 0 ? null : CarCompatibility.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OtherCompatibility.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsCompatibilityV3Holder[] newArray(int i12) {
            return new SparePartsCompatibilityV3Holder[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparePartsCompatibilityV3Holder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @l
    public final SparePartsCompatibilityV4Holder d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsCompatibilityV3Holder)) {
            return false;
        }
        SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder = (SparePartsCompatibilityV3Holder) obj;
        return L.f(this.f80438b, sparePartsCompatibilityV3Holder.f80438b) && L.f(this.f80439c, sparePartsCompatibilityV3Holder.f80439c);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @l
    /* renamed from: getAction */
    public final DeepLink getF80442d() {
        return null;
    }

    public final int hashCode() {
        CarCompatibility carCompatibility = this.f80438b;
        int iHashCode = (carCompatibility == null ? 0 : carCompatibility.hashCode()) * 31;
        OtherCompatibility otherCompatibility = this.f80439c;
        return iHashCode + (otherCompatibility != null ? otherCompatibility.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SparePartsCompatibilityV3Holder(carCompatibility=" + this.f80438b + ", otherCompatibility=" + this.f80439c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CarCompatibility carCompatibility = this.f80438b;
        if (carCompatibility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carCompatibility.writeToParcel(parcel, i12);
        }
        OtherCompatibility otherCompatibility = this.f80439c;
        if (otherCompatibility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            otherCompatibility.writeToParcel(parcel, i12);
        }
    }

    public SparePartsCompatibilityV3Holder(@l CarCompatibility carCompatibility, @l OtherCompatibility otherCompatibility) {
        this.f80438b = carCompatibility;
        this.f80439c = otherCompatibility;
    }

    public /* synthetic */ SparePartsCompatibilityV3Holder(CarCompatibility carCompatibility, OtherCompatibility otherCompatibility, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : carCompatibility, (i12 & 2) != 0 ? null : otherCompatibility);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @k
    /* renamed from: c */
    public final SparePartsCompatibilityV3Holder getF80440b() {
        return this;
    }
}
