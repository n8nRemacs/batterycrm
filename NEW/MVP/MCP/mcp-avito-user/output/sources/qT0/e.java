package QT0;

import Y61.k;
import java.time.DateTimeException;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlinx.datetime.i;
import kotlinx.datetime.q;
import kotlinx.datetime.r;
import kotlinx.datetime.t;
import kotlinx.datetime.w;

/* compiled from: KotlinxUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    public static final long a(@k w wVar, @k w wVar2, @k i.e eVar) {
        long nanoOfDay = wVar2.f412684b.toNanoOfDay() - wVar.f412684b.toNanoOfDay();
        i.Companion aVar = i.INSTANCE;
        aVar.getClass();
        if (eVar.equals(i.f412483a)) {
            return nanoOfDay;
        }
        aVar.getClass();
        if (eVar.equals(i.f412484b)) {
            return nanoOfDay / 1000;
        }
        aVar.getClass();
        if (eVar.equals(i.f412485c)) {
            return nanoOfDay / 1000000;
        }
        aVar.getClass();
        if (eVar.equals(i.f412486d)) {
            return nanoOfDay / 1000000000;
        }
        aVar.getClass();
        if (eVar.equals(i.f412487e)) {
            return nanoOfDay / 60000000000L;
        }
        aVar.getClass();
        if (eVar.equals(i.f412488f)) {
            return nanoOfDay / 3600000000000L;
        }
        throw new UnsupportedOperationException("Unknown DateTimeUnit " + eVar);
    }

    @k
    public static final w b(@k w wVar, long j12, @k i.e eVar) {
        i.Companion aVar = i.INSTANCE;
        aVar.getClass();
        if (eVar.equals(i.f412483a)) {
            return c(wVar, j12);
        }
        aVar.getClass();
        if (eVar.equals(i.f412484b)) {
            return c(wVar, (j12 % 86400000000L) * 1000);
        }
        aVar.getClass();
        if (eVar.equals(i.f412485c)) {
            return c(wVar, (j12 % 86400000) * 1000000);
        }
        aVar.getClass();
        boolean zEquals = eVar.equals(i.f412486d);
        LocalTime localTime = wVar.f412684b;
        if (zEquals) {
            if (j12 == 0) {
                return wVar;
            }
            long hour = (localTime.getHour() * 3600) + (localTime.getMinute() * 60) + localTime.getSecond();
            long j13 = ((((int) (j12 % 86400)) + hour) + 86400) % 86400;
            if (hour == j13) {
                return wVar;
            }
            long j14 = 60;
            return new w((int) (j13 / 3600), (int) ((j13 / j14) % j14), (int) (j13 % j14), localTime.getNano());
        }
        aVar.getClass();
        if (eVar.equals(i.f412487e)) {
            if (j12 == 0) {
                return wVar;
            }
            int minute = localTime.getMinute() + (localTime.getHour() * 60);
            int i12 = ((((int) (j12 % 1440)) + minute) + 1440) % 1440;
            return minute == i12 ? wVar : new w(i12 / 60, i12 % 60, localTime.getSecond(), localTime.getNano());
        }
        aVar.getClass();
        if (!eVar.equals(i.f412488f)) {
            throw new UnsupportedOperationException("Unknown DateTimeUnit " + eVar);
        }
        if (j12 == 0) {
            return wVar;
        }
        long j15 = 24;
        return new w((int) ((((j12 % j15) + localTime.getHour()) + j15) % j15), localTime.getMinute(), localTime.getSecond(), localTime.getNano());
    }

    @k
    public static final w c(@k w wVar, long j12) {
        if (j12 == 0) {
            return wVar;
        }
        long nanoOfDay = wVar.f412684b.toNanoOfDay();
        long j13 = (((j12 % 86400000000000L) + nanoOfDay) + 86400000000000L) % 86400000000000L;
        if (nanoOfDay == j13) {
            return wVar;
        }
        long j14 = 60;
        return new w((int) (j13 / 3600000000000L), (int) ((j13 / 60000000000L) % j14), (int) ((j13 / 1000000000) % j14), (int) (j13 % 1000000000));
    }

    @k
    public static final t d(@k t tVar, long j12, @k i.e eVar) {
        i.Companion aVar = i.INSTANCE;
        aVar.getClass();
        if (eVar.equals(i.f412483a)) {
            return e(tVar, tVar.a(), 0L, 0L, 0L, j12);
        }
        if (eVar.equals(i.f412484b)) {
            q qVarA = tVar.a();
            aVar.getClass();
            t tVar2 = new t(r.a(qVarA, (int) (j12 / 86400000000L), i.f412489g), tVar.b());
            return e(tVar2, tVar2.a(), 0L, 0L, 0L, (j12 % 86400000000L) * 1000);
        }
        if (eVar.equals(i.f412485c)) {
            q qVarA2 = tVar.a();
            aVar.getClass();
            t tVar3 = new t(r.a(qVarA2, (int) (j12 / 86400000), i.f412489g), tVar.b());
            return e(tVar3, tVar3.a(), 0L, 0L, 0L, (j12 % 86400000) * 1000000);
        }
        if (eVar.equals(i.f412486d)) {
            return e(tVar, tVar.a(), 0L, 0L, j12, 0L);
        }
        if (eVar.equals(i.f412487e)) {
            return e(tVar, tVar.a(), 0L, j12, 0L, 0L);
        }
        if (eVar.equals(i.f412488f)) {
            return e(tVar, tVar.a(), j12, 0L, 0L, 0L);
        }
        throw new UnsupportedOperationException("Unknown DateTimeUnit " + eVar);
    }

    public static final t e(t tVar, q qVar, long j12, long j13, long j14, long j15) {
        w wVar;
        if ((j12 | j13 | j14 | j15) == 0) {
            return new t(qVar, tVar.b());
        }
        long j16 = 1440;
        long j17 = 24;
        long j18 = (j12 / j17) + (j13 / j16) + (j14 / 86400) + (j15 / 86400000000000L);
        long j19 = 1;
        long j22 = j18 * j19;
        long j23 = ((j12 % j17) * 3600000000000L) + ((j13 % j16) * 60000000000L) + ((j14 % 86400) * 1000000000) + (j15 % 86400000000000L);
        long nanoOfDay = tVar.b().f412684b.toNanoOfDay();
        long j24 = (j23 * j19) + nanoOfDay;
        long j25 = j24 / 86400000000000L;
        if ((j24 ^ 86400000000000L) < 0 && j25 * 86400000000000L != j24) {
            j25--;
        }
        long j26 = j22 + j25;
        long j27 = ((j24 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j27 == nanoOfDay) {
            wVar = tVar.b();
        } else {
            w.INSTANCE.getClass();
            try {
                wVar = new w(LocalTime.ofNanoOfDay(j27));
            } catch (DateTimeException e12) {
                throw new IllegalArgumentException(e12);
            }
        }
        i.INSTANCE.getClass();
        return new t(r.a(qVar, (int) j26, i.f412489g), wVar);
    }
}
