package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BaseRatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ModelActionParams;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ModelActionParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ModelActionParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f250139b;

    /* compiled from: BaseRatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelActionParams> {
        @Override // android.os.Parcelable.Creator
        public final ModelActionParams createFromParcel(Parcel parcel) {
            return new ModelActionParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ModelActionParams[] newArray(int i12) {
            return new ModelActionParams[i12];
        }
    }

    public ModelActionParams(@Y61.l Integer num) {
        this.f250139b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModelActionParams) && L.f(this.f250139b, ((ModelActionParams) obj).f250139b);
    }

    public final int hashCode() {
        Integer num = this.f250139b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Y61.k
    public final String toString() {
        return s.j(new StringBuilder("ModelActionParams(reviewId="), this.f250139b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f250139b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
