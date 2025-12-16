package com.avito.android.rating.details.text_sheet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TextSheetArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/TextSheetArguments;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextSheetArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<TextSheetArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f247524b;

    /* compiled from: TextSheetArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextSheetArguments> {
        @Override // android.os.Parcelable.Creator
        public final TextSheetArguments createFromParcel(Parcel parcel) {
            return new TextSheetArguments((BaseRatingReviewItem.ReviewAction.ReviewActionValue) parcel.readParcelable(TextSheetArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextSheetArguments[] newArray(int i12) {
            return new TextSheetArguments[i12];
        }
    }

    public TextSheetArguments(@k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
        this.f247524b = reviewActionValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextSheetArguments) && L.f(this.f247524b, ((TextSheetArguments) obj).f247524b);
    }

    public final int hashCode() {
        return this.f247524b.hashCode();
    }

    @k
    public final String toString() {
        return "TextSheetArguments(reviewActionValue=" + this.f247524b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f247524b, i12);
    }
}
