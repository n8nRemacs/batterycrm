package EV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEV/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4032b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4033c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4034d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4035e;

    public c() {
        this(null, false, false, false, false, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f4031a, cVar.f4031a) && this.f4032b == cVar.f4032b && this.f4033c == cVar.f4033c && this.f4034d == cVar.f4034d && this.f4035e == cVar.f4035e;
    }

    public final int hashCode() {
        Y41.l<Boolean, G0> lVar = this.f4031a;
        return Boolean.hashCode(this.f4035e) + r.i(r.i(r.i((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f4032b), 31, this.f4033c), 31, this.f4034d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherState(onCheckedChange=");
        sb2.append(this.f4031a);
        sb2.append(", enabled=");
        sb2.append(this.f4032b);
        sb2.append(", checked=");
        sb2.append(this.f4033c);
        sb2.append(", error=");
        sb2.append(this.f4034d);
        sb2.append(", isClickable=");
        return r.x(sb2, this.f4035e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l Y41.l<? super Boolean, G0> lVar, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f4031a = lVar;
        this.f4032b = z12;
        this.f4033c = z13;
        this.f4034d = z14;
        this.f4035e = z15;
    }

    public /* synthetic */ c(Y41.l lVar, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : lVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) == 0 ? z14 : false, (i12 & 16) == 0 ? z15 : true);
    }
}
