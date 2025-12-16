package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RequestReviewLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/RequestReviewLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RequestReviewLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RequestReviewLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133639b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133640c;

    /* compiled from: RequestReviewLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequestReviewLink> {
        @Override // android.os.Parcelable.Creator
        public final RequestReviewLink createFromParcel(Parcel parcel) {
            return new RequestReviewLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RequestReviewLink[] newArray(int i12) {
            return new RequestReviewLink[i12];
        }
    }

    public RequestReviewLink(@Y61.k String str, @Y61.k String str2) {
        this.f133639b = str;
        this.f133640c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestReviewLink)) {
            return false;
        }
        RequestReviewLink requestReviewLink = (RequestReviewLink) obj;
        return kotlin.jvm.internal.L.f(this.f133639b, requestReviewLink.f133639b) && kotlin.jvm.internal.L.f(this.f133640c, requestReviewLink.f133640c);
    }

    public final int hashCode() {
        return this.f133640c.hashCode() + (this.f133639b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestReviewLink(context=");
        sb2.append(this.f133639b);
        sb2.append(", chatId=");
        return C22026a.c(sb2, this.f133640c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133639b);
        parcel.writeString(this.f133640c);
    }
}
