package org.threeten.bp.chrono;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: MinguoDate.java */
/* loaded from: classes8.dex */
public final class t extends b<t> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f421924c = 0;
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.e f421925b;

    /* compiled from: MinguoDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421926a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421926a = iArr;
            try {
                iArr[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421926a[ChronoField.f422147x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421926a[ChronoField.f422149z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421926a[ChronoField.f422122D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421926a[ChronoField.f422121C.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421926a[ChronoField.f422123E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421926a[ChronoField.f422124F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public t(org.threeten.bp.e eVar) {
        w81.d.f(eVar, "date");
        this.f421925b = eVar;
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    @Override // org.threeten.bp.chrono.b
    public final b A(long j12) {
        return G(this.f421925b.S(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b B(long j12) {
        return G(this.f421925b.T(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b C(long j12) {
        return G(this.f421925b.V(j12));
    }

    public final int E() {
        return this.f421925b.f421941b - 1911;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final t w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (t) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        if (m(chronoField) == j12) {
            return this;
        }
        int iOrdinal = chronoField.ordinal();
        org.threeten.bp.e eVar = this.f421925b;
        switch (iOrdinal) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                s.f421922d.r(chronoField).b(j12, chronoField);
                return G(eVar.T(j12 - (((E() * 12) + eVar.f421942c) - 1)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iA2 = s.f421922d.r(chronoField).a(j12, chronoField);
                switch (chronoField.ordinal()) {
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return G(eVar.Z(E() >= 1 ? iA2 + 1911 : 1912 - iA2));
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return G(eVar.Z(iA2 + 1911));
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        return G(eVar.Z(1912 - E()));
                }
        }
        return G(eVar.c(j12, hVar));
    }

    public final t G(org.threeten.bp.e eVar) {
        return eVar.equals(this.f421925b) ? this : new t(eVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.d(this);
        }
        if (!l(hVar)) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        ChronoField chronoField = (ChronoField) hVar;
        int iOrdinal = chronoField.ordinal();
        if (iOrdinal == 18 || iOrdinal == 19 || iOrdinal == 21) {
            return this.f421925b.b(hVar);
        }
        if (iOrdinal != 25) {
            return s.f421922d.r(chronoField);
        }
        org.threeten.bp.temporal.l lVar = ChronoField.f422123E.f422152d;
        return org.threeten.bp.temporal.l.d(1L, E() <= 0 ? (-lVar.f422205b) + 1912 : lVar.f422208e - 1911);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(org.threeten.bp.e eVar) {
        return (t) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f421925b.equals(((t) obj).f421925b);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.c
    public final int hashCode() {
        s.f421922d.getClass();
        return this.f421925b.hashCode() ^ (-1990173233);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (t) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        org.threeten.bp.e eVar = this.f421925b;
        switch (iOrdinal) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return ((E() * 12) + eVar.f421942c) - 1;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iE2 = E();
                if (iE2 < 1) {
                    iE2 = 1 - iE2;
                }
                return iE2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return E();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return E() < 1 ? 0 : 1;
            default:
                return eVar.m(hVar);
        }
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.c
    /* renamed from: n */
    public final org.threeten.bp.temporal.c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (t) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<t> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final j q() {
        return s.f421922d;
    }

    @Override // org.threeten.bp.chrono.c
    public final l r() {
        return (MinguoEra) super.r();
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: s */
    public final c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (t) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: t */
    public final c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (t) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final c u(org.threeten.bp.temporal.g gVar) {
        return (t) super.u(gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final long v() {
        return this.f421925b.v();
    }

    @Override // org.threeten.bp.chrono.c
    public final c x(org.threeten.bp.temporal.e eVar) {
        return (t) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: z */
    public final b r(long j12, org.threeten.bp.temporal.k kVar) {
        return (t) super.r(j12, kVar);
    }
}
