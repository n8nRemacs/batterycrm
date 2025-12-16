package dq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import dq.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectAgentState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ldq/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f394080i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f394081j = new c(null, null, "", false, false, false, d.C11037d.f394094a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<com.avito.android.comfortable_deal.select_agent.item.agent.c> f394082b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f394083c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f394084d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f394085e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f394086f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f394087g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final d f394088h;

    /* compiled from: SelectAgentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<com.avito.android.comfortable_deal.select_agent.item.agent.c> list, @l String str, @k String str2, boolean z12, boolean z13, boolean z14, @k d dVar) {
        this.f394082b = list;
        this.f394083c = str;
        this.f394084d = str2;
        this.f394085e = z12;
        this.f394086f = z13;
        this.f394087g = z14;
        this.f394088h = dVar;
    }

    public static c a(c cVar, List list, String str, String str2, boolean z12, boolean z13, boolean z14, d dVar, int i12) {
        List list2 = (i12 & 1) != 0 ? cVar.f394082b : list;
        String str3 = (i12 & 2) != 0 ? cVar.f394083c : str;
        String str4 = (i12 & 4) != 0 ? cVar.f394084d : str2;
        boolean z15 = (i12 & 8) != 0 ? cVar.f394085e : z12;
        boolean z16 = (i12 & 16) != 0 ? cVar.f394086f : z13;
        boolean z17 = (i12 & 32) != 0 ? cVar.f394087g : z14;
        d dVar2 = (i12 & 64) != 0 ? cVar.f394088h : dVar;
        cVar.getClass();
        return new c(list2, str3, str4, z15, z16, z17, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f394082b, cVar.f394082b) && L.f(this.f394083c, cVar.f394083c) && L.f(this.f394084d, cVar.f394084d) && this.f394085e == cVar.f394085e && this.f394086f == cVar.f394086f && this.f394087g == cVar.f394087g && L.f(this.f394088h, cVar.f394088h);
    }

    public final int hashCode() {
        List<com.avito.android.comfortable_deal.select_agent.item.agent.c> list = this.f394082b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f394083c;
        return this.f394088h.hashCode() + r.i(r.i(r.i(H.d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f394084d), 31, this.f394085e), 31, this.f394086f), 31, this.f394087g);
    }

    @k
    public final String toString() {
        return "SelectAgentState(agents=" + this.f394082b + ", selectedAgentId=" + this.f394083c + ", dealId=" + this.f394084d + ", isError=" + this.f394085e + ", isAgentsLoading=" + this.f394086f + ", isSubmitting=" + this.f394087g + ", viewState=" + this.f394088h + ')';
    }
}
