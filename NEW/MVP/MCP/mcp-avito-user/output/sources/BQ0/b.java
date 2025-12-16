package BQ0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StunMessage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LBQ0/b;", "LBQ0/a;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f1379a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f1380b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<c> f1381c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1382d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k g gVar, @k e eVar, @k List<? extends c> list) {
        this.f1379a = gVar;
        this.f1380b = eVar;
        this.f1381c = list;
        int i12 = 0;
        for (c cVar : list) {
            int length = cVar.getF1383a().length + 4;
            int length2 = cVar.getF1383a().length % 4;
            i12 += (length2 == 0 ? 0 : 4 - length2) + length;
        }
        this.f1382d = 20 + i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f1379a, bVar.f1379a) && L.f(this.f1380b, bVar.f1380b) && L.f(this.f1381c, bVar.f1381c);
    }

    public final int hashCode() {
        return this.f1381c.hashCode() + ((this.f1380b.hashCode() + (this.f1379a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StunMessage(type=");
        sb2.append(this.f1379a);
        sb2.append(", transactionId=");
        sb2.append(this.f1380b);
        sb2.append(", attributes=");
        return H.p(sb2, this.f1381c, ')');
    }
}
