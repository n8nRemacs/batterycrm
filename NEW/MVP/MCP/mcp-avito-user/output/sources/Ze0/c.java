package ZE0;

import Y61.k;
import Y61.l;
import ZE0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZE0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f20008g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f20009h;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f20010b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f20011c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final P2<YE0.b> f20012d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f20013e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final YE0.b f20014f;

    /* compiled from: TravelOnboardingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZE0/c$a;", "", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        P2.c cVar = P2.c.f318721a;
        d.f20015a.getClass();
        f20009h = new c(null, null, cVar, d.a.f20017b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String str, @l DeepLink deepLink, @k P2<? super YE0.b> p22, @k d dVar) {
        this.f20010b = str;
        this.f20011c = deepLink;
        this.f20012d = p22;
        this.f20013e = dVar;
        P2.b bVar = p22 instanceof P2.b ? (P2.b) p22 : null;
        this.f20014f = bVar != null ? (YE0.b) bVar.f318720a : null;
    }

    public static c a(c cVar, String str, DeepLink deepLink, P2 p22, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f20010b;
        }
        if ((i12 & 2) != 0) {
            deepLink = cVar.f20011c;
        }
        if ((i12 & 4) != 0) {
            p22 = cVar.f20012d;
        }
        if ((i12 & 8) != 0) {
            dVar = cVar.f20013e;
        }
        cVar.getClass();
        return new c(str, deepLink, p22, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f20010b, cVar.f20010b) && L.f(this.f20011c, cVar.f20011c) && L.f(this.f20012d, cVar.f20012d) && L.f(this.f20013e, cVar.f20013e);
    }

    public final int hashCode() {
        String str = this.f20010b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.f20011c;
        return this.f20013e.hashCode() + ((this.f20012d.hashCode() + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "TravelOnboardingState(onboardingId=" + this.f20010b + ", onboardingDeeplink=" + this.f20011c + ", loadingState=" + this.f20012d + ", viewState=" + this.f20013e + ')';
    }
}
