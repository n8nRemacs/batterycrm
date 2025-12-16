package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Writer;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: f, reason: collision with root package name */
    public static final n1 f362921f = new n1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f362922a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f362923b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f362924c;

    /* renamed from: d, reason: collision with root package name */
    public int f362925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362926e;

    public n1() {
        this(0, new int[8], new Object[8], true);
    }

    public static n1 e(n1 n1Var, n1 n1Var2) {
        int i12 = n1Var.f362922a + n1Var2.f362922a;
        int[] iArrCopyOf = Arrays.copyOf(n1Var.f362923b, i12);
        System.arraycopy(n1Var2.f362923b, 0, iArrCopyOf, n1Var.f362922a, n1Var2.f362922a);
        Object[] objArrCopyOf = Arrays.copyOf(n1Var.f362924c, i12);
        System.arraycopy(n1Var2.f362924c, 0, objArrCopyOf, n1Var.f362922a, n1Var2.f362922a);
        return new n1(i12, iArrCopyOf, objArrCopyOf, true);
    }

    public static void g(int i12, Object obj, Writer writer) {
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            writer.writeInt64(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 1) {
            writer.writeFixed64(i13, ((Long) obj).longValue());
            return;
        }
        if (i14 == 2) {
            writer.a(i13, (AbstractC37700t) obj);
            return;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.writeFixed32(i13, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.f362824b) {
            writer.writeStartGroup(i13);
            ((n1) obj).h(writer);
            writer.writeEndGroup(i13);
        } else {
            writer.writeEndGroup(i13);
            ((n1) obj).h(writer);
            writer.writeStartGroup(i13);
        }
    }

    public final void a() {
        if (!this.f362926e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i12) {
        int[] iArr = this.f362923b;
        if (i12 > iArr.length) {
            int i13 = this.f362922a;
            int i14 = (i13 / 2) + i13;
            if (i14 >= i12) {
                i12 = i14;
            }
            if (i12 < 8) {
                i12 = 8;
            }
            this.f362923b = Arrays.copyOf(iArr, i12);
            this.f362924c = Arrays.copyOf(this.f362924c, i12);
        }
    }

    public final int c() {
        int iE2;
        int i12 = this.f362925d;
        if (i12 != -1) {
            return i12;
        }
        int iC2 = 0;
        for (int i13 = 0; i13 < this.f362922a; i13++) {
            int i14 = this.f362923b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                iE2 = CodedOutputStream.E(i15, ((Long) this.f362924c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f362924c[i13]).getClass();
                iE2 = CodedOutputStream.o(i15);
            } else if (i16 == 2) {
                iE2 = CodedOutputStream.j(i15, (AbstractC37700t) this.f362924c[i13]);
            } else if (i16 == 3) {
                iC2 = ((n1) this.f362924c[i13]).c() + (CodedOutputStream.B(i15) * 2) + iC2;
            } else {
                if (i16 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                ((Integer) this.f362924c[i13]).getClass();
                iE2 = CodedOutputStream.n(i15);
            }
            iC2 = iE2 + iC2;
        }
        this.f362925d = iC2;
        return iC2;
    }

    public final boolean d(int i12, AbstractC37708x abstractC37708x) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF2;
        a();
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            f(i12, Long.valueOf(abstractC37708x.v()));
            return true;
        }
        if (i14 == 1) {
            f(i12, Long.valueOf(abstractC37708x.r()));
            return true;
        }
        if (i14 == 2) {
            f(i12, abstractC37708x.n());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            f(i12, Integer.valueOf(abstractC37708x.q()));
            return true;
        }
        n1 n1Var = new n1();
        do {
            iF2 = abstractC37708x.F();
            if (iF2 == 0) {
                break;
            }
        } while (n1Var.d(iF2, abstractC37708x));
        abstractC37708x.a((i13 << 3) | 4);
        f(i12, n1Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i12 = this.f362922a;
        if (i12 == n1Var.f362922a) {
            int[] iArr = this.f362923b;
            int[] iArr2 = n1Var.f362923b;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    Object[] objArr = this.f362924c;
                    Object[] objArr2 = n1Var.f362924c;
                    int i14 = this.f362922a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (objArr[i15].equals(objArr2[i15])) {
                        }
                    }
                    return true;
                }
                if (iArr[i13] != iArr2[i13]) {
                    break;
                }
                i13++;
            }
        }
        return false;
    }

    public final void f(int i12, Object obj) {
        a();
        b(this.f362922a + 1);
        int[] iArr = this.f362923b;
        int i13 = this.f362922a;
        iArr[i13] = i12;
        this.f362924c[i13] = obj;
        this.f362922a = i13 + 1;
    }

    public final void h(Writer writer) {
        if (this.f362922a == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.f362824b) {
            for (int i12 = 0; i12 < this.f362922a; i12++) {
                g(this.f362923b[i12], this.f362924c[i12], writer);
            }
            return;
        }
        for (int i13 = this.f362922a - 1; i13 >= 0; i13--) {
            g(this.f362923b[i13], this.f362924c[i13], writer);
        }
    }

    public final int hashCode() {
        int i12 = this.f362922a;
        int i13 = (527 + i12) * 31;
        int[] iArr = this.f362923b;
        int iHashCode = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i13 + i14) * 31;
        Object[] objArr = this.f362924c;
        int i17 = this.f362922a;
        for (int i18 = 0; i18 < i17; i18++) {
            iHashCode = (iHashCode * 31) + objArr[i18].hashCode();
        }
        return i16 + iHashCode;
    }

    public n1(int i12, int[] iArr, Object[] objArr, boolean z12) {
        this.f362925d = -1;
        this.f362922a = i12;
        this.f362923b = iArr;
        this.f362924c = objArr;
        this.f362926e = z12;
    }
}
