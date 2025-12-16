package Sh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSh0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f15123f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f15124g = new c(null, false, false, false, 15, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f15125b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15126c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15127d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15128e;

    /* compiled from: ReAgentProfileCreateLandingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/c$a;", "", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, false, false, false, 15, null);
    }

    public static c a(c cVar, List list, boolean z12, boolean z13, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f15125b;
        }
        if ((i12 & 2) != 0) {
            z12 = cVar.f15126c;
        }
        if ((i12 & 4) != 0) {
            z13 = cVar.f15127d;
        }
        if ((i12 & 8) != 0) {
            z14 = cVar.f15128e;
        }
        cVar.getClass();
        return new c(list, z12, z13, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15125b, cVar.f15125b) && this.f15126c == cVar.f15126c && this.f15127d == cVar.f15127d && this.f15128e == cVar.f15128e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15128e) + r.i(r.i(this.f15125b.hashCode() * 31, 31, this.f15126c), 31, this.f15127d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReAgentProfileCreateLandingState(items=");
        sb2.append(this.f15125b);
        sb2.append(", isLoading=");
        sb2.append(this.f15126c);
        sb2.append(", isError=");
        sb2.append(this.f15127d);
        sb2.append(", refreshOnResume=");
        return r.x(sb2, this.f15128e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, boolean z14) {
        this.f15125b = list;
        this.f15126c = z12;
        this.f15127d = z13;
        this.f15128e = z14;
    }

    public c(List list, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14);
    }
}
