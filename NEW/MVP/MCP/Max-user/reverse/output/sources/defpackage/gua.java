package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class gua {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public gua(b9i b9iVar, z9i z9iVar) {
        this.a = 2;
        this.f = b9iVar;
        int i = z9iVar.c;
        ByteBuffer byteBuffer = z9iVar.e;
        this.b = i;
        this.d |= (z9iVar.a & 4) != 0;
        if ((z9iVar.a & 4) != 0) {
            this.e = new ByteArrayOutputStream(600000);
        } else {
            this.e = new ByteArrayOutputStream(34000);
        }
        while (true) {
            int iMin = Math.min(byteBuffer.remaining(), ((b9i) this.f).c.length);
            if (iMin == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((b9i) this.f).c, 0, iMin);
                ((ByteArrayOutputStream) this.e).write(((b9i) this.f).c, 0, iMin);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                int i4 = 0;
                this.c = 0;
                do {
                    int i5 = this.c;
                    int i6 = i + i5;
                    hua huaVar = (hua) this.e;
                    if (i6 < huaVar.c) {
                        int[] iArr = huaVar.f;
                        this.c = i5 + 1;
                        i2 = iArr[i6];
                        i4 += i2;
                    }
                    return i4;
                } while (i2 == 255);
                return i4;
            default:
                int i7 = 0;
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    hua huaVar2 = (hua) this.e;
                    if (i9 < huaVar2.c) {
                        int[] iArr2 = huaVar2.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i9];
                        i7 += i3;
                    }
                    return i7;
                } while (i3 == 255);
                return i7;
        }
    }

    public boolean b(hp5 hp5Var) {
        int i;
        hua huaVar = (hua) this.e;
        qyg qygVar = (qyg) this.f;
        fsi.d(hp5Var != null);
        if (this.d) {
            this.d = false;
            qygVar.B(0);
        }
        while (!this.d) {
            if (this.b < 0) {
                if (huaVar.c(hp5Var, -1L) && huaVar.a(hp5Var, true)) {
                    int iA = huaVar.d;
                    if ((huaVar.a & 1) == 1 && qygVar.c == 0) {
                        iA += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        hp5Var.z(iA);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.b);
            int i2 = this.b + this.c;
            if (iA2 > 0) {
                qygVar.d(qygVar.c + iA2);
                try {
                    hp5Var.readFully(qygVar.a, qygVar.c, iA2);
                    qygVar.D(qygVar.c + iA2);
                    this.d = huaVar.f[i2 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i2 == huaVar.c) {
                i2 = -1;
            }
            this.b = i2;
        }
        return true;
    }

    public boolean c(ip5 ip5Var) {
        int i;
        hua huaVar = (hua) this.e;
        umb umbVar = (umb) this.f;
        hsi.g(ip5Var != null);
        if (this.d) {
            this.d = false;
            umbVar.G(0);
        }
        while (!this.d) {
            if (this.b < 0) {
                if (huaVar.d(ip5Var, -1L) && huaVar.b(ip5Var, true)) {
                    int iA = huaVar.d;
                    if ((huaVar.a & 1) == 1 && umbVar.c == 0) {
                        iA += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        ip5Var.z(iA);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.b);
            int i2 = this.b + this.c;
            if (iA2 > 0) {
                umbVar.c(umbVar.c + iA2);
                try {
                    ip5Var.readFully(umbVar.a, umbVar.c, iA2);
                    umbVar.I(umbVar.c + iA2);
                    this.d = huaVar.f[i2 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i2 == huaVar.c) {
                i2 = -1;
            }
            this.b = i2;
        }
        return true;
    }

    public gua(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new hua(1);
                this.f = new umb(0, new byte[65025]);
                this.b = -1;
                break;
            default:
                this.e = new hua(0);
                this.f = new qyg(0, new byte[65025]);
                this.b = -1;
                break;
        }
    }
}
