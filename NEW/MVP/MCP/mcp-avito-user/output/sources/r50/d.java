package r50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Lce.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/d;", "", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429602a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f429603b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC47494b f429604c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC47494b f429605d;

    /* renamed from: e, reason: collision with root package name */
    public final long f429606e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, @k AbstractC47494b abstractC47494b, @k AbstractC47494b abstractC47494b2, long j12) {
        this.f429602a = list;
        this.f429603b = z12;
        this.f429604c = abstractC47494b;
        this.f429605d = abstractC47494b2;
        this.f429606e = j12;
    }

    public static d a(d dVar, List list, boolean z12, AbstractC47494b abstractC47494b, AbstractC47494b abstractC47494b2, long j12, int i12) {
        if ((i12 & 1) != 0) {
            list = dVar.f429602a;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            z12 = dVar.f429603b;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            abstractC47494b = dVar.f429604c;
        }
        AbstractC47494b abstractC47494b3 = abstractC47494b;
        if ((i12 & 8) != 0) {
            abstractC47494b2 = dVar.f429605d;
        }
        AbstractC47494b abstractC47494b4 = abstractC47494b2;
        if ((i12 & 16) != 0) {
            j12 = dVar.f429606e;
        }
        dVar.getClass();
        return new d(list2, z13, abstractC47494b3, abstractC47494b4, j12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f429602a, dVar.f429602a) && this.f429603b == dVar.f429603b && L.f(this.f429604c, dVar.f429604c) && L.f(this.f429605d, dVar.f429605d) && this.f429606e == dVar.f429606e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f429606e) + ((this.f429605d.hashCode() + ((this.f429604c.hashCode() + r.i(this.f429602a.hashCode() * 31, 31, this.f429603b)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListState(items=");
        sb2.append(this.f429602a);
        sb2.append(", isRefreshing=");
        sb2.append(this.f429603b);
        sb2.append(", topEdgeState=");
        sb2.append(this.f429604c);
        sb2.append(", bottomEdgeState=");
        sb2.append(this.f429605d);
        sb2.append(", loadedId=");
        return r.u(sb2, this.f429606e, ')');
    }
}
