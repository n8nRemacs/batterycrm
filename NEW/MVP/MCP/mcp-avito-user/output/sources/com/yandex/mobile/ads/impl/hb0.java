package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.facebook.imageutils.JfifUtil;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.x21;
import com.yandex.mobile.ads.impl.x91;
import j.InterfaceC42153i;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v61.InterfaceC49173d;

/* loaded from: classes8.dex */
public final class hb0 implements ru {

    /* renamed from: c0, reason: collision with root package name */
    private static final byte[] f385947c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f385948d0 = pc1.b("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f385949e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f385950f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    private static final UUID f385951g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    private static final Map<String, Integer> f385952h0;

    /* renamed from: A, reason: collision with root package name */
    private long f385953A;

    /* renamed from: B, reason: collision with root package name */
    private long f385954B;

    /* renamed from: C, reason: collision with root package name */
    @j.P
    private la0 f385955C;

    /* renamed from: D, reason: collision with root package name */
    @j.P
    private la0 f385956D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f385957E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f385958F;

    /* renamed from: G, reason: collision with root package name */
    private int f385959G;

    /* renamed from: H, reason: collision with root package name */
    private long f385960H;

    /* renamed from: I, reason: collision with root package name */
    private long f385961I;

    /* renamed from: J, reason: collision with root package name */
    private int f385962J;

    /* renamed from: K, reason: collision with root package name */
    private int f385963K;

    /* renamed from: L, reason: collision with root package name */
    private int[] f385964L;

    /* renamed from: M, reason: collision with root package name */
    private int f385965M;

    /* renamed from: N, reason: collision with root package name */
    private int f385966N;

    /* renamed from: O, reason: collision with root package name */
    private int f385967O;

    /* renamed from: P, reason: collision with root package name */
    private int f385968P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f385969Q;

    /* renamed from: R, reason: collision with root package name */
    private long f385970R;

    /* renamed from: S, reason: collision with root package name */
    private int f385971S;

    /* renamed from: T, reason: collision with root package name */
    private int f385972T;

    /* renamed from: U, reason: collision with root package name */
    private int f385973U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f385974V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f385975W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f385976X;

    /* renamed from: Y, reason: collision with root package name */
    private int f385977Y;

    /* renamed from: Z, reason: collision with root package name */
    private byte f385978Z;

    /* renamed from: a, reason: collision with root package name */
    private final hs f385979a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f385980a0;

    /* renamed from: b, reason: collision with root package name */
    private final yc1 f385981b;

    /* renamed from: b0, reason: collision with root package name */
    private tu f385982b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f385983c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f385984d;

    /* renamed from: e, reason: collision with root package name */
    private final pr0 f385985e;

    /* renamed from: f, reason: collision with root package name */
    private final pr0 f385986f;

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f385987g;

    /* renamed from: h, reason: collision with root package name */
    private final pr0 f385988h;

    /* renamed from: i, reason: collision with root package name */
    private final pr0 f385989i;

    /* renamed from: j, reason: collision with root package name */
    private final pr0 f385990j;

    /* renamed from: k, reason: collision with root package name */
    private final pr0 f385991k;

    /* renamed from: l, reason: collision with root package name */
    private final pr0 f385992l;

    /* renamed from: m, reason: collision with root package name */
    private final pr0 f385993m;

    /* renamed from: n, reason: collision with root package name */
    private final pr0 f385994n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f385995o;

    /* renamed from: p, reason: collision with root package name */
    private long f385996p;

    /* renamed from: q, reason: collision with root package name */
    private long f385997q;

    /* renamed from: r, reason: collision with root package name */
    private long f385998r;

    /* renamed from: s, reason: collision with root package name */
    private long f385999s;

    /* renamed from: t, reason: collision with root package name */
    private long f386000t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private b f386001u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f386002v;

    /* renamed from: w, reason: collision with root package name */
    private int f386003w;

    /* renamed from: x, reason: collision with root package name */
    private long f386004x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f386005y;

    /* renamed from: z, reason: collision with root package name */
    private long f386006z;

    public final class a implements gs {
        private a() {
        }

        public final boolean a(int i12) {
            hb0.this.getClass();
            return i12 == 357149030 || i12 == 524531317 || i12 == 475249515 || i12 == 374648427;
        }

        public /* synthetic */ a(hb0 hb0Var, int i12) {
            this();
        }
    }

    public static final class b {

        /* renamed from: N, reason: collision with root package name */
        public byte[] f386021N;

        /* renamed from: T, reason: collision with root package name */
        public ya1 f386027T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f386028U;

        /* renamed from: X, reason: collision with root package name */
        public x91 f386031X;

        /* renamed from: Y, reason: collision with root package name */
        public int f386032Y;

        /* renamed from: a, reason: collision with root package name */
        public String f386033a;

        /* renamed from: b, reason: collision with root package name */
        public String f386034b;

        /* renamed from: c, reason: collision with root package name */
        public int f386035c;

        /* renamed from: d, reason: collision with root package name */
        public int f386036d;

        /* renamed from: e, reason: collision with root package name */
        public int f386037e;

        /* renamed from: f, reason: collision with root package name */
        public int f386038f;

        /* renamed from: g, reason: collision with root package name */
        private int f386039g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f386040h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f386041i;

        /* renamed from: j, reason: collision with root package name */
        public x91.a f386042j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f386043k;

        /* renamed from: l, reason: collision with root package name */
        public DrmInitData f386044l;

        /* renamed from: m, reason: collision with root package name */
        public int f386045m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f386046n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f386047o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f386048p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f386049q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f386050r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f386051s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f386052t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f386053u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f386054v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f386055w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f386056x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f386057y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f386058z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f386008A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f386009B = 1000;

        /* renamed from: C, reason: collision with root package name */
        public int f386010C = 200;

        /* renamed from: D, reason: collision with root package name */
        public float f386011D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f386012E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f386013F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f386014G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f386015H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f386016I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f386017J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f386018K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f386019L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f386020M = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public int f386022O = 1;

        /* renamed from: P, reason: collision with root package name */
        public int f386023P = -1;

        /* renamed from: Q, reason: collision with root package name */
        public int f386024Q = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: R, reason: collision with root package name */
        public long f386025R = 0;

        /* renamed from: S, reason: collision with root package name */
        public long f386026S = 0;

        /* renamed from: V, reason: collision with root package name */
        public boolean f386029V = true;

        /* renamed from: W, reason: collision with root package name */
        private String f386030W = "eng";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:279:0x0546  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x055d  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x056a  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x057b  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x0742  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r1v7 */
        @v61.InterfaceC49173d
        @v61.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.yandex.mobile.ads.impl.tu r25, int r26) throws com.yandex.mobile.ads.impl.tr0 {
            /*
                Method dump skipped, instructions count: 2136
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb0.b.a(com.yandex.mobile.ads.impl.tu, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(boolean z12) {
            return "A_OPUS".equals(this.f386034b) ? z12 : this.f386038f > 0;
        }

        @InterfaceC49173d
        private byte[] a(String str) throws tr0 {
            byte[] bArr = this.f386043k;
            if (bArr != null) {
                return bArr;
            }
            throw tr0.a("Missing CodecPrivate for codec " + str, (Exception) null);
        }
    }

    static {
        HashMap map = new HashMap();
        gb0.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f385952h0 = Collections.unmodifiableMap(map);
    }

    public hb0() {
        this(new ro());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] d() {
        return new ru[]{new hb0()};
    }

    private void e() {
        this.f385971S = 0;
        this.f385972T = 0;
        this.f385973U = 0;
        this.f385974V = false;
        this.f385975W = false;
        this.f385976X = false;
        this.f385977Y = 0;
        this.f385978Z = (byte) 0;
        this.f385980a0 = false;
        this.f385990j.c(0);
    }

    public hb0(ro roVar) {
        this.f385997q = -1L;
        this.f385998r = -9223372036854775807L;
        this.f385999s = -9223372036854775807L;
        this.f386000t = -9223372036854775807L;
        this.f386006z = -1L;
        this.f385953A = -1L;
        this.f385954B = -9223372036854775807L;
        this.f385979a = roVar;
        roVar.a(new a(this, 0));
        this.f385984d = true;
        this.f385981b = new yc1();
        this.f385983c = new SparseArray<>();
        this.f385987g = new pr0(4);
        this.f385988h = new pr0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f385989i = new pr0(4);
        this.f385985e = new pr0(lj0.f387520a);
        this.f385986f = new pr0(4);
        this.f385990j = new pr0();
        this.f385991k = new pr0();
        this.f385992l = new pr0(8);
        this.f385993m = new pr0();
        this.f385994n = new pr0();
        this.f385964L = new int[1];
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        return new n51().b((to) suVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    @j.InterfaceC42153i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r20) throws com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb0.b(int):void");
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f385982b0 = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    @InterfaceC42153i
    public final void a(long j12, long j13) {
        this.f385954B = -9223372036854775807L;
        this.f385959G = 0;
        ((ro) this.f385979a).a();
        this.f385981b.b();
        e();
        for (int i12 = 0; i12 < this.f385983c.size(); i12++) {
            ya1 ya1Var = this.f385983c.valueAt(i12).f386027T;
            if (ya1Var != null) {
                ya1Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) {
        this.f385958F = false;
        boolean zA2 = true;
        while (zA2 && !this.f385958F) {
            to toVar = (to) suVar;
            zA2 = ((ro) this.f385979a).a(toVar);
            if (zA2) {
                long position = toVar.getPosition();
                if (this.f386005y) {
                    this.f385953A = position;
                    fu0Var.f385508a = this.f386006z;
                    this.f386005y = false;
                } else if (this.f386002v) {
                    long j12 = this.f385953A;
                    if (j12 != -1) {
                        fu0Var.f385508a = j12;
                        this.f385953A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA2) {
            return 0;
        }
        for (int i12 = 0; i12 < this.f385983c.size(); i12++) {
            b bVarValueAt = this.f385983c.valueAt(i12);
            bVarValueAt.f386031X.getClass();
            ya1 ya1Var = bVarValueAt.f386027T;
            if (ya1Var != null) {
                ya1Var.a(bVarValueAt.f386031X, bVarValueAt.f386042j);
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @InterfaceC42153i
    public final void a(int i12, long j12) throws tr0 {
        la0 la0Var;
        if (i12 == 20529) {
            if (j12 == 0) {
                return;
            }
            throw tr0.a("ContentEncodingOrder " + j12 + " not supported", (Exception) null);
        }
        if (i12 == 20530) {
            if (j12 == 1) {
                return;
            }
            throw tr0.a("ContentEncodingScope " + j12 + " not supported", (Exception) null);
        }
        int i13 = 3;
        int i14 = 2;
        switch (i12) {
            case 131:
                a(i12);
                this.f386001u.f386036d = (int) j12;
                return;
            case 136:
                a(i12);
                this.f386001u.f386029V = j12 == 1;
                return;
            case 155:
                this.f385961I = a(j12);
                return;
            case 159:
                a(i12);
                this.f386001u.f386022O = (int) j12;
                return;
            case 176:
                a(i12);
                this.f386001u.f386045m = (int) j12;
                return;
            case 179:
                la0 la0Var2 = this.f385955C;
                if (la0Var2 != null && this.f385956D != null) {
                    la0Var2.a(a(j12));
                    return;
                }
                throw tr0.a("Element " + i12 + " must be in a Cues", (Exception) null);
            case 186:
                a(i12);
                this.f386001u.f386046n = (int) j12;
                return;
            case JfifUtil.MARKER_RST7 /* 215 */:
                a(i12);
                this.f386001u.f386035c = (int) j12;
                return;
            case 231:
                this.f385954B = a(j12);
                return;
            case 238:
                this.f385968P = (int) j12;
                return;
            case 241:
                if (this.f385957E) {
                    return;
                }
                if (this.f385955C != null && (la0Var = this.f385956D) != null) {
                    la0Var.a(j12);
                    this.f385957E = true;
                    return;
                } else {
                    throw tr0.a("Element " + i12 + " must be in a Cues", (Exception) null);
                }
            case 251:
                this.f385969Q = true;
                return;
            case 16871:
                a(i12);
                this.f386001u.f386039g = (int) j12;
                return;
            case 16980:
                if (j12 == 3) {
                    return;
                }
                throw tr0.a("ContentCompAlgo " + j12 + " not supported", (Exception) null);
            case 17029:
                if (j12 < 1 || j12 > 2) {
                    throw tr0.a("DocTypeReadVersion " + j12 + " not supported", (Exception) null);
                }
                return;
            case 17143:
                if (j12 == 1) {
                    return;
                }
                throw tr0.a("EBMLReadVersion " + j12 + " not supported", (Exception) null);
            case 18401:
                if (j12 == 5) {
                    return;
                }
                throw tr0.a("ContentEncAlgo " + j12 + " not supported", (Exception) null);
            case 18408:
                if (j12 == 1) {
                    return;
                }
                throw tr0.a("AESSettingsCipherMode " + j12 + " not supported", (Exception) null);
            case 21420:
                this.f386004x = j12 + this.f385997q;
                return;
            case 21432:
                int i15 = (int) j12;
                a(i12);
                if (i15 == 0) {
                    this.f386001u.f386055w = 0;
                    return;
                }
                if (i15 == 1) {
                    this.f386001u.f386055w = 2;
                    return;
                } else if (i15 == 3) {
                    this.f386001u.f386055w = 1;
                    return;
                } else {
                    if (i15 != 15) {
                        return;
                    }
                    this.f386001u.f386055w = 3;
                    return;
                }
            case 21680:
                a(i12);
                this.f386001u.f386047o = (int) j12;
                return;
            case 21682:
                a(i12);
                this.f386001u.f386049q = (int) j12;
                return;
            case 21690:
                a(i12);
                this.f386001u.f386048p = (int) j12;
                return;
            case 21930:
                a(i12);
                this.f386001u.f386028U = j12 == 1;
                return;
            case 21998:
                a(i12);
                this.f386001u.f386038f = (int) j12;
                return;
            case 22186:
                a(i12);
                this.f386001u.f386025R = j12;
                return;
            case 22203:
                a(i12);
                this.f386001u.f386026S = j12;
                return;
            case 25188:
                a(i12);
                this.f386001u.f386023P = (int) j12;
                return;
            case 30114:
                this.f385970R = j12;
                return;
            case 30321:
                a(i12);
                int i16 = (int) j12;
                if (i16 == 0) {
                    this.f386001u.f386050r = 0;
                    return;
                }
                if (i16 == 1) {
                    this.f386001u.f386050r = 1;
                    return;
                } else if (i16 == 2) {
                    this.f386001u.f386050r = 2;
                    return;
                } else {
                    if (i16 != 3) {
                        return;
                    }
                    this.f386001u.f386050r = 3;
                    return;
                }
            case 2352003:
                a(i12);
                this.f386001u.f386037e = (int) j12;
                return;
            case 2807729:
                this.f385998r = j12;
                return;
            default:
                switch (i12) {
                    case 21945:
                        a(i12);
                        int i17 = (int) j12;
                        if (i17 == 1) {
                            this.f386001u.f386008A = 2;
                            return;
                        } else {
                            if (i17 != 2) {
                                return;
                            }
                            this.f386001u.f386008A = 1;
                            return;
                        }
                    case 21946:
                        a(i12);
                        int i18 = (int) j12;
                        if (i18 != 1) {
                            if (i18 == 16) {
                                i13 = 6;
                            } else if (i18 == 18) {
                                i13 = 7;
                            } else if (i18 != 6 && i18 != 7) {
                                i13 = -1;
                            }
                        }
                        if (i13 != -1) {
                            this.f386001u.f386058z = i13;
                            return;
                        }
                        return;
                    case 21947:
                        a(i12);
                        b bVar = this.f386001u;
                        bVar.f386056x = true;
                        int i19 = (int) j12;
                        if (i19 == 1) {
                            i14 = 1;
                        } else if (i19 == 9) {
                            i14 = 6;
                        } else if (i19 != 4 && i19 != 5 && i19 != 6 && i19 != 7) {
                            i14 = -1;
                        }
                        if (i14 != -1) {
                            bVar.f386057y = i14;
                            return;
                        }
                        return;
                    case 21948:
                        a(i12);
                        this.f386001u.f386009B = (int) j12;
                        return;
                    case 21949:
                        a(i12);
                        this.f386001u.f386010C = (int) j12;
                        return;
                    default:
                        return;
                }
        }
    }

    @InterfaceC42153i
    public final void a(int i12, int i13, to toVar) throws tr0, EOFException, InterruptedIOException {
        int i14;
        long j12;
        int i15;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 1;
        if (i12 != 161 && i12 != 163) {
            if (i12 == 165) {
                if (this.f385959G != 2) {
                    return;
                }
                b bVar = this.f385983c.get(this.f385965M);
                if (this.f385968P == 4 && "V_VP9".equals(bVar.f386034b)) {
                    this.f385994n.c(i13);
                    toVar.a(this.f385994n.c(), 0, i13, false);
                    return;
                } else {
                    toVar.a(i13);
                    return;
                }
            }
            if (i12 == 16877) {
                a(i12);
                b bVar2 = this.f386001u;
                if (bVar2.f386039g != 1685485123 && bVar2.f386039g != 1685480259) {
                    toVar.a(i13);
                    return;
                }
                byte[] bArr = new byte[i13];
                bVar2.f386021N = bArr;
                toVar.a(bArr, 0, i13, false);
                return;
            }
            if (i12 == 16981) {
                a(i12);
                byte[] bArr2 = new byte[i13];
                this.f386001u.f386041i = bArr2;
                toVar.a(bArr2, 0, i13, false);
                return;
            }
            if (i12 == 18402) {
                byte[] bArr3 = new byte[i13];
                toVar.a(bArr3, 0, i13, false);
                a(i12);
                this.f386001u.f386042j = new x91.a(1, 0, 0, bArr3);
                return;
            }
            if (i12 == 21419) {
                Arrays.fill(this.f385989i.c(), (byte) 0);
                toVar.a(this.f385989i.c(), 4 - i13, i13, false);
                this.f385989i.e(0);
                this.f386003w = (int) this.f385989i.v();
                return;
            }
            if (i12 == 25506) {
                a(i12);
                byte[] bArr4 = new byte[i13];
                this.f386001u.f386043k = bArr4;
                toVar.a(bArr4, 0, i13, false);
                return;
            }
            if (i12 == 30322) {
                a(i12);
                byte[] bArr5 = new byte[i13];
                this.f386001u.f386054v = bArr5;
                toVar.a(bArr5, 0, i13, false);
                return;
            }
            throw tr0.a("Unexpected id: " + i12, (Exception) null);
        }
        if (this.f385959G == 0) {
            this.f385965M = (int) this.f385981b.a(toVar, false, true, 8);
            this.f385966N = this.f385981b.a();
            this.f385961I = -9223372036854775807L;
            this.f385959G = 1;
            this.f385987g.c(0);
        }
        b bVar3 = this.f385983c.get(this.f385965M);
        if (bVar3 == null) {
            toVar.a(i13 - this.f385966N);
            this.f385959G = 0;
            return;
        }
        bVar3.f386031X.getClass();
        if (this.f385959G == 1) {
            a(toVar, 3);
            int i22 = (this.f385987g.c()[2] & 6) >> 1;
            byte b12 = 255;
            if (i22 == 0) {
                this.f385963K = 1;
                int[] iArr = this.f385964L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                this.f385964L = iArr;
                iArr[0] = (i13 - this.f385966N) - 3;
            } else {
                a(toVar, 4);
                int i23 = (this.f385987g.c()[3] & 255) + 1;
                this.f385963K = i23;
                int[] iArr2 = this.f385964L;
                if (iArr2 == null) {
                    iArr2 = new int[i23];
                } else if (iArr2.length < i23) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i23)];
                }
                this.f385964L = iArr2;
                if (i22 == 2) {
                    int i24 = (i13 - this.f385966N) - 4;
                    int i25 = this.f385963K;
                    Arrays.fill(iArr2, 0, i25, i24 / i25);
                } else {
                    if (i22 != 1) {
                        if (i22 == 3) {
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                int i28 = this.f385963K - i19;
                                if (i26 < i28) {
                                    this.f385964L[i26] = 0;
                                    int i29 = i18 + 1;
                                    a(toVar, i29);
                                    if (this.f385987g.c()[i18] == 0) {
                                        throw tr0.a("No valid varint length mask found", (Exception) null);
                                    }
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 >= 8) {
                                            j12 = 0;
                                            break;
                                        }
                                        int i33 = i19 << (7 - i32);
                                        if ((this.f385987g.c()[i18] & i33) != 0) {
                                            i29 += i32;
                                            a(toVar, i29);
                                            int i34 = i18 + 1;
                                            j12 = this.f385987g.c()[i18] & b12 & (~i33);
                                            int i35 = i34;
                                            while (i35 < i29) {
                                                j12 = (j12 << 8) | (this.f385987g.c()[i35] & b12);
                                                i35++;
                                                b12 = 255;
                                            }
                                            if (i26 > 0) {
                                                j12 -= (1 << ((i32 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i32++;
                                            i19 = 1;
                                            b12 = 255;
                                        }
                                    }
                                    if (j12 < -2147483648L || j12 > 2147483647L) {
                                        break;
                                    }
                                    int i36 = (int) j12;
                                    int[] iArr3 = this.f385964L;
                                    if (i26 != 0) {
                                        i36 += iArr3[i26 - 1];
                                    }
                                    iArr3[i26] = i36;
                                    i27 += i36;
                                    i26++;
                                    i18 = i29;
                                    i19 = 1;
                                    b12 = 255;
                                } else {
                                    this.f385964L[i28] = ((i13 - this.f385966N) - i18) - i27;
                                    break;
                                }
                            }
                            throw tr0.a("EBML lacing sample size out of range.", (Exception) null);
                        }
                        throw tr0.a("Unexpected lacing value: " + i22, (Exception) null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    while (true) {
                        i15 = this.f385963K - 1;
                        if (i37 >= i15) {
                            break;
                        }
                        this.f385964L[i37] = 0;
                        while (true) {
                            i16 = i18 + 1;
                            a(toVar, i16);
                            int i39 = this.f385987g.c()[i18] & 255;
                            int[] iArr4 = this.f385964L;
                            i17 = iArr4[i37] + i39;
                            iArr4[i37] = i17;
                            if (i39 != 255) {
                                break;
                            } else {
                                i18 = i16;
                            }
                        }
                        i38 += i17;
                        i37++;
                        i18 = i16;
                    }
                    this.f385964L[i15] = ((i13 - this.f385966N) - i18) - i38;
                }
            }
            this.f385960H = this.f385954B + a((this.f385987g.c()[0] << 8) | (this.f385987g.c()[1] & 255));
            this.f385967O = (bVar3.f386036d == 2 || (i12 == 163 && (this.f385987g.c()[2] & 128) == 128)) ? 1 : 0;
            this.f385959G = 2;
            this.f385962J = 0;
            i14 = 163;
        } else {
            i14 = 163;
        }
        if (i12 == i14) {
            while (true) {
                int i42 = this.f385962J;
                if (i42 < this.f385963K) {
                    a(bVar3, ((this.f385962J * bVar3.f386037e) / 1000) + this.f385960H, this.f385967O, a(toVar, bVar3, this.f385964L[i42], false), 0);
                    this.f385962J++;
                } else {
                    this.f385959G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i43 = this.f385962J;
                if (i43 >= this.f385963K) {
                    return;
                }
                int[] iArr5 = this.f385964L;
                iArr5[i43] = a(toVar, bVar3, iArr5[i43], true);
                this.f385962J++;
            }
        }
    }

    @InterfaceC49173d
    private void a(int i12) throws tr0 {
        if (this.f386001u != null) {
            return;
        }
        throw tr0.a("Element " + i12 + " must be in a TrackEntry", (Exception) null);
    }

    @InterfaceC42153i
    public final void a(int i12, double d12) throws tr0 {
        if (i12 == 181) {
            a(i12);
            this.f386001u.f386024Q = (int) d12;
            return;
        }
        if (i12 != 17545) {
            switch (i12) {
                case 21969:
                    a(i12);
                    this.f386001u.f386011D = (float) d12;
                    break;
                case 21970:
                    a(i12);
                    this.f386001u.f386012E = (float) d12;
                    break;
                case 21971:
                    a(i12);
                    this.f386001u.f386013F = (float) d12;
                    break;
                case 21972:
                    a(i12);
                    this.f386001u.f386014G = (float) d12;
                    break;
                case 21973:
                    a(i12);
                    this.f386001u.f386015H = (float) d12;
                    break;
                case 21974:
                    a(i12);
                    this.f386001u.f386016I = (float) d12;
                    break;
                case 21975:
                    a(i12);
                    this.f386001u.f386017J = (float) d12;
                    break;
                case 21976:
                    a(i12);
                    this.f386001u.f386018K = (float) d12;
                    break;
                case 21977:
                    a(i12);
                    this.f386001u.f386019L = (float) d12;
                    break;
                case 21978:
                    a(i12);
                    this.f386001u.f386020M = (float) d12;
                    break;
                default:
                    switch (i12) {
                        case 30323:
                            a(i12);
                            this.f386001u.f386051s = (float) d12;
                            break;
                        case 30324:
                            a(i12);
                            this.f386001u.f386052t = (float) d12;
                            break;
                        case 30325:
                            a(i12);
                            this.f386001u.f386053u = (float) d12;
                            break;
                    }
            }
            return;
        }
        this.f385999s = (long) d12;
    }

    @InterfaceC42153i
    public final void a(int i12, String str) throws tr0 {
        if (i12 == 134) {
            a(i12);
            this.f386001u.f386034b = str;
            return;
        }
        if (i12 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw tr0.a("DocType " + str + " not supported", (Exception) null);
        }
        if (i12 == 21358) {
            a(i12);
            this.f386001u.f386033a = str;
        } else {
            if (i12 != 2274716) {
                return;
            }
            a(i12);
            this.f386001u.f386030W = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.yandex.mobile.ads.impl.hb0.b r16, long r17, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb0.a(com.yandex.mobile.ads.impl.hb0$b, long, int, int, int):void");
    }

    private void a(to toVar, int i12) throws EOFException, InterruptedIOException {
        if (this.f385987g.e() >= i12) {
            return;
        }
        if (this.f385987g.b() < i12) {
            pr0 pr0Var = this.f385987g;
            pr0Var.a(Math.max(pr0Var.b() * 2, i12));
        }
        toVar.a(this.f385987g.c(), this.f385987g.e(), i12 - this.f385987g.e(), false);
        this.f385987g.d(i12);
    }

    @v61.m
    private int a(to toVar, b bVar, int i12, boolean z12) throws EOFException, InterruptedIOException, tr0 {
        int iB2;
        int iB3;
        int i13;
        if ("S_TEXT/UTF8".equals(bVar.f386034b)) {
            a(toVar, f385947c0, i12);
            int i14 = this.f385972T;
            e();
            return i14;
        }
        if ("S_TEXT/ASS".equals(bVar.f386034b)) {
            a(toVar, f385949e0, i12);
            int i15 = this.f385972T;
            e();
            return i15;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f386034b)) {
            a(toVar, f385950f0, i12);
            int i16 = this.f385972T;
            e();
            return i16;
        }
        x91 x91Var = bVar.f386031X;
        if (!this.f385974V) {
            if (bVar.f386040h) {
                this.f385967O &= -1073741825;
                if (!this.f385975W) {
                    toVar.a(this.f385987g.c(), 0, 1, false);
                    this.f385971S++;
                    if ((this.f385987g.c()[0] & 128) != 128) {
                        this.f385978Z = this.f385987g.c()[0];
                        this.f385975W = true;
                    } else {
                        throw tr0.a("Extension bit is set in signal byte", (Exception) null);
                    }
                }
                byte b12 = this.f385978Z;
                if ((b12 & 1) == 1) {
                    boolean z13 = (b12 & 2) == 2;
                    this.f385967O |= 1073741824;
                    if (!this.f385980a0) {
                        toVar.a(this.f385992l.c(), 0, 8, false);
                        this.f385971S += 8;
                        this.f385980a0 = true;
                        this.f385987g.c()[0] = (byte) ((z13 ? 128 : 0) | 8);
                        this.f385987g.e(0);
                        x91Var.b(1, this.f385987g);
                        this.f385972T++;
                        this.f385992l.e(0);
                        x91Var.b(8, this.f385992l);
                        this.f385972T += 8;
                    }
                    if (z13) {
                        if (!this.f385976X) {
                            toVar.a(this.f385987g.c(), 0, 1, false);
                            this.f385971S++;
                            this.f385987g.e(0);
                            this.f385977Y = this.f385987g.t();
                            this.f385976X = true;
                        }
                        int i17 = this.f385977Y * 4;
                        this.f385987g.c(i17);
                        toVar.a(this.f385987g.c(), 0, i17, false);
                        this.f385971S += i17;
                        short s5 = (short) ((this.f385977Y / 2) + 1);
                        int i18 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f385995o;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f385995o = ByteBuffer.allocate(i18);
                        }
                        this.f385995o.position(0);
                        this.f385995o.putShort(s5);
                        int i19 = 0;
                        int i22 = 0;
                        while (true) {
                            i13 = this.f385977Y;
                            if (i19 >= i13) {
                                break;
                            }
                            int iX2 = this.f385987g.x();
                            if (i19 % 2 == 0) {
                                this.f385995o.putShort((short) (iX2 - i22));
                            } else {
                                this.f385995o.putInt(iX2 - i22);
                            }
                            i19++;
                            i22 = iX2;
                        }
                        int i23 = (i12 - this.f385971S) - i22;
                        if (i13 % 2 == 1) {
                            this.f385995o.putInt(i23);
                        } else {
                            this.f385995o.putShort((short) i23);
                            this.f385995o.putInt(0);
                        }
                        this.f385993m.a(i18, this.f385995o.array());
                        x91Var.b(i18, this.f385993m);
                        this.f385972T += i18;
                    }
                }
            } else {
                byte[] bArr = bVar.f386041i;
                if (bArr != null) {
                    this.f385990j.a(bArr.length, bArr);
                }
            }
            if (bVar.a(z12)) {
                this.f385967O |= 268435456;
                this.f385994n.c(0);
                int iE2 = (this.f385990j.e() + i12) - this.f385971S;
                this.f385987g.c(4);
                this.f385987g.c()[0] = (byte) ((iE2 >> 24) & 255);
                this.f385987g.c()[1] = (byte) ((iE2 >> 16) & 255);
                this.f385987g.c()[2] = (byte) ((iE2 >> 8) & 255);
                this.f385987g.c()[3] = (byte) (iE2 & 255);
                x91Var.b(4, this.f385987g);
                this.f385972T += 4;
            }
            this.f385974V = true;
        }
        int iE3 = this.f385990j.e() + i12;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f386034b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f386034b)) {
            if (bVar.f386027T != null) {
                db.b(this.f385990j.e() == 0);
                bVar.f386027T.a(toVar);
            }
            while (true) {
                int i24 = this.f385971S;
                if (i24 >= iE3) {
                    break;
                }
                int i25 = iE3 - i24;
                int iA2 = this.f385990j.a();
                if (iA2 > 0) {
                    iB3 = Math.min(i25, iA2);
                    x91Var.a(iB3, this.f385990j);
                } else {
                    iB3 = x91Var.b(toVar, i25, false);
                }
                this.f385971S += iB3;
                this.f385972T += iB3;
            }
        } else {
            byte[] bArrC = this.f385986f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i26 = bVar.f386032Y;
            int i27 = 4 - i26;
            while (this.f385971S < iE3) {
                int i28 = this.f385973U;
                if (i28 == 0) {
                    int iMin = Math.min(i26, this.f385990j.a());
                    toVar.a(bArrC, i27 + iMin, i26 - iMin, false);
                    if (iMin > 0) {
                        this.f385990j.a(bArrC, i27, iMin);
                    }
                    this.f385971S += i26;
                    this.f385986f.e(0);
                    this.f385973U = this.f385986f.x();
                    this.f385985e.e(0);
                    x91Var.a(4, this.f385985e);
                    this.f385972T += 4;
                } else {
                    int iA3 = this.f385990j.a();
                    if (iA3 > 0) {
                        iB2 = Math.min(i28, iA3);
                        x91Var.a(iB2, this.f385990j);
                    } else {
                        iB2 = x91Var.b(toVar, i28, false);
                    }
                    this.f385971S += iB2;
                    this.f385972T += iB2;
                    this.f385973U -= iB2;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f386034b)) {
            this.f385988h.e(0);
            x91Var.a(4, this.f385988h);
            this.f385972T += 4;
        }
        int i29 = this.f385972T;
        e();
        return i29;
    }

    private void a(to toVar, byte[] bArr, int i12) throws EOFException, InterruptedIOException {
        int length = bArr.length + i12;
        if (this.f385991k.b() < length) {
            pr0 pr0Var = this.f385991k;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i12);
            pr0Var.getClass();
            pr0Var.a(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, this.f385991k.c(), 0, bArr.length);
        }
        toVar.a(this.f385991k.c(), bArr.length, i12, false);
        this.f385991k.e(0);
        this.f385991k.d(length);
    }

    private static byte[] a(String str, long j12, long j13) {
        db.a(j12 != -9223372036854775807L);
        int i12 = (int) (j12 / 3600000000L);
        long j14 = j12 - (i12 * 3600000000L);
        int i13 = (int) (j14 / 60000000);
        long j15 = j14 - (i13 * 60000000);
        int i14 = (int) (j15 / 1000000);
        return pc1.b(String.format(Locale.US, str, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf((int) ((j15 - (i14 * 1000000)) / j13))));
    }

    private long a(long j12) throws tr0 {
        long j13 = this.f385998r;
        if (j13 != -9223372036854775807L) {
            return pc1.a(j12, j13, 1000L);
        }
        throw tr0.a("Can't scale timecode prior to timecodeScale being set.", (Exception) null);
    }

    @InterfaceC42153i
    public final void a(int i12, long j12, long j13) throws tr0 {
        db.b(this.f385982b0);
        if (i12 == 160) {
            this.f385969Q = false;
            this.f385970R = 0L;
            return;
        }
        if (i12 == 174) {
            this.f386001u = new b();
            return;
        }
        if (i12 == 187) {
            this.f385957E = false;
            return;
        }
        if (i12 == 19899) {
            this.f386003w = -1;
            this.f386004x = -1L;
            return;
        }
        if (i12 == 20533) {
            a(i12);
            this.f386001u.f386040h = true;
            return;
        }
        if (i12 == 21968) {
            a(i12);
            this.f386001u.f386056x = true;
            return;
        }
        if (i12 == 408125543) {
            long j14 = this.f385997q;
            if (j14 != -1 && j14 != j12) {
                throw tr0.a("Multiple Segment elements not supported", (Exception) null);
            }
            this.f385997q = j12;
            this.f385996p = j13;
            return;
        }
        if (i12 != 475249515) {
            if (i12 == 524531317 && !this.f386002v) {
                if (this.f385984d && this.f386006z != -1) {
                    this.f386005y = true;
                    return;
                } else {
                    this.f385982b0.a(new x21.b(this.f386000t, 0L));
                    this.f386002v = true;
                    return;
                }
            }
            return;
        }
        this.f385955C = new la0(0);
        this.f385956D = new la0(0);
    }
}
