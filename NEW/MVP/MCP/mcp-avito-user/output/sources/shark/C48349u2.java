package shark;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.C42823x;
import kotlin.text.C43047d;
import okio.InterfaceC44804n;
import shark.AbstractC48345t2;
import shark.q3;

/* compiled from: HprofRecordReader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/u2;", "", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.u2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48349u2 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f438768e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f438769f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f438770g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f438771h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f438772i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f438773j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f438774k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f438775l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f438776m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f438777n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f438778o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f438779p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f438780q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f438781r;

    /* renamed from: a, reason: collision with root package name */
    public long f438782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438783b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f438784c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC44804n f438785d;

    /* compiled from: HprofRecordReader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lshark/u2$a;", "", "<init>", "()V", "", "BOOLEAN_SIZE", "I", "BOOLEAN_TYPE", "BYTE_MASK", "BYTE_SIZE", "BYTE_TYPE", "CHAR_SIZE", "CHAR_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", "", "INT_MASK", "J", "INT_SIZE", "INT_TYPE", "LONG_SIZE", "LONG_TYPE", "SHORT_SIZE", "SHORT_TYPE", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.u2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
        PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
        f438768e = 1;
        PrimitiveType[] primitiveTypeArr2 = PrimitiveType.f438192d;
        f438769f = 2;
        PrimitiveType[] primitiveTypeArr3 = PrimitiveType.f438192d;
        f438770g = 1;
        PrimitiveType[] primitiveTypeArr4 = PrimitiveType.f438192d;
        f438771h = 2;
        PrimitiveType[] primitiveTypeArr5 = PrimitiveType.f438192d;
        f438772i = 4;
        PrimitiveType[] primitiveTypeArr6 = PrimitiveType.f438192d;
        f438773j = 8;
        f438774k = 4;
        f438775l = 5;
        PrimitiveType[] primitiveTypeArr7 = PrimitiveType.f438192d;
        f438776m = 6;
        PrimitiveType[] primitiveTypeArr8 = PrimitiveType.f438192d;
        f438777n = 7;
        f438778o = 8;
        f438779p = 9;
        f438780q = 10;
        f438781r = 11;
    }

    public C48349u2(@Y61.k C48236b2 c48236b2, @Y61.k InterfaceC44804n interfaceC44804n) {
        this.f438785d = interfaceC44804n;
        int i12 = c48236b2.f438248d;
        this.f438783b = i12;
        PrimitiveType.f438195g.getClass();
        Map mapL = kotlin.collections.P0.l(PrimitiveType.f438193e, new kotlin.Q(2, Integer.valueOf(i12)));
        Object objW = C42745f0.W(mapL.keySet());
        if (objW == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        int iIntValue = ((Number) objW).intValue() + 1;
        int[] iArr = new int[iIntValue];
        for (int i13 = 0; i13 < iIntValue; i13++) {
            Integer num = (Integer) mapL.get(Integer.valueOf(i13));
            iArr[i13] = num != null ? num.intValue() : 0;
        }
        this.f438784c = iArr;
    }

    public final byte a() {
        this.f438782a += f438770g;
        return this.f438785d.readByte();
    }

    @Y61.k
    public final AbstractC48345t2.b.c.a b() {
        long j12;
        long j13;
        long j14;
        q3 hVar;
        long jC2 = c();
        int iD2 = d();
        long jC3 = c();
        long jC4 = c();
        long jC5 = c();
        long jC6 = c();
        c();
        c();
        int iD3 = d();
        int i12 = i();
        for (int i13 = 0; i13 < i12; i13++) {
            j(f438771h);
            j(this.f438784c[h()]);
        }
        int i14 = i();
        ArrayList arrayList = new ArrayList(i14);
        int i15 = 0;
        while (i15 < i14) {
            long j15 = jC6;
            long jC7 = c();
            int i16 = i14;
            int iH2 = h();
            int i17 = iD3;
            if (iH2 == 2) {
                j12 = jC5;
                hVar = new q3.i(c());
                j13 = jC3;
                j14 = jC4;
            } else {
                j12 = jC5;
                int i18 = f438774k;
                InterfaceC44804n interfaceC44804n = this.f438785d;
                if (iH2 == i18) {
                    j14 = jC4;
                    j13 = jC3;
                    this.f438782a += f438768e;
                    hVar = new q3.a(interfaceC44804n.readByte() != 0);
                } else {
                    j13 = jC3;
                    j14 = jC4;
                    if (iH2 == f438775l) {
                        Charset charset = C43047d.f410590c;
                        long j16 = this.f438782a;
                        long j17 = f438769f;
                        this.f438782a = j16 + j17;
                        hVar = new q3.c(interfaceC44804n.z1(j17, charset).charAt(0));
                    } else if (iH2 == f438776m) {
                        int i19 = kotlin.jvm.internal.A.f406820a;
                        hVar = new q3.f(Float.intBitsToFloat(d()));
                    } else if (iH2 == f438777n) {
                        int i22 = C42823x.f406860a;
                        hVar = new q3.e(Double.longBitsToDouble(e()));
                    } else if (iH2 == f438778o) {
                        hVar = new q3.b(a());
                    } else if (iH2 == f438779p) {
                        hVar = new q3.j(g());
                    } else if (iH2 == f438780q) {
                        hVar = new q3.g(d());
                    } else {
                        if (iH2 != f438781r) {
                            throw new IllegalStateException(AK.c.g(iH2, "Unknown type "));
                        }
                        hVar = new q3.h(e());
                    }
                    arrayList.add(new AbstractC48345t2.b.c.a.C12637b(jC7, iH2, hVar));
                    i15++;
                    jC6 = j15;
                    i14 = i16;
                    iD3 = i17;
                    jC5 = j12;
                    jC4 = j14;
                    jC3 = j13;
                }
            }
            arrayList.add(new AbstractC48345t2.b.c.a.C12637b(jC7, iH2, hVar));
            i15++;
            jC6 = j15;
            i14 = i16;
            iD3 = i17;
            jC5 = j12;
            jC4 = j14;
            jC3 = j13;
        }
        long j18 = jC3;
        long j19 = jC4;
        long j22 = jC5;
        long j23 = jC6;
        int i23 = iD3;
        int i24 = i();
        ArrayList arrayList2 = new ArrayList(i24);
        for (int i25 = 0; i25 < i24; i25++) {
            arrayList2.add(new AbstractC48345t2.b.c.a.C12636a(c(), h()));
        }
        return new AbstractC48345t2.b.c.a(jC2, iD2, j18, j19, j22, j23, i23, arrayList, arrayList2);
    }

    public final long c() {
        int iA2;
        int i12 = this.f438783b;
        if (i12 == 1) {
            iA2 = a();
        } else if (i12 == 2) {
            iA2 = g();
        } else {
            if (i12 != 4) {
                if (i12 == 8) {
                    return e();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            iA2 = d();
        }
        return iA2;
    }

    public final int d() {
        this.f438782a += f438772i;
        return this.f438785d.readInt();
    }

    public final long e() {
        this.f438782a += f438773j;
        return this.f438785d.readLong();
    }

    @Y61.k
    public final AbstractC48345t2.b.c.d f() {
        long jC2 = c();
        int iD2 = d();
        int iD3 = d();
        int iH2 = h();
        int i12 = 0;
        if (iH2 == f438774k) {
            boolean[] zArr = new boolean[iD3];
            for (int i13 = 0; i13 < iD3; i13++) {
                zArr[i13] = a() != 0;
            }
            return new AbstractC48345t2.b.c.d.a(jC2, iD2, zArr);
        }
        int i14 = f438775l;
        InterfaceC44804n interfaceC44804n = this.f438785d;
        if (iH2 == i14) {
            char[] cArr = new char[iD3];
            for (int i15 = 0; i15 < iD3; i15++) {
                Charset charset = C43047d.f410590c;
                long j12 = this.f438782a;
                long j13 = f438769f;
                this.f438782a = j12 + j13;
                cArr[i15] = interfaceC44804n.z1(j13, charset).charAt(0);
            }
            return new AbstractC48345t2.b.c.d.C12641c(iD2, jC2, cArr);
        }
        if (iH2 == f438776m) {
            float[] fArr = new float[iD3];
            while (i12 < iD3) {
                int i16 = kotlin.jvm.internal.A.f406820a;
                fArr[i12] = Float.intBitsToFloat(d());
                i12++;
            }
            return new AbstractC48345t2.b.c.d.e(jC2, fArr, iD2);
        }
        if (iH2 == f438777n) {
            double[] dArr = new double[iD3];
            while (i12 < iD3) {
                int i17 = C42823x.f406860a;
                dArr[i12] = Double.longBitsToDouble(e());
                i12++;
            }
            return new AbstractC48345t2.b.c.d.C12642d(jC2, iD2, dArr);
        }
        if (iH2 == f438778o) {
            long j14 = iD3;
            this.f438782a += j14;
            return new AbstractC48345t2.b.c.d.C12640b(iD2, interfaceC44804n.p5(j14), jC2);
        }
        if (iH2 == f438779p) {
            short[] sArr = new short[iD3];
            while (i12 < iD3) {
                sArr[i12] = g();
                i12++;
            }
            return new AbstractC48345t2.b.c.d.h(jC2, iD2, sArr);
        }
        if (iH2 == f438780q) {
            int[] iArr = new int[iD3];
            while (i12 < iD3) {
                iArr[i12] = d();
                i12++;
            }
            return new AbstractC48345t2.b.c.d.f(iArr, jC2, iD2);
        }
        if (iH2 != f438781r) {
            throw new IllegalStateException(AK.c.g(iH2, "Unexpected type "));
        }
        long[] jArr = new long[iD3];
        while (i12 < iD3) {
            jArr[i12] = e();
            i12++;
        }
        return new AbstractC48345t2.b.c.d.g(iD2, jC2, jArr);
    }

    public final short g() {
        this.f438782a += f438771h;
        return this.f438785d.readShort();
    }

    public final int h() {
        return a() & 255;
    }

    public final int i() {
        return g() & 65535;
    }

    public final void j(int i12) {
        long j12 = i12;
        this.f438782a += j12;
        this.f438785d.skip(j12);
    }

    public final void k(long j12) {
        this.f438782a += j12;
        this.f438785d.skip(j12);
    }

    public final void l() {
        int[] iArr;
        int i12 = this.f438783b;
        int i13 = f438772i;
        j(i12 + i13 + i12 + i12 + i12 + i12 + i12 + i12 + i13);
        int i14 = i();
        int i15 = 0;
        while (true) {
            iArr = this.f438784c;
            if (i15 >= i14) {
                break;
            }
            j(f438771h);
            j(iArr[h()]);
            i15++;
        }
        int i16 = i();
        for (int i17 = 0; i17 < i16; i17++) {
            j(i12);
            j(iArr[h()]);
        }
        j((i12 + f438770g) * i());
    }
}
