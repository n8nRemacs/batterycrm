package yQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: StunMessageTransactionId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyQ0/e;", "LyQ0/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements InterfaceC50159a {

    /* renamed from: a, reason: collision with root package name */
    public final long f443104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f443105b;

    public e(long j12, int i12) {
        this.f443104a = j12;
        this.f443105b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f443104a == eVar.f443104a && this.f443105b == eVar.f443105b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f443105b) + (Long.hashCode(this.f443104a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StunMessageTransactionId(firstLong=");
        sb2.append(this.f443104a);
        sb2.append(", secondInt=");
        return r.t(sb2, this.f443105b, ')');
    }
}
