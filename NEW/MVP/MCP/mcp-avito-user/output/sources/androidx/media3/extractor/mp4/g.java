package androidx.media3.extractor.mp4;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.H;
import androidx.media3.extractor.K;
import androidx.media3.extractor.mp4.a;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: Mp4Extractor.java */
@J
/* loaded from: classes.dex */
public final class g implements p, H {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f51002w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final z f51003a;

    /* renamed from: b, reason: collision with root package name */
    public final z f51004b;

    /* renamed from: c, reason: collision with root package name */
    public final z f51005c;

    /* renamed from: d, reason: collision with root package name */
    public final z f51006d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<a.C1856a> f51007e;

    /* renamed from: f, reason: collision with root package name */
    public final i f51008f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f51009g;

    /* renamed from: h, reason: collision with root package name */
    public int f51010h;

    /* renamed from: i, reason: collision with root package name */
    public int f51011i;

    /* renamed from: j, reason: collision with root package name */
    public long f51012j;

    /* renamed from: k, reason: collision with root package name */
    public int f51013k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public z f51014l;

    /* renamed from: m, reason: collision with root package name */
    public int f51015m;

    /* renamed from: n, reason: collision with root package name */
    public int f51016n;

    /* renamed from: o, reason: collision with root package name */
    public int f51017o;

    /* renamed from: p, reason: collision with root package name */
    public int f51018p;

    /* renamed from: q, reason: collision with root package name */
    public r f51019q;

    /* renamed from: r, reason: collision with root package name */
    public b[] f51020r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f51021s;

    /* renamed from: t, reason: collision with root package name */
    public int f51022t;

    /* renamed from: u, reason: collision with root package name */
    public long f51023u;

    /* renamed from: v, reason: collision with root package name */
    public int f51024v;

    /* compiled from: Mp4Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Mp4Extractor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final k f51025a;

        /* renamed from: b, reason: collision with root package name */
        public final n f51026b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.extractor.J f51027c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final K f51028d;

        /* renamed from: e, reason: collision with root package name */
        public int f51029e;

        public b(k kVar, n nVar, androidx.media3.extractor.J j12) {
            this.f51025a = kVar;
            this.f51026b = nVar;
            this.f51027c = j12;
            this.f51028d = "audio/true-hd".equals(kVar.f51046f.f47757m) ? new K() : null;
        }
    }

    public g() {
        this(0);
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f51007e.clear();
        this.f51013k = 0;
        this.f51015m = -1;
        this.f51016n = 0;
        this.f51017o = 0;
        this.f51018p = 0;
        if (j12 == 0) {
            if (this.f51010h != 3) {
                this.f51010h = 0;
                this.f51013k = 0;
                return;
            } else {
                i iVar = this.f51008f;
                iVar.f51035a.clear();
                iVar.f51036b = 0;
                this.f51009g.clear();
                return;
            }
        }
        for (b bVar : this.f51020r) {
            n nVar = bVar.f51026b;
            int iF2 = M.f(nVar.f51079f, j13, false);
            while (true) {
                if (iF2 < 0) {
                    iF2 = -1;
                    break;
                } else if ((nVar.f51080g[iF2] & 1) != 0) {
                    break;
                } else {
                    iF2--;
                }
            }
            if (iF2 == -1) {
                iF2 = nVar.a(j13);
            }
            bVar.f51029e = iF2;
            K k12 = bVar.f51028d;
            if (k12 != null) {
                k12.f50385b = false;
                k12.f50386c = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return j.a(qVar, false, false);
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f51023u;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    @Override // androidx.media3.extractor.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.extractor.H.a f(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.g.f(long):androidx.media3.extractor.H$a");
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x045d  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r37, androidx.media3.extractor.F r38) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.g.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f51019q = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
    
        if (r8 != 1920233063) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cc, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.c(r8, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d8, code lost:
    
        if (r8 != 1885823344) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01da, code lost:
    
        r0 = androidx.media3.extractor.mp4.f.c(r8, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e2, code lost:
    
        r10.F(r11);
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01eb, code lost:
    
        if (r8 != 1936683886) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ed, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TVSHOWSORT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f8, code lost:
    
        if (r8 != 1953919848) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fa, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TVSHOW", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
    
        if (r8 != 757935405) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0207, code lost:
    
        r0 = null;
        r12 = null;
        r3 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020b, code lost:
    
        r5 = r10.f47963b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020d, code lost:
    
        if (r5 >= r11) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020f, code lost:
    
        r19 = r10.g();
        r27 = r2;
        r2 = r10.g();
        r10.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        if (r2 != 1835360622) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0224, code lost:
    
        r12 = r10.q(r19 - 12);
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0230, code lost:
    
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0237, code lost:
    
        if (r2 != 1851878757) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0239, code lost:
    
        r0 = r10.q(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0243, code lost:
    
        if (r2 != 1684108385) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0245, code lost:
    
        r8 = r19;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0249, code lost:
    
        r10.G(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024e, code lost:
    
        r2 = r27;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0253, code lost:
    
        r27 = r2;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0257, code lost:
    
        if (r12 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0259, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025c, code lost:
    
        if (r3 != (-1)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x025f, code lost:
    
        r10.F(r3);
        r10.G(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0271, code lost:
    
        r12 = new androidx.media3.extractor.metadata.id3.InternalFrame(r12, r0, r10.q(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0274, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0275, code lost:
    
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027a, code lost:
    
        r27 = r2;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0281, code lost:
    
        r2 = r8 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0286, code lost:
    
        if (r2 != 6516084) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0288, code lost:
    
        r0 = r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0293, code lost:
    
        if (r10.g() != 1684108385) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0295, code lost:
    
        r10.G(8);
        r0 = r10.q(r0 - 16);
        r12 = new androidx.media3.extractor.metadata.id3.CommentFrame("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a9, code lost:
    
        androidx.media3.extractor.mp4.a.a(r8);
        androidx.media3.common.util.s.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b3, code lost:
    
        if (r2 == 7233901) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b8, code lost:
    
        if (r2 != 7631467) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        if (r2 == 6516589) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c4, code lost:
    
        if (r2 != 7828084) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ca, code lost:
    
        if (r2 != 6578553) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cc, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TDRC", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d6, code lost:
    
        if (r2 != 4280916) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d8, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TPE1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e2, code lost:
    
        if (r2 != 7630703) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e4, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSSE", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ee, code lost:
    
        if (r2 != 6384738) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f0, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TALB", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fb, code lost:
    
        if (r2 != 7108978) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02fd, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "USLT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0308, code lost:
    
        if (r2 != 6776174) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x030a, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TCON", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0313, code lost:
    
        if (r2 != 6779504) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0315, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TIT1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031d, code lost:
    
        androidx.media3.extractor.mp4.a.a(r8);
        androidx.media3.common.util.s.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0323, code lost:
    
        r10.F(r11);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0328, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TCOM", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0330, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TIT2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0338, code lost:
    
        if (r12 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x033a, code lost:
    
        r4.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x033d, code lost:
    
        r2 = r27;
        r6 = r29;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x034a, code lost:
    
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x034d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x034e, code lost:
    
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0355, code lost:
    
        if (r4.isEmpty() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0357, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0359, code lost:
    
        r12 = new androidx.media3.common.Metadata(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x035e, code lost:
    
        r19 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r10.F(r2);
        r2 = r2 + r8;
        r10.G(r12);
        r4 = new java.util.ArrayList();
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r8 = r10.f47963b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r8 >= r2) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r11 = r10.g() + r8;
        r8 = r10.g();
        r3 = (r8 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r3 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r3 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r27 = r2;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r8 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r3 = androidx.media3.extractor.mp4.f.d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r3 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r3 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        r3 = androidx.media3.extractor.mp4.f.f51001a[r3 - r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r8 = new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", null, com.google.common.collect.AbstractC37401r1.E(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        androidx.media3.common.util.s.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        r10.F(r11);
        r27 = r2;
        r29 = r6;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (r8 != 1684632427) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.a(r8, "TPOS", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r27 = r2;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        if (r8 != 1953655662) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.a(r8, "TRCK", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        if (r8 != 1953329263) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.c(r8, "TBPM", r10, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
    
        if (r8 != 1668311404) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.c(r8, "TCMP", r10, r5, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0130, code lost:
    
        if (r8 != 1668249202) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0132, code lost:
    
        r0 = r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        if (r10.g() != 1684108385) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        r3 = r10.g() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r3 != 13) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0149, code lost:
    
        r12 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014e, code lost:
    
        if (r3 != 14) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        r12 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0153, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0154, code lost:
    
        if (r12 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0156, code lost:
    
        androidx.media3.common.util.s.g();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        r10.G(4);
        r0 = r0 - 16;
        r3 = new byte[r0];
        r10.e(0, r0, r3);
        r12 = new androidx.media3.extractor.metadata.id3.ApicFrame(r12, null, 3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        androidx.media3.common.util.s.g();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017c, code lost:
    
        if (r8 != 1631670868) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TPE2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0189, code lost:
    
        if (r8 != 1936682605) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSOT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
    
        if (r8 != 1936679276) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSO2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r8 != 1936679282) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSOA", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        if (r8 != 1936679265) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b2, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSOP", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
    
        if (r8 != 1936679791) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
    
        r12 = androidx.media3.extractor.mp4.f.b(r8, "TSOC", r10);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x063e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06c8  */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r31) {
        /*
            Method dump skipped, instructions count: 1945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.g.j(long):void");
    }

    public g(int i12) {
        this.f51010h = 0;
        this.f51008f = new i();
        this.f51009g = new ArrayList();
        this.f51006d = new z(16);
        this.f51007e = new ArrayDeque<>();
        this.f51003a = new z(androidx.media3.container.b.f48118a);
        this.f51004b = new z(4);
        this.f51005c = new z();
        this.f51015m = -1;
        this.f51019q = r.f51145J1;
        this.f51020r = new b[0];
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
