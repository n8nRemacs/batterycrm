package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;

/* compiled from: TimeSource.kt */
@K0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/d;", "Lkotlin/time/q;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public interface d extends q, Comparable<d> {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static int a(@Y61.k d dVar, @Y61.k d dVar2) {
            long jY02 = dVar.y0(dVar2);
            e.f410651c.getClass();
            return e.d(jY02, 0L);
        }
    }

    long y0(@Y61.k d dVar);
}
