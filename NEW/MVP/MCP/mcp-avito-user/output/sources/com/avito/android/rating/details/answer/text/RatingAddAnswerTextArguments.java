package com.avito.android.rating.details.answer.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextArguments;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAddAnswerTextArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingAddAnswerTextArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f246799b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final RatingActionAnswerLengthValidationData f246800c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f246801d;

    /* compiled from: RatingAddAnswerTextArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingAddAnswerTextArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerTextArguments createFromParcel(Parcel parcel) {
            return new RatingAddAnswerTextArguments(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (RatingActionAnswerLengthValidationData) parcel.readParcelable(RatingAddAnswerTextArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerTextArguments[] newArray(int i12) {
            return new RatingAddAnswerTextArguments[i12];
        }
    }

    public RatingAddAnswerTextArguments(@l Long l12, @l RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData, @k String str) {
        this.f246799b = l12;
        this.f246800c = ratingActionAnswerLengthValidationData;
        this.f246801d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAddAnswerTextArguments)) {
            return false;
        }
        RatingAddAnswerTextArguments ratingAddAnswerTextArguments = (RatingAddAnswerTextArguments) obj;
        return L.f(this.f246799b, ratingAddAnswerTextArguments.f246799b) && L.f(this.f246800c, ratingAddAnswerTextArguments.f246800c) && L.f(this.f246801d, ratingAddAnswerTextArguments.f246801d);
    }

    public final int hashCode() {
        Long l12 = this.f246799b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData = this.f246800c;
        return this.f246801d.hashCode() + ((iHashCode + (ratingActionAnswerLengthValidationData != null ? ratingActionAnswerLengthValidationData.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAddAnswerTextArguments(reviewId=");
        sb2.append(this.f246799b);
        sb2.append(", lengthValidation=");
        sb2.append(this.f246800c);
        sb2.append(", operationId=");
        return C22026a.c(sb2, this.f246801d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f246799b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.f246800c, i12);
        parcel.writeString(this.f246801d);
    }
}
