package Ux0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingSections.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUx0/c;", "", "", "LUx0/d;", "blocks", "LUx0/a;", "eventBusUpdate", "<init>", "(Ljava/util/List;LUx0/a;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LUx0/a;", "b", "()LUx0/a;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("blocks")
    @l
    private final List<d> blocks;

    @com.google.gson.annotations.c("eventBusUpdate")
    @l
    private final C15583a eventBusUpdate;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l List<? extends d> list, @l C15583a c15583a) {
        this.blocks = list;
        this.eventBusUpdate = c15583a;
    }

    @l
    public final List<d> a() {
        return this.blocks;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C15583a getEventBusUpdate() {
        return this.eventBusUpdate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.blocks, cVar.blocks) && L.f(this.eventBusUpdate, cVar.eventBusUpdate);
    }

    public final int hashCode() {
        List<d> list = this.blocks;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C15583a c15583a = this.eventBusUpdate;
        return iHashCode + (c15583a != null ? c15583a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StrBookingResponse(blocks=" + this.blocks + ", eventBusUpdate=" + this.eventBusUpdate + ')';
    }
}
