package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class w62 extends c72 {
    public final umb h = new umb();
    public final u62 i = new u62(3);
    public int j = -1;
    public final int k;
    public final t62[] l;
    public t62 m;
    public List n;
    public List o;
    public u62 p;
    public int q;

    public w62(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = ed3.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new t62[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new t62();
        }
        this.m = this.l[0];
    }

    @Override // defpackage.c72
    public final y6i f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new y6i(9, list);
    }

    @Override // defpackage.c72, defpackage.mh4
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.c72
    public final void g(y62 y62Var) {
        ByteBuffer byteBuffer = y62Var.o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        umb umbVar = this.h;
        umbVar.H(iLimit, bArrArray);
        while (umbVar.a() >= 3) {
            int iX = umbVar.x();
            int i = iX & 3;
            boolean z = (iX & 4) == 4;
            byte bX = (byte) umbVar.x();
            byte bX2 = (byte) umbVar.x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bX & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            a8i.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bX & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        u62 u62Var = new u62(i2, i4, 1);
                        this.p = u62Var;
                        byte[] bArr = u62Var.d;
                        u62Var.e = 1;
                        bArr[0] = bX2;
                    } else {
                        hsi.b(i == 2);
                        u62 u62Var2 = this.p;
                        if (u62Var2 == null) {
                            a8i.g("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = u62Var2.d;
                            int i5 = u62Var2.e;
                            int i6 = i5 + 1;
                            u62Var2.e = i6;
                            bArr2[i5] = bX;
                            u62Var2.e = i5 + 2;
                            bArr2[i6] = bX2;
                        }
                    }
                    u62 u62Var3 = this.p;
                    if (u62Var3.e == (u62Var3.c * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.c72
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        char c;
        int i;
        boolean z;
        u62 u62Var = this.p;
        if (u62Var == null) {
            return;
        }
        int i2 = 2;
        if (u62Var.e != (u62Var.c * 2) - 1) {
            a8i.e("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.c * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.b + ");");
        }
        u62 u62Var2 = this.p;
        byte[] bArr = u62Var2.d;
        int i3 = u62Var2.e;
        u62 u62Var3 = this.i;
        u62Var3.o(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (u62Var3.b() > 0) {
                int i4 = 3;
                int i5 = u62Var3.i(3);
                int i6 = u62Var3.i(5);
                if (i5 == 7) {
                    u62Var3.t(i2);
                    i5 = u62Var3.i(6);
                    if (i5 < 7) {
                        wy1.p(i5, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i6 == 0) {
                    if (i5 != 0) {
                        a8i.l("Cea708Decoder", "serviceNumber is non-zero (" + i5 + ") when blockSize is 0");
                    }
                } else if (i5 != this.k) {
                    u62Var3.u(i6);
                } else {
                    int iG = (i6 * 8) + u62Var3.g();
                    while (u62Var3.g() < iG) {
                        int i7 = u62Var3.i(8);
                        if (i7 != 16) {
                            if (i7 <= 31) {
                                if (i7 != 0) {
                                    if (i7 == i4) {
                                        this.n = k();
                                    } else if (i7 != 8) {
                                        switch (i7) {
                                            case Protos.Attaches.Attach.PRESENT /* 12 */:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case Protos.Attaches.Attach.LOCATION /* 14 */:
                                                break;
                                            default:
                                                if (i7 < 17 || i7 > 23) {
                                                    if (i7 < 24 || i7 > 31) {
                                                        wy1.p(i7, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        a8i.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                                                        u62Var3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    a8i.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                                                    u62Var3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (i7 <= 127) {
                                if (i7 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (i7 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (i7 <= 159) {
                                    t62[] t62VarArr = this.l;
                                    switch (i7) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i8 = i7 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = t62VarArr[i8];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (u62Var3.h()) {
                                                    t62 t62Var = t62VarArr[8 - i9];
                                                    t62Var.a.clear();
                                                    t62Var.b.clear();
                                                    t62Var.o = -1;
                                                    t62Var.p = -1;
                                                    t62Var.q = -1;
                                                    t62Var.s = -1;
                                                    t62Var.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (u62Var3.h()) {
                                                    t62VarArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (u62Var3.h()) {
                                                    t62VarArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (u62Var3.h()) {
                                                    t62VarArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (u62Var3.h()) {
                                                    t62VarArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            u62Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i2;
                                            if (!this.m.c) {
                                                u62Var3.t(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                u62Var3.i(4);
                                                u62Var3.i(i14);
                                                u62Var3.i(i14);
                                                boolean zH = u62Var3.h();
                                                boolean zH2 = u62Var3.h();
                                                i4 = 3;
                                                u62Var3.i(3);
                                                u62Var3.i(3);
                                                this.m.e(zH, zH2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int iC = t62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                                int iC2 = t62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                                u62Var3.t(2);
                                                t62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                u62Var3.t(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                u62Var3.t(4);
                                                int i15 = u62Var3.i(4);
                                                u62Var3.t(2);
                                                u62Var3.i(6);
                                                t62 t62Var2 = this.m;
                                                if (t62Var2.u != i15) {
                                                    t62Var2.a('\n');
                                                }
                                                t62Var2.u = i15;
                                            } else {
                                                u62Var3.t(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            wy1.p(i7, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = t62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                                u62Var3.i(2);
                                                t62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), 0);
                                                u62Var3.h();
                                                u62Var3.h();
                                                u62Var3.i(2);
                                                u62Var3.i(2);
                                                int i16 = u62Var3.i(2);
                                                u62Var3.t(8);
                                                t62 t62Var3 = this.m;
                                                t62Var3.n = iC3;
                                                t62Var3.k = i16;
                                            } else {
                                                u62Var3.t(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i17 = i7 - 152;
                                            t62 t62Var4 = t62VarArr[i17];
                                            u62Var3.t(i2);
                                            boolean zH3 = u62Var3.h();
                                            u62Var3.t(i2);
                                            int i18 = u62Var3.i(i4);
                                            boolean zH4 = u62Var3.h();
                                            int i19 = u62Var3.i(7);
                                            int i20 = u62Var3.i(8);
                                            int i21 = u62Var3.i(4);
                                            int i22 = u62Var3.i(4);
                                            u62Var3.t(i2);
                                            u62Var3.t(6);
                                            u62Var3.t(i2);
                                            int i23 = u62Var3.i(3);
                                            int i24 = u62Var3.i(3);
                                            ArrayList arrayList = t62Var4.a;
                                            t62Var4.c = true;
                                            t62Var4.d = zH3;
                                            t62Var4.e = i18;
                                            t62Var4.f = zH4;
                                            t62Var4.g = i19;
                                            t62Var4.h = i20;
                                            t62Var4.i = i21;
                                            int i25 = i22 + 1;
                                            if (t62Var4.j != i25) {
                                                t62Var4.j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= t62Var4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i23 != 0 && t62Var4.l != i23) {
                                                t62Var4.l = i23;
                                                int i26 = i23 - 1;
                                                int i27 = t62.B[i26];
                                                boolean z3 = t62.A[i26];
                                                int i28 = t62.y[i26];
                                                int i29 = t62.z[i26];
                                                int i30 = t62.x[i26];
                                                t62Var4.n = i27;
                                                t62Var4.k = i30;
                                            }
                                            if (i24 != 0 && t62Var4.m != i24) {
                                                t62Var4.m = i24;
                                                int i31 = i24 - 1;
                                                int i32 = t62.D[i31];
                                                int i33 = t62.C[i31];
                                                t62Var4.e(false, false);
                                                t62Var4.f(t62.v, t62.E[i31]);
                                            }
                                            if (this.q != i17) {
                                                this.q = i17;
                                                this.m = t62VarArr[i17];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (i7 <= 255) {
                                        this.m.a((char) (i7 & 255));
                                    } else {
                                        wy1.p(i7, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int i34 = u62Var3.i(8);
                            if (i34 <= 31) {
                                c = 7;
                                if (i34 > 7) {
                                    if (i34 <= 15) {
                                        u62Var3.t(8);
                                    } else if (i34 <= 23) {
                                        u62Var3.t(16);
                                    } else if (i34 <= 31) {
                                        u62Var3.t(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (i34 <= 127) {
                                    if (i34 == 32) {
                                        this.m.a(' ');
                                    } else if (i34 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i34 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i34 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i34 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i34 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i34 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i34 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i34 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i34 != 61) {
                                        switch (i34) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i34) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        wy1.p(i34, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (i34 > 159) {
                                    i = 2;
                                    if (i34 <= 255) {
                                        if (i34 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            wy1.p(i34, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        wy1.p(i34, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i34 <= 135) {
                                    u62Var3.t(32);
                                } else if (i34 <= 143) {
                                    u62Var3.t(40);
                                } else if (i34 <= 159) {
                                    i = 2;
                                    u62Var3.t(2);
                                    u62Var3.t(u62Var3.i(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w62.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
