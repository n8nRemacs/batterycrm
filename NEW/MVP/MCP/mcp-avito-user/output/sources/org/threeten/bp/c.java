package org.threeten.bp;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: Duration.java */
/* loaded from: classes8.dex */
public final class c implements org.threeten.bp.temporal.g, Comparable<c>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f421847d = new c(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: b, reason: collision with root package name */
    public final long f421848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f421849c;

    /* compiled from: Duration.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421850a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421850a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421850a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421850a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421850a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public c(long j12, int i12) {
        this.f421848b = j12;
        this.f421849c = i12;
    }

    public static c b(int i12, long j12) {
        return (((long) i12) | j12) == 0 ? f421847d : new c(j12, i12);
    }

    public static c c(long j12) {
        long j13 = j12 / 1000000000;
        int i12 = (int) (j12 % 1000000000);
        if (i12 < 0) {
            i12 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j13--;
        }
        return b(i12, j13);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 1, this);
    }

    @Override // org.threeten.bp.temporal.g
    public final org.threeten.bp.temporal.c a(org.threeten.bp.chrono.c cVar) {
        long j12 = this.f421848b;
        org.threeten.bp.temporal.c cVarR = cVar;
        if (j12 != 0) {
            cVarR = cVar.r(j12, ChronoUnit.SECONDS);
        }
        int i12 = this.f421849c;
        return i12 != 0 ? cVarR.r(i12, ChronoUnit.NANOS) : cVarR;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int iA2 = w81.d.a(this.f421848b, cVar2.f421848b);
        return iA2 != 0 ? iA2 : this.f421849c - cVar2.f421849c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f421848b == cVar.f421848b && this.f421849c == cVar.f421849c;
    }

    public final int hashCode() {
        long j12 = this.f421848b;
        return (this.f421849c * 51) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        if (this == f421847d) {
            return "PT0S";
        }
        long j12 = this.f421848b;
        long j13 = j12 / 3600;
        int i12 = (int) ((j12 % 3600) / 60);
        int i13 = (int) (j12 % 60);
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(24, "PT");
        if (j13 != 0) {
            sbQ.append(j13);
            sbQ.append('H');
        }
        if (i12 != 0) {
            sbQ.append(i12);
            sbQ.append('M');
        }
        int i14 = this.f421849c;
        if (i13 == 0 && i14 == 0 && sbQ.length() > 2) {
            return sbQ.toString();
        }
        if (i13 >= 0 || i14 <= 0) {
            sbQ.append(i13);
        } else if (i13 == -1) {
            sbQ.append("-0");
        } else {
            sbQ.append(i13 + 1);
        }
        if (i14 > 0) {
            int length = sbQ.length();
            if (i13 < 0) {
                sbQ.append(2000000000 - i14);
            } else {
                sbQ.append(i14 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            }
            while (sbQ.charAt(sbQ.length() - 1) == '0') {
                sbQ.setLength(sbQ.length() - 1);
            }
            sbQ.setCharAt(length, '.');
        }
        sbQ.append('S');
        return sbQ.toString();
    }
}
