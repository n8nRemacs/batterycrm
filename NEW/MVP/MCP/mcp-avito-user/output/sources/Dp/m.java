package dp;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UserTypeCode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomDealResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldp/m;", "", "Ldp/h;", UserTypeCode.COMPANY, "Ldp/i;", "agent", "<init>", "(Ldp/h;Ldp/i;)V", "Ldp/h;", "b", "()Ldp/h;", "Ldp/i;", "a", "()Ldp/i;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("private_agent")
    @Y61.l
    private final i agent;

    @com.google.gson.annotations.c(UserTypeCode.COMPANY)
    @Y61.l
    private final h company;

    public m(@Y61.l h hVar, @Y61.l i iVar) {
        this.company = hVar;
        this.agent = iVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final i getAgent() {
        return this.agent;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final h getCompany() {
        return this.company;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.company, mVar.company) && L.f(this.agent, mVar.agent);
    }

    public final int hashCode() {
        h hVar = this.company;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        i iVar = this.agent;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Partner(company=" + this.company + ", agent=" + this.agent + ')';
    }
}
