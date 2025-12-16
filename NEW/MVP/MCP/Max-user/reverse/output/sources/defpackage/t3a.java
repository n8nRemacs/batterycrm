package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t3a implements fp5, h9e {
    public int i;
    public long j;
    public int k;
    public qyg l;
    public int n;
    public int o;
    public int p;
    public jp5 q;
    public r3a[] r;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final t9e f = new t9e();
    public final ArrayList g = new ArrayList();
    public final qyg d = new qyg(16);
    public final ArrayDeque e = new ArrayDeque();
    public final qyg a = new qyg(gfi.a);
    public final qyg b = new qyg(4);
    public final qyg c = new qyg(2, false);
    public int m = -1;

    public t3a(int i) {
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                t9e t9eVar = this.f;
                t9eVar.a.clear();
                t9eVar.b = 0;
                this.g.clear();
                return;
            }
        }
        r3a[] r3aVarArr = this.r;
        if (r3aVarArr != null) {
            for (r3a r3aVar : r3aVarArr) {
                tfg tfgVar = r3aVar.b;
                int iE = xxg.e(tfgVar.f, j2, false);
                while (true) {
                    if (iE < 0) {
                        iE = -1;
                        break;
                    } else if ((tfgVar.g[iE] & 1) != 0) {
                        break;
                    } else {
                        iE--;
                    }
                }
                if (iE == -1) {
                    iE = tfgVar.a(j2);
                }
                r3aVar.e = iE;
                djg djgVar = r3aVar.d;
                if (djgVar != null) {
                    djgVar.b = false;
                    djgVar.c = 0;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[EDGE_INSN: B:73:0x00e3->B:65:0x00e3 BREAK  A[LOOP:1: B:32:0x0070->B:64:0x00de], SYNTHETIC] */
    @Override // defpackage.h9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f9e e(long r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.e(long):f9e");
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.u;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.q = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        return rmi.d(hp5Var, false, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r40, defpackage.n7 r41) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.i(hp5, n7):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bc, code lost:
    
        if (r15 >= r10) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01be, code lost:
    
        r19 = r7.f();
        r29 = r0;
        r0 = r7.f();
        r30 = r4;
        r7.F(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d1, code lost:
    
        if (r0 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d3, code lost:
    
        r13 = r7.o(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r0 != 1851878757) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01df, code lost:
    
        r14 = r7.o(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e9, code lost:
    
        if (r0 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01eb, code lost:
    
        r8 = r15;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ee, code lost:
    
        r7.F(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f3, code lost:
    
        r0 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f8, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fc, code lost:
    
        if (r13 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fe, code lost:
    
        if (r14 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0201, code lost:
    
        if (r8 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0204, code lost:
    
        r7.E(r8);
        r7.F(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0217, code lost:
    
        r9 = new defpackage.gp7(r13, r14, r7.o(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0219, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        r7.E(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021f, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0225, code lost:
    
        r0 = 16777215 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022c, code lost:
    
        if (r0 != 6516084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022e, code lost:
    
        r9 = defpackage.tei.c(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (r0 == 7233901) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023b, code lost:
    
        if (r0 != 7631467) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0242, code lost:
    
        if (r0 == 6516589) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0247, code lost:
    
        if (r0 != 7828084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024e, code lost:
    
        if (r0 != 6578553) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0250, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025a, code lost:
    
        if (r0 != 4280916) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025c, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0266, code lost:
    
        if (r0 != 7630703) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0268, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0272, code lost:
    
        if (r0 != 6384738) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0274, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027e, code lost:
    
        if (r0 != 7108978) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0280, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x028a, code lost:
    
        if (r0 != 6776174) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x028c, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0294, code lost:
    
        if (r0 != 6779504) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0296, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029e, code lost:
    
        r4 = java.lang.String.valueOf(defpackage.oy.h(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ac, code lost:
    
        if (r4.length() == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ae, code lost:
    
        r0 = "Skipped unknown metadata entry: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b3, code lost:
    
        r0 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b9, code lost:
    
        android.util.Log.d("MetadataUtil", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02bc, code lost:
    
        r7.E(r10);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c1, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c9, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d1, code lost:
    
        if (r9 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d3, code lost:
    
        r3.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d6, code lost:
    
        r9 = r26;
        r0 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e2, code lost:
    
        r7.E(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e6, code lost:
    
        r29 = r0;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ee, code lost:
    
        if (r3.isEmpty() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f0, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02f4, code lost:
    
        r19 = new defpackage.sy9(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r7.E(r4);
        r4 = r4 + r10;
        r7.F(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r8 >= r4) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r10 = r7.f() + r8;
        r8 = r7.f();
        r26 = r9;
        r9 = (r8 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r9 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r9 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r8 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        r8 = defpackage.tei.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r8 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        r9 = defpackage.tei.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r8 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r8 = r9[r8 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r9 = new defpackage.g4g("TCON", null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r7.E(r10);
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        if (r8 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        r9 = defpackage.tei.e(r8, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (r8 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r9 = defpackage.tei.e(r8, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        if (r8 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        r9 = defpackage.tei.g(r8, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        if (r8 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
    
        r9 = defpackage.tei.g(r8, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0129, code lost:
    
        if (r8 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        r9 = defpackage.tei.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        if (r8 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0135, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        if (r8 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014b, code lost:
    
        if (r8 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        if (r8 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        if (r8 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:
    
        if (r8 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0172, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017d, code lost:
    
        if (r8 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
    
        r9 = defpackage.tei.g(r8, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        if (r8 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018d, code lost:
    
        r9 = defpackage.tei.g(r8, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019a, code lost:
    
        if (r8 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019c, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
    
        if (r8 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a9, code lost:
    
        r9 = defpackage.tei.f(r8, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b4, code lost:
    
        if (r8 != 757935405) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b6, code lost:
    
        r13 = null;
        r14 = null;
        r8 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ba, code lost:
    
        r15 = r7.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x057a A[PHI: r0
  0x057a: PHI (r0v11 sy9) = (r0v4 sy9), (r0v4 sy9), (r0v6 sy9), (r0v4 sy9) binds: [B:277:0x057e, B:278:0x0580, B:378:0x057a, B:273:0x0573] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0632 A[LOOP:12: B:310:0x062f->B:312:0x0632, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05e4 A[EDGE_INSN: B:375:0x05e4->B:300:0x05e4 BREAK  A[LOOP:10: B:290:0x05b1->B:299:0x05df], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r32) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.j(long):void");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
