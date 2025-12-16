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

/* compiled from: RecommendationBlocksLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationBlocksLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class RecommendationBlocksLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RecommendationBlocksLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252276b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f252277c;

    /* compiled from: RecommendationBlocksLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationBlocksLink> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationBlocksLink createFromParcel(Parcel parcel) {
            return new RecommendationBlocksLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationBlocksLink[] newArray(int i12) {
            return new RecommendationBlocksLink[i12];
        }
    }

    /* compiled from: RecommendationBlocksLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/deep_linking/RecommendationBlocksLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f252278b = new b();
    }

    public RecommendationBlocksLink(@k String str, @l String str2) {
        this.f252276b = str;
        this.f252277c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationBlocksLink)) {
            return false;
        }
        RecommendationBlocksLink recommendationBlocksLink = (RecommendationBlocksLink) obj;
        return L.f(this.f252276b, recommendationBlocksLink.f252276b) && L.f(this.f252277c, recommendationBlocksLink.f252277c);
    }

    public final int hashCode() {
        int iHashCode = this.f252276b.hashCode() * 31;
        String str = this.f252277c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendationBlocksLink(payload=");
        sb2.append(this.f252276b);
        sb2.append(", additional=");
        return C22026a.c(sb2, this.f252277c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252276b);
        parcel.writeString(this.f252277c);
    }
}
