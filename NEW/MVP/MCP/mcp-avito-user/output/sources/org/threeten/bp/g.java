package org.threeten.bp;

import com.yandex.div2.D8;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import w81.AbstractC49471c;

/* compiled from: LocalTime.java */
/* loaded from: classes8.dex */
public final class g extends AbstractC49471c implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Comparable<g>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f422067f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f422068g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f422069h;

    /* renamed from: i, reason: collision with root package name */
    public static final org.threeten.bp.temporal.j<g> f422070i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final g[] f422071j = new g[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: b, reason: collision with root package name */
    public final byte f422072b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f422073c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f422074d;

    /* renamed from: e, reason: collision with root package name */
    public final int f422075e;

    /* compiled from: LocalTime.java */
    public class a implements org.threeten.bp.temporal.j<g> {
        @Override // org.threeten.bp.temporal.j
        public final g a(org.threeten.bp.temporal.d dVar) {
            return g.r(dVar);
        }
    }

    /* compiled from: LocalTime.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422076a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f422077b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f422077b = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422077b[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f422077b[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f422077b[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f422077b[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f422077b[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f422077b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f422076a = iArr2;
            try {
                iArr2[ChronoField.f422128e.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f422076a[ChronoField.f422129f.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f422076a[ChronoField.f422130g.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f422076a[ChronoField.f422131h.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f422076a[ChronoField.f422132i.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f422076a[ChronoField.f422133j.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f422076a[ChronoField.f422134k.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f422076a[ChronoField.f422135l.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f422076a[ChronoField.f422136m.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f422076a[ChronoField.f422137n.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f422076a[ChronoField.f422138o.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f422076a[ChronoField.f422139p.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f422076a[ChronoField.f422140q.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f422076a[ChronoField.f422141r.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f422076a[ChronoField.f422142s.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i12 = 0;
        while (true) {
            g[] gVarArr = f422071j;
            if (i12 >= gVarArr.length) {
                g gVar = gVarArr[0];
                f422069h = gVar;
                g gVar2 = gVarArr[12];
                f422067f = gVar;
                f422068g = new g(23, 59, 59, 999999999);
                return;
            }
            gVarArr[i12] = new g(i12, 0, 0, 0);
            i12++;
        }
    }

    public g(int i12, int i13, int i14, int i15) {
        this.f422072b = (byte) i12;
        this.f422073c = (byte) i13;
        this.f422074d = (byte) i14;
        this.f422075e = i15;
    }

    public static g G(ObjectInput objectInput) throws IOException {
        int i12;
        int i13;
        int i14 = objectInput.readByte();
        int i15 = 0;
        if (i14 < 0) {
            i14 = ~i14;
            i12 = 0;
            i13 = 0;
        } else {
            byte b12 = objectInput.readByte();
            if (b12 < 0) {
                int i16 = ~b12;
                i13 = 0;
                i15 = i16;
                i12 = 0;
            } else {
                byte b13 = objectInput.readByte();
                if (b13 < 0) {
                    i12 = ~b13;
                } else {
                    i15 = objectInput.readInt();
                    i12 = b13;
                }
                i13 = i15;
                i15 = b12;
            }
        }
        return v(i14, i15, i12, i13);
    }

    public static g p(int i12, int i13, int i14, int i15) {
        return ((i13 | i14) | i15) == 0 ? f422071j[i12] : new g(i12, i13, i14, i15);
    }

    public static g r(org.threeten.bp.temporal.d dVar) {
        g gVar = (g) dVar.f(org.threeten.bp.temporal.i.f422204g);
        if (gVar != null) {
            return gVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g t() {
        d dVarA = new a.c(o.r()).a();
        long j12 = ((dVarA.f421935b % 86400) + r0.f421846b.o().a(dVarA).f422109c) % 86400;
        if (j12 < 0) {
            j12 += 86400;
        }
        return x(dVarA.f421936c, j12);
    }

    public static g u(int i12, int i13) {
        ChronoField.f422140q.i(i12);
        if (i13 == 0) {
            return f422071j[i12];
        }
        ChronoField.f422136m.i(i13);
        return new g(i12, i13, 0, 0);
    }

    public static g v(int i12, int i13, int i14, int i15) {
        ChronoField.f422140q.i(i12);
        ChronoField.f422136m.i(i13);
        ChronoField.f422134k.i(i14);
        ChronoField.f422128e.i(i15);
        return p(i12, i13, i14, i15);
    }

    public static g w(long j12) {
        ChronoField.f422129f.i(j12);
        int i12 = (int) (j12 / 3600000000000L);
        long j13 = j12 - (i12 * 3600000000000L);
        int i13 = (int) (j13 / 60000000000L);
        long j14 = j13 - (i13 * 60000000000L);
        int i14 = (int) (j14 / 1000000000);
        return p(i12, i13, i14, (int) (j14 - (i14 * 1000000000)));
    }

    private Object writeReplace() {
        return new l((byte) 5, this);
    }

    public static g x(int i12, long j12) {
        ChronoField.f422135l.i(j12);
        ChronoField.f422128e.i(i12);
        int i13 = (int) (j12 / 3600);
        long j13 = j12 - (i13 * 3600);
        return p(i13, (int) (j13 / 60), (int) (j13 - (r1 * 60)), i12);
    }

    public static g z(long j12) {
        ChronoField.f422135l.i(j12);
        int i12 = (int) (j12 / 3600);
        long j13 = j12 - (i12 * 3600);
        return p(i12, (int) (j13 / 60), (int) (j13 - (r1 * 60)), 0);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final g r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (g) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 0:
                return E(j12);
            case 1:
                return E((j12 % 86400000000L) * 1000);
            case 2:
                return E((j12 % 86400000) * 1000000);
            case 3:
                return F(j12);
            case 4:
                return C(j12);
            case 5:
                return B(j12);
            case 6:
                return B((j12 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    public final g B(long j12) {
        if (j12 == 0) {
            return this;
        }
        return p(((((int) (j12 % 24)) + this.f422072b) + 24) % 24, this.f422073c, this.f422074d, this.f422075e);
    }

    public final g C(long j12) {
        if (j12 == 0) {
            return this;
        }
        int i12 = (this.f422072b * 60) + this.f422073c;
        int i13 = ((((int) (j12 % 1440)) + i12) + 1440) % 1440;
        return i12 == i13 ? this : p(i13 / 60, i13 % 60, this.f422074d, this.f422075e);
    }

    public final g E(long j12) {
        if (j12 == 0) {
            return this;
        }
        long jH2 = H();
        long j13 = (((j12 % 86400000000000L) + jH2) + 86400000000000L) % 86400000000000L;
        return jH2 == j13 ? this : p((int) (j13 / 3600000000000L), (int) ((j13 / 60000000000L) % 60), (int) ((j13 / 1000000000) % 60), (int) (j13 % 1000000000));
    }

    public final g F(long j12) {
        if (j12 == 0) {
            return this;
        }
        int i12 = (this.f422073c * 60) + (this.f422072b * 3600) + this.f422074d;
        int i13 = ((((int) (j12 % 86400)) + i12) + 86400) % 86400;
        return i12 == i13 ? this : p(i13 / 3600, (i13 / 60) % 60, i13 % 60, this.f422075e);
    }

    public final long H() {
        return (this.f422074d * 1000000000) + (this.f422073c * 60000000000L) + (this.f422072b * 3600000000000L) + this.f422075e;
    }

    public final int J() {
        return (this.f422073c * 60) + (this.f422072b * 3600) + this.f422074d;
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final g w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (g) hVar.a(this, j12);
        }
        ChronoField chronoField = (ChronoField) hVar;
        chronoField.i(j12);
        int iOrdinal = chronoField.ordinal();
        byte b12 = this.f422074d;
        int i12 = this.f422075e;
        byte b13 = this.f422072b;
        byte b14 = this.f422073c;
        switch (iOrdinal) {
            case 0:
                return N((int) j12);
            case 1:
                return w(j12);
            case 2:
                return N(((int) j12) * 1000);
            case 3:
                return w(j12 * 1000);
            case 4:
                return N(((int) j12) * 1000000);
            case 5:
                return w(j12 * 1000000);
            case 6:
                int i13 = (int) j12;
                if (b12 == i13) {
                    return this;
                }
                ChronoField.f422134k.i(i13);
                return p(b13, b14, i13, i12);
            case 7:
                return F(j12 - J());
            case 8:
                int i14 = (int) j12;
                if (b14 == i14) {
                    return this;
                }
                ChronoField.f422136m.i(i14);
                return p(b13, i14, b12, i12);
            case 9:
                return C(j12 - ((b13 * 60) + b14));
            case 10:
                return B(j12 - (b13 % 12));
            case 11:
                if (j12 == 12) {
                    j12 = 0;
                }
                return B(j12 - (b13 % 12));
            case 12:
                return L((int) j12);
            case 13:
                if (j12 == 24) {
                    j12 = 0;
                }
                return L((int) j12);
            case 14:
                return B((j12 - (b13 / 12)) * 12);
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    public final g L(int i12) {
        if (this.f422072b == i12) {
            return this;
        }
        ChronoField.f422140q.i(i12);
        return p(i12, this.f422073c, this.f422074d, this.f422075e);
    }

    public final g N(int i12) {
        if (this.f422075e == i12) {
            return this;
        }
        ChronoField.f422128e.i(i12);
        return p(this.f422072b, this.f422073c, this.f422074d, i12);
    }

    public final void O(DataOutput dataOutput) throws IOException {
        byte b12 = this.f422074d;
        byte b13 = this.f422072b;
        byte b14 = this.f422073c;
        int i12 = this.f422075e;
        if (i12 != 0) {
            dataOutput.writeByte(b13);
            dataOutput.writeByte(b14);
            dataOutput.writeByte(b12);
            dataOutput.writeInt(i12);
            return;
        }
        if (b12 != 0) {
            dataOutput.writeByte(b13);
            dataOutput.writeByte(b14);
            dataOutput.writeByte(~b12);
        } else if (b14 == 0) {
            dataOutput.writeByte(~b13);
        } else {
            dataOutput.writeByte(b13);
            dataOutput.writeByte(~b14);
        }
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(H(), ChronoField.f422129f);
    }

    @Override // org.threeten.bp.temporal.c
    /* renamed from: e */
    public final org.threeten.bp.temporal.c x(e eVar) {
        return (g) eVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f422072b == gVar.f422072b && this.f422073c == gVar.f422073c && this.f422074d == gVar.f422074d && this.f422075e == gVar.f422075e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422200c) {
            return (R) ChronoUnit.NANOS;
        }
        if (jVar == org.threeten.bp.temporal.i.f422204g) {
            return this;
        }
        if (jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422198a || jVar == org.threeten.bp.temporal.i.f422201d || jVar == org.threeten.bp.temporal.i.f422202e || jVar == org.threeten.bp.temporal.i.f422203f) {
            return null;
        }
        return jVar.a(this);
    }

    public final int hashCode() {
        long jH2 = H();
        return (int) (jH2 ^ (jH2 >>> 32));
    }

    @Override // org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        return j12 == Long.MIN_VALUE ? n(Long.MAX_VALUE, kVar).n(1L, kVar) : n(-j12, kVar);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? s(hVar) : super.k(hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422129f ? H() : hVar == ChronoField.f422131h ? H() / 1000 : s(hVar) : hVar.h(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        byte b12 = gVar.f422072b;
        int i12 = 0;
        byte b13 = this.f422072b;
        int i13 = b13 < b12 ? -1 : b13 > b12 ? 1 : 0;
        if (i13 != 0) {
            return i13;
        }
        byte b14 = this.f422073c;
        byte b15 = gVar.f422073c;
        int i14 = b14 < b15 ? -1 : b14 > b15 ? 1 : 0;
        if (i14 != 0) {
            return i14;
        }
        byte b16 = this.f422074d;
        byte b17 = gVar.f422074d;
        int i15 = b16 < b17 ? -1 : b16 > b17 ? 1 : 0;
        if (i15 != 0) {
            return i15;
        }
        int i16 = this.f422075e;
        int i17 = gVar.f422075e;
        if (i16 < i17) {
            i12 = -1;
        } else if (i16 > i17) {
            i12 = 1;
        }
        return i12;
    }

    public final String q(org.threeten.bp.format.c cVar) {
        w81.d.f(cVar, "formatter");
        return cVar.a(this);
    }

    public final int s(org.threeten.bp.temporal.h hVar) {
        int iOrdinal = ((ChronoField) hVar).ordinal();
        byte b12 = this.f422073c;
        int i12 = this.f422075e;
        byte b13 = this.f422072b;
        switch (iOrdinal) {
            case 0:
                return i12;
            case 1:
                throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
            case 2:
                return i12 / 1000;
            case 3:
                throw new DateTimeException(D8.p("Field too large for an int: ", hVar));
            case 4:
                return i12 / 1000000;
            case 5:
                return (int) (H() / 1000000);
            case 6:
                return this.f422074d;
            case 7:
                return J();
            case 8:
                return b12;
            case 9:
                return (b13 * 60) + b12;
            case 10:
                return b13 % 12;
            case 11:
                int i13 = b13 % 12;
                if (i13 % 12 == 0) {
                    return 12;
                }
                return i13;
            case 12:
                return b13;
            case 13:
                if (b13 == 0) {
                    return 24;
                }
                return b13;
            case 14:
                return b13 / 12;
            default:
                throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b12 = this.f422072b;
        sb2.append(b12 < 10 ? "0" : "");
        sb2.append((int) b12);
        byte b13 = this.f422073c;
        sb2.append(b13 < 10 ? ":0" : ":");
        sb2.append((int) b13);
        byte b14 = this.f422074d;
        int i12 = this.f422075e;
        if (b14 > 0 || i12 > 0) {
            sb2.append(b14 < 10 ? ":0" : ":");
            sb2.append((int) b14);
            if (i12 > 0) {
                sb2.append('.');
                if (i12 % 1000000 == 0) {
                    sb2.append(Integer.toString((i12 / 1000000) + 1000).substring(1));
                } else if (i12 % 1000 == 0) {
                    sb2.append(Integer.toString((i12 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i12 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }
}
