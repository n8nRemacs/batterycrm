package ru.avito.component.serp.rating_and_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAndReviews.kt */
@d
@InterfaceC41177b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/component/serp/rating_and_reviews/RatingAndReviews;", "Landroid/os/Parcelable;", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RatingAndReviews implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f430541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RatingAndReviewsColors f430542d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f430539e = new a(null);

    @k
    public static final Parcelable.Creator<RatingAndReviews> CREATOR = new b();

    /* compiled from: RatingAndReviews.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/serp/rating_and_reviews/RatingAndReviews$a;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingAndReviews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RatingAndReviews> {
        @Override // android.os.Parcelable.Creator
        public final RatingAndReviews createFromParcel(Parcel parcel) {
            return new RatingAndReviews(parcel.readString(), parcel.readString(), RatingAndReviewsColors.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAndReviews[] newArray(int i12) {
            return new RatingAndReviews[i12];
        }
    }

    public RatingAndReviews(@k String str, @k String str2, @k RatingAndReviewsColors ratingAndReviewsColors) {
        this.f430540b = str;
        this.f430541c = str2;
        this.f430542d = ratingAndReviewsColors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAndReviews)) {
            return false;
        }
        RatingAndReviews ratingAndReviews = (RatingAndReviews) obj;
        return L.f(this.f430540b, ratingAndReviews.f430540b) && L.f(this.f430541c, ratingAndReviews.f430541c) && this.f430542d == ratingAndReviews.f430542d;
    }

    public final int hashCode() {
        return this.f430542d.hashCode() + H.d(this.f430540b.hashCode() * 31, 31, this.f430541c);
    }

    @k
    public final String toString() {
        return "RatingAndReviews(ratingText=" + this.f430540b + ", reviewsText=" + this.f430541c + ", colors=" + this.f430542d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430540b);
        parcel.writeString(this.f430541c);
        this.f430542d.writeToParcel(parcel, i12);
    }
}
