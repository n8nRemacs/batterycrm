package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bua {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final byte r;
    public final byte s;
    public final byte t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public bua(aua auaVar) {
        int i;
        int i2;
        boolean zH;
        ?? r8;
        int i3 = auaVar.a;
        ByteBuffer byteBuffer = auaVar.b;
        hsi.b(i3 == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        u62 u62Var = new u62(bArr, iRemaining, 3, (byte) 0);
        this.g = u62Var.i(3);
        u62Var.s();
        boolean zH2 = u62Var.h();
        this.a = zH2;
        if (zH2) {
            i2 = u62Var.i(5);
            this.b = false;
            this.j = false;
            r8 = 0;
            i = 0;
        } else {
            if (u62Var.h()) {
                u62Var.t(64);
                if (u62Var.h()) {
                    int i4 = 0;
                    while (!u62Var.h()) {
                        i4++;
                    }
                    if (i4 < 32) {
                        u62Var.t(i4);
                    }
                }
                boolean zH3 = u62Var.h();
                this.b = zH3;
                if (zH3) {
                    u62Var.t(47);
                }
            } else {
                this.b = false;
            }
            this.j = u62Var.h();
            int i5 = u62Var.i(5);
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            i = 0;
            while (i7 <= i5) {
                u62Var.t(12);
                if (i7 == 0) {
                    i6 = u62Var.i(5);
                    zH = z;
                    if (i6 > 7) {
                        zH = u62Var.h();
                    }
                } else {
                    zH = z;
                    if (u62Var.i(5) > 7) {
                        u62Var.s();
                        zH = z;
                    }
                }
                if (this.b) {
                    u62Var.s();
                }
                if (this.j && u62Var.h()) {
                    if (i7 == 0) {
                        i = u62Var.i(4);
                    } else {
                        u62Var.t(4);
                    }
                }
                i7++;
                z = zH;
            }
            i2 = i6;
            r8 = z;
        }
        int i8 = u62Var.i(4);
        int i9 = u62Var.i(4);
        u62Var.t(i8 + 1);
        u62Var.t(i9 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = u62Var.h();
        }
        if (this.c) {
            u62Var.t(4);
            u62Var.t(3);
        }
        u62Var.t(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            u62Var.t(4);
            boolean zH4 = u62Var.h();
            if (zH4) {
                u62Var.t(2);
            }
            if (u62Var.h()) {
                this.d = true;
            } else {
                this.d = u62Var.h();
            }
            if (!this.d || u62Var.h()) {
                this.e = true;
            } else {
                this.e = u62Var.h();
            }
            if (zH4) {
                this.f = u62Var.i(3) + 1;
            } else {
                this.f = 0;
            }
        }
        this.h = i2;
        this.i = r8;
        this.k = i;
        u62Var.t(3);
        boolean zH5 = u62Var.h();
        this.l = zH5;
        if (this.g == 2 && zH5) {
            this.m = u62Var.h();
        } else {
            this.m = false;
        }
        if (this.g != 1) {
            this.n = u62Var.h();
        } else {
            this.n = false;
        }
        if (u62Var.h()) {
            this.r = (byte) u62Var.i(8);
            this.s = (byte) u62Var.i(8);
            this.t = (byte) u62Var.i(8);
        } else {
            this.r = (byte) 0;
            this.s = (byte) 0;
            this.t = (byte) 0;
        }
        if (this.n) {
            u62Var.s();
            this.o = false;
            this.p = false;
            this.q = 0;
        } else if (this.r == 1 && this.s == 13 && this.t == 0) {
            this.o = false;
            this.p = false;
            this.q = 0;
        } else {
            u62Var.s();
            int i10 = this.g;
            if (i10 == 0) {
                this.o = true;
                this.p = true;
            } else if (i10 == 1) {
                this.o = false;
                this.p = false;
            } else if (this.m) {
                boolean zH6 = u62Var.h();
                this.o = zH6;
                if (zH6) {
                    this.p = u62Var.h();
                } else {
                    this.p = false;
                }
            } else {
                this.o = true;
                this.p = false;
            }
            if (this.o && this.p) {
                this.q = u62Var.i(2);
            } else {
                this.q = 0;
            }
        }
        u62Var.s();
    }
}
