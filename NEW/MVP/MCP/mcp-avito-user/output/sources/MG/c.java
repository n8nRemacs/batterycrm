package Mg;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvlRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMg/c;", "", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10985a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f10986b;

    public c() {
        this(0, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10985a == cVar.f10985a && L.f(this.f10986b, cVar.f10986b);
    }

    public final int hashCode() {
        return this.f10986b.hashCode() + (Integer.hashCode(this.f10985a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideosState(page=");
        sb2.append(this.f10985a);
        sb2.append(", items=");
        return H.p(sb2, this.f10986b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i12, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f10985a = i12;
        this.f10986b = list;
    }

    public c(int i12, List list, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
