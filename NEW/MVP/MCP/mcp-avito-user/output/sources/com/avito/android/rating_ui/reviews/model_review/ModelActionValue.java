package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BaseRatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ModelActionValue;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ModelActionValue implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ModelActionValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ModelActionParams f250144c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f250145d;

    /* compiled from: BaseRatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelActionValue> {
        @Override // android.os.Parcelable.Creator
        public final ModelActionValue createFromParcel(Parcel parcel) {
            return new ModelActionValue(parcel.readString(), ModelActionParams.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelActionValue[] newArray(int i12) {
            return new ModelActionValue[i12];
        }
    }

    public ModelActionValue(@Y61.k String str, @Y61.k ModelActionParams modelActionParams, @Y61.k String str2) {
        this.f250143b = str;
        this.f250144c = modelActionParams;
        this.f250145d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelActionValue)) {
            return false;
        }
        ModelActionValue modelActionValue = (ModelActionValue) obj;
        return L.f(this.f250143b, modelActionValue.f250143b) && L.f(this.f250144c, modelActionValue.f250144c) && L.f(this.f250145d, modelActionValue.f250145d);
    }

    public final int hashCode() {
        return this.f250145d.hashCode() + ((this.f250144c.hashCode() + (this.f250143b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelActionValue(title=");
        sb2.append(this.f250143b);
        sb2.append(", params=");
        sb2.append(this.f250144c);
        sb2.append(", requestUrl=");
        return C22026a.c(sb2, this.f250145d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f250143b);
        this.f250144c.writeToParcel(parcel, i12);
        parcel.writeString(this.f250145d);
    }
}
