package com.avito.android.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RetrySellerSubscriptionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/RetrySellerSubscriptionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class RetrySellerSubscriptionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RetrySellerSubscriptionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f132868b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132869c;

    /* compiled from: RetrySellerSubscriptionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetrySellerSubscriptionLink> {
        @Override // android.os.Parcelable.Creator
        public final RetrySellerSubscriptionLink createFromParcel(Parcel parcel) {
            return new RetrySellerSubscriptionLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RetrySellerSubscriptionLink[] newArray(int i12) {
            return new RetrySellerSubscriptionLink[i12];
        }
    }

    /* compiled from: RetrySellerSubscriptionLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/RetrySellerSubscriptionLink$b;", "LJu/c$b;", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f132870b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f132871c;

        public b(@Y61.l String str, @Y61.l String str2) {
            this.f132870b = str;
            this.f132871c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f132870b, bVar.f132870b) && kotlin.jvm.internal.L.f(this.f132871c, bVar.f132871c);
        }

        public final int hashCode() {
            String str = this.f132870b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f132871c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TriggerSubscription(hash=");
            sb2.append(this.f132870b);
            sb2.append(", src=");
            return C22026a.c(sb2, this.f132871c, ')');
        }
    }

    public RetrySellerSubscriptionLink(@Y61.l String str, @Y61.l String str2) {
        this.f132868b = str;
        this.f132869c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132868b);
        parcel.writeString(this.f132869c);
    }
}
