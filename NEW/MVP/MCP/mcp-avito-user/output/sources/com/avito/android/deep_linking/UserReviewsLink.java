package com.avito.android.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: UserReviewsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/UserReviewsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UserReviewsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UserReviewsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f132878b;

    /* compiled from: UserReviewsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserReviewsLink> {
        @Override // android.os.Parcelable.Creator
        public final UserReviewsLink createFromParcel(Parcel parcel) {
            return new UserReviewsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserReviewsLink[] newArray(int i12) {
            return new UserReviewsLink[i12];
        }
    }

    public UserReviewsLink(@Y61.l String str) {
        this.f132878b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserReviewsLink) && kotlin.jvm.internal.L.f(this.f132878b, ((UserReviewsLink) obj).f132878b);
    }

    public final int hashCode() {
        String str = this.f132878b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("UserReviewsLink(context="), this.f132878b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132878b);
    }
}
