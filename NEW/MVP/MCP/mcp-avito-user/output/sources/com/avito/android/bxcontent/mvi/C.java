package com.avito.android.bxcontent.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.AnalyticParams;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.FeedId;
import com.avito.android.location.InterfaceC31506h;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.serp.adapter.LayoutType;
import com.avito.android.serp.adapter.warning.SerpWarningItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.http2.Http2;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/C;", "Lcom/avito/android/location/h;", "Lcom/avito/android/search/h;", "b", "c", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface C extends InterfaceC31506h, com.avito.android.search.h {

    /* compiled from: BxContentInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/C$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FeedId f111209a;

        /* renamed from: b, reason: collision with root package name */
        public final int f111210b;

        /* renamed from: c, reason: collision with root package name */
        public final int f111211c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Location f111212d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f111213e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f111214f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final SearchParams f111215g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final PresentationType f111216h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f111217i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f111218j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final LayoutType f111219k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final String f111220l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Long f111221m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f111222n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f111223o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final String f111224p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final List<String> f111225q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final AnalyticParams f111226r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final AdvertListAdditionalTopics f111227s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final String f111228t;

        public b() {
            throw null;
        }

        public b(FeedId feedId, int i12, int i13, Location location, String str, boolean z12, SearchParams searchParams, PresentationType presentationType, String str2, String str3, LayoutType layoutType, String str4, Long l12, String str5, String str6, String str7, List list, AnalyticParams analyticParams, AdvertListAdditionalTopics advertListAdditionalTopics, String str8, int i14, C42822w c42822w) {
            FeedId feedId2;
            if ((i14 & 1) != 0) {
                FeedId.f112034d.getClass();
                feedId2 = FeedId.f112035e;
            } else {
                feedId2 = feedId;
            }
            int i15 = (i14 & 2) != 0 ? 0 : i12;
            int i16 = (i14 & 4) != 0 ? 1 : i13;
            Location location2 = (i14 & 8) != 0 ? null : location;
            String str9 = (i14 & 16) != 0 ? null : str;
            boolean z13 = (i14 & 32) == 0 ? z12 : true;
            String str10 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6;
            String str11 = (32768 & i14) != 0 ? null : str7;
            List list2 = (65536 & i14) != 0 ? null : list;
            AnalyticParams analyticParams2 = (131072 & i14) != 0 ? null : analyticParams;
            AdvertListAdditionalTopics advertListAdditionalTopics2 = (262144 & i14) != 0 ? null : advertListAdditionalTopics;
            String str12 = (i14 & 524288) == 0 ? str8 : null;
            this.f111209a = feedId2;
            this.f111210b = i15;
            this.f111211c = i16;
            this.f111212d = location2;
            this.f111213e = str9;
            this.f111214f = z13;
            this.f111215g = searchParams;
            this.f111216h = presentationType;
            this.f111217i = str2;
            this.f111218j = str3;
            this.f111219k = layoutType;
            this.f111220l = str4;
            this.f111221m = l12;
            this.f111222n = str5;
            this.f111223o = str10;
            this.f111224p = str11;
            this.f111225q = list2;
            this.f111226r = analyticParams2;
            this.f111227s = advertListAdditionalTopics2;
            this.f111228t = str12;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AdvertListAdditionalTopics getF111227s() {
            return this.f111227s;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final FeedId getF111209a() {
            return this.f111209a;
        }

        /* renamed from: c, reason: from getter */
        public final int getF111210b() {
            return this.f111210b;
        }

        /* renamed from: d, reason: from getter */
        public final int getF111211c() {
            return this.f111211c;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final PresentationType getF111216h() {
            return this.f111216h;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f111209a, bVar.f111209a) && this.f111210b == bVar.f111210b && this.f111211c == bVar.f111211c && kotlin.jvm.internal.L.f(this.f111212d, bVar.f111212d) && kotlin.jvm.internal.L.f(this.f111213e, bVar.f111213e) && this.f111214f == bVar.f111214f && kotlin.jvm.internal.L.f(this.f111215g, bVar.f111215g) && this.f111216h == bVar.f111216h && kotlin.jvm.internal.L.f(this.f111217i, bVar.f111217i) && kotlin.jvm.internal.L.f(this.f111218j, bVar.f111218j) && this.f111219k == bVar.f111219k && kotlin.jvm.internal.L.f(this.f111220l, bVar.f111220l) && kotlin.jvm.internal.L.f(this.f111221m, bVar.f111221m) && kotlin.jvm.internal.L.f(this.f111222n, bVar.f111222n) && kotlin.jvm.internal.L.f(this.f111223o, bVar.f111223o) && kotlin.jvm.internal.L.f(this.f111224p, bVar.f111224p) && kotlin.jvm.internal.L.f(this.f111225q, bVar.f111225q) && kotlin.jvm.internal.L.f(this.f111226r, bVar.f111226r) && kotlin.jvm.internal.L.f(this.f111227s, bVar.f111227s) && kotlin.jvm.internal.L.f(this.f111228t, bVar.f111228t);
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getF111224p() {
            return this.f111224p;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final String getF111223o() {
            return this.f111223o;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final SearchParams getF111215g() {
            return this.f111215g;
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f111211c, androidx.appcompat.app.r.e(this.f111210b, this.f111209a.hashCode() * 31, 31), 31);
            Location location = this.f111212d;
            int iHashCode = (iE2 + (location == null ? 0 : location.hashCode())) * 31;
            String str = this.f111213e;
            int i12 = androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f111214f);
            SearchParams searchParams = this.f111215g;
            int iHashCode2 = (this.f111216h.hashCode() + ((i12 + (searchParams == null ? 0 : searchParams.hashCode())) * 31)) * 31;
            String str2 = this.f111217i;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f111218j;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            LayoutType layoutType = this.f111219k;
            int iD2 = androidx.compose.foundation.H.d((iHashCode4 + (layoutType == null ? 0 : layoutType.hashCode())) * 31, 31, this.f111220l);
            Long l12 = this.f111221m;
            int iHashCode5 = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str4 = this.f111222n;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f111223o;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f111224p;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            List<String> list = this.f111225q;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            AnalyticParams analyticParams = this.f111226r;
            int iHashCode10 = (iHashCode9 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
            AdvertListAdditionalTopics advertListAdditionalTopics = this.f111227s;
            int iHashCode11 = (iHashCode10 + (advertListAdditionalTopics == null ? 0 : advertListAdditionalTopics.hashCode())) * 31;
            String str7 = this.f111228t;
            return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getF111228t() {
            return this.f111228t;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final String getF111213e() {
            return this.f111213e;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GetDataParams(feedId=");
            sb2.append(this.f111209a);
            sb2.append(", offset=");
            sb2.append(this.f111210b);
            sb2.append(", page=");
            sb2.append(this.f111211c);
            sb2.append(", location=");
            sb2.append(this.f111212d);
            sb2.append(", suggestLocationId=");
            sb2.append(this.f111213e);
            sb2.append(", needToChangeHint=");
            sb2.append(this.f111214f);
            sb2.append(", searchParams=");
            sb2.append(this.f111215g);
            sb2.append(", presentationType=");
            sb2.append(this.f111216h);
            sb2.append(", searchContext=");
            sb2.append(this.f111217i);
            sb2.append(", fromPage=");
            sb2.append(this.f111218j);
            sb2.append(", layoutType=");
            sb2.append(this.f111219k);
            sb2.append(", onboardingId=");
            sb2.append(this.f111220l);
            sb2.append(", lastStamp=");
            sb2.append(this.f111221m);
            sb2.append(", pageId=");
            sb2.append(this.f111222n);
            sb2.append(", screenTitle=");
            sb2.append(this.f111223o);
            sb2.append(", screenSubTitle=");
            sb2.append(this.f111224p);
            sb2.append(", itemIds=");
            sb2.append(this.f111225q);
            sb2.append(", analyticParams=");
            sb2.append(this.f111226r);
            sb2.append(", advertListAdditionalTopics=");
            sb2.append(this.f111227s);
            sb2.append(", src=");
            return C22026a.c(sb2, this.f111228t, ')');
        }
    }

    @Y61.k
    InterfaceC43160i<BxContentInternalAction> a();

    @Y61.k
    kotlinx.coroutines.flow.internal.m d(@Y61.k C29126a.b bVar, @Y61.l String str, boolean z12);

    @Y61.k
    kotlinx.coroutines.flow.X e(@Y61.l c cVar, @Y61.l b bVar);

    void f(@Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams, @Y61.l String str);

    void g(@Y61.k SerpWarningItem serpWarningItem);

    @Y61.l
    Object k(@Y61.k RecentQuerySearchItem recentQuerySearchItem, @Y61.l String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    D0 m(@Y61.k List list, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, boolean z12);

    @Y61.k
    kotlinx.coroutines.flow.C0 n(@Y61.k PresentationType presentationType, @Y61.l String str, @Y61.l String str2, @Y61.l SearchParams searchParams, @Y61.k String str3, @Y61.l SerpSpaceType serpSpaceType, @Y61.l LayoutType layoutType);

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/C$c;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f111229a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Boolean f111230b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final SearchParams f111231c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<String> f111232d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final PresentationType f111233e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f111234f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final SerpSpaceType f111235g;

        public c(@Y61.l String str, @Y61.l Boolean bool, @Y61.l SearchParams searchParams, @Y61.l List<String> list, @Y61.k PresentationType presentationType, @Y61.l String str2, @Y61.l SerpSpaceType serpSpaceType) {
            this.f111229a = str;
            this.f111230b = bool;
            this.f111231c = searchParams;
            this.f111232d = list;
            this.f111233e = presentationType;
            this.f111234f = str2;
            this.f111235g = serpSpaceType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f111229a, cVar.f111229a) && kotlin.jvm.internal.L.f(this.f111230b, cVar.f111230b) && kotlin.jvm.internal.L.f(this.f111231c, cVar.f111231c) && kotlin.jvm.internal.L.f(this.f111232d, cVar.f111232d) && this.f111233e == cVar.f111233e && kotlin.jvm.internal.L.f(this.f111234f, cVar.f111234f) && this.f111235g == cVar.f111235g;
        }

        public final int hashCode() {
            String str = this.f111229a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f111230b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            SearchParams searchParams = this.f111231c;
            int iHashCode3 = (iHashCode2 + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
            List<String> list = this.f111232d;
            int iHashCode4 = (this.f111233e.hashCode() + ((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            String str2 = this.f111234f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SerpSpaceType serpSpaceType = this.f111235g;
            return iHashCode5 + (serpSpaceType != null ? serpSpaceType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "TopSheetParams(locationId=" + this.f111229a + ", locationForcedByUser=" + this.f111230b + ", searchParams=" + this.f111231c + ", inlinesOrder=" + this.f111232d + ", presentationType=" + this.f111233e + ", context=" + this.f111234f + ", serpSpaceType=" + this.f111235g + ')';
        }

        public /* synthetic */ c(String str, Boolean bool, SearchParams searchParams, List list, PresentationType presentationType, String str2, SerpSpaceType serpSpaceType, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : searchParams, (i12 & 8) != 0 ? null : list, presentationType, str2, (i12 & 64) != 0 ? SerpSpaceType.Default : serpSpaceType);
        }
    }
}
