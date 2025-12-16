package Vb;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/l;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f17264a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17265b;

    public l() {
        this(0L, 0L, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f17264a == lVar.f17264a && this.f17265b == lVar.f17265b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17265b) + (Long.hashCode(this.f17264a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamps(start=");
        sb2.append(this.f17264a);
        sb2.append(", end=");
        return r.u(sb2, this.f17265b, ')');
    }

    public l(long j12, long j13) {
        this.f17264a = j12;
        this.f17265b = j13;
    }

    public /* synthetic */ l(long j12, long j13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? 0L : j13);
    }
}
