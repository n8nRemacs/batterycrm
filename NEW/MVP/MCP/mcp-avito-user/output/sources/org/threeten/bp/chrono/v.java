package org.threeten.bp.chrono;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: ThaiBuddhistChronology.java */
/* loaded from: classes8.dex */
public final class v extends j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final v f421929d = new v();
    private static final long serialVersionUID = 2775954514031616474L;

    /* compiled from: ThaiBuddhistChronology.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421930a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f421930a = iArr;
            try {
                iArr[ChronoField.f422121C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421930a[ChronoField.f422122D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421930a[ChronoField.f422123E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Object readResolve() {
        return f421929d;
    }

    @Override // org.threeten.bp.chrono.j
    public final c a(int i12, int i13, int i14) {
        return new w(org.threeten.bp.e.N(i12 - 543, i13, i14));
    }

    @Override // org.threeten.bp.chrono.j
    public final c b(org.threeten.bp.temporal.d dVar) {
        return dVar instanceof w ? (w) dVar : new w(org.threeten.bp.e.B(dVar));
    }

    @Override // org.threeten.bp.chrono.j
    public final c c(long j12) {
        return new w(org.threeten.bp.e.P(j12));
    }

    @Override // org.threeten.bp.chrono.j
    public final l h(int i12) {
        if (i12 == 0) {
            return ThaiBuddhistEra.f421860b;
        }
        if (i12 == 1) {
            return ThaiBuddhistEra.f421861c;
        }
        throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
    }

    @Override // org.threeten.bp.chrono.j
    public final String k() {
        return "buddhist";
    }

    @Override // org.threeten.bp.chrono.j
    public final String l() {
        return "ThaiBuddhist";
    }

    @Override // org.threeten.bp.chrono.j
    public final h<w> q(org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        return i.C(this, dVar, oVar);
    }

    public final org.threeten.bp.temporal.l r(ChronoField chronoField) {
        switch (chronoField.ordinal()) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                org.threeten.bp.temporal.l lVar = ChronoField.f422121C.f422152d;
                return org.threeten.bp.temporal.l.d(lVar.f422205b + 6516, lVar.f422208e + 6516);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                org.threeten.bp.temporal.l lVar2 = ChronoField.f422123E.f422152d;
                return org.threeten.bp.temporal.l.e(1L, 1L, (-(lVar2.f422205b + 543)) + 1, lVar2.f422208e + 543);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                org.threeten.bp.temporal.l lVar3 = ChronoField.f422123E.f422152d;
                return org.threeten.bp.temporal.l.d(lVar3.f422205b + 543, lVar3.f422208e + 543);
            default:
                return chronoField.f422152d;
        }
    }
}
