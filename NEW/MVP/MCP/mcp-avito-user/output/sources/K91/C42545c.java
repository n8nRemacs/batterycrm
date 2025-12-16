package k91;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserSession.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk91/c;", "", "", "timeToModifyMessage", "<init>", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C42545c {

    @com.google.gson.annotations.c("timeToModifyMessage")
    @l
    private final Long timeToModifyMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public C42545c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getTimeToModifyMessage() {
        return this.timeToModifyMessage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42545c) && L.f(this.timeToModifyMessage, ((C42545c) obj).timeToModifyMessage);
    }

    public final int hashCode() {
        Long l12 = this.timeToModifyMessage;
        if (l12 == null) {
            return 0;
        }
        return l12.hashCode();
    }

    @k
    public final String toString() {
        return m.m(new StringBuilder("ServerConfig(timeToModifyMessage="), this.timeToModifyMessage, ')');
    }

    public C42545c(@l Long l12) {
        this.timeToModifyMessage = l12;
    }

    public /* synthetic */ C42545c(Long l12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : l12);
    }
}
