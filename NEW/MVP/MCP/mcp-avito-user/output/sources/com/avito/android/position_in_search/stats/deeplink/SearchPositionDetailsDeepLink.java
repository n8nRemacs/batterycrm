package com.avito.android.position_in_search.stats.deeplink;

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

/* compiled from: SearchPositionDetailsDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_position-in-search_stats_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class SearchPositionDetailsDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SearchPositionDetailsDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f220336b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f220337c;

    /* compiled from: SearchPositionDetailsDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchPositionDetailsDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final SearchPositionDetailsDeepLink createFromParcel(Parcel parcel) {
            return new SearchPositionDetailsDeepLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPositionDetailsDeepLink[] newArray(int i12) {
            return new SearchPositionDetailsDeepLink[i12];
        }
    }

    /* compiled from: SearchPositionDetailsDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink$b;", "LJu/c$b;", "a", "Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink$b$a;", "_avito_position-in-search_stats_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: SearchPositionDetailsDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink$b$a;", "Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink$b;", "<init>", "()V", "_avito_position-in-search_stats_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f220338b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 235162106;
            }

            @k
            public final String toString() {
                return "Done";
            }
        }
    }

    public SearchPositionDetailsDeepLink(long j12, @k String str) {
        this.f220336b = j12;
        this.f220337c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPositionDetailsDeepLink)) {
            return false;
        }
        SearchPositionDetailsDeepLink searchPositionDetailsDeepLink = (SearchPositionDetailsDeepLink) obj;
        return this.f220336b == searchPositionDetailsDeepLink.f220336b && L.f(this.f220337c, searchPositionDetailsDeepLink.f220337c);
    }

    public final int hashCode() {
        return this.f220337c.hashCode() + (Long.hashCode(this.f220336b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchPositionDetailsDeepLink(itemId=");
        sb2.append(this.f220336b);
        sb2.append(", period=");
        return C22026a.c(sb2, this.f220337c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f220336b);
        parcel.writeString(this.f220337c);
    }
}
