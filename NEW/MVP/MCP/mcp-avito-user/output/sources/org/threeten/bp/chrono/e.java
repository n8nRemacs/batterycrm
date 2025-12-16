package org.threeten.bp.chrono;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.Serializable;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: ChronoLocalDateTimeImpl.java */
/* loaded from: classes8.dex */
final class e<D extends c> extends d<D> implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f421864d = 0;
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: b, reason: collision with root package name */
    public final D f421865b;

    /* renamed from: c, reason: collision with root package name */
    public final org.threeten.bp.g f421866c;

    /* compiled from: ChronoLocalDateTimeImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421867a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421867a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421867a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421867a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421867a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421867a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421867a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421867a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public e(D d12, org.threeten.bp.g gVar) {
        w81.d.f(d12, "date");
        w81.d.f(gVar, CrashHianalyticsData.TIME);
        this.f421865b = d12;
        this.f421866c = gVar;
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    public final e<D> A(D d12, long j12, long j13, long j14, long j15) {
        long j16 = j12 | j13 | j14 | j15;
        org.threeten.bp.g gVarW = this.f421866c;
        if (j16 == 0) {
            return C(d12, gVarW);
        }
        long j17 = j13 / 1440;
        long j18 = j12 / 24;
        long j19 = (j13 % 1440) * 60000000000L;
        long j22 = ((j12 % 24) * 3600000000000L) + j19 + ((j14 % 86400) * 1000000000) + (j15 % 86400000000000L);
        long jH2 = gVarW.H();
        long j23 = j22 + jH2;
        long jC2 = w81.d.c(j23, 86400000000000L) + j18 + j17 + (j14 / 86400) + (j15 / 86400000000000L);
        long j24 = ((j23 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j24 != jH2) {
            gVarW = org.threeten.bp.g.w(j24);
        }
        return C(d12.r(jC2, ChronoUnit.DAYS), gVarW);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final e w(long j12, org.threeten.bp.temporal.h hVar) {
        boolean z12 = hVar instanceof ChronoField;
        D d12 = this.f421865b;
        if (!z12) {
            return d12.q().e(hVar.a(this, j12));
        }
        boolean zK2 = ((ChronoField) hVar).k();
        org.threeten.bp.g gVar = this.f421866c;
        return zK2 ? C(d12, gVar.c(j12, hVar)) : C(d12.w(j12, hVar), gVar);
    }

    public final e<D> C(org.threeten.bp.temporal.c cVar, org.threeten.bp.g gVar) {
        D d12 = this.f421865b;
        return (d12 == cVar && this.f421866c == gVar) ? this : new e<>(d12.q().d(cVar), gVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar instanceof ChronoField) {
            return (((ChronoField) hVar).k() ? this.f421866c : this.f421865b).b(hVar);
        }
        return hVar.d(this);
    }

    @Override // org.threeten.bp.chrono.d, w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(org.threeten.bp.e eVar) {
        return C(eVar, this.f421866c);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() ? this.f421866c.k(hVar) : this.f421865b.k(hVar) : b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar != null && hVar.b(this);
        }
        ChronoField chronoField = (ChronoField) hVar;
        return chronoField.e() || chronoField.k();
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() ? this.f421866c.m(hVar) : this.f421865b.m(hVar) : hVar.h(this);
    }

    @Override // org.threeten.bp.chrono.d
    public final h<D> o(org.threeten.bp.o oVar) {
        return i.B(oVar, null, this);
    }

    @Override // org.threeten.bp.chrono.d
    public final D u() {
        return this.f421865b;
    }

    @Override // org.threeten.bp.chrono.d
    public final org.threeten.bp.g v() {
        return this.f421866c;
    }

    @Override // org.threeten.bp.chrono.d
    public final d x(org.threeten.bp.e eVar) {
        return C(eVar, this.f421866c);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final e<D> r(long j12, org.threeten.bp.temporal.k kVar) {
        boolean z12 = kVar instanceof ChronoUnit;
        D d12 = this.f421865b;
        if (!z12) {
            return d12.q().e(kVar.a(this, j12));
        }
        int iOrdinal = ((ChronoUnit) kVar).ordinal();
        org.threeten.bp.g gVar = this.f421866c;
        switch (iOrdinal) {
            case 0:
                return A(this.f421865b, 0L, 0L, 0L, j12);
            case 1:
                e<D> eVarC = C(d12.r(j12 / 86400000000L, ChronoUnit.DAYS), gVar);
                return eVarC.A(eVarC.f421865b, 0L, 0L, 0L, (j12 % 86400000000L) * 1000);
            case 2:
                e<D> eVarC2 = C(d12.r(j12 / 86400000, ChronoUnit.DAYS), gVar);
                return eVarC2.A(eVarC2.f421865b, 0L, 0L, 0L, (j12 % 86400000) * 1000000);
            case 3:
                return A(this.f421865b, 0L, 0L, j12, 0L);
            case 4:
                return A(this.f421865b, 0L, j12, 0L, 0L);
            case 5:
                return A(this.f421865b, j12, 0L, 0L, 0L);
            case 6:
                e<D> eVarC3 = C(d12.r(j12 / 256, ChronoUnit.DAYS), gVar);
                return eVarC3.A(eVarC3.f421865b, (j12 % 256) * 12, 0L, 0L, 0L);
            default:
                return C(d12.r(j12, kVar), gVar);
        }
    }
}
