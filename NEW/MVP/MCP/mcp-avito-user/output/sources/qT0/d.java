package QT0;

import Y61.k;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlinx.datetime.i;
import kotlinx.datetime.l;
import kotlinx.datetime.m;
import kotlinx.datetime.q;
import kotlinx.datetime.r;
import kotlinx.datetime.t;

/* compiled from: KotlinxTimeCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQT0/d;", "LRT0/g;", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements RT0.g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f13721a = new d();

    public static long a(ST0.h hVar, ST0.h hVar2, i.e eVar) {
        long j12;
        long j13;
        int i12;
        long j14;
        long j15;
        long jA2;
        if (hVar instanceof ST0.d) {
            a.f13718a.getClass();
            Instant instant = a.a((ST0.d) hVar).f412618b;
            Instant instant2 = a.a((ST0.d) hVar2).f412618b;
            try {
                long epochSecond = instant2.getEpochSecond() - instant.getEpochSecond();
                long nano = instant2.getNano() - instant.getNano();
                long j16 = eVar.f412494j;
                if (epochSecond > 0 && nano < 0) {
                    epochSecond--;
                    nano += 1000000000;
                } else if (epochSecond < 0 && nano > 0) {
                    epochSecond++;
                    nano -= 1000000000;
                }
                if (epochSecond == 0) {
                    return nano / j16;
                }
                I51.d dVarB = I51.f.b(epochSecond, 1000000000L, j16);
                return Math.addExact(dVarB.f7949a, Math.addExact(nano / j16, Math.addExact(nano % j16, dVarB.f7950b) / j16));
            } catch (ArithmeticException unused) {
                jA2 = instant.compareTo(instant2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
        } else {
            if (hVar instanceof ST0.g) {
                h.f13724a.getClass();
                return e.a(h.a((ST0.g) hVar), h.a((ST0.g) hVar2), eVar);
            }
            if (!(hVar instanceof ST0.f)) {
                throw new IllegalArgumentException("Unsupported type " + hVar.getF14992a());
            }
            g.f13723a.getClass();
            t tVarA = g.a((ST0.f) hVar);
            t tVarA2 = g.a((ST0.f) hVar2);
            q qVarA = tVarA.a();
            q qVarA2 = tVarA2.a();
            int i13 = r.f412624c;
            long jA3 = I51.f.a(qVarA.f412619b.until(qVarA2.f412619b, ChronoUnit.DAYS));
            if (jA3 != 0) {
                long nanoOfDay = tVarA2.b().f412684b.toNanoOfDay() - tVarA.b().f412684b.toNanoOfDay();
                if (jA3 > 0) {
                    j12 = jA3 - 1;
                    j13 = nanoOfDay + 86400000000000L;
                } else {
                    j12 = jA3 + 1;
                    j13 = nanoOfDay - 86400000000000L;
                }
                i.INSTANCE.getClass();
                if (eVar.equals(i.f412483a)) {
                    j15 = j12 * 86400000000000L;
                } else {
                    if (eVar.equals(i.f412484b)) {
                        j13 /= 1000;
                        j14 = 86400000000L;
                    } else if (eVar.equals(i.f412485c)) {
                        j13 /= 1000000;
                        j14 = 86400000;
                    } else if (eVar.equals(i.f412486d)) {
                        j13 /= 1000000000;
                        j14 = 86400;
                    } else {
                        if (eVar.equals(i.f412487e)) {
                            j13 /= 60000000000L;
                            i12 = 1440;
                        } else {
                            if (!eVar.equals(i.f412488f)) {
                                throw new UnsupportedOperationException("Unknown DateTimeUnit " + eVar);
                            }
                            j13 /= 3600000000000L;
                            i12 = 24;
                        }
                        j14 = i12;
                    }
                    j15 = j12 * j14;
                }
                return j15 + j13;
            }
            jA2 = e.a(tVarA.b(), tVarA2.b(), eVar);
        }
        return jA2;
    }

    public static ST0.h b(ST0.h hVar, long j12, i.e eVar) throws NumberFormatException {
        if (hVar instanceof ST0.d) {
            a.f13718a.getClass();
            l lVarA = a.a((ST0.d) hVar);
            return new ST0.d(String.valueOf((j12 != Long.MIN_VALUE ? m.a(lVarA, -j12, eVar) : m.a(m.a(lVarA, -(j12 + 1), eVar), 1, eVar)).a()));
        }
        if (hVar instanceof ST0.g) {
            h.f13724a.getClass();
            return new ST0.g(e.b(h.a((ST0.g) hVar), -j12, eVar).f412684b.toString());
        }
        if (hVar instanceof ST0.f) {
            g.f13723a.getClass();
            return new ST0.f(e.d(g.a((ST0.f) hVar), -j12, eVar).f412681b.toString());
        }
        throw new IllegalArgumentException("Unsupported type " + hVar.getF14992a());
    }

    public static ST0.h c(ST0.h hVar, long j12, i.e eVar) {
        if (hVar instanceof ST0.d) {
            a.f13718a.getClass();
            return new ST0.d(String.valueOf(m.a(a.a((ST0.d) hVar), j12, eVar).a()));
        }
        if (hVar instanceof ST0.g) {
            h.f13724a.getClass();
            return new ST0.g(e.b(h.a((ST0.g) hVar), j12, eVar).f412684b.toString());
        }
        if (hVar instanceof ST0.f) {
            g.f13723a.getClass();
            return new ST0.f(e.d(g.a((ST0.f) hVar), j12, eVar).f412681b.toString());
        }
        throw new IllegalArgumentException("Unsupported type " + hVar.getF14992a());
    }

    @Override // RT0.g
    public final <T extends ST0.h> int B(@k T t12) {
        if (t12 instanceof ST0.g) {
            h.f13724a.getClass();
            return h.a((ST0.g) t12).f412684b.getHour();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).f412681b.getHour();
        }
        throw new IllegalArgumentException("Unsupported type " + t12.getF14992a());
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T D(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) c(t12, j12, i.f412487e);
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T G(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) b(t12, j12, i.f412485c);
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T H(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) b(t12, j12, i.f412488f);
    }

    @Override // RT0.g
    public final <T extends ST0.h> int P(@k T t12) {
        if (t12 instanceof ST0.g) {
            h.f13724a.getClass();
            return h.a((ST0.g) t12).f412684b.getSecond();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).f412681b.getSecond();
        }
        throw new IllegalArgumentException("Unsupported type " + t12.getF14992a());
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T Q(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) c(t12, j12, i.f412488f);
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T i(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) c(t12, j12, i.f412485c);
    }

    @Override // RT0.g
    public final <T extends ST0.h> long l(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412485c);
    }

    @Override // RT0.g
    @k
    public final ST0.g n(@k ST0.f fVar) {
        g.f13723a.getClass();
        return new ST0.g(g.a(fVar).b().f412684b.toString());
    }

    @Override // RT0.g
    public final <T extends ST0.h> int o(@k T t12) {
        if (t12 instanceof ST0.g) {
            h.f13724a.getClass();
            return h.a((ST0.g) t12).f412684b.getMinute();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).f412681b.getMinute();
        }
        throw new IllegalArgumentException("Unsupported type " + t12.getF14992a());
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T p(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) c(t12, j12, i.f412486d);
    }

    @Override // RT0.g
    public final <T extends ST0.h> long r(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412488f);
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T t(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) b(t12, j12, i.f412487e);
    }

    @Override // RT0.g
    public final <T extends ST0.h> long u(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412486d);
    }

    @Override // RT0.g
    public final <T extends ST0.h> long v(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412487e);
    }

    @Override // RT0.g
    public final <T extends ST0.h> int w(@k T t12) {
        long nano;
        if (t12 instanceof ST0.g) {
            h.f13724a.getClass();
            nano = h.a((ST0.g) t12).f412684b.getNano() / 1000000;
        } else {
            if (!(t12 instanceof ST0.f)) {
                throw new IllegalArgumentException("Unsupported type " + t12.getF14992a());
            }
            g.f13723a.getClass();
            nano = g.a((ST0.f) t12).f412681b.getNano() / 1000000;
        }
        return (int) nano;
    }

    @Override // RT0.g
    @k
    public final <T extends ST0.h> T z(@k T t12, long j12) {
        i.INSTANCE.getClass();
        return (T) b(t12, j12, i.f412486d);
    }
}
