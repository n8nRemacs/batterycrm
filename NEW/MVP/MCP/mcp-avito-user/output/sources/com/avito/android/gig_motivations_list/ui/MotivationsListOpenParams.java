package com.avito.android.gig_motivations_list.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: MotivationsListOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_motivations_list/ui/MotivationsListOpenParams;", "Lcom/avito/android/util/OpenParams;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MotivationsListOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<MotivationsListOpenParams> CREATOR = new a();

    /* compiled from: MotivationsListOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationsListOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final MotivationsListOpenParams createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new MotivationsListOpenParams();
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationsListOpenParams[] newArray(int i12) {
            return new MotivationsListOpenParams[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
