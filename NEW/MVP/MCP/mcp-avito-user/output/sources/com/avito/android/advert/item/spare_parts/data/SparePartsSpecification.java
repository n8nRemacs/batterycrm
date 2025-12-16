package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/SparePartsSpecification;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparePartsSpecification implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsSpecification> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f80450b;

    /* compiled from: SparePartsV3Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsSpecification> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsSpecification createFromParcel(Parcel parcel) {
            return new SparePartsSpecification(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsSpecification[] newArray(int i12) {
            return new SparePartsSpecification[i12];
        }
    }

    public SparePartsSpecification(@k List<String> list) {
        this.f80450b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SparePartsSpecification) && L.f(this.f80450b, ((SparePartsSpecification) obj).f80450b);
    }

    public final int hashCode() {
        return this.f80450b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("SparePartsSpecification(params="), this.f80450b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f80450b);
    }
}
