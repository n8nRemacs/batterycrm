package com.avito.android.recommendation_items_loader_impl.deep_linking;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RecommendationItemsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationItemsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class RecommendationItemsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RecommendationItemsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f252279b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f252280c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f252281d;

    /* compiled from: RecommendationItemsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationItemsLink> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationItemsLink createFromParcel(Parcel parcel) {
            return new RecommendationItemsLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationItemsLink[] newArray(int i12) {
            return new RecommendationItemsLink[i12];
        }
    }

    /* compiled from: RecommendationItemsLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationItemsLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f252282b = new b();
    }

    public RecommendationItemsLink(@l String str, @l String str2, @k String str3) {
        this.f252279b = str;
        this.f252280c = str2;
        this.f252281d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationItemsLink)) {
            return false;
        }
        RecommendationItemsLink recommendationItemsLink = (RecommendationItemsLink) obj;
        return L.f(this.f252279b, recommendationItemsLink.f252279b) && L.f(this.f252280c, recommendationItemsLink.f252280c) && L.f(this.f252281d, recommendationItemsLink.f252281d);
    }

    public final int hashCode() {
        String str = this.f252279b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f252280c;
        return this.f252281d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendationItemsLink(title=");
        sb2.append(this.f252279b);
        sb2.append(", subtitle=");
        sb2.append(this.f252280c);
        sb2.append(", payload=");
        return C22026a.c(sb2, this.f252281d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252279b);
        parcel.writeString(this.f252280c);
        parcel.writeString(this.f252281d);
    }
}
