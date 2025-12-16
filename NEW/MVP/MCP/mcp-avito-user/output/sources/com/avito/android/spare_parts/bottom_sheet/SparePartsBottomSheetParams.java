package com.avito.android.spare_parts.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.models.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsBottomSheetParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/SparePartsBottomSheetParams;", "Landroid/os/Parcelable;", "_avito_spare-parts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SparePartsBottomSheetParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SparePartsBottomSheetParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SparePartsGroup f284753c;

    /* compiled from: SparePartsBottomSheetParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsBottomSheetParams> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsBottomSheetParams createFromParcel(Parcel parcel) {
            return new SparePartsBottomSheetParams(parcel.readString(), (SparePartsGroup) parcel.readParcelable(SparePartsBottomSheetParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsBottomSheetParams[] newArray(int i12) {
            return new SparePartsBottomSheetParams[i12];
        }
    }

    public SparePartsBottomSheetParams(@Y61.k String str, @Y61.k SparePartsGroup sparePartsGroup) {
        this.f284752b = str;
        this.f284753c = sparePartsGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsBottomSheetParams)) {
            return false;
        }
        SparePartsBottomSheetParams sparePartsBottomSheetParams = (SparePartsBottomSheetParams) obj;
        return L.f(this.f284752b, sparePartsBottomSheetParams.f284752b) && L.f(this.f284753c, sparePartsBottomSheetParams.f284753c);
    }

    public final int hashCode() {
        return this.f284753c.hashCode() + (this.f284752b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SparePartsBottomSheetParams(advertId=" + this.f284752b + ", sparePartsGroup=" + this.f284753c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f284752b);
        parcel.writeParcelable(this.f284753c, i12);
    }
}
