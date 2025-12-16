package com.avito.android.competitor_analytics.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CompetitorAnalyticsDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/deeplink/CompetitorAnalyticsDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CompetitorAnalyticsDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CompetitorAnalyticsDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f124247b;

    /* compiled from: CompetitorAnalyticsDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompetitorAnalyticsDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CompetitorAnalyticsDeepLink createFromParcel(Parcel parcel) {
            return new CompetitorAnalyticsDeepLink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CompetitorAnalyticsDeepLink[] newArray(int i12) {
            return new CompetitorAnalyticsDeepLink[i12];
        }
    }

    public CompetitorAnalyticsDeepLink(long j12) {
        this.f124247b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompetitorAnalyticsDeepLink) && this.f124247b == ((CompetitorAnalyticsDeepLink) obj).f124247b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f124247b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("CompetitorAnalyticsDeepLink(itemId="), this.f124247b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f124247b);
    }
}
