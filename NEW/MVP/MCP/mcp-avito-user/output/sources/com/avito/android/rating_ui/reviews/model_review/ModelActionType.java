package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseRatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ModelActionType;", "", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ModelActionType implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ModelActionType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final ModelActionType f250140b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ModelActionType[] f250141c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250142d;

    static {
        ModelActionType modelActionType = new ModelActionType("REMOVE_MODEL_REVIEW", 0);
        f250140b = modelActionType;
        ModelActionType[] modelActionTypeArr = {modelActionType};
        f250141c = modelActionTypeArr;
        f250142d = kotlin.enums.c.a(modelActionTypeArr);
        CREATOR = new Parcelable.Creator<ModelActionType>() { // from class: com.avito.android.rating_ui.reviews.model_review.ModelActionType.a
            @Override // android.os.Parcelable.Creator
            public final ModelActionType createFromParcel(Parcel parcel) {
                return ModelActionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModelActionType[] newArray(int i12) {
                return new ModelActionType[i12];
            }
        };
    }

    public ModelActionType() {
        throw null;
    }

    public static ModelActionType valueOf(String str) {
        return (ModelActionType) Enum.valueOf(ModelActionType.class, str);
    }

    public static ModelActionType[] values() {
        return (ModelActionType[]) f250141c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
