package com.avito.android.ratings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/ReviewData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReviewData implements Parcelable {

    @k
    public static final Parcelable.Creator<ReviewData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f250506b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ReviewReply f250507c;

    /* compiled from: ReviewData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReviewData> {
        @Override // android.os.Parcelable.Creator
        public final ReviewData createFromParcel(Parcel parcel) {
            return new ReviewData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? ReviewReply.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewData[] newArray(int i12) {
            return new ReviewData[i12];
        }
    }

    public ReviewData(@l Long l12, @l ReviewReply reviewReply) {
        this.f250506b = l12;
        this.f250507c = reviewReply;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewData)) {
            return false;
        }
        ReviewData reviewData = (ReviewData) obj;
        return L.f(this.f250506b, reviewData.f250506b) && L.f(this.f250507c, reviewData.f250507c);
    }

    public final int hashCode() {
        Long l12 = this.f250506b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        ReviewReply reviewReply = this.f250507c;
        return iHashCode + (reviewReply != null ? reviewReply.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ReviewData(reviewId=" + this.f250506b + ", reply=" + this.f250507c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f250506b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        ReviewReply reviewReply = this.f250507c;
        if (reviewReply == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewReply.writeToParcel(parcel, i12);
        }
    }
}
