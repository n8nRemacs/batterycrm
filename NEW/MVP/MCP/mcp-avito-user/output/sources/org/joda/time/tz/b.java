package org.joda.time.tz;

import androidx.appcompat.app.r;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44856c;
import org.joda.time.C44866h;
import org.joda.time.chrono.x;

/* compiled from: DateTimeZoneBuilder.java */
/* loaded from: classes7.dex */
public class b {

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class a extends AbstractC44868j {
        private static final long serialVersionUID = 6941492635554961361L;

        /* renamed from: g, reason: collision with root package name */
        public final int f420974g;

        /* renamed from: h, reason: collision with root package name */
        public final d f420975h;

        /* renamed from: i, reason: collision with root package name */
        public final d f420976i;

        public a(String str, int i12, d dVar, d dVar2) {
            super(str);
            this.f420974g = i12;
            this.f420975h = dVar;
            this.f420976i = dVar2;
        }

        @Override // org.joda.time.AbstractC44868j
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f420915b.equals(aVar.f420915b) && this.f420974g == aVar.f420974g && this.f420975h.equals(aVar.f420975h) && this.f420976i.equals(aVar.f420976i);
        }

        @Override // org.joda.time.AbstractC44868j
        public final String g(long j12) {
            return s(j12).f420989b;
        }

        @Override // org.joda.time.AbstractC44868j
        public final int i(long j12) {
            return this.f420974g + s(j12).f420990c;
        }

        @Override // org.joda.time.AbstractC44868j
        public final int m(long j12) {
            return this.f420974g;
        }

        @Override // org.joda.time.AbstractC44868j
        public final boolean n() {
            return false;
        }

        @Override // org.joda.time.AbstractC44868j
        public final long o(long j12) {
            long jA2;
            int i12 = this.f420974g;
            d dVar = this.f420975h;
            d dVar2 = this.f420976i;
            try {
                jA2 = dVar.a(i12, dVar2.f420990c, j12);
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j12 > 0 && jA2 < 0) {
                jA2 = j12;
            }
            try {
                long jA3 = dVar2.a(i12, dVar.f420990c, j12);
                if (j12 <= 0 || jA3 >= 0) {
                    j12 = jA3;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return jA2 > j12 ? j12 : jA2;
        }

        @Override // org.joda.time.AbstractC44868j
        public final long p(long j12) {
            long jB2;
            long j13 = j12 + 1;
            int i12 = this.f420974g;
            d dVar = this.f420975h;
            d dVar2 = this.f420976i;
            try {
                jB2 = dVar.b(i12, dVar2.f420990c, j13);
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j13 < 0 && jB2 > 0) {
                jB2 = j13;
            }
            try {
                long jB3 = dVar2.b(i12, dVar.f420990c, j13);
                if (j13 >= 0 || jB3 <= 0) {
                    j13 = jB3;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jB2 <= j13) {
                jB2 = j13;
            }
            return jB2 - 1;
        }

        public final d s(long j12) {
            long jA2;
            int i12 = this.f420974g;
            d dVar = this.f420975h;
            d dVar2 = this.f420976i;
            try {
                jA2 = dVar.a(i12, dVar2.f420990c, j12);
            } catch (ArithmeticException | IllegalArgumentException unused) {
                jA2 = j12;
            }
            try {
                j12 = dVar2.a(i12, dVar.f420990c, j12);
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return jA2 > j12 ? dVar : dVar2;
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    /* renamed from: org.joda.time.tz.b$b, reason: collision with other inner class name */
    public static final class C12210b {

        /* renamed from: a, reason: collision with root package name */
        public final char f420977a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420978b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420979c;

        /* renamed from: d, reason: collision with root package name */
        public final int f420980d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f420981e;

        /* renamed from: f, reason: collision with root package name */
        public final int f420982f;

        public C12210b(char c12, int i12, int i13, int i14, boolean z12, int i15) {
            if (c12 != 'u' && c12 != 'w' && c12 != 's') {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Unknown mode: ", c12));
            }
            this.f420977a = c12;
            this.f420978b = i12;
            this.f420979c = i13;
            this.f420980d = i14;
            this.f420981e = z12;
            this.f420982f = i15;
        }

        public final long a(x xVar, long j12) {
            int i12 = this.f420979c;
            if (i12 >= 0) {
                return xVar.f420496B.G(i12, j12);
            }
            return xVar.f420496B.a(i12, xVar.f420501G.a(1, xVar.f420496B.G(1, j12)));
        }

        public final long b(x xVar, long j12) {
            try {
                return a(xVar, j12);
            } catch (IllegalArgumentException e12) {
                if (this.f420978b != 2 || this.f420979c != 29) {
                    throw e12;
                }
                while (!xVar.f420502H.z(j12)) {
                    j12 = xVar.f420502H.a(1, j12);
                }
                return a(xVar, j12);
            }
        }

        public final long c(x xVar, long j12) {
            try {
                return a(xVar, j12);
            } catch (IllegalArgumentException e12) {
                if (this.f420978b != 2 || this.f420979c != 29) {
                    throw e12;
                }
                while (!xVar.f420502H.z(j12)) {
                    j12 = xVar.f420502H.a(-1, j12);
                }
                return a(xVar, j12);
            }
        }

        public final long d(x xVar, long j12) {
            int iC2 = this.f420980d - xVar.f420495A.c(j12);
            if (iC2 == 0) {
                return j12;
            }
            if (this.f420981e) {
                if (iC2 < 0) {
                    iC2 += 7;
                }
            } else if (iC2 > 0) {
                iC2 -= 7;
            }
            return xVar.f420495A.a(iC2, j12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12210b)) {
                return false;
            }
            C12210b c12210b = (C12210b) obj;
            return this.f420977a == c12210b.f420977a && this.f420978b == c12210b.f420978b && this.f420979c == c12210b.f420979c && this.f420980d == c12210b.f420980d && this.f420981e == c12210b.f420981e && this.f420982f == c12210b.f420982f;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[OfYear]\nMode: ");
            sb2.append(this.f420977a);
            sb2.append("\nMonthOfYear: ");
            sb2.append(this.f420978b);
            sb2.append("\nDayOfMonth: ");
            sb2.append(this.f420979c);
            sb2.append("\nDayOfWeek: ");
            sb2.append(this.f420980d);
            sb2.append("\nAdvanceDayOfWeek: ");
            sb2.append(this.f420981e);
            sb2.append("\nMillisOfDay: ");
            return r.t(sb2, this.f420982f, '\n');
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class c extends AbstractC44868j {
        private static final long serialVersionUID = 7811976468055766265L;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f420983g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f420984h;

        /* renamed from: i, reason: collision with root package name */
        public final int[] f420985i;

        /* renamed from: j, reason: collision with root package name */
        public final String[] f420986j;

        /* renamed from: k, reason: collision with root package name */
        public final a f420987k;

        public c(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, a aVar) {
            super(str);
            this.f420983g = jArr;
            this.f420984h = iArr;
            this.f420985i = iArr2;
            this.f420986j = strArr;
            this.f420987k = aVar;
        }

        public static c s(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i12 = 0; i12 < unsignedShort; i12++) {
                strArr[i12] = dataInput.readUTF();
            }
            int i13 = dataInput.readInt();
            long[] jArr = new long[i13];
            int[] iArr = new int[i13];
            int[] iArr2 = new int[i13];
            String[] strArr2 = new String[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                jArr[i14] = b.b(dataInput);
                iArr[i14] = (int) b.b(dataInput);
                iArr2[i14] = (int) b.b(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i14] = strArr[unsignedByte];
            }
            return new c(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new a(str, (int) b.b(dataInput), d.c(dataInput), d.c(dataInput)) : null);
        }

        @Override // org.joda.time.AbstractC44868j
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f420915b.equals(cVar.f420915b) && Arrays.equals(this.f420983g, cVar.f420983g) && Arrays.equals(this.f420986j, cVar.f420986j) && Arrays.equals(this.f420984h, cVar.f420984h) && Arrays.equals(this.f420985i, cVar.f420985i)) {
                a aVar = cVar.f420987k;
                a aVar2 = this.f420987k;
                if (aVar2 == null) {
                    if (aVar == null) {
                        return true;
                    }
                } else if (aVar2.equals(aVar)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.AbstractC44868j
        public final String g(long j12) {
            long[] jArr = this.f420983g;
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            String[] strArr = this.f420986j;
            if (iBinarySearch >= 0) {
                return strArr[iBinarySearch];
            }
            int i12 = ~iBinarySearch;
            if (i12 < jArr.length) {
                return i12 > 0 ? strArr[i12 - 1] : "UTC";
            }
            a aVar = this.f420987k;
            return aVar == null ? strArr[i12 - 1] : aVar.s(j12).f420989b;
        }

        @Override // org.joda.time.AbstractC44868j
        public final int i(long j12) {
            long[] jArr = this.f420983g;
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            int[] iArr = this.f420984h;
            if (iBinarySearch >= 0) {
                return iArr[iBinarySearch];
            }
            int i12 = ~iBinarySearch;
            if (i12 >= jArr.length) {
                a aVar = this.f420987k;
                return aVar == null ? iArr[i12 - 1] : aVar.i(j12);
            }
            if (i12 > 0) {
                return iArr[i12 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.AbstractC44868j
        public final int m(long j12) {
            long[] jArr = this.f420983g;
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            int[] iArr = this.f420985i;
            if (iBinarySearch >= 0) {
                return iArr[iBinarySearch];
            }
            int i12 = ~iBinarySearch;
            if (i12 >= jArr.length) {
                a aVar = this.f420987k;
                return aVar == null ? iArr[i12 - 1] : aVar.f420974g;
            }
            if (i12 > 0) {
                return iArr[i12 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.AbstractC44868j
        public final boolean n() {
            return false;
        }

        @Override // org.joda.time.AbstractC44868j
        public final long o(long j12) {
            long[] jArr = this.f420983g;
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            int i12 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i12 < jArr.length) {
                return jArr[i12];
            }
            a aVar = this.f420987k;
            if (aVar == null) {
                return j12;
            }
            long j13 = jArr[jArr.length - 1];
            if (j12 < j13) {
                j12 = j13;
            }
            return aVar.o(j12);
        }

        @Override // org.joda.time.AbstractC44868j
        public final long p(long j12) {
            long[] jArr = this.f420983g;
            int iBinarySearch = Arrays.binarySearch(jArr, j12);
            if (iBinarySearch >= 0) {
                return j12 > Long.MIN_VALUE ? j12 - 1 : j12;
            }
            int i12 = ~iBinarySearch;
            if (i12 < jArr.length) {
                if (i12 > 0) {
                    long j13 = jArr[i12 - 1];
                    if (j13 > Long.MIN_VALUE) {
                        return j13 - 1;
                    }
                }
                return j12;
            }
            a aVar = this.f420987k;
            if (aVar != null) {
                long jP2 = aVar.p(j12);
                if (jP2 < j12) {
                    return jP2;
                }
            }
            long j14 = jArr[i12 - 1];
            return j14 > Long.MIN_VALUE ? j14 - 1 : j12;
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final C12210b f420988a;

        /* renamed from: b, reason: collision with root package name */
        public final String f420989b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420990c;

        public d(C12210b c12210b, String str, int i12) {
            this.f420988a = c12210b;
            this.f420989b = str;
            this.f420990c = i12;
        }

        public static d c(DataInput dataInput) {
            return new d(new C12210b((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) b.b(dataInput)), dataInput.readUTF(), (int) b.b(dataInput));
        }

        public final long a(int i12, int i13, long j12) {
            C12210b c12210b = this.f420988a;
            char c12 = c12210b.f420977a;
            if (c12 == 'w') {
                i12 += i13;
            } else if (c12 != 's') {
                i12 = 0;
            }
            long j13 = i12;
            long j14 = j12 + j13;
            x xVar = x.f420650N;
            AbstractC44864f abstractC44864f = xVar.f420501G;
            int i14 = c12210b.f420978b;
            long jG2 = xVar.f420523q.G(0, abstractC44864f.G(i14, j14));
            AbstractC44864f abstractC44864f2 = xVar.f420523q;
            int i15 = c12210b.f420982f;
            long jB2 = c12210b.b(xVar, abstractC44864f2.a(Math.min(i15, 86399999), jG2));
            if (c12210b.f420980d != 0) {
                jB2 = c12210b.d(xVar, jB2);
                if (jB2 <= j14) {
                    jB2 = c12210b.d(xVar, c12210b.b(xVar, xVar.f420501G.G(i14, xVar.f420502H.a(1, jB2))));
                }
            } else if (jB2 <= j14) {
                jB2 = c12210b.b(xVar, xVar.f420502H.a(1, jB2));
            }
            return xVar.f420523q.a(i15, xVar.f420523q.G(0, jB2)) - j13;
        }

        public final long b(int i12, int i13, long j12) {
            C12210b c12210b = this.f420988a;
            char c12 = c12210b.f420977a;
            if (c12 == 'w') {
                i12 += i13;
            } else if (c12 != 's') {
                i12 = 0;
            }
            long j13 = i12;
            long j14 = j12 + j13;
            x xVar = x.f420650N;
            AbstractC44864f abstractC44864f = xVar.f420501G;
            int i14 = c12210b.f420978b;
            long jG2 = xVar.f420523q.G(0, abstractC44864f.G(i14, j14));
            AbstractC44864f abstractC44864f2 = xVar.f420523q;
            int i15 = c12210b.f420982f;
            long jC2 = c12210b.c(xVar, abstractC44864f2.a(i15, jG2));
            if (c12210b.f420980d != 0) {
                jC2 = c12210b.d(xVar, jC2);
                if (jC2 >= j14) {
                    jC2 = c12210b.d(xVar, c12210b.c(xVar, xVar.f420501G.G(i14, xVar.f420502H.a(-1, jC2))));
                }
            } else if (jC2 >= j14) {
                jC2 = c12210b.c(xVar, xVar.f420502H.a(-1, jC2));
            }
            return xVar.f420523q.a(i15, xVar.f420523q.G(0, jC2)) - j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f420990c == dVar.f420990c && this.f420989b.equals(dVar.f420989b) && this.f420988a.equals(dVar.f420988a);
        }

        public final String toString() {
            return this.f420988a + " named " + this.f420989b + " at " + this.f420990c;
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class e {
        public final String toString() {
            return "0 to 0 using null";
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<e> f420991a = new ArrayList<>(10);

        /* renamed from: b, reason: collision with root package name */
        public final int f420992b = Integer.MAX_VALUE;

        static {
            x.f420650N.f420502H.c(C44866h.a());
        }

        public final String toString() {
            return "null initial: 0 std: 0 upper: " + this.f420992b + " null " + this.f420991a;
        }
    }

    /* compiled from: DateTimeZoneBuilder.java */
    public static final class g {
        public final String toString() {
            return new C44856c(0L, AbstractC44868j.f420911c) + " 0 0";
        }
    }

    public b() {
        new ArrayList(10);
    }

    public static AbstractC44868j a(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            c cVarS = c.s(dataInput, str);
            int i12 = org.joda.time.tz.a.f420965i;
            return new org.joda.time.tz.a(cVarS);
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return c.s(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        org.joda.time.tz.d dVar = new org.joda.time.tz.d((int) b(dataInput), (int) b(dataInput), str, dataInput.readUTF());
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        return dVar.equals(abstractC44868j) ? abstractC44868j : dVar;
    }

    public static long b(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j12;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i12 = unsignedByte2 >> 6;
        if (i12 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j12 = 60000;
        } else if (i12 == 2) {
            unsignedByte = ((unsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j12 = 1000;
        } else {
            if (i12 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j12 = 1800000;
        }
        return unsignedByte * j12;
    }
}
