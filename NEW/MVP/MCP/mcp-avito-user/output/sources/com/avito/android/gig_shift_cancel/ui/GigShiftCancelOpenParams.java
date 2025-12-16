package com.avito.android.gig_shift_cancel.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigShiftCancelOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/ui/GigShiftCancelOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftCancelOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<GigShiftCancelOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f160729b;

    /* compiled from: GigShiftCancelOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftCancelOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftCancelOpenParams createFromParcel(Parcel parcel) {
            return new GigShiftCancelOpenParams(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftCancelOpenParams[] newArray(int i12) {
            return new GigShiftCancelOpenParams[i12];
        }
    }

    public GigShiftCancelOpenParams(long j12) {
        this.f160729b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f160729b);
    }
}
