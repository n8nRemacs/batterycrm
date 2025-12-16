package com.avito.android.rating.details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.remote.model.FloatingBuyBlock;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsArguments.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsArguments;", "Landroid/os/Parcelable;", "ItemReviews", "PublicProfileRating", "UserRating", "UserReviews", "Lcom/avito/android/rating/details/RatingDetailsArguments$ItemReviews;", "Lcom/avito/android/rating/details/RatingDetailsArguments$PublicProfileRating;", "Lcom/avito/android/rating/details/RatingDetailsArguments$UserRating;", "Lcom/avito/android/rating/details/RatingDetailsArguments$UserReviews;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class RatingDetailsArguments implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f246408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ReviewsOpenPageFrom f246409c;

    /* compiled from: RatingDetailsArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsArguments$ItemReviews;", "Lcom/avito/android/rating/details/RatingDetailsArguments;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemReviews extends RatingDetailsArguments {

        @Y61.k
        public static final Parcelable.Creator<ItemReviews> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f246410d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ReviewsOpenPageFrom f246411e;

        /* renamed from: f, reason: collision with root package name */
        public final long f246412f;

        /* compiled from: RatingDetailsArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemReviews> {
            @Override // android.os.Parcelable.Creator
            public final ItemReviews createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                return new ItemReviews(parcel.readLong(), (ReviewsOpenPageFrom) parcel.readParcelable(ItemReviews.class.getClassLoader()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final ItemReviews[] newArray(int i12) {
                return new ItemReviews[i12];
            }
        }

        public /* synthetic */ ItemReviews(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, long j12, int i12, C42822w c42822w) {
            this(j12, reviewsOpenPageFrom, (i12 & 1) != 0 ? null : str);
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF246408b() {
            return this.f246410d;
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final ReviewsOpenPageFrom getF246409c() {
            return this.f246411e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemReviews)) {
                return false;
            }
            ItemReviews itemReviews = (ItemReviews) obj;
            return L.f(this.f246410d, itemReviews.f246410d) && L.f(this.f246411e, itemReviews.f246411e) && this.f246412f == itemReviews.f246412f;
        }

        public final int hashCode() {
            String str = this.f246410d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ReviewsOpenPageFrom reviewsOpenPageFrom = this.f246411e;
            return Long.hashCode(this.f246412f) + ((iHashCode + (reviewsOpenPageFrom != null ? reviewsOpenPageFrom.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemReviews(contextId=");
            sb2.append(this.f246410d);
            sb2.append(", pageFrom=");
            sb2.append(this.f246411e);
            sb2.append(", itemId=");
            return androidx.appcompat.app.r.u(sb2, this.f246412f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f246410d);
            parcel.writeParcelable(this.f246411e, i12);
            parcel.writeLong(this.f246412f);
        }

        public ItemReviews(long j12, @Y61.l ReviewsOpenPageFrom reviewsOpenPageFrom, @Y61.l String str) {
            super(str, reviewsOpenPageFrom, null);
            this.f246410d = str;
            this.f246411e = reviewsOpenPageFrom;
            this.f246412f = j12;
        }
    }

    /* compiled from: RatingDetailsArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsArguments$PublicProfileRating;", "Lcom/avito/android/rating/details/RatingDetailsArguments;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PublicProfileRating extends RatingDetailsArguments {

        @Y61.k
        public static final Parcelable.Creator<PublicProfileRating> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f246413d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ReviewsOpenPageFrom f246414e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f246415f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f246416g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Long f246417h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final FloatingBuyBlock f246418i;

        /* compiled from: RatingDetailsArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PublicProfileRating> {
            @Override // android.os.Parcelable.Creator
            public final PublicProfileRating createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                return new PublicProfileRating((ReviewsOpenPageFrom) parcel.readParcelable(PublicProfileRating.class.getClassLoader()), (FloatingBuyBlock) parcel.readParcelable(PublicProfileRating.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), string, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PublicProfileRating[] newArray(int i12) {
                return new PublicProfileRating[i12];
            }
        }

        public /* synthetic */ PublicProfileRating(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, String str2, String str3, Long l12, FloatingBuyBlock floatingBuyBlock, int i12, C42822w c42822w) {
            this(reviewsOpenPageFrom, (i12 & 32) != 0 ? null : floatingBuyBlock, l12, (i12 & 1) != 0 ? null : str, str2, str3);
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF246408b() {
            return this.f246413d;
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final ReviewsOpenPageFrom getF246409c() {
            return this.f246414e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PublicProfileRating)) {
                return false;
            }
            PublicProfileRating publicProfileRating = (PublicProfileRating) obj;
            return L.f(this.f246413d, publicProfileRating.f246413d) && L.f(this.f246414e, publicProfileRating.f246414e) && L.f(this.f246415f, publicProfileRating.f246415f) && L.f(this.f246416g, publicProfileRating.f246416g) && L.f(this.f246417h, publicProfileRating.f246417h) && L.f(this.f246418i, publicProfileRating.f246418i);
        }

        public final int hashCode() {
            String str = this.f246413d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ReviewsOpenPageFrom reviewsOpenPageFrom = this.f246414e;
            int iD2 = H.d((iHashCode + (reviewsOpenPageFrom == null ? 0 : reviewsOpenPageFrom.hashCode())) * 31, 31, this.f246415f);
            String str2 = this.f246416g;
            int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l12 = this.f246417h;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            FloatingBuyBlock floatingBuyBlock = this.f246418i;
            return iHashCode3 + (floatingBuyBlock != null ? floatingBuyBlock.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "PublicProfileRating(contextId=" + this.f246413d + ", pageFrom=" + this.f246414e + ", userKey=" + this.f246415f + ", srcRole=" + this.f246416g + ", fromItem=" + this.f246417h + ", floatingBuyBlock=" + this.f246418i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f246413d);
            parcel.writeParcelable(this.f246414e, i12);
            parcel.writeString(this.f246415f);
            parcel.writeString(this.f246416g);
            Long l12 = this.f246417h;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.f246418i, i12);
        }

        public PublicProfileRating(@Y61.l ReviewsOpenPageFrom reviewsOpenPageFrom, @Y61.l FloatingBuyBlock floatingBuyBlock, @Y61.l Long l12, @Y61.l String str, @Y61.k String str2, @Y61.l String str3) {
            super(str, reviewsOpenPageFrom, null);
            this.f246413d = str;
            this.f246414e = reviewsOpenPageFrom;
            this.f246415f = str2;
            this.f246416g = str3;
            this.f246417h = l12;
            this.f246418i = floatingBuyBlock;
        }
    }

    /* compiled from: RatingDetailsArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsArguments$UserRating;", "Lcom/avito/android/rating/details/RatingDetailsArguments;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserRating extends RatingDetailsArguments {

        @Y61.k
        public static final Parcelable.Creator<UserRating> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f246419d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ReviewsOpenPageFrom f246420e;

        /* compiled from: RatingDetailsArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserRating> {
            @Override // android.os.Parcelable.Creator
            public final UserRating createFromParcel(Parcel parcel) {
                return new UserRating(parcel.readString(), (ReviewsOpenPageFrom) parcel.readParcelable(UserRating.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UserRating[] newArray(int i12) {
                return new UserRating[i12];
            }
        }

        public /* synthetic */ UserRating(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, reviewsOpenPageFrom);
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF246408b() {
            return this.f246419d;
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final ReviewsOpenPageFrom getF246409c() {
            return this.f246420e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserRating)) {
                return false;
            }
            UserRating userRating = (UserRating) obj;
            return L.f(this.f246419d, userRating.f246419d) && L.f(this.f246420e, userRating.f246420e);
        }

        public final int hashCode() {
            String str = this.f246419d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ReviewsOpenPageFrom reviewsOpenPageFrom = this.f246420e;
            return iHashCode + (reviewsOpenPageFrom != null ? reviewsOpenPageFrom.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "UserRating(contextId=" + this.f246419d + ", pageFrom=" + this.f246420e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f246419d);
            parcel.writeParcelable(this.f246420e, i12);
        }

        public UserRating(@Y61.l String str, @Y61.l ReviewsOpenPageFrom reviewsOpenPageFrom) {
            super(str, reviewsOpenPageFrom, null);
            this.f246419d = str;
            this.f246420e = reviewsOpenPageFrom;
        }
    }

    /* compiled from: RatingDetailsArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsArguments$UserReviews;", "Lcom/avito/android/rating/details/RatingDetailsArguments;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserReviews extends RatingDetailsArguments {

        @Y61.k
        public static final Parcelable.Creator<UserReviews> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f246421d;

        /* compiled from: RatingDetailsArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserReviews> {
            @Override // android.os.Parcelable.Creator
            public final UserReviews createFromParcel(Parcel parcel) {
                return new UserReviews(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserReviews[] newArray(int i12) {
                return new UserReviews[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserReviews() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.rating.details.RatingDetailsArguments
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF246408b() {
            return this.f246421d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserReviews) && L.f(this.f246421d, ((UserReviews) obj).f246421d);
        }

        public final int hashCode() {
            String str = this.f246421d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UserReviews(contextId="), this.f246421d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f246421d);
        }

        public /* synthetic */ UserReviews(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }

        public UserReviews(@Y61.l String str) {
            super(str, null, null);
            this.f246421d = str;
        }
    }

    public RatingDetailsArguments(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, C42822w c42822w) {
        this.f246408b = str;
        this.f246409c = reviewsOpenPageFrom;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public String getF246408b() {
        return this.f246408b;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public ReviewsOpenPageFrom getF246409c() {
        return this.f246409c;
    }
}
