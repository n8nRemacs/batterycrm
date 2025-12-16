package com.avito.android.rating.details.answer.photo;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerPhotoArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/RatingAddAnswerPhotoArguments;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAddAnswerPhotoArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingAddAnswerPhotoArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f246620b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f246621c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f246622d;

    /* compiled from: RatingAddAnswerPhotoArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingAddAnswerPhotoArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerPhotoArguments createFromParcel(Parcel parcel) {
            return new RatingAddAnswerPhotoArguments(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerPhotoArguments[] newArray(int i12) {
            return new RatingAddAnswerPhotoArguments[i12];
        }
    }

    public RatingAddAnswerPhotoArguments(@l Long l12, @k String str, @k String str2) {
        this.f246620b = l12;
        this.f246621c = str;
        this.f246622d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAddAnswerPhotoArguments)) {
            return false;
        }
        RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = (RatingAddAnswerPhotoArguments) obj;
        return L.f(this.f246620b, ratingAddAnswerPhotoArguments.f246620b) && L.f(this.f246621c, ratingAddAnswerPhotoArguments.f246621c) && L.f(this.f246622d, ratingAddAnswerPhotoArguments.f246622d);
    }

    public final int hashCode() {
        Long l12 = this.f246620b;
        return this.f246622d.hashCode() + H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f246621c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAddAnswerPhotoArguments(reviewId=");
        sb2.append(this.f246620b);
        sb2.append(", answerText=");
        sb2.append(this.f246621c);
        sb2.append(", operationId=");
        return C22026a.c(sb2, this.f246622d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f246620b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f246621c);
        parcel.writeString(this.f246622d);
    }
}
