package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class v62 extends b72 {
    public final qyg g = new qyg(2, false);
    public final u62 h = new u62(2);
    public int i = -1;
    public final int j;
    public final s62[] k;
    public s62 l;
    public List m;
    public List n;
    public u62 o;
    public int p;

    public v62(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new s62[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new s62();
        }
        this.l = this.k[0];
    }

    @Override // defpackage.b72
    public final x6i e() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new x6i(7, list);
    }

    @Override // defpackage.b72
    public final void f(x62 x62Var) {
        ByteBuffer byteBuffer = x62Var.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        qyg qygVar = this.g;
        qygVar.C(iLimit, bArrArray);
        while (qygVar.c() >= 3) {
            int iS = qygVar.s();
            int i = iS & 3;
            boolean z = (iS & 4) == 4;
            byte bS = (byte) qygVar.s();
            byte bS2 = (byte) qygVar.s();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        i();
                        int i2 = (bS & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            k();
                            int i4 = this.i;
                            StringBuilder sb = new StringBuilder(71);
                            sb.append("Sequence number discontinuity. previous=");
                            sb.append(i4);
                            sb.append(" current=");
                            sb.append(i2);
                            Log.w("Cea708Decoder", sb.toString());
                        }
                        this.i = i2;
                        int i5 = bS & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        u62 u62Var = new u62(i2, i5, 0);
                        this.o = u62Var;
                        byte[] bArr = u62Var.d;
                        u62Var.e = 1;
                        bArr[0] = bS2;
                    } else {
                        fsi.b(i == 2);
                        u62 u62Var2 = this.o;
                        if (u62Var2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = u62Var2.d;
                            int i6 = u62Var2.e;
                            int i7 = i6 + 1;
                            u62Var2.e = i7;
                            bArr2[i6] = bS;
                            u62Var2.e = i6 + 2;
                            bArr2[i7] = bS2;
                        }
                    }
                    u62 u62Var3 = this.o;
                    if (u62Var3.e == (u62Var3.c * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // defpackage.b72, defpackage.kh4
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        k();
        this.o = null;
    }

    @Override // defpackage.b72
    public final boolean h() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        int i;
        int i2;
        boolean z;
        char c;
        char c2;
        int i3;
        int i4;
        u62 u62Var = this.o;
        if (u62Var == null) {
            return;
        }
        int i5 = u62Var.e;
        int i6 = 2;
        int i7 = (u62Var.c * 2) - 1;
        if (i5 != i7) {
            int i8 = u62Var.b;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(i7);
            sb.append(", but current index is ");
            sb.append(i5);
            sb.append(" (sequence number ");
            sb.append(i8);
            sb.append(");");
            Log.d("Cea708Decoder", sb.toString());
        }
        u62 u62Var2 = this.o;
        byte[] bArr = u62Var2.d;
        int i9 = u62Var2.e;
        u62 u62Var3 = this.h;
        u62Var3.o(i9, bArr);
        int i10 = 3;
        int i11 = u62Var3.i(3);
        int i12 = u62Var3.i(5);
        if (i11 == 7) {
            u62Var3.t(2);
            i11 = u62Var3.i(6);
            if (i11 < 7) {
                az1.s("Invalid extended service number: ", 44, i11, "Cea708Decoder");
            }
        }
        if (i12 == 0) {
            if (i11 != 0) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("serviceNumber is non-zero (");
                sb2.append(i11);
                sb2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb2.toString());
            }
        } else if (i11 == this.j) {
            int i13 = 8;
            boolean z2 = false;
            for (int iG = (i12 * 8) + u62Var3.g(); u62Var3.b() > 0 && u62Var3.g() < iG; iG = i2) {
                int i14 = u62Var3.i(i13);
                if (i14 != 16) {
                    if (i14 <= 31) {
                        if (i14 != 0) {
                            if (i14 == i10) {
                                this.m = j();
                            } else if (i14 != i13) {
                                switch (i14) {
                                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                                        k();
                                        break;
                                    case 13:
                                        this.l.a('\n');
                                        break;
                                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                                        break;
                                    default:
                                        if (i14 < 17 || i14 > 23) {
                                            if (i14 < 24 || i14 > 31) {
                                                az1.s("Invalid C0 command: ", 31, i14, "Cea708Decoder");
                                                break;
                                            } else {
                                                az1.s("Currently unsupported COMMAND_P16 Command: ", 54, i14, "Cea708Decoder");
                                                u62Var3.t(16);
                                                break;
                                            }
                                        } else {
                                            az1.s("Currently unsupported COMMAND_EXT1 Command: ", 55, i14, "Cea708Decoder");
                                            u62Var3.t(i13);
                                            break;
                                        }
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.l.b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                        i3 = i6;
                        i2 = iG;
                        i4 = i13;
                        c2 = ',';
                        z = true;
                    } else if (i14 <= 127) {
                        if (i14 == 127) {
                            this.l.a((char) 9835);
                        } else {
                            this.l.a((char) (i14 & 255));
                        }
                        i3 = i6;
                        i2 = iG;
                        i4 = i13;
                        c2 = ',';
                        z = true;
                        z2 = true;
                    } else {
                        if (i14 <= 159) {
                            s62[] s62VarArr = this.k;
                            switch (i14) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    i = i10;
                                    i2 = iG;
                                    z = true;
                                    int i15 = i14 - 128;
                                    if (this.p != i15) {
                                        this.p = i15;
                                        this.l = s62VarArr[i15];
                                        break;
                                    }
                                    break;
                                case 136:
                                    i = i10;
                                    i2 = iG;
                                    z = true;
                                    int i16 = 1;
                                    for (int i17 = i13; i16 <= i17; i17 = 8) {
                                        if (u62Var3.h()) {
                                            s62 s62Var = s62VarArr[8 - i16];
                                            s62Var.a.clear();
                                            s62Var.b.clear();
                                            s62Var.p = -1;
                                            s62Var.q = -1;
                                            s62Var.r = -1;
                                            s62Var.t = -1;
                                            s62Var.v = 0;
                                        }
                                        i16++;
                                    }
                                    break;
                                case 137:
                                    i = i10;
                                    i2 = iG;
                                    int i18 = 1;
                                    for (int i19 = i13; i18 <= i19; i19 = 8) {
                                        if (u62Var3.h()) {
                                            s62VarArr[8 - i18].d = true;
                                        }
                                        i18++;
                                    }
                                    z = true;
                                    break;
                                case 138:
                                    i = i10;
                                    i2 = iG;
                                    int i20 = 1;
                                    for (int i21 = i13; i20 <= i21; i21 = 8) {
                                        if (u62Var3.h()) {
                                            s62VarArr[8 - i20].d = false;
                                        }
                                        i20++;
                                    }
                                    z = true;
                                    break;
                                case 139:
                                    i = i10;
                                    i2 = iG;
                                    int i22 = 1;
                                    for (int i23 = i13; i22 <= i23; i23 = 8) {
                                        if (u62Var3.h()) {
                                            s62VarArr[8 - i22].d = !r1.d;
                                        }
                                        i22++;
                                    }
                                    z = true;
                                    break;
                                case 140:
                                    i = i10;
                                    i2 = iG;
                                    int i24 = 1;
                                    for (int i25 = i13; i24 <= i25; i25 = 8) {
                                        if (u62Var3.h()) {
                                            s62VarArr[8 - i24].d();
                                        }
                                        i24++;
                                    }
                                    z = true;
                                    break;
                                case 141:
                                    i = i10;
                                    i2 = iG;
                                    u62Var3.t(i13);
                                    z = true;
                                    break;
                                case 142:
                                    i = i10;
                                    i2 = iG;
                                    z = true;
                                    break;
                                case 143:
                                    i = i10;
                                    i2 = iG;
                                    k();
                                    z = true;
                                    break;
                                case 144:
                                    int i26 = i6;
                                    i2 = iG;
                                    if (!this.l.c) {
                                        u62Var3.t(16);
                                        i = 3;
                                        z = true;
                                        break;
                                    } else {
                                        u62Var3.i(4);
                                        u62Var3.i(i26);
                                        u62Var3.i(i26);
                                        boolean zH = u62Var3.h();
                                        boolean zH2 = u62Var3.h();
                                        i = 3;
                                        u62Var3.i(3);
                                        u62Var3.i(3);
                                        this.l.e(zH, zH2);
                                        z = true;
                                    }
                                case 145:
                                    i2 = iG;
                                    if (this.l.c) {
                                        int iC = s62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                        int iC2 = s62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                        u62Var3.t(2);
                                        s62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), 0);
                                        this.l.f(iC, iC2);
                                    } else {
                                        u62Var3.t(24);
                                    }
                                    i = 3;
                                    z = true;
                                    break;
                                case 146:
                                    i2 = iG;
                                    if (this.l.c) {
                                        u62Var3.t(4);
                                        int i27 = u62Var3.i(4);
                                        u62Var3.t(2);
                                        u62Var3.i(6);
                                        s62 s62Var2 = this.l;
                                        if (s62Var2.v != i27) {
                                            s62Var2.a('\n');
                                        }
                                        s62Var2.v = i27;
                                    } else {
                                        u62Var3.t(16);
                                    }
                                    i = 3;
                                    z = true;
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    az1.s("Invalid C1 command: ", 31, i14, "Cea708Decoder");
                                    i = i10;
                                    i2 = iG;
                                    z = true;
                                    break;
                                case 151:
                                    i2 = iG;
                                    if (this.l.c) {
                                        int iC3 = s62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), u62Var3.i(2));
                                        u62Var3.i(2);
                                        s62.c(u62Var3.i(2), u62Var3.i(2), u62Var3.i(2), 0);
                                        u62Var3.h();
                                        u62Var3.h();
                                        u62Var3.i(2);
                                        u62Var3.i(2);
                                        int i28 = u62Var3.i(2);
                                        u62Var3.t(8);
                                        s62 s62Var3 = this.l;
                                        s62Var3.o = iC3;
                                        s62Var3.l = i28;
                                    } else {
                                        u62Var3.t(32);
                                    }
                                    i = 3;
                                    z = true;
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i29 = i14 - 152;
                                    s62 s62Var4 = s62VarArr[i29];
                                    u62Var3.t(i6);
                                    boolean zH3 = u62Var3.h();
                                    boolean zH4 = u62Var3.h();
                                    u62Var3.h();
                                    int i30 = u62Var3.i(i10);
                                    boolean zH5 = u62Var3.h();
                                    int i31 = u62Var3.i(7);
                                    int i32 = u62Var3.i(i13);
                                    int i33 = u62Var3.i(4);
                                    int i34 = u62Var3.i(4);
                                    u62Var3.t(i6);
                                    u62Var3.i(6);
                                    u62Var3.t(i6);
                                    int i35 = u62Var3.i(3);
                                    i2 = iG;
                                    int i36 = u62Var3.i(3);
                                    ArrayList arrayList = s62Var4.a;
                                    s62Var4.c = true;
                                    s62Var4.d = zH3;
                                    s62Var4.k = zH4;
                                    s62Var4.e = i30;
                                    s62Var4.f = zH5;
                                    s62Var4.g = i31;
                                    s62Var4.h = i32;
                                    s62Var4.i = i33;
                                    int i37 = i34 + 1;
                                    if (s62Var4.j != i37) {
                                        s62Var4.j = i37;
                                        while (true) {
                                            if ((zH4 && arrayList.size() >= s62Var4.j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i35 != 0 && s62Var4.m != i35) {
                                        s62Var4.m = i35;
                                        int i38 = i35 - 1;
                                        int i39 = s62.C[i38];
                                        boolean z3 = s62.B[i38];
                                        int i40 = s62.z[i38];
                                        int i41 = s62.A[i38];
                                        int i42 = s62.y[i38];
                                        s62Var4.o = i39;
                                        s62Var4.l = i42;
                                    }
                                    if (i36 != 0 && s62Var4.n != i36) {
                                        s62Var4.n = i36;
                                        int i43 = i36 - 1;
                                        int i44 = s62.E[i43];
                                        int i45 = s62.D[i43];
                                        s62Var4.e(false, false);
                                        s62Var4.f(s62.w, s62.F[i43]);
                                    }
                                    if (this.p != i29) {
                                        this.p = i29;
                                        this.l = s62VarArr[i29];
                                    }
                                    i = 3;
                                    z = true;
                                    break;
                            }
                        } else {
                            i = i10;
                            i2 = iG;
                            z = true;
                            if (i14 <= 255) {
                                this.l.a((char) (i14 & 255));
                            } else {
                                az1.s("Invalid base command: ", 33, i14, "Cea708Decoder");
                                c2 = ',';
                                i3 = 2;
                                c = 7;
                                i4 = 8;
                            }
                        }
                        z2 = z;
                        c2 = ',';
                        i3 = 2;
                        c = 7;
                        i4 = 8;
                    }
                    c = 7;
                    i = i10;
                } else {
                    i = i10;
                    i2 = iG;
                    int i46 = i13;
                    z = true;
                    int i47 = u62Var3.i(i46);
                    if (i47 <= 31) {
                        c = 7;
                        if (i47 > 7) {
                            if (i47 <= 15) {
                                u62Var3.t(i46);
                            } else if (i47 <= 23) {
                                u62Var3.t(16);
                            } else if (i47 <= 31) {
                                u62Var3.t(24);
                            }
                        }
                        c2 = ',';
                    } else {
                        c = 7;
                        if (i47 <= 127) {
                            if (i47 == 32) {
                                c2 = ',';
                                this.l.a(' ');
                            } else if (i47 == 33) {
                                c2 = ',';
                                this.l.a((char) 160);
                            } else if (i47 == 37) {
                                c2 = ',';
                                this.l.a((char) 8230);
                            } else if (i47 != 42) {
                                c2 = ',';
                                if (i47 == 44) {
                                    this.l.a((char) 338);
                                } else if (i47 == 63) {
                                    this.l.a((char) 376);
                                } else if (i47 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i47 == 58) {
                                    this.l.a((char) 353);
                                } else if (i47 == 60) {
                                    this.l.a((char) 339);
                                } else if (i47 != 61) {
                                    switch (i47) {
                                        case 48:
                                            this.l.a((char) 9608);
                                            break;
                                        case 49:
                                            this.l.a((char) 8216);
                                            break;
                                        case 50:
                                            this.l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.l.a((char) 8220);
                                            break;
                                        case 52:
                                            this.l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i47) {
                                                case 118:
                                                    this.l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.l.a((char) 9484);
                                                    break;
                                                default:
                                                    az1.s("Invalid G2 character: ", 33, i47, "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                            } else {
                                c2 = ',';
                                this.l.a((char) 352);
                            }
                            z2 = true;
                        } else {
                            c2 = ',';
                            if (i47 > 159) {
                                i3 = 2;
                                i4 = 8;
                                if (i47 <= 255) {
                                    if (i47 == 160) {
                                        this.l.a((char) 13252);
                                    } else {
                                        az1.s("Invalid G3 character: ", 33, i47, "Cea708Decoder");
                                        this.l.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    az1.s("Invalid extended command: ", 37, i47, "Cea708Decoder");
                                }
                            } else if (i47 <= 135) {
                                u62Var3.t(32);
                            } else if (i47 <= 143) {
                                u62Var3.t(40);
                            } else if (i47 <= 159) {
                                i3 = 2;
                                u62Var3.t(2);
                                i4 = 8;
                                u62Var3.t(u62Var3.i(6) * 8);
                            }
                        }
                    }
                    i3 = 2;
                    i4 = 8;
                }
                i10 = i;
                i6 = i3;
                i13 = i4;
            }
            if (z2) {
                this.m = j();
            }
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v62.j():java.util.List");
    }

    public final void k() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
