package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SearchPositionSortDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class SearchPositionSortDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SearchPositionSortDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchPositionSortBody f221331b;

    /* compiled from: SearchPositionSortDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchPositionSortDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final SearchPositionSortDeepLink createFromParcel(Parcel parcel) {
            return new SearchPositionSortDeepLink(SearchPositionSortBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPositionSortDeepLink[] newArray(int i12) {
            return new SearchPositionSortDeepLink[i12];
        }
    }

    /* compiled from: SearchPositionSortDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b$a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: SearchPositionSortDeepLink.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b$a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f221332b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2082290099;
            }

            @k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: SearchPositionSortDeepLink.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b$b;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortDeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6694b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f221333b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221334c;

            public C6694b(@k String str, @k String str2) {
                this.f221333b = str;
                this.f221334c = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6694b)) {
                    return false;
                }
                C6694b c6694b = (C6694b) obj;
                return L.f(this.f221333b, c6694b.f221333b) && L.f(this.f221334c, c6694b.f221334c);
            }

            public final int hashCode() {
                return this.f221334c.hashCode() + (this.f221333b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(slug=");
                sb2.append(this.f221333b);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f221334c, ')');
            }
        }
    }

    public SearchPositionSortDeepLink(@k SearchPositionSortBody searchPositionSortBody) {
        this.f221331b = searchPositionSortBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchPositionSortDeepLink) && L.f(this.f221331b, ((SearchPositionSortDeepLink) obj).f221331b);
    }

    public final int hashCode() {
        return this.f221331b.hashCode();
    }

    @k
    public final String toString() {
        return "SearchPositionSortDeepLink(body=" + this.f221331b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f221331b.writeToParcel(parcel, i12);
    }
}
