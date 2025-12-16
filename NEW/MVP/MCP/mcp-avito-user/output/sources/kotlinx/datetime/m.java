package kotlinx.datetime;

import java.time.DateTimeException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.i;

/* compiled from: Instant.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class m {
    @Y61.k
    public static final l a(@Y61.k l lVar, long j12, @Y61.k i.e eVar) throws Exception {
        l lVar2;
        try {
            I51.d dVarB = I51.f.b(j12, eVar.f412494j, 1000000000L);
            long j13 = dVarB.f7949a;
            return new l(lVar.f412618b.plusSeconds(j13).plusNanos(dVarB.f7950b));
        } catch (Exception e12) {
            if (!(e12 instanceof DateTimeException) && !(e12 instanceof ArithmeticException)) {
                throw e12;
            }
            if (j12 > 0) {
                l.INSTANCE.getClass();
                lVar2 = l.f412617d;
            } else {
                l.INSTANCE.getClass();
                lVar2 = l.f412616c;
            }
            return lVar2;
        }
    }
}
