package dp;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldp/c;", "", "", "Ldp/a;", "agents", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39774c {

    @com.google.gson.annotations.c("agents")
    @Y61.k
    private final List<C39772a> agents;

    public C39774c(@Y61.k List<C39772a> list) {
        this.agents = list;
    }

    @Y61.k
    public final List<C39772a> a() {
        return this.agents;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39774c) && L.f(this.agents, ((C39774c) obj).agents);
    }

    public final int hashCode() {
        return this.agents.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("AgentsResponse(agents="), this.agents, ')');
    }
}
