package ru.avito.component.serp.rating_and_reviews;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RatingAndReviewsColors.kt */
@InterfaceC41178c
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/component/serp/rating_and_reviews/RatingAndReviewsColors;", "", "Landroid/os/Parcelable;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RatingAndReviewsColors implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingAndReviewsColors> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final RatingAndReviewsColors f430543b;

    /* renamed from: c, reason: collision with root package name */
    public static final RatingAndReviewsColors f430544c;

    /* renamed from: d, reason: collision with root package name */
    public static final RatingAndReviewsColors f430545d;

    /* renamed from: e, reason: collision with root package name */
    public static final RatingAndReviewsColors f430546e;

    /* renamed from: f, reason: collision with root package name */
    public static final RatingAndReviewsColors f430547f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ RatingAndReviewsColors[] f430548g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f430549h;

    static {
        RatingAndReviewsColors ratingAndReviewsColors = new RatingAndReviewsColors("GREEN", 0);
        f430543b = ratingAndReviewsColors;
        RatingAndReviewsColors ratingAndReviewsColors2 = new RatingAndReviewsColors("LIME", 1);
        f430544c = ratingAndReviewsColors2;
        RatingAndReviewsColors ratingAndReviewsColors3 = new RatingAndReviewsColors("ORANGE", 2);
        f430545d = ratingAndReviewsColors3;
        RatingAndReviewsColors ratingAndReviewsColors4 = new RatingAndReviewsColors("RED", 3);
        f430546e = ratingAndReviewsColors4;
        RatingAndReviewsColors ratingAndReviewsColors5 = new RatingAndReviewsColors("GRAY", 4);
        f430547f = ratingAndReviewsColors5;
        RatingAndReviewsColors[] ratingAndReviewsColorsArr = {ratingAndReviewsColors, ratingAndReviewsColors2, ratingAndReviewsColors3, ratingAndReviewsColors4, ratingAndReviewsColors5};
        f430548g = ratingAndReviewsColorsArr;
        f430549h = c.a(ratingAndReviewsColorsArr);
        CREATOR = new Parcelable.Creator<RatingAndReviewsColors>() { // from class: ru.avito.component.serp.rating_and_reviews.RatingAndReviewsColors.a
            @Override // android.os.Parcelable.Creator
            public final RatingAndReviewsColors createFromParcel(Parcel parcel) {
                return RatingAndReviewsColors.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RatingAndReviewsColors[] newArray(int i12) {
                return new RatingAndReviewsColors[i12];
            }
        };
    }

    public RatingAndReviewsColors() {
        throw null;
    }

    public static RatingAndReviewsColors valueOf(String str) {
        return (RatingAndReviewsColors) Enum.valueOf(RatingAndReviewsColors.class, str);
    }

    public static RatingAndReviewsColors[] values() {
        return (RatingAndReviewsColors[]) f430548g.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
