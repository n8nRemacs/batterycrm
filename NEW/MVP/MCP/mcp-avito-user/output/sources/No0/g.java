package No0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LNo0/g;", "", "Ljava/util/Date;", "dueDate", "", "totalSends", "sendsLeft", "<init>", "(Ljava/util/Date;JJ)V", "Ljava/util/Date;", "a", "()Ljava/util/Date;", "J", "c", "()J", "b", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("dueDate")
    @k
    private final Date dueDate;

    @com.google.gson.annotations.c("sendsLeft")
    private final long sendsLeft;

    @com.google.gson.annotations.c("totalSends")
    private final long totalSends;

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LNo0/g$a;", "", "<init>", "()V", "", "DUE_DATE", "Ljava/lang/String;", "SENDS_LEFT", "TOTAL_SENDS", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@k Date date, long j12, long j13) {
        this.dueDate = date;
        this.totalSends = j12;
        this.sendsLeft = j13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Date getDueDate() {
        return this.dueDate;
    }

    /* renamed from: b, reason: from getter */
    public final long getSendsLeft() {
        return this.sendsLeft;
    }

    /* renamed from: c, reason: from getter */
    public final long getTotalSends() {
        return this.totalSends;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.dueDate, gVar.dueDate) && this.totalSends == gVar.totalSends && this.sendsLeft == gVar.sendsLeft;
    }

    public final int hashCode() {
        return Long.hashCode(this.sendsLeft) + r.g(this.dueDate.hashCode() * 31, 31, this.totalSends);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tariff(dueDate=");
        sb2.append(this.dueDate);
        sb2.append(", totalSends=");
        sb2.append(this.totalSends);
        sb2.append(", sendsLeft=");
        return r.u(sb2, this.sendsLeft, ')');
    }
}
