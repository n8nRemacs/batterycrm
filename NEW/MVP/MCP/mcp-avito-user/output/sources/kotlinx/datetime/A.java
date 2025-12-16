package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/datetime/B", "kotlinx/datetime/C"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {
    @Y61.k
    public static final t a(@Y61.k l lVar, @Y61.k z zVar) {
        try {
            return new t(LocalDateTime.ofInstant(lVar.f412618b, zVar.f412688a));
        } catch (DateTimeException e12) {
            throw new DateTimeArithmeticException(e12);
        }
    }
}
