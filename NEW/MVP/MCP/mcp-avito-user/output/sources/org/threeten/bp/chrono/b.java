package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: ChronoDateImpl.java */
/* loaded from: classes8.dex */
abstract class b<D extends c> extends c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* compiled from: ChronoDateImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421863a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421863a = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421863a[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421863a[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421863a[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421863a[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421863a[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421863a[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public abstract b<D> A(long j12);

    public abstract b<D> B(long j12);

    public abstract b<D> C(long j12);

    @Override // org.threeten.bp.chrono.c
    public d<?> o(org.threeten.bp.g gVar) {
        return new e(this, gVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b<D> r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (b) q().d(kVar.a(this, j12));
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 7:
                return A(j12);
            case 8:
                return A(w81.d.i(7, j12));
            case 9:
                return B(j12);
            case 10:
                return C(j12);
            case 11:
                return C(w81.d.i(10, j12));
            case 12:
                return C(w81.d.i(100, j12));
            case 13:
                return C(w81.d.i(1000, j12));
            default:
                throw new DateTimeException(kVar + " not valid for chronology " + q().l());
        }
    }
}
