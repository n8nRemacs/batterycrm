package X80;

import X80.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PeriodInfoState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {
    @Y61.l
    public static final c.a a(@Y61.k c cVar) {
        if (cVar instanceof c.a) {
            return (c.a) cVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(@Y61.k X80.j r3, @Y61.k java.lang.String r4) {
        /*
            X80.c r3 = r3.f18714f
            X80.c$a r0 = a(r3)
            r1 = 0
            if (r0 == 0) goto L18
            X80.l r0 = r0.f18679i
            if (r0 == 0) goto L18
            java.lang.String r2 = r0.getF18721a()
            boolean r4 = kotlin.jvm.internal.L.f(r2, r4)
            if (r4 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            boolean r4 = r0 instanceof X80.l.b
            if (r4 == 0) goto L20
            r1 = r0
            X80.l$b r1 = (X80.l.b) r1
        L20:
            r4 = 0
            if (r1 != 0) goto L24
            return r4
        L24:
            boolean r0 = r3 instanceof X80.c.d
            if (r0 != 0) goto L32
            boolean r3 = r3 instanceof X80.c.b
            if (r3 != 0) goto L32
            com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod$AdditionalToast r3 = r1.f18722b
            boolean r3 = r3.f220433c
            if (r3 == 0) goto L33
        L32:
            r4 = 1
        L33:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X80.k.b(X80.j, java.lang.String):boolean");
    }

    @Y61.l
    public static final h c(@Y61.k c.a aVar, @Y61.k String str) {
        Object next;
        Iterator<T> it = aVar.f18676f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((h) next).f18705b.f220463b, str)) {
                break;
            }
        }
        return (h) next;
    }
}
