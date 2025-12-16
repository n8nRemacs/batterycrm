package com.avito.android.gig_apply.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigSlotOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigSlotOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GigSlotOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159882b;

    /* compiled from: GigSlotOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSlotOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigSlotOpenParams createFromParcel(Parcel parcel) {
            return new GigSlotOpenParams(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GigSlotOpenParams[] newArray(int i12) {
            return new GigSlotOpenParams[i12];
        }
    }

    public GigSlotOpenParams(long j12) {
        this.f159882b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f159882b);
    }
}
