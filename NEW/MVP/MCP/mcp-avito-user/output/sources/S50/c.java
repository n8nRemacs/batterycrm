package S50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentShortFlowCreationState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LS50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f14817d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f14818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14819c;

    /* compiled from: ReAgentShortFlowCreationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS50/c$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l DeepLink deepLink, boolean z12) {
        this.f14818b = deepLink;
        this.f14819c = z12;
    }

    public static c a(c cVar, boolean z12) {
        DeepLink deepLink = cVar.f14818b;
        cVar.getClass();
        return new c(deepLink, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14818b, cVar.f14818b) && this.f14819c == cVar.f14819c;
    }

    public final int hashCode() {
        DeepLink deepLink = this.f14818b;
        return Boolean.hashCode(this.f14819c) + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReAgentShortFlowCreationState(navigationBackDeeplink=");
        sb2.append(this.f14818b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f14819c, ')');
    }
}
