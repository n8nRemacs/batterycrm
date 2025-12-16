package org.threeten.bp.chrono;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.div2.D8;
import java.io.Serializable;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ThaiBuddhistDate.java */
/* loaded from: classes8.dex */
public final class w extends b<w> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f421931c = 0;
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.e f421932b;

    /* compiled from: ThaiBuddhistDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421933a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421933a = iArr;
            try {
                iArr[ChronoField.f422146w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421933a[ChronoField.f422147x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421933a[ChronoField.f422149z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421933a[ChronoField.f422122D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421933a[ChronoField.f422121C.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421933a[ChronoField.f422123E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421933a[ChronoField.f422124F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public w(org.threeten.bp.e eVar) {
        w81.d.f(eVar, "date");
        this.f421932b = eVar;
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    @Override // org.threeten.bp.chrono.b
    public final b A(long j12) {
        return G(this.f421932b.S(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b B(long j12) {
        return G(this.f421932b.T(j12));
    }

    @Override // org.threeten.bp.chrono.b
    public final b C(long j12) {
        return G(this.f421932b.V(j12));
    }

    public final int E() {
        return this.f421932b.f421941b + 543;
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final w w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (w) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        if (m(chronoField) == j12) {
            return this;
        }
        int iOrdinal = chronoField.ordinal();
        org.threeten.bp.e eVar = this.f421932b;
        switch (iOrdinal) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                v.f421929d.r(chronoField).b(j12, chronoField);
                return G(eVar.T(j12 - (((E() * 12) + eVar.f421942c) - 1)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iA2 = v.f421929d.r(chronoField).a(j12, chronoField);
                switch (chronoField.ordinal()) {
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        if (E() < 1) {
                            iA2 = 1 - iA2;
                        }
                        return G(eVar.Z(iA2 - 543));
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return G(eVar.Z(iA2 - 543));
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        return G(eVar.Z((-542) - E()));
                }
        }
        return G(eVar.c(j12, hVar));
    }

    public final w G(org.threeten.bp.e eVar) {
        return eVar.equals(this.f421932b) ? this : new w(eVar);
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
            return this.f421932b.b(hVar);
        }
        if (iOrdinal != 25) {
            return v.f421929d.r(chronoField);
        }
        org.threeten.bp.temporal.l lVar = ChronoField.f422123E.f422152d;
        return org.threeten.bp.temporal.l.d(1L, E() <= 0 ? (-(lVar.f422205b + 543)) + 1 : 543 + lVar.f422208e);
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(org.threeten.bp.e eVar) {
        return (w) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f421932b.equals(((w) obj).f421932b);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.c
    public final int hashCode() {
        v.f421929d.getClass();
        return this.f421932b.hashCode() ^ 146118545;
    }

    @Override // org.threeten.bp.chrono.c, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (w) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar.h(this);
        }
        int iOrdinal = ((ChronoField) hVar).ordinal();
        org.threeten.bp.e eVar = this.f421932b;
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
        return (w) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<w> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final j q() {
        return v.f421929d;
    }

    @Override // org.threeten.bp.chrono.c
    public final l r() {
        return (ThaiBuddhistEra) super.r();
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: s */
    public final c i(long j12, org.threeten.bp.temporal.k kVar) {
        return (w) super.i(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: t */
    public final c r(long j12, org.threeten.bp.temporal.k kVar) {
        return (w) super.r(j12, kVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final c u(org.threeten.bp.temporal.g gVar) {
        return (w) super.u(gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public final long v() {
        return this.f421932b.v();
    }

    @Override // org.threeten.bp.chrono.c
    public final c x(org.threeten.bp.temporal.e eVar) {
        return (w) super.x(eVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: z */
    public final b r(long j12, org.threeten.bp.temporal.k kVar) {
        return (w) super.r(j12, kVar);
    }
}
