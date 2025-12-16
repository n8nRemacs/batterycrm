package Ap;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResponsibleAgentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAp/b;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C13065a f629b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f630c;

    public b(@l C13065a c13065a, boolean z12) {
        this.f629b = c13065a;
        this.f630c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f629b, bVar.f629b) && this.f630c == bVar.f630c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return -967818896;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF244992b() {
        return "team_member_agent_item";
    }

    public final int hashCode() {
        C13065a c13065a = this.f629b;
        return Boolean.hashCode(this.f630c) + ((62385296 + (c13065a == null ? 0 : c13065a.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResponsibleAgentItem(stringId=team_member_agent_item, agentInfo=");
        sb2.append(this.f629b);
        sb2.append(", canEdit=");
        return r.x(sb2, this.f630c, ')');
    }
}
