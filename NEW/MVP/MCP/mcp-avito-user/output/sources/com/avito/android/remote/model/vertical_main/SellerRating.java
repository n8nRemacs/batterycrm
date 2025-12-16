package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: SellersCarouselWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SellerRating;", "Landroid/os/Parcelable;", "", "scoreFloat", "", "reviews", "<init>", "(FI)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getScoreFloat", "()F", "I", "getReviews", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerRating implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerRating> CREATOR = new Creator();
    private final int reviews;
    private final float scoreFloat;

    /* compiled from: SellersCarouselWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerRating> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerRating createFromParcel(@k Parcel parcel) {
            return new SellerRating(parcel.readFloat(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerRating[] newArray(int i12) {
            return new SellerRating[i12];
        }
    }

    public SellerRating(float f12, int i12) {
        this.scoreFloat = f12;
        this.reviews = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getReviews() {
        return this.reviews;
    }

    public final float getScoreFloat() {
        return this.scoreFloat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeFloat(this.scoreFloat);
        parcel.writeInt(this.reviews);
    }
}
