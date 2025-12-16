package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BaseRatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ModelAction;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ModelAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ModelAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ModelActionType f250137b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ModelActionValue f250138c;

    /* compiled from: BaseRatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelAction> {
        @Override // android.os.Parcelable.Creator
        public final ModelAction createFromParcel(Parcel parcel) {
            return new ModelAction(parcel.readInt() == 0 ? null : ModelActionType.CREATOR.createFromParcel(parcel), ModelActionValue.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ModelAction[] newArray(int i12) {
            return new ModelAction[i12];
        }
    }

    public ModelAction(@Y61.l ModelActionType modelActionType, @Y61.k ModelActionValue modelActionValue) {
        this.f250137b = modelActionType;
        this.f250138c = modelActionValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelAction)) {
            return false;
        }
        ModelAction modelAction = (ModelAction) obj;
        return this.f250137b == modelAction.f250137b && L.f(this.f250138c, modelAction.f250138c);
    }

    public final int hashCode() {
        ModelActionType modelActionType = this.f250137b;
        return this.f250138c.hashCode() + ((modelActionType == null ? 0 : modelActionType.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ModelAction(type=" + this.f250137b + ", value=" + this.f250138c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        ModelActionType modelActionType = this.f250137b;
        if (modelActionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            modelActionType.writeToParcel(parcel, i12);
        }
        this.f250138c.writeToParcel(parcel, i12);
    }
}
