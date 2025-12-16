package p4;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnchorsExpandContainerState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp4/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C46889a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<UU.a> f428186a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UU.a f428187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428188c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f428189d;

    public C46889a() {
        this(null, null, 0, null, 15, null);
    }

    public static C46889a a(C46889a c46889a, List list, UU.a aVar, int i12, Y41.l lVar, int i13) {
        if ((i13 & 1) != 0) {
            list = c46889a.f428186a;
        }
        if ((i13 & 2) != 0) {
            aVar = c46889a.f428187b;
        }
        if ((i13 & 4) != 0) {
            i12 = c46889a.f428188c;
        }
        if ((i13 & 8) != 0) {
            lVar = c46889a.f428189d;
        }
        c46889a.getClass();
        return new C46889a(list, aVar, i12, lVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46889a)) {
            return false;
        }
        C46889a c46889a = (C46889a) obj;
        return L.f(this.f428186a, c46889a.f428186a) && L.f(this.f428187b, c46889a.f428187b) && this.f428188c == c46889a.f428188c && L.f(this.f428189d, c46889a.f428189d);
    }

    public final int hashCode() {
        int iHashCode = this.f428186a.hashCode() * 31;
        UU.a aVar = this.f428187b;
        int iE2 = r.e(this.f428188c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        Y41.l<Integer, G0> lVar = this.f428189d;
        return iE2 + (lVar != null ? lVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorsExpandContainerState(buttons=");
        sb2.append(this.f428186a);
        sb2.append(", expandButton=");
        sb2.append(this.f428187b);
        sb2.append(", maxLines=");
        sb2.append(this.f428188c);
        sb2.append(", onMeasureButtonsListener=");
        return H.l(sb2, this.f428189d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C46889a(@k List<UU.a> list, @l UU.a aVar, int i12, @l Y41.l<? super Integer, G0> lVar) {
        this.f428186a = list;
        this.f428187b = aVar;
        this.f428188c = i12;
        this.f428189d = lVar;
    }

    public C46889a(List list, UU.a aVar, int i12, Y41.l lVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? C42784z0.f406748b : list, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? Integer.MAX_VALUE : i12, (i13 & 8) != 0 ? null : lVar);
    }
}
