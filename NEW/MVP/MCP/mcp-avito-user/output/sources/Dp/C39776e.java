package dp;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomDealResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldp/e;", "", "", "id", "Ldp/m;", "partner", "<init>", "(Ljava/lang/String;Ldp/m;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ldp/m;", "b", "()Ldp/m;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dp.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39776e {

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("partner")
    @Y61.k
    private final m partner;

    public C39776e(@Y61.k String str, @Y61.k m mVar) {
        this.id = str;
        this.partner = mVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final m getPartner() {
        return this.partner;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39776e)) {
            return false;
        }
        C39776e c39776e = (C39776e) obj;
        return L.f(this.id, c39776e.id) && L.f(this.partner, c39776e.partner);
    }

    public final int hashCode() {
        return this.partner.hashCode() + (this.id.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ClientRoomDealResponse(id=" + this.id + ", partner=" + this.partner + ')';
    }
}
