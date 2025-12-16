package Mi0;

import Y61.k;
import Y61.l;
import com.avito.android.AnalyticParams;
import com.avito.android.deep_linking.links.AdvertListLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationLoaderInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LMi0/b;", "", "a", "b", "c", "LMi0/b$a;", "LMi0/b$b;", "LMi0/b$c;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14493b {

    /* compiled from: RecommendationLoaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMi0/b$a;", "LMi0/b;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mi0.b$a */
    public static final class a implements InterfaceC14493b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10994a = new a();
    }

    /* compiled from: RecommendationLoaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMi0/b$b;", "LMi0/b;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mi0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0699b implements InterfaceC14493b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertListLink.ItemList f10995a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AnalyticParams f10996b;

        public C0699b(@k AdvertListLink.ItemList itemList, @l AnalyticParams analyticParams) {
            this.f10995a = itemList;
            this.f10996b = analyticParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0699b)) {
                return false;
            }
            C0699b c0699b = (C0699b) obj;
            return this.f10995a.equals(c0699b.f10995a) && L.f(this.f10996b, c0699b.f10996b);
        }

        public final int hashCode() {
            int iHashCode = this.f10995a.hashCode() * 31;
            AnalyticParams analyticParams = this.f10996b;
            return iHashCode + (analyticParams == null ? 0 : analyticParams.hashCode());
        }

        @k
        public final String toString() {
            return "NavigateToItems(deeplink=" + this.f10995a + ", analyticParams=" + this.f10996b + ')';
        }
    }

    /* compiled from: RecommendationLoaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMi0/b$c;", "LMi0/b;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mi0.b$c */
    public static final class c implements InterfaceC14493b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f10997a = new c();
    }
}
