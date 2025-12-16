package com.avito.android.rating.details.answer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/RatingAddAnswerArguments;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAddAnswerArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingAddAnswerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f246592b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final RatingActionAnswerLengthValidationData f246593c;

    /* compiled from: RatingAddAnswerArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingAddAnswerArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerArguments createFromParcel(Parcel parcel) {
            return new RatingAddAnswerArguments(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (RatingActionAnswerLengthValidationData) parcel.readParcelable(RatingAddAnswerArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerArguments[] newArray(int i12) {
            return new RatingAddAnswerArguments[i12];
        }
    }

    public RatingAddAnswerArguments(@l Long l12, @l RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData) {
        this.f246592b = l12;
        this.f246593c = ratingActionAnswerLengthValidationData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAddAnswerArguments)) {
            return false;
        }
        RatingAddAnswerArguments ratingAddAnswerArguments = (RatingAddAnswerArguments) obj;
        return L.f(this.f246592b, ratingAddAnswerArguments.f246592b) && L.f(this.f246593c, ratingAddAnswerArguments.f246593c);
    }

    public final int hashCode() {
        Long l12 = this.f246592b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData = this.f246593c;
        return iHashCode + (ratingActionAnswerLengthValidationData != null ? ratingActionAnswerLengthValidationData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RatingAddAnswerArguments(reviewId=" + this.f246592b + ", answerLengthValidation=" + this.f246593c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f246592b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.f246593c, i12);
    }
}
