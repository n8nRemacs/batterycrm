package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class kj6 implements gp5 {
    public static final byte[] Y0 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final hf6 Z0;
    public final ukd A0;
    public zjd B0;
    public int C0;
    public int D0;
    public long E0;
    public int F0;
    public umb G0;
    public long H0;
    public int I0;
    public long J0;
    public long K0;
    public long L0;
    public ij6 M0;
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public kp5 S0;
    public sfg[] T0;
    public sfg[] U0;
    public boolean V0;
    public boolean W0;
    public final umb X;
    public long X0;
    public final umb Y;
    public final byte[] Z;
    public final rof a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final umb o;
    public final umb s0;
    public final z9g t0;
    public final xo8 u0;
    public final umb v0;
    public final ArrayDeque w0;
    public final ArrayDeque x0;
    public final a9 y0;
    public final sfg z0;

    static {
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("application/x-emsg");
        Z0 = new hf6(ff6Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kj6(rof rofVar, int i) {
        this(rofVar, i, null, zjd.o, null);
        t76 t76Var = wg7.b;
    }

    public static y45 b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            q3a q3aVar = (q3a) list.get(i);
            if (q3aVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = q3aVar.c.a;
                uaj uajVarG = d7j.g(bArr);
                UUID uuid = uajVarG == null ? null : (UUID) uajVarG.c;
                if (uuid == null) {
                    a8i.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w45(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new y45(null, false, (w45[]) arrayList.toArray(new w45[0]));
    }

    public static void c(umb umbVar, int i, jfg jfgVar) throws ParserException {
        umbVar.J(i + 8);
        int iJ = umbVar.j();
        byte[] bArr = gt0.a;
        if ((iJ & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iJ & 2) != 0;
        int iB = umbVar.B();
        if (iB == 0) {
            Arrays.fill(jfgVar.k, 0, jfgVar.d, false);
            return;
        }
        int i2 = jfgVar.d;
        umb umbVar2 = (umb) jfgVar.q;
        if (iB != i2) {
            StringBuilder sbM = ho7.m(iB, "Senc sample count ", " is different from fragment sample count");
            sbM.append(jfgVar.d);
            throw ParserException.a(null, sbM.toString());
        }
        Arrays.fill(jfgVar.k, 0, iB, z);
        umbVar2.G(umbVar.a());
        jfgVar.j = true;
        jfgVar.l = true;
        umbVar.h(0, umbVar2.a, umbVar2.c);
        umbVar2.J(0);
        jfgVar.l = false;
    }

    public static Pair e(long j, umb umbVar) throws ParserException {
        long jC;
        long jC2;
        umb umbVar2 = umbVar;
        umbVar2.J(8);
        int iE = gt0.e(umbVar2.j());
        umbVar2.K(4);
        long jZ = umbVar2.z();
        if (iE == 0) {
            jC = umbVar2.z();
            jC2 = umbVar2.z();
        } else {
            jC = umbVar2.C();
            jC2 = umbVar2.C();
        }
        long j2 = jC2 + j;
        String str = zxg.a;
        long jE0 = zxg.e0(jC, 1000000L, jZ, RoundingMode.DOWN);
        umbVar2.K(2);
        int iD = umbVar2.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j3 = j2;
        long j4 = jE0;
        int i = 0;
        while (i < iD) {
            int iJ = umbVar2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jZ2 = umbVar2.z();
            iArr[i] = iJ & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jC += jZ2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jE02 = zxg.e0(jC, 1000000L, jZ, RoundingMode.DOWN);
            jArr4[i] = jE02 - jArr5[i];
            umbVar2.K(4);
            j3 += iArr[i];
            i++;
            iD = iD;
            umbVar2 = umbVar;
            j4 = jE02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jE0), new h93(iArr, jArr, jArr2, jArr3));
    }

    public final void a() {
        this.C0 = 0;
        this.F0 = 0;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((ij6) sparseArray.valueAt(i)).e();
        }
        this.x0.clear();
        this.I0 = 0;
        ((PriorityQueue) this.y0.e).clear();
        this.J0 = j2;
        this.w0.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x07f1, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0705  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r54) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 2037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj6.f(long):void");
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        zjd zjdVarM;
        c6f c6fVarD = pmi.d(ip5Var, true, false);
        if (c6fVarD != null) {
            zjdVarM = wg7.m(c6fVarD);
        } else {
            t76 t76Var = wg7.b;
            zjdVarM = zjd.o;
        }
        this.B0 = zjdVarM;
        return c6fVarD == null;
    }

    @Override // defpackage.gp5
    public final List l() {
        return this.B0;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            kp5Var = new dl6(kp5Var, this.a);
        }
        this.S0 = kp5Var;
        a();
        sfg[] sfgVarArr = new sfg[2];
        this.T0 = sfgVarArr;
        int i3 = 0;
        sfg sfgVar = this.z0;
        if (sfgVar != null) {
            sfgVarArr[0] = sfgVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            sfgVarArr[i] = this.S0.mo163B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        sfg[] sfgVarArr2 = (sfg[]) zxg.W(i, this.T0);
        this.T0 = sfgVarArr2;
        for (sfg sfgVar2 : sfgVarArr2) {
            sfgVar2.d(Z0);
        }
        List list = this.c;
        this.U0 = new sfg[list.size()];
        while (i3 < this.U0.length) {
            sfg sfgVarMo163B = this.S0.mo163B(i4, 3);
            sfgVarMo163B.d((hf6) list.get(i3));
            this.U0[i3] = sfgVarMo163B;
            i3++;
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e7, code lost:
    
        if (r32.O0 >= r32.N0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
    
        r2 = r32.P0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01eb, code lost:
    
        if (r2 != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f0, code lost:
    
        if (r32.U0.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f4, code lost:
    
        if (r32.Q0 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f6, code lost:
    
        r2 = defpackage.hfi.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0206, code lost:
    
        if ((r4 + r2) > (r32.N0 - r32.O0)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0208, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020c, code lost:
    
        r33.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0219, code lost:
    
        if (r19 < 0) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021b, code lost:
    
        r32.P0 = r19 - r2;
        r13 = r32.o;
        r25 = r4;
        r13.J(0);
        r20 = r6;
        r5.b(r13, 4, 0);
        r32.O0 += 4;
        r32.N0 += r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023b, code lost:
    
        if (r32.U0.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023d, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023f, code lost:
    
        r4 = r15[4];
        r6 = r8.n;
        r13 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (java.util.Objects.equals(r6, "video/avc") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024f, code lost:
    
        if (defpackage.xz9.b(r13, "video/avc") == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0252, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0256, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025b, code lost:
    
        if ((r4 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025d, code lost:
    
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0265, code lost:
    
        if (java.util.Objects.equals(r8.n, r4) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026b, code lost:
    
        if (defpackage.xz9.b(r13, r4) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0275, code lost:
    
        if (((r26 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0278, code lost:
    
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027c, code lost:
    
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027f, code lost:
    
        r32.R0 = r6;
        r5.b(r9, r2, 0);
        r32.O0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028a, code lost:
    
        if (r2 <= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028e, code lost:
    
        if (r32.Q0 != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (defpackage.hfi.e(r15, r2, r8) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r32.Q0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0299, code lost:
    
        r34 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029b, code lost:
    
        r6 = r20;
        r2 = r22;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02aa, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ab, code lost:
    
        r25 = r4;
        r20 = r6;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b3, code lost:
    
        if (r32.R0 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b5, code lost:
    
        r6 = r32.Y;
        r6.G(r2);
        r34 = r4;
        r33.readFully(r6.a, 0, r32.P0);
        r5.b(r6, r32.P0, 0);
        r2 = r32.P0;
        r2 = defpackage.hfi.q(r6.c, r6.a);
        r6.J(0);
        r6.I(r2);
        r2 = r8.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02de, code lost:
    
        if (r2 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e2, code lost:
    
        if (r7.a == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e4, code lost:
    
        r7.F(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ea, code lost:
    
        if (r7.a == r2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ec, code lost:
    
        r7.F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ef, code lost:
    
        r7.i(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fb, code lost:
    
        if ((r22.a() & 4) == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02fd, code lost:
    
        r7.q(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0300, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0303, code lost:
    
        r34 = r4;
        r2 = r5.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x030c, code lost:
    
        r32.O0 += r2;
        r32.P0 -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0317, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0319, code lost:
    
        r2 = r32.O0;
        r4 = r32.N0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031d, code lost:
    
        if (r2 >= r4) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031f, code lost:
    
        r32.O0 += r5.c(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032b, code lost:
    
        r1 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0331, code lost:
    
        if (r32.Q0 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0333, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0336, code lost:
    
        r28 = r1;
        r1 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033c, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x033e, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0343, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0345, code lost:
    
        r26 = r10;
        r5.a(r26, r28, r32.N0, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0356, code lost:
    
        if (r3.isEmpty() != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0358, code lost:
    
        r1 = (defpackage.gj6) r3.removeFirst();
        r32.I0 -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0369, code lost:
    
        if (r1.b == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036b, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036d, code lost:
    
        if (r14 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x036f, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0373, code lost:
    
        r7 = r4;
        r2 = r32.T0;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0378, code lost:
    
        if (r5 >= r4) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x037a, code lost:
    
        r2[r5].a(r7, 1, r1.c, r32.I0, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038c, code lost:
    
        if (r22.c() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x038e, code lost:
    
        r32.M0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0391, code lost:
    
        r32.C0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0396, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r32.C0 != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r9 = r6.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r32.N0 = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        r32.Q0 = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r33.z(r32.N0);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        r3 = (defpackage.umb) r6.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0133, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        r3.K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        if (r6.j == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        if (r6.k[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0144, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        r32.M0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0155, code lost:
    
        r32.C0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0161, code lost:
    
        if (r2.d.a.h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0163, code lost:
    
        r32.N0 -= 8;
        r33.z(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        r32.O0 = r2.d(r32.N0, 7);
        defpackage.aw0.b(r32.N0, r8);
        r4 = 0;
        r5.b(r8, 7, 0);
        r32.O0 += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0197, code lost:
    
        r4 = 0;
        r32.O0 = r2.d(r32.N0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        r32.N0 += r32.O0;
        r32.C0 = 4;
        r32.P0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b2, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b4, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        r15 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c7, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cb, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        if (r4 == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
    
        r9 = r32.X;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e1, code lost:
    
        r22 = r2;
     */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r33, defpackage.n7 r34) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj6.y(ip5, n7):int");
    }

    public kj6(rof rofVar, int i, z9g z9gVar, List list, sfg sfgVar) {
        this.a = rofVar;
        this.b = i;
        this.t0 = z9gVar;
        this.c = Collections.unmodifiableList(list);
        this.z0 = sfgVar;
        this.u0 = new xo8(17, (byte) 0);
        this.v0 = new umb(16);
        this.o = new umb(hfi.a);
        this.X = new umb(6);
        this.Y = new umb();
        byte[] bArr = new byte[16];
        this.Z = bArr;
        this.s0 = new umb(bArr);
        this.w0 = new ArrayDeque();
        this.x0 = new ArrayDeque();
        this.d = new SparseArray();
        t76 t76Var = wg7.b;
        this.B0 = zjd.o;
        this.K0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.S0 = kp5.u;
        this.T0 = new sfg[0];
        this.U0 = new sfg[0];
        this.y0 = new a9(new ej6(this));
        this.A0 = new ukd(11);
        this.X0 = -1L;
    }
}
