package com.avito.android.rating_ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: RatingItemsMarginHorizontal.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal;", "Landroid/os/Parcelable;", "MarginLarge", "MarginNormal", "Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal$MarginLarge;", "Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal$MarginNormal;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingItemsMarginHorizontal extends Parcelable {

    /* compiled from: RatingItemsMarginHorizontal.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal$MarginLarge;", "Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal;", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarginLarge implements RatingItemsMarginHorizontal {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MarginLarge f249853b = new MarginLarge();

        @k
        public static final Parcelable.Creator<MarginLarge> CREATOR = new a();

        /* compiled from: RatingItemsMarginHorizontal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MarginLarge> {
            @Override // android.os.Parcelable.Creator
            public final MarginLarge createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MarginLarge.f249853b;
            }

            @Override // android.os.Parcelable.Creator
            public final MarginLarge[] newArray(int i12) {
                return new MarginLarge[i12];
            }
        }

        @Override // com.avito.android.rating_ui.RatingItemsMarginHorizontal
        public final int H0() {
            return R.dimen.vertical_content_horizontal_padding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof MarginLarge);
        }

        public final int hashCode() {
            return 1164145585;
        }

        @k
        public final String toString() {
            return "MarginLarge";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: RatingItemsMarginHorizontal.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal$MarginNormal;", "Lcom/avito/android/rating_ui/RatingItemsMarginHorizontal;", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarginNormal implements RatingItemsMarginHorizontal {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MarginNormal f249854b = new MarginNormal();

        @k
        public static final Parcelable.Creator<MarginNormal> CREATOR = new a();

        /* compiled from: RatingItemsMarginHorizontal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MarginNormal> {
            @Override // android.os.Parcelable.Creator
            public final MarginNormal createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MarginNormal.f249854b;
            }

            @Override // android.os.Parcelable.Creator
            public final MarginNormal[] newArray(int i12) {
                return new MarginNormal[i12];
            }
        }

        @Override // com.avito.android.rating_ui.RatingItemsMarginHorizontal
        public final int H0() {
            return R.dimen.content_horizontal_padding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof MarginNormal);
        }

        public final int hashCode() {
            return 1798968113;
        }

        @k
        public final String toString() {
            return "MarginNormal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: RatingItemsMarginHorizontal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    int H0();
}
