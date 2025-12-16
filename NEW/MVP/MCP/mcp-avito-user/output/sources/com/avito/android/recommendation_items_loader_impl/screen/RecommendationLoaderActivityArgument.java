package com.avito.android.recommendation_items_loader_impl.screen;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.AnalyticParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationLoaderActivityArgument.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument;", "Landroid/os/Parcelable;", "RecommendationBlocksLoaderArgument", "RecommendationItemsLoaderArgument", "Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument$RecommendationBlocksLoaderArgument;", "Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument$RecommendationItemsLoaderArgument;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RecommendationLoaderActivityArgument extends Parcelable {

    /* compiled from: RecommendationLoaderActivityArgument.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument$RecommendationBlocksLoaderArgument;", "Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecommendationBlocksLoaderArgument implements RecommendationLoaderActivityArgument {

        @k
        public static final Parcelable.Creator<RecommendationBlocksLoaderArgument> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252299b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f252300c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AnalyticParams f252301d;

        /* compiled from: RecommendationLoaderActivityArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RecommendationBlocksLoaderArgument> {
            @Override // android.os.Parcelable.Creator
            public final RecommendationBlocksLoaderArgument createFromParcel(Parcel parcel) {
                return new RecommendationBlocksLoaderArgument(parcel.readString(), parcel.readString(), (AnalyticParams) parcel.readParcelable(RecommendationBlocksLoaderArgument.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RecommendationBlocksLoaderArgument[] newArray(int i12) {
                return new RecommendationBlocksLoaderArgument[i12];
            }
        }

        public RecommendationBlocksLoaderArgument(@k String str, @l String str2, @l AnalyticParams analyticParams) {
            this.f252299b = str;
            this.f252300c = str2;
            this.f252301d = analyticParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendationBlocksLoaderArgument)) {
                return false;
            }
            RecommendationBlocksLoaderArgument recommendationBlocksLoaderArgument = (RecommendationBlocksLoaderArgument) obj;
            return L.f(this.f252299b, recommendationBlocksLoaderArgument.f252299b) && L.f(this.f252300c, recommendationBlocksLoaderArgument.f252300c) && L.f(this.f252301d, recommendationBlocksLoaderArgument.f252301d);
        }

        public final int hashCode() {
            int iHashCode = this.f252299b.hashCode() * 31;
            String str = this.f252300c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AnalyticParams analyticParams = this.f252301d;
            return iHashCode2 + (analyticParams != null ? analyticParams.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "RecommendationBlocksLoaderArgument(payload=" + this.f252299b + ", additional=" + this.f252300c + ", analyticParams=" + this.f252301d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f252299b);
            parcel.writeString(this.f252300c);
            parcel.writeParcelable(this.f252301d, i12);
        }
    }

    /* compiled from: RecommendationLoaderActivityArgument.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument$RecommendationItemsLoaderArgument;", "Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivityArgument;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecommendationItemsLoaderArgument implements RecommendationLoaderActivityArgument {

        @k
        public static final Parcelable.Creator<RecommendationItemsLoaderArgument> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f252302b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f252303c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f252304d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AnalyticParams f252305e;

        /* compiled from: RecommendationLoaderActivityArgument.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RecommendationItemsLoaderArgument> {
            @Override // android.os.Parcelable.Creator
            public final RecommendationItemsLoaderArgument createFromParcel(Parcel parcel) {
                return new RecommendationItemsLoaderArgument(parcel.readString(), parcel.readString(), parcel.readString(), (AnalyticParams) parcel.readParcelable(RecommendationItemsLoaderArgument.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RecommendationItemsLoaderArgument[] newArray(int i12) {
                return new RecommendationItemsLoaderArgument[i12];
            }
        }

        public RecommendationItemsLoaderArgument(@l String str, @l String str2, @k String str3, @l AnalyticParams analyticParams) {
            this.f252302b = str;
            this.f252303c = str2;
            this.f252304d = str3;
            this.f252305e = analyticParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendationItemsLoaderArgument)) {
                return false;
            }
            RecommendationItemsLoaderArgument recommendationItemsLoaderArgument = (RecommendationItemsLoaderArgument) obj;
            return L.f(this.f252302b, recommendationItemsLoaderArgument.f252302b) && L.f(this.f252303c, recommendationItemsLoaderArgument.f252303c) && L.f(this.f252304d, recommendationItemsLoaderArgument.f252304d) && L.f(this.f252305e, recommendationItemsLoaderArgument.f252305e);
        }

        public final int hashCode() {
            String str = this.f252302b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f252303c;
            int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f252304d);
            AnalyticParams analyticParams = this.f252305e;
            return iD2 + (analyticParams != null ? analyticParams.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "RecommendationItemsLoaderArgument(title=" + this.f252302b + ", subtitle=" + this.f252303c + ", payload=" + this.f252304d + ", analyticParams=" + this.f252305e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f252302b);
            parcel.writeString(this.f252303c);
            parcel.writeString(this.f252304d);
            parcel.writeParcelable(this.f252305e, i12);
        }
    }
}
