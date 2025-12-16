package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class jj6 implements fp5 {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final gf6 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final qyg h;
    public final y9g i;
    public final rfg n;
    public int o;
    public int p;
    public long q;
    public int r;
    public qyg s;
    public long t;
    public int u;
    public hj6 y;
    public int z;
    public final xt4 j = new xt4(17);
    public final qyg k = new qyg(16);
    public final qyg d = new qyg(gfi.a);
    public final qyg e = new qyg(5);
    public final qyg f = new qyg(2, false);
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public jp5 D = jp5.t;
    public rfg[] E = new rfg[0];
    public rfg[] F = new rfg[0];

    static {
        ef6 ef6Var = new ef6();
        ef6Var.k = "application/x-emsg";
        I = new gf6(ef6Var);
    }

    public jj6(int i, y9g y9gVar, List list, h4c h4cVar) {
        this.a = i;
        this.i = y9gVar;
        this.b = Collections.unmodifiableList(list);
        this.n = h4cVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new qyg(bArr);
    }

    public static x45 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ny nyVar = (ny) list.get(i);
            if (nyVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = nyVar.c.a;
                t9f t9fVarB = c7j.b(bArr);
                UUID uuid = t9fVarB == null ? null : (UUID) t9fVarB.b;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new v45(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new x45(null, false, (v45[]) arrayList.toArray(new v45[0]));
    }

    public static void b(qyg qygVar, int i, jfg jfgVar) throws ParserException {
        qygVar.E(i + 8);
        int iF = qygVar.f();
        if ((iF & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iF & 2) != 0;
        int iV = qygVar.v();
        if (iV == 0) {
            Arrays.fill(jfgVar.k, 0, jfgVar.d, false);
            return;
        }
        int i2 = jfgVar.d;
        qyg qygVar2 = (qyg) jfgVar.q;
        if (iV != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(iV);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw ParserException.a(null, sb.toString());
        }
        Arrays.fill(jfgVar.k, 0, iV, z);
        qygVar2.B(qygVar.c());
        jfgVar.j = true;
        jfgVar.l = true;
        qygVar.e(0, qygVar2.a, qygVar2.c);
        qygVar2.E(0);
        jfgVar.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x0733, code lost:
    
        r50.o = 0;
        r50.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0738, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r51) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.c(long):void");
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((hj6) sparseArray.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        int i;
        this.D = jp5Var;
        int i2 = 0;
        this.o = 0;
        this.r = 0;
        rfg[] rfgVarArr = new rfg[2];
        this.E = rfgVarArr;
        rfg rfgVar = this.n;
        if (rfgVar != null) {
            rfgVarArr[0] = rfgVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            rfgVarArr[i] = jp5Var.B(100, 5);
            i3 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        rfg[] rfgVarArr2 = (rfg[]) xxg.D(i, this.E);
        this.E = rfgVarArr2;
        for (rfg rfgVar2 : rfgVarArr2) {
            rfgVar2.d(I);
        }
        List list = this.b;
        this.F = new rfg[list.size()];
        while (i2 < this.F.length) {
            rfg rfgVarB = this.D.B(i3, 3);
            rfgVarB.d((gf6) list.get(i2));
            this.F[i2] = rfgVarB;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        return rmi.d(hp5Var, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fe, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020c, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        r33.C = r5;
        r33.A += 5;
        r33.z += r35;
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0220, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022b, code lost:
    
        throw com.google.android.exoplayer2.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022c, code lost:
    
        r35 = r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0233, code lost:
    
        if (r33.C == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
    
        r12 = r33.f;
        r12.B(r5);
        r19 = r8;
        r22 = r9;
        ((defpackage.mm4) r34).a(r12.a, 0, r33.B, false);
        r7.c(r33.B, r12);
        r4 = r33.B;
        r5 = defpackage.gfi.i(r12.c, r12.a);
        r12.E("video/hevc".equals(r6.v0) ? 1 : 0);
        r12.D(r5);
        defpackage.syi.a(r13, r12, r33.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026a, code lost:
    
        r19 = r8;
        r22 = r9;
        r4 = r7.a(r34, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0273, code lost:
    
        r33.A += r4;
        r33.B -= r4;
        r4 = r35;
        r8 = r19;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0284, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0287, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0289, code lost:
    
        r4 = r33.A;
        r5 = r33.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        if (r4 >= r5) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        r33.A += r7.a(r34, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029d, code lost:
    
        if (r2.l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029f, code lost:
    
        r11 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ae, code lost:
    
        if (r3.i[r2.f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b0, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b7, code lost:
    
        if (r2.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b9, code lost:
    
        r11 = r11 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bc, code lost:
    
        r25 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c2, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c4, code lost:
    
        r28 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c9, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02cb, code lost:
    
        r23 = r13;
        r7.b(r23, r25, r33.z, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02dc, code lost:
    
        if (r30.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02de, code lost:
    
        r1 = (defpackage.fj6) r30.removeFirst();
        r33.u -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ef, code lost:
    
        if (r1.b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f1, code lost:
    
        r3 = r3 + r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f3, code lost:
    
        if (r15 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f5, code lost:
    
        r3 = r15.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f9, code lost:
    
        r6 = r3;
        r3 = r33.E;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fe, code lost:
    
        if (r12 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0300, code lost:
    
        r3[r12].b(r6, 1, r1.c, r33.u, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0312, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0314, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0317, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r33.o != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r4 = r3.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r33.z = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r2.f >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        ((defpackage.mm4) r34).z(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r4 = (defpackage.qyg) r3.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        r4.F(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0104, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        if (r3.j == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        if (r3.k[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        r4.F(r4.x() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
    
        if (r2.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012d, code lost:
    
        r33.z = r4 - 8;
        ((defpackage.mm4) r34).z(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.v0) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        r33.A = r2.c(r33.z, 7);
        r4 = r33.z;
        r7 = r33.h;
        defpackage.zs0.d(r4, r7);
        r2.a.c(7, r7);
        r33.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r33.A = r2.c(r33.z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016c, code lost:
    
        r33.z += r33.A;
        r33.o = 4;
        r33.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0178, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        if (r2.l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        r13 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018f, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0195, code lost:
    
        r4 = r6.j;
        r6 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        if (r4 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        r9 = r33.e;
        r11 = r9.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r35] = 0;
        r8 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b1, code lost:
    
        if (r33.A >= r33.z) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        r5 = r33.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b7, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b9, code lost:
    
        r30 = r12;
        ((defpackage.mm4) r34).a(r11, r4, r8, false);
        r9.E(0);
        r5 = r9.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
    
        if (r5 < 1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        r33.B = r5 - 1;
        r5 = r33.d;
        r5.E(0);
        r7.c(4, r5);
        r7.c(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e1, code lost:
    
        if (r33.F.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e3, code lost:
    
        r5 = r6.v0;
        r19 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ed, code lost:
    
        if ("video/avc".equals(r5) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ef, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f4, code lost:
    
        if ((r19 & 31) == 6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f7, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r34, defpackage.n7 r35) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
