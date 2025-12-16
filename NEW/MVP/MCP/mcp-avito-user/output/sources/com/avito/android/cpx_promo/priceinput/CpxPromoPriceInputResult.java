package com.avito.android.cpx_promo.priceinput;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CpxPromoPriceInputResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputResult;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CpxPromoPriceInputResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CpxPromoPriceInputResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CpxPromoInputSource f127292b;

    /* renamed from: c, reason: collision with root package name */
    public final long f127293c;

    /* compiled from: CpxPromoPriceInputResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoPriceInputResult> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputResult createFromParcel(Parcel parcel) {
            return new CpxPromoPriceInputResult(CpxPromoInputSource.valueOf(parcel.readString()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputResult[] newArray(int i12) {
            return new CpxPromoPriceInputResult[i12];
        }
    }

    public CpxPromoPriceInputResult(@Y61.k CpxPromoInputSource cpxPromoInputSource, long j12) {
        this.f127292b = cpxPromoInputSource;
        this.f127293c = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpxPromoPriceInputResult)) {
            return false;
        }
        CpxPromoPriceInputResult cpxPromoPriceInputResult = (CpxPromoPriceInputResult) obj;
        return this.f127292b == cpxPromoPriceInputResult.f127292b && this.f127293c == cpxPromoPriceInputResult.f127293c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f127293c) + (this.f127292b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxPromoPriceInputResult(source=");
        sb2.append(this.f127292b);
        sb2.append(", selectedValue=");
        return r.u(sb2, this.f127293c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f127292b.name());
        parcel.writeLong(this.f127293c);
    }
}
