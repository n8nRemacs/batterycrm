package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.B;
import com.google.android.exoplayer2.extractor.mp4.a;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes6.dex */
public final class g implements com.google.android.exoplayer2.extractor.j, y {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f344829w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final F f344830a;

    /* renamed from: b, reason: collision with root package name */
    public final F f344831b;

    /* renamed from: c, reason: collision with root package name */
    public final F f344832c;

    /* renamed from: d, reason: collision with root package name */
    public final F f344833d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<a.C10581a> f344834e;

    /* renamed from: f, reason: collision with root package name */
    public final i f344835f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f344836g;

    /* renamed from: h, reason: collision with root package name */
    public int f344837h;

    /* renamed from: i, reason: collision with root package name */
    public int f344838i;

    /* renamed from: j, reason: collision with root package name */
    public long f344839j;

    /* renamed from: k, reason: collision with root package name */
    public int f344840k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public F f344841l;

    /* renamed from: m, reason: collision with root package name */
    public int f344842m;

    /* renamed from: n, reason: collision with root package name */
    public int f344843n;

    /* renamed from: o, reason: collision with root package name */
    public int f344844o;

    /* renamed from: p, reason: collision with root package name */
    public int f344845p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f344846q;

    /* renamed from: r, reason: collision with root package name */
    public b[] f344847r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f344848s;

    /* renamed from: t, reason: collision with root package name */
    public int f344849t;

    /* renamed from: u, reason: collision with root package name */
    public long f344850u;

    /* renamed from: v, reason: collision with root package name */
    public int f344851v;

    /* compiled from: Mp4Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Mp4Extractor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final k f344852a;

        /* renamed from: b, reason: collision with root package name */
        public final n f344853b;

        /* renamed from: c, reason: collision with root package name */
        public final A f344854c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final B f344855d;

        /* renamed from: e, reason: collision with root package name */
        public int f344856e;

        public b(k kVar, n nVar, A a12) {
            this.f344852a = kVar;
            this.f344853b = nVar;
            this.f344854c = a12;
            this.f344855d = "audio/true-hd".equals(kVar.f344873f.f343476m) ? new B() : null;
        }
    }

    public g() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f344834e.clear();
        this.f344840k = 0;
        this.f344842m = -1;
        this.f344843n = 0;
        this.f344844o = 0;
        this.f344845p = 0;
        if (j12 == 0) {
            if (this.f344837h != 3) {
                this.f344837h = 0;
                this.f344840k = 0;
                return;
            } else {
                i iVar = this.f344835f;
                iVar.f344862a.clear();
                iVar.f344863b = 0;
                this.f344836g.clear();
                return;
            }
        }
        for (b bVar : this.f344847r) {
            n nVar = bVar.f344853b;
            int iF2 = U.f(nVar.f344906f, j13, false);
            while (true) {
                if (iF2 < 0) {
                    iF2 = -1;
                    break;
                } else if ((nVar.f344907g[iF2] & 1) != 0) {
                    break;
                } else {
                    iF2--;
                }
            }
            if (iF2 == -1) {
                iF2 = nVar.a(j13);
            }
            bVar.f344856e = iF2;
            B b12 = bVar.f344855d;
            if (b12 != null) {
                b12.f344377b = false;
                b12.f344378c = 0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f344846q = lVar;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344850u;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.extractor.y.a f(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.g.f(long):com.google.android.exoplayer2.extractor.y$a");
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) {
        return j.a(kVar, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x045d  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r37, com.google.android.exoplayer2.extractor.w r38) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.g.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c8, code lost:
    
        if (r5 != 1936679791) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ca, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d5, code lost:
    
        if (r5 != 1920233063) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.f.c(r5, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e3, code lost:
    
        if (r5 != 1885823344) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.f.c(r5, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f2, code lost:
    
        if (r5 != 1936683886) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f4, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ff, code lost:
    
        if (r5 != 1953919848) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0201, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        if (r5 != 757935405) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:
    
        r5 = null;
        r12 = null;
        r8 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0212, code lost:
    
        r0 = r10.f348071b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
    
        if (r0 >= r11) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0216, code lost:
    
        r18 = r10.d();
        r0 = r10.d();
        r27 = r4;
        r10.C(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        if (r0 != 1835360622) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022b, code lost:
    
        r12 = r10.n(r18 - 12);
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0237, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023e, code lost:
    
        if (r0 != 1851878757) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r5 = r10.n(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024b, code lost:
    
        if (r0 != 1684108385) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024d, code lost:
    
        r13 = r18;
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0251, code lost:
    
        r10.C(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0256, code lost:
    
        r4 = r27;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025b, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025f, code lost:
    
        if (r12 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        if (r5 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0264, code lost:
    
        if (r8 != (-1)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0267, code lost:
    
        r10.B(r8);
        r10.C(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0279, code lost:
    
        r12 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r12, r5, r10.n(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027b, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027c, code lost:
    
        r10.B(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0281, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0287, code lost:
    
        r0 = r5 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028c, code lost:
    
        if (r0 != 6516084) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x028e, code lost:
    
        r0 = r10.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0299, code lost:
    
        if (r10.d() != 1684108385) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x029b, code lost:
    
        r10.C(8);
        r0 = r10.n(r0 - 16);
        r12 = new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02af, code lost:
    
        com.google.android.exoplayer2.extractor.mp4.a.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b6, code lost:
    
        if (r0 == 7233901) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02bb, code lost:
    
        if (r0 != 7631467) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c2, code lost:
    
        if (r0 == 6516589) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c7, code lost:
    
        if (r0 != 7828084) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cd, code lost:
    
        if (r0 != 6578553) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cf, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d9, code lost:
    
        if (r0 != 4280916) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02db, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e5, code lost:
    
        if (r0 != 7630703) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e7, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f1, code lost:
    
        if (r0 != 6384738) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f3, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02fd, code lost:
    
        if (r0 != 7108978) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ff, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x030a, code lost:
    
        if (r0 != 6776174) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x030c, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0315, code lost:
    
        if (r0 != 6779504) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0317, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031f, code lost:
    
        com.google.android.exoplayer2.extractor.mp4.a.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0322, code lost:
    
        r10.B(r11);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0327, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x032f, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0337, code lost:
    
        if (r12 == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0339, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x033c, code lost:
    
        r4 = r27;
        r6 = r28;
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0348, code lost:
    
        r10.B(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x034b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x034c, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0352, code lost:
    
        if (r3.isEmpty() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0354, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0356, code lost:
    
        r12 = new com.google.android.exoplayer2.metadata.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x035b, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r10.B(r4);
        r4 = r4 + r5;
        r10.C(r12);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r5 = r10.f348071b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r5 >= r4) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r11 = r10.d() + r5;
        r5 = r10.d();
        r8 = (r5 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r8 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r8 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r27 = r4;
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r5 != 1735291493) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r10.C(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r10.d() != 1684108385) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        r10.C(8);
        r5 = r10.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        if (r5 <= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (r5 > 192) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.f.f344828a[r5 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        r8 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r10.B(r11);
        r27 = r4;
        r28 = r6;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r5 != 1684632427) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.a(r5, r10, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r10.B(r11);
        r27 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r5 != 1953655662) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.a(r5, r10, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        if (r5 != 1953329263) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.f.c(r5, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        r10.B(r11);
        r27 = r4;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        if (r5 != 1668311404) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.f.c(r5, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        if (r5 != 1668249202) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        r5 = r10.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        if (r10.d() != 1684108385) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
    
        r8 = r10.d() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if (r8 != 13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
    
        r12 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        if (r8 != 14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0162, code lost:
    
        r12 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0165, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        if (r12 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0168, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        r10.C(r0);
        r5 = r5 - 16;
        r8 = new byte[r5];
        r10.c(0, r5, r8);
        r12 = new com.google.android.exoplayer2.metadata.id3.ApicFrame(r12, null, 3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0180, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r5 != 1631670868) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        if (r5 != 1936682605) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0196, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a1, code lost:
    
        if (r5 != 1936679276) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ae, code lost:
    
        if (r5 != 1936679282) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b0, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r5 != 1936679265) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bd, code lost:
    
        r12 = com.google.android.exoplayer2.extractor.mp4.f.b(r5, r10, "TSOP");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05db A[PHI: r0
  0x05db: PHI (r0v27 com.google.android.exoplayer2.metadata.Metadata) = 
  (r0v11 com.google.android.exoplayer2.metadata.Metadata)
  (r0v11 com.google.android.exoplayer2.metadata.Metadata)
  (r0v21 com.google.android.exoplayer2.metadata.Metadata)
  (r0v11 com.google.android.exoplayer2.metadata.Metadata)
 binds: [B:297:0x05df, B:298:0x05e1, B:400:0x05db, B:293:0x05d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0649 A[EDGE_INSN: B:398:0x0649->B:322:0x0649 BREAK  A[LOOP:10: B:311:0x0613->B:321:0x0643], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r30) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.g.j(long):void");
    }

    public g(int i12) {
        this.f344837h = 0;
        this.f344835f = new i();
        this.f344836g = new ArrayList();
        this.f344833d = new F(16);
        this.f344834e = new ArrayDeque<>();
        this.f344830a = new F(com.google.android.exoplayer2.util.A.f348026a);
        this.f344831b = new F(4);
        this.f344832c = new F();
        this.f344842m = -1;
        this.f344846q = com.google.android.exoplayer2.extractor.l.f344575h2;
        this.f344847r = new b[0];
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
