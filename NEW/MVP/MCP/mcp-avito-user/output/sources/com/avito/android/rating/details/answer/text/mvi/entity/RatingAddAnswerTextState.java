package com.avito.android.rating.details.answer.text.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAddAnswerTextState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingAddAnswerTextState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatingAddAnswerTextValidationInteractor.ValidationTextResult f246884c;

    /* compiled from: RatingAddAnswerTextState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingAddAnswerTextState> {
        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerTextState createFromParcel(Parcel parcel) {
            return new RatingAddAnswerTextState(parcel.readString(), (RatingAddAnswerTextValidationInteractor.ValidationTextResult) parcel.readParcelable(RatingAddAnswerTextState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerTextState[] newArray(int i12) {
            return new RatingAddAnswerTextState[i12];
        }
    }

    public RatingAddAnswerTextState(@k String str, @k RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult) {
        this.f246883b = str;
        this.f246884c = validationTextResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAddAnswerTextState)) {
            return false;
        }
        RatingAddAnswerTextState ratingAddAnswerTextState = (RatingAddAnswerTextState) obj;
        return L.f(this.f246883b, ratingAddAnswerTextState.f246883b) && L.f(this.f246884c, ratingAddAnswerTextState.f246884c);
    }

    public final int hashCode() {
        return this.f246884c.hashCode() + (this.f246883b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "RatingAddAnswerTextState(text=" + this.f246883b + ", validationTextResult=" + this.f246884c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246883b);
        parcel.writeParcelable(this.f246884c, i12);
    }
}
