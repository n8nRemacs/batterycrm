package Mi0;

import Y61.k;
import Y61.l;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.AdvertListLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationLoaderOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LMi0/c;", "", "a", "LMi0/c$a;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14494c {

    /* compiled from: RecommendationLoaderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMi0/c$a;", "LMi0/c;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mi0.c$a */
    public static final /* data */ class a implements InterfaceC14494c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertListLink.ItemList f10998a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AnalyticParams f10999b;

        public a(@k AdvertListLink.ItemList itemList, @l AnalyticParams analyticParams) {
            this.f10998a = itemList;
            this.f10999b = analyticParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10998a.equals(aVar.f10998a) && L.f(this.f10999b, aVar.f10999b);
        }

        public final int hashCode() {
            int iHashCode = this.f10998a.hashCode() * 31;
            AnalyticParams analyticParams = this.f10999b;
            return iHashCode + (analyticParams == null ? 0 : analyticParams.hashCode());
        }

        @k
        public final String toString() {
            return "NavigateToItems(deeplink=" + this.f10998a + ", analyticParams=" + this.f10999b + ')';
        }
    }
}
