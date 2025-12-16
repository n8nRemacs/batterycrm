package net.bytebuddy.jar.asm;

/* compiled from: Label.java */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: n, reason: collision with root package name */
    public static final r f418267n = new r();

    /* renamed from: a, reason: collision with root package name */
    public short f418268a;

    /* renamed from: b, reason: collision with root package name */
    public short f418269b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f418270c;

    /* renamed from: d, reason: collision with root package name */
    public int f418271d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f418272e;

    /* renamed from: f, reason: collision with root package name */
    public short f418273f;

    /* renamed from: g, reason: collision with root package name */
    public short f418274g;

    /* renamed from: h, reason: collision with root package name */
    public short f418275h;

    /* renamed from: i, reason: collision with root package name */
    public short f418276i;

    /* renamed from: j, reason: collision with root package name */
    public o f418277j;

    /* renamed from: k, reason: collision with root package name */
    public r f418278k;

    /* renamed from: l, reason: collision with root package name */
    public l f418279l;

    /* renamed from: m, reason: collision with root package name */
    public r f418280m;

    public final void a(int i12, int i13, int i14) {
        if (this.f418272e == null) {
            this.f418272e = new int[6];
        }
        int[] iArr = this.f418272e;
        int i15 = iArr[0];
        int i16 = i15 + 2;
        if (i16 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f418272e = iArr2;
        }
        int[] iArr3 = this.f418272e;
        iArr3[i15 + 1] = i12;
        iArr3[i16] = i13 | i14;
        iArr3[0] = i16;
    }

    public final r b() {
        o oVar = this.f418277j;
        return oVar == null ? this : oVar.f418247a;
    }

    public final r c(r rVar) {
        for (l lVar = this.f418279l; lVar != null; lVar = lVar.f418233c) {
            if ((this.f418268a & 16) == 0 || lVar != this.f418279l.f418233c) {
                r rVar2 = lVar.f418232b;
                if (rVar2.f418280m == null) {
                    rVar2.f418280m = rVar;
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    public final void d(C44391d c44391d, int i12, boolean z12) {
        if ((this.f418268a & 4) != 0) {
            if (z12) {
                c44391d.i(this.f418271d - i12);
                return;
            } else {
                c44391d.j(this.f418271d - i12);
                return;
            }
        }
        if (z12) {
            a(i12, 536870912, c44391d.f418166b);
            c44391d.i(-1);
        } else {
            a(i12, 268435456, c44391d.f418166b);
            c44391d.j(-1);
        }
    }

    public final boolean e(int i12, byte[] bArr) {
        this.f418268a = (short) (this.f418268a | 4);
        this.f418271d = i12;
        int[] iArr = this.f418272e;
        boolean z12 = false;
        if (iArr == null) {
            return false;
        }
        for (int i13 = iArr[0]; i13 > 0; i13 -= 2) {
            int[] iArr2 = this.f418272e;
            int i14 = iArr2[i13 - 1];
            int i15 = iArr2[i13];
            int i16 = i12 - i14;
            int i17 = 268435455 & i15;
            if ((i15 & (-268435456)) == 268435456) {
                if (i16 < -32768 || i16 > 32767) {
                    int i18 = bArr[i14] & 255;
                    if (i18 < 198) {
                        bArr[i14] = (byte) (i18 + 49);
                    } else {
                        bArr[i14] = (byte) (i18 + 20);
                    }
                    z12 = true;
                }
                bArr[i17] = (byte) (i16 >>> 8);
                bArr[i17 + 1] = (byte) i16;
            } else {
                bArr[i17] = (byte) (i16 >>> 24);
                bArr[i17 + 1] = (byte) (i16 >>> 16);
                bArr[i17 + 2] = (byte) (i16 >>> 8);
                bArr[i17 + 3] = (byte) i16;
            }
        }
        return z12;
    }

    public final String toString() {
        return "L" + System.identityHashCode(this);
    }
}
