package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.i;

/* compiled from: LocalDate.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final long f412622a = LocalDate.MIN.toEpochDay();

    /* renamed from: b, reason: collision with root package name */
    public static final long f412623b = LocalDate.MAX.toEpochDay();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f412624c = 0;

    @Y61.k
    public static final q a(@Y61.k q qVar, long j12, @Y61.k i.b bVar) throws Exception {
        LocalDate localDatePlusMonths;
        try {
            boolean z12 = bVar instanceof i.c;
            LocalDate localDate = qVar.f412619b;
            if (z12) {
                long jAddExact = Math.addExact(localDate.toEpochDay(), Math.multiplyExact(j12, ((i.c) bVar).f412492j));
                if (jAddExact > f412623b || f412622a > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jAddExact);
            } else {
                if (!(bVar instanceof i.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = localDate.plusMonths(Math.multiplyExact(j12, ((i.d) bVar).f412493j));
            }
            return new q(localDatePlusMonths);
        } catch (Exception e12) {
            if (!(e12 instanceof DateTimeException) && !(e12 instanceof ArithmeticException)) {
                throw e12;
            }
            throw new DateTimeArithmeticException("The result of adding " + j12 + " of " + bVar + " to " + qVar + " is out of LocalDate range.", e12);
        }
    }

    public static final int b(@Y61.k q qVar, @Y61.k q qVar2, @Y61.k i.b bVar) {
        boolean z12 = bVar instanceof i.d;
        LocalDate localDate = qVar.f412619b;
        LocalDate localDate2 = qVar2.f412619b;
        if (z12) {
            return I51.f.a(localDate.until(localDate2, ChronoUnit.MONTHS) / ((i.d) bVar).f412493j);
        }
        if (bVar instanceof i.c) {
            return I51.f.a(localDate.until(localDate2, ChronoUnit.DAYS) / ((i.c) bVar).f412492j);
        }
        throw new NoWhenBranchMatchedException();
    }
}
