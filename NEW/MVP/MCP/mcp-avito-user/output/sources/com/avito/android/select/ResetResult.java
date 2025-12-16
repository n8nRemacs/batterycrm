package com.avito.android.select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ResetResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/ResetResult;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResetResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ResetResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264968b;

    /* compiled from: ResetResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResetResult> {
        @Override // android.os.Parcelable.Creator
        public final ResetResult createFromParcel(Parcel parcel) {
            return new ResetResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ResetResult[] newArray(int i12) {
            return new ResetResult[i12];
        }
    }

    public ResetResult(@Y61.k String str) {
        this.f264968b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264968b);
    }
}
