package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BaseRatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/Author;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Author implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Author> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f250136c;

    /* compiled from: BaseRatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Author> {
        @Override // android.os.Parcelable.Creator
        public final Author createFromParcel(Parcel parcel) {
            return new Author(parcel.readString(), (Image) parcel.readParcelable(Author.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Author[] newArray(int i12) {
            return new Author[i12];
        }
    }

    public Author(@Y61.k String str, @Y61.l Image image) {
        this.f250135b = str;
        this.f250136c = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return L.f(this.f250135b, author.f250135b) && L.f(this.f250136c, author.f250136c);
    }

    public final int hashCode() {
        int iHashCode = this.f250135b.hashCode() * 31;
        Image image = this.f250136c;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Author(title=");
        sb2.append(this.f250135b);
        sb2.append(", avatar=");
        return AK.c.o(sb2, this.f250136c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f250135b);
        parcel.writeParcelable(this.f250136c, i12);
    }
}
