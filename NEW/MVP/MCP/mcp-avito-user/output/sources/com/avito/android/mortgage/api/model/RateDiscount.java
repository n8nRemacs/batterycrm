package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OffersResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/api/model/RateDiscount;", "Landroid/os/Parcelable;", "", "baseRate", "<init>", "(D)V", "D", "c", "()D", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RateDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<RateDiscount> CREATOR = new a();

    @c("base")
    private final double baseRate;

    /* compiled from: OffersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RateDiscount> {
        @Override // android.os.Parcelable.Creator
        public final RateDiscount createFromParcel(Parcel parcel) {
            return new RateDiscount(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final RateDiscount[] newArray(int i12) {
            return new RateDiscount[i12];
        }
    }

    public RateDiscount(double d12) {
        this.baseRate = d12;
    }

    /* renamed from: c, reason: from getter */
    public final double getBaseRate() {
        return this.baseRate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeDouble(this.baseRate);
    }
}
