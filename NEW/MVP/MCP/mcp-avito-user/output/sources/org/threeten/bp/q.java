package org.threeten.bp;

import androidx.camera.camera2.internal.G;
import com.yandex.div2.D8;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ZoneOffset.java */
/* loaded from: classes8.dex */
public final class q extends o implements org.threeten.bp.temporal.d, org.threeten.bp.temporal.e, Comparable<q>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f422104e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f422105f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f422106g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f422107h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f422108i;
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: c, reason: collision with root package name */
    public final int f422109c;

    /* renamed from: d, reason: collision with root package name */
    public final transient String f422110d;

    /* compiled from: ZoneOffset.java */
    public class a implements org.threeten.bp.temporal.j<q> {
        @Override // org.threeten.bp.temporal.j
        public final q a(org.threeten.bp.temporal.d dVar) {
            return q.t(dVar);
        }
    }

    static {
        new a();
        f422104e = new ConcurrentHashMap(16, 0.75f, 4);
        f422105f = new ConcurrentHashMap(16, 0.75f, 4);
        f422106g = w(0);
        f422107h = w(-64800);
        f422108i = w(64800);
    }

    public q(int i12) {
        String string;
        this.f422109c = i12;
        if (i12 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i12);
            StringBuilder sb2 = new StringBuilder();
            int i13 = iAbs / 3600;
            int i14 = (iAbs / 60) % 60;
            sb2.append(i12 < 0 ? "-" : "+");
            sb2.append(i13 < 10 ? "0" : "");
            sb2.append(i13);
            sb2.append(i14 < 10 ? ":0" : ":");
            sb2.append(i14);
            int i15 = iAbs % 60;
            if (i15 != 0) {
                sb2.append(i15 < 10 ? ":0" : ":");
                sb2.append(i15);
            }
            string = sb2.toString();
        }
        this.f422110d = string;
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static q t(org.threeten.bp.temporal.d dVar) {
        q qVar = (q) dVar.f(org.threeten.bp.temporal.i.f422202e);
        if (qVar != null) {
            return qVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.threeten.bp.q u(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            w81.d.f(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = org.threeten.bp.q.f422105f
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.q r0 = (org.threeten.bp.q) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = x(r2, r7, r3)
            int r1 = x(r6, r7, r2)
            int r2 = x(r5, r7, r2)
            goto L85
        L37:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = x(r2, r7, r3)
            int r1 = x(r1, r7, r3)
            int r2 = x(r4, r7, r3)
            goto L85
        L50:
            int r0 = x(r2, r7, r3)
            int r1 = x(r6, r7, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = x(r2, r7, r3)
            int r1 = x(r1, r7, r3)
            goto L58
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7f:
            int r0 = x(r2, r7, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.q r7 = v(r7, r0, r1)
            return r7
        La8:
            org.threeten.bp.q r7 = v(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.q.u(java.lang.String):org.threeten.bp.q");
    }

    public static q v(int i12, int i13, int i14) {
        if (i12 < -18 || i12 > 18) {
            throw new DateTimeException(G.e(i12, "Zone offset hours not in valid range: value ", " is not in the range -18 to 18"));
        }
        if (i12 > 0) {
            if (i13 < 0 || i14 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i12 < 0) {
            if (i13 > 0 || i14 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i13 > 0 && i14 < 0) || (i13 < 0 && i14 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i13) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i13) + " is not in the range 0 to 59");
        }
        if (Math.abs(i14) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i14) + " is not in the range 0 to 59");
        }
        if (Math.abs(i12) == 18 && (Math.abs(i13) > 0 || Math.abs(i14) > 0)) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return w((i13 * 60) + (i12 * 3600) + i14);
    }

    public static q w(int i12) {
        if (Math.abs(i12) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i12 % 900 != 0) {
            return new q(i12);
        }
        Integer numValueOf = Integer.valueOf(i12);
        ConcurrentHashMap concurrentHashMap = f422104e;
        q qVar = (q) concurrentHashMap.get(numValueOf);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new q(i12));
        q qVar2 = (q) concurrentHashMap.get(numValueOf);
        f422105f.putIfAbsent(qVar2.f422110d, qVar2);
        return qVar2;
    }

    private Object writeReplace() {
        return new l((byte) 8, this);
    }

    public static int x(int i12, String str, boolean z12) {
        if (z12 && str.charAt(i12 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i12);
        char cCharAt2 = str.charAt(i12 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static q z(ObjectInput objectInput) throws IOException {
        byte b12 = objectInput.readByte();
        return b12 == 127 ? w(objectInput.readInt()) : w(b12 * 900);
    }

    public final void A(DataOutput dataOutput) throws IOException {
        int i12 = this.f422109c;
        int i13 = i12 % 900 == 0 ? i12 / 900 : 127;
        dataOutput.writeByte(i13);
        if (i13 == 127) {
            dataOutput.writeInt(i12);
        }
    }

    @Override // org.threeten.bp.temporal.e
    public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
        return cVar.w(this.f422109c, ChronoField.f422126H);
    }

    @Override // org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422126H) {
            return hVar.f();
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        return qVar.f422109c - this.f422109c;
    }

    @Override // org.threeten.bp.o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f422109c == ((q) obj).f422109c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        if (jVar == org.threeten.bp.temporal.i.f422202e || jVar == org.threeten.bp.temporal.i.f422201d) {
            return this;
        }
        if (jVar == org.threeten.bp.temporal.i.f422203f || jVar == org.threeten.bp.temporal.i.f422204g || jVar == org.threeten.bp.temporal.i.f422200c || jVar == org.threeten.bp.temporal.i.f422199b || jVar == org.threeten.bp.temporal.i.f422198a) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // org.threeten.bp.o
    public final String h() {
        return this.f422110d;
    }

    @Override // org.threeten.bp.o
    public final int hashCode() {
        return this.f422109c;
    }

    @Override // org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422126H) {
            return this.f422109c;
        }
        if (hVar instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(D8.p("Unsupported field: ", hVar));
        }
        return b(hVar).a(m(hVar), hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? hVar == ChronoField.f422126H : hVar != null && hVar.b(this);
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        if (hVar == ChronoField.f422126H) {
            return this.f422109c;
        }
        if (hVar instanceof ChronoField) {
            throw new DateTimeException(D8.p("Unsupported field: ", hVar));
        }
        return hVar.h(this);
    }

    @Override // org.threeten.bp.o
    public final org.threeten.bp.zone.f o() {
        return org.threeten.bp.zone.f.g(this);
    }

    @Override // org.threeten.bp.o
    public final void s(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        A(objectOutput);
    }

    @Override // org.threeten.bp.o
    public final String toString() {
        return this.f422110d;
    }
}
