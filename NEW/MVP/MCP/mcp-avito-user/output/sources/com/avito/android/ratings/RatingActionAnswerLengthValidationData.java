package com.avito.android.ratings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: RatingActionAnswerLengthValidationData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/RatingActionAnswerLengthValidationData;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingActionAnswerLengthValidationData implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingActionAnswerLengthValidationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f250504b;

    /* renamed from: c, reason: collision with root package name */
    public final int f250505c;

    /* compiled from: RatingActionAnswerLengthValidationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingActionAnswerLengthValidationData> {
        @Override // android.os.Parcelable.Creator
        public final RatingActionAnswerLengthValidationData createFromParcel(Parcel parcel) {
            return new RatingActionAnswerLengthValidationData(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingActionAnswerLengthValidationData[] newArray(int i12) {
            return new RatingActionAnswerLengthValidationData[i12];
        }
    }

    public RatingActionAnswerLengthValidationData(int i12, int i13) {
        this.f250504b = i12;
        this.f250505c = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingActionAnswerLengthValidationData)) {
            return false;
        }
        RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData = (RatingActionAnswerLengthValidationData) obj;
        return this.f250504b == ratingActionAnswerLengthValidationData.f250504b && this.f250505c == ratingActionAnswerLengthValidationData.f250505c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250505c) + (Integer.hashCode(this.f250504b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingActionAnswerLengthValidationData(min=");
        sb2.append(this.f250504b);
        sb2.append(", max=");
        return r.t(sb2, this.f250505c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f250504b);
        parcel.writeInt(this.f250505c);
    }
}
