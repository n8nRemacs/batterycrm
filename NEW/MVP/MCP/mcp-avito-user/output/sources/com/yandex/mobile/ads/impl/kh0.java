package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;
import com.yandex.mobile.ads.impl.gc;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.x21;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class kh0 implements ru, x21 {

    /* renamed from: a, reason: collision with root package name */
    private final int f387132a;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f387133b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f387134c;

    /* renamed from: d, reason: collision with root package name */
    private final pr0 f387135d;

    /* renamed from: e, reason: collision with root package name */
    private final pr0 f387136e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<gc.a> f387137f;

    /* renamed from: g, reason: collision with root package name */
    private final b31 f387138g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f387139h;

    /* renamed from: i, reason: collision with root package name */
    private int f387140i;

    /* renamed from: j, reason: collision with root package name */
    private int f387141j;

    /* renamed from: k, reason: collision with root package name */
    private long f387142k;

    /* renamed from: l, reason: collision with root package name */
    private int f387143l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private pr0 f387144m;

    /* renamed from: n, reason: collision with root package name */
    private int f387145n;

    /* renamed from: o, reason: collision with root package name */
    private int f387146o;

    /* renamed from: p, reason: collision with root package name */
    private int f387147p;

    /* renamed from: q, reason: collision with root package name */
    private int f387148q;

    /* renamed from: r, reason: collision with root package name */
    private tu f387149r;

    /* renamed from: s, reason: collision with root package name */
    private a[] f387150s;

    /* renamed from: t, reason: collision with root package name */
    private long[][] f387151t;

    /* renamed from: u, reason: collision with root package name */
    private int f387152u;

    /* renamed from: v, reason: collision with root package name */
    private long f387153v;

    /* renamed from: w, reason: collision with root package name */
    private int f387154w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    private MotionPhotoMetadata f387155x;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s91 f387156a;

        /* renamed from: b, reason: collision with root package name */
        public final y91 f387157b;

        /* renamed from: c, reason: collision with root package name */
        public final x91 f387158c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final ya1 f387159d;

        /* renamed from: e, reason: collision with root package name */
        public int f387160e;

        public a(s91 s91Var, y91 y91Var, x91 x91Var) {
            this.f387156a = s91Var;
            this.f387157b = y91Var;
            this.f387158c = x91Var;
            this.f387159d = "audio/true-hd".equals(s91Var.f389838f.f391181l) ? new ya1() : null;
        }
    }

    public kh0() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s91 a(s91 s91Var) {
        return s91Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] d() {
        return new ru[]{new kh0()};
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f387153v;
    }

    public kh0(int i12) {
        this.f387132a = 0;
        this.f387140i = 0;
        this.f387138g = new b31();
        this.f387139h = new ArrayList();
        this.f387136e = new pr0(16);
        this.f387137f = new ArrayDeque<>();
        this.f387133b = new pr0(lj0.f387520a);
        this.f387134c = new pr0(4);
        this.f387135d = new pr0();
        this.f387145n = -1;
        this.f387149r = tu.f390311a;
        this.f387150s = new a[0];
    }

    private void c(long j12) {
        while (!this.f387137f.isEmpty() && this.f387137f.peek().f385631b == j12) {
            gc.a aVarPop = this.f387137f.pop();
            if (aVarPop.f385630a == 1836019574) {
                a(aVarPop);
                this.f387137f.clear();
                this.f387140i = 2;
            } else if (!this.f387137f.isEmpty()) {
                this.f387137f.peek().f385633d.add(aVarPop);
            }
        }
        if (this.f387140i != 2) {
            this.f387140i = 0;
            this.f387143l = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        return m51.a(suVar, (this.f387132a & 2) != 0);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        long jMin;
        long jMin2;
        long j13;
        boolean z12;
        long j14;
        int iA2;
        long j15 = j12;
        a[] aVarArr = this.f387150s;
        if (aVarArr.length == 0) {
            z21 z21Var = z21.f392158c;
            return new x21.a(z21Var, z21Var);
        }
        int i12 = this.f387152u;
        boolean z13 = false;
        if (i12 != -1) {
            y91 y91Var = aVarArr[i12].f387157b;
            int iB2 = pc1.b(y91Var.f391973f, j15, false);
            while (true) {
                if (iB2 < 0) {
                    iB2 = -1;
                    break;
                }
                if ((y91Var.f391974g[iB2] & 1) != 0) {
                    break;
                }
                iB2--;
            }
            if (iB2 == -1) {
                iB2 = y91Var.a(j15);
            }
            if (iB2 == -1) {
                z21 z21Var2 = z21.f392158c;
                return new x21.a(z21Var2, z21Var2);
            }
            long j16 = y91Var.f391973f[iB2];
            jMin = y91Var.f391970c[iB2];
            if (j16 >= j15 || iB2 >= y91Var.f391969b - 1 || (iA2 = y91Var.a(j15)) == -1 || iA2 == iB2) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = y91Var.f391973f[iA2];
                j14 = y91Var.f391970c[iA2];
            }
            jMin2 = j14;
            j15 = j16;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j13 = -9223372036854775807L;
        }
        int i13 = 0;
        while (true) {
            a[] aVarArr2 = this.f387150s;
            if (i13 >= aVarArr2.length) {
                break;
            }
            if (i13 != this.f387152u) {
                y91 y91Var2 = aVarArr2[i13].f387157b;
                int iB3 = pc1.b(y91Var2.f391973f, j15, z13);
                while (true) {
                    if (iB3 < 0) {
                        iB3 = -1;
                        break;
                    }
                    if ((y91Var2.f391974g[iB3] & 1) != 0) {
                        break;
                    }
                    iB3--;
                }
                if (iB3 == -1) {
                    iB3 = y91Var2.a(j15);
                }
                if (iB3 != -1) {
                    jMin = Math.min(y91Var2.f391970c[iB3], jMin);
                }
                if (j13 != -9223372036854775807L) {
                    z12 = false;
                    int iB4 = pc1.b(y91Var2.f391973f, j13, false);
                    while (true) {
                        if (iB4 < 0) {
                            iB4 = -1;
                            break;
                        }
                        if ((y91Var2.f391974g[iB4] & 1) != 0) {
                            break;
                        }
                        iB4--;
                    }
                    if (iB4 == -1) {
                        iB4 = y91Var2.a(j13);
                    }
                    if (iB4 != -1) {
                        jMin2 = Math.min(y91Var2.f391970c[iB4], jMin2);
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = z13;
            }
            i13++;
            z13 = z12;
        }
        z21 z21Var3 = new z21(j15, jMin);
        return j13 == -9223372036854775807L ? new x21.a(z21Var3, z21Var3) : new x21.a(z21Var3, new z21(j13, jMin2));
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f387149r = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f387137f.clear();
        this.f387143l = 0;
        this.f387145n = -1;
        this.f387146o = 0;
        this.f387147p = 0;
        this.f387148q = 0;
        if (j12 == 0) {
            if (this.f387140i != 3) {
                this.f387140i = 0;
                this.f387143l = 0;
                return;
            } else {
                this.f387138g.a();
                this.f387139h.clear();
                return;
            }
        }
        for (a aVar : this.f387150s) {
            y91 y91Var = aVar.f387157b;
            int iB2 = pc1.b(y91Var.f391973f, j13, false);
            while (true) {
                if (iB2 < 0) {
                    iB2 = -1;
                    break;
                } else if ((y91Var.f391974g[iB2] & 1) != 0) {
                    break;
                } else {
                    iB2--;
                }
            }
            if (iB2 == -1) {
                iB2 = y91Var.a(j13);
            }
            aVar.f387160e = iB2;
            ya1 ya1Var = aVar.f387159d;
            if (ya1Var != null) {
                ya1Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v59 */
    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) throws tr0 {
        int i12;
        boolean z12;
        gc.a aVarPeek;
        boolean z13;
        int i13;
        int i14 = 0;
        ?? r52 = 1;
        while (true) {
            int i15 = this.f387140i;
            if (i15 == 0) {
                boolean z14 = r52;
                if (this.f387143l == 0) {
                    if (!suVar.a(this.f387136e.c(), 0, 8, z14)) {
                        if (this.f387154w != 2 || (this.f387132a & 2) == 0) {
                            return -1;
                        }
                        x91 x91VarA = this.f387149r.a(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f387155x;
                        x91VarA.a(new vw.a().a(motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata)).a());
                        this.f387149r.a();
                        this.f387149r.a(new x21.b(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f387143l = 8;
                    this.f387136e.e(0);
                    this.f387142k = this.f387136e.v();
                    this.f387141j = this.f387136e.h();
                }
                long j12 = this.f387142k;
                if (j12 == 1) {
                    suVar.readFully(this.f387136e.c(), 8, 8);
                    this.f387143l += 8;
                    this.f387142k = this.f387136e.y();
                } else if (j12 == 0) {
                    long jA2 = suVar.a();
                    if (jA2 == -1 && (aVarPeek = this.f387137f.peek()) != null) {
                        jA2 = aVarPeek.f385631b;
                    }
                    if (jA2 != -1) {
                        this.f387142k = (jA2 - suVar.getPosition()) + this.f387143l;
                    }
                }
                long j13 = this.f387142k;
                int i16 = this.f387143l;
                if (j13 >= i16) {
                    int i17 = this.f387141j;
                    if (i17 == 1836019574 || i17 == 1953653099 || i17 == 1835297121 || i17 == 1835626086 || i17 == 1937007212 || i17 == 1701082227 || i17 == 1835365473) {
                        z13 = true;
                        long position = suVar.getPosition();
                        long j14 = this.f387142k;
                        long j15 = this.f387143l;
                        long j16 = (position + j14) - j15;
                        if (j14 != j15 && this.f387141j == 1835365473) {
                            this.f387135d.c(8);
                            suVar.a(this.f387135d.c(), 0, 8);
                            pr0 pr0Var = this.f387135d;
                            int i18 = hc.f386076b;
                            int iD2 = pr0Var.d();
                            pr0Var.f(4);
                            if (pr0Var.h() != 1751411826) {
                                iD2 += 4;
                            }
                            pr0Var.e(iD2);
                            suVar.a(this.f387135d.d());
                            suVar.c();
                        }
                        this.f387137f.push(new gc.a(this.f387141j, j16));
                        if (this.f387142k == this.f387143l) {
                            c(j16);
                            i13 = 0;
                        } else {
                            i13 = 0;
                            this.f387140i = 0;
                            this.f387143l = 0;
                        }
                    } else {
                        if (i17 != 1835296868 && i17 != 1836476516 && i17 != 1751411826 && i17 != 1937011556 && i17 != 1937011827 && i17 != 1937011571 && i17 != 1668576371 && i17 != 1701606260 && i17 != 1937011555 && i17 != 1937011578 && i17 != 1937013298 && i17 != 1937007471 && i17 != 1668232756 && i17 != 1953196132 && i17 != 1718909296 && i17 != 1969517665 && i17 != 1801812339 && i17 != 1768715124) {
                            long position2 = suVar.getPosition();
                            long j17 = this.f387143l;
                            long j18 = position2 - j17;
                            if (this.f387141j == 1836086884) {
                                this.f387155x = new MotionPhotoMetadata(0L, j18, -9223372036854775807L, j18 + j17, this.f387142k - j17);
                            }
                            this.f387144m = null;
                            z13 = true;
                            this.f387140i = 1;
                        } else {
                            db.b(i16 == 8);
                            db.b(this.f387142k <= 2147483647L);
                            pr0 pr0Var2 = new pr0((int) this.f387142k);
                            System.arraycopy(this.f387136e.c(), 0, pr0Var2.c(), 0, 8);
                            this.f387144m = pr0Var2;
                            z13 = true;
                            this.f387140i = 1;
                        }
                        i13 = 0;
                    }
                    i14 = i13;
                    r52 = z13;
                } else {
                    throw tr0.a("Atom size less than header length (unsupported).");
                }
            } else {
                if (i15 != r52) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            this.f387138g.a(suVar, fu0Var, this.f387139h);
                            if (fu0Var.f385508a == 0) {
                                this.f387140i = i14;
                                this.f387143l = i14;
                            }
                            return r52;
                        }
                        throw new IllegalStateException();
                    }
                    long position3 = suVar.getPosition();
                    if (this.f387145n == -1) {
                        int i19 = i14;
                        int i22 = r52;
                        int i23 = i22;
                        int i24 = -1;
                        int i25 = -1;
                        long j19 = Long.MAX_VALUE;
                        long j22 = Long.MAX_VALUE;
                        long j23 = Long.MAX_VALUE;
                        while (true) {
                            a[] aVarArr = this.f387150s;
                            if (i19 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i19];
                            int i26 = aVar.f387160e;
                            y91 y91Var = aVar.f387157b;
                            if (i26 != y91Var.f391969b) {
                                long j24 = y91Var.f391970c[i26];
                                long[][] jArr = this.f387151t;
                                int i27 = pc1.f388768a;
                                long j25 = jArr[i19][i26];
                                long j26 = j24 - position3;
                                int i28 = (j26 < 0 || j26 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? r52 : i14;
                                if ((i28 == 0 && i22 != 0) || (i28 == i22 && j26 < j23)) {
                                    i22 = i28;
                                    i25 = i19;
                                    j23 = j26;
                                    j22 = j25;
                                }
                                if (j25 < j19) {
                                    i23 = i28;
                                    i24 = i19;
                                    j19 = j25;
                                }
                            }
                            i19 += r52;
                        }
                        int i29 = (j19 == Long.MAX_VALUE || i23 == 0 || j22 < j19 + 10485760) ? i25 : i24;
                        this.f387145n = i29;
                        if (i29 == -1) {
                            return -1;
                        }
                    }
                    a aVar2 = this.f387150s[this.f387145n];
                    x91 x91Var = aVar2.f387158c;
                    int i32 = aVar2.f387160e;
                    y91 y91Var2 = aVar2.f387157b;
                    long j27 = y91Var2.f391970c[i32];
                    int i33 = y91Var2.f391971d[i32];
                    ya1 ya1Var = aVar2.f387159d;
                    long j28 = (j27 - position3) + this.f387146o;
                    if (j28 >= 0 && j28 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        if (aVar2.f387156a.f389839g == 1) {
                            j28 += 8;
                            i33 -= 8;
                        }
                        suVar.a((int) j28);
                        s91 s91Var = aVar2.f387156a;
                        if (s91Var.f389842j != 0) {
                            byte[] bArrC = this.f387134c.c();
                            bArrC[0] = 0;
                            bArrC[1] = 0;
                            bArrC[2] = 0;
                            int i34 = aVar2.f387156a.f389842j;
                            int i35 = 4 - i34;
                            while (this.f387147p < i33) {
                                int i36 = this.f387148q;
                                if (i36 == 0) {
                                    suVar.readFully(bArrC, i35, i34);
                                    this.f387146o += i34;
                                    this.f387134c.e(0);
                                    int iH2 = this.f387134c.h();
                                    if (iH2 >= 0) {
                                        this.f387148q = iH2;
                                        this.f387133b.e(0);
                                        x91Var.a(4, this.f387133b);
                                        this.f387147p += 4;
                                        i33 += i35;
                                    } else {
                                        throw tr0.a("Invalid NAL length", (Exception) null);
                                    }
                                } else {
                                    int iB2 = x91Var.b(suVar, i36, false);
                                    this.f387146o += iB2;
                                    this.f387147p += iB2;
                                    this.f387148q -= iB2;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(s91Var.f389838f.f391181l)) {
                                if (this.f387147p == 0) {
                                    C39341l.a(i33, this.f387135d);
                                    i12 = 7;
                                    x91Var.a(7, this.f387135d);
                                    this.f387147p += 7;
                                } else {
                                    i12 = 7;
                                }
                                i33 += i12;
                            } else if (ya1Var != null) {
                                ya1Var.a(suVar);
                            }
                            while (true) {
                                int i37 = this.f387147p;
                                if (i37 >= i33) {
                                    break;
                                }
                                int iB3 = x91Var.b(suVar, i33 - i37, false);
                                this.f387146o += iB3;
                                this.f387147p += iB3;
                                this.f387148q -= iB3;
                            }
                        }
                        y91 y91Var3 = aVar2.f387157b;
                        long j29 = y91Var3.f391973f[i32];
                        int i38 = y91Var3.f391974g[i32];
                        if (ya1Var != null) {
                            ya1Var.a(x91Var, j29, i38, i33, 0, null);
                            if (i32 + 1 == aVar2.f387157b.f391969b) {
                                ya1Var.a(x91Var, null);
                            }
                        } else {
                            x91Var.a(j29, i38, i33, 0, null);
                        }
                        aVar2.f387160e++;
                        this.f387145n = -1;
                        this.f387146o = 0;
                        this.f387147p = 0;
                        this.f387148q = 0;
                        return 0;
                    }
                    fu0Var.f385508a = j27;
                    return 1;
                }
                long j32 = this.f387142k - this.f387143l;
                long position4 = suVar.getPosition() + j32;
                pr0 pr0Var3 = this.f387144m;
                if (pr0Var3 != null) {
                    suVar.readFully(pr0Var3.c(), this.f387143l, (int) j32);
                    if (this.f387141j == 1718909296) {
                        pr0Var3.e(8);
                        int iH3 = pr0Var3.h();
                        int i39 = iH3 != 1751476579 ? iH3 != 1903435808 ? 0 : 1 : 2;
                        if (i39 == 0) {
                            pr0Var3.f(4);
                            while (true) {
                                if (pr0Var3.a() <= 0) {
                                    i39 = 0;
                                    break;
                                }
                                int iH4 = pr0Var3.h();
                                i39 = iH4 != 1751476579 ? iH4 != 1903435808 ? 0 : 1 : 2;
                                if (i39 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f387154w = i39;
                    } else if (!this.f387137f.isEmpty()) {
                        this.f387137f.peek().f385632c.add(new gc.b(this.f387141j, pr0Var3));
                    }
                } else if (j32 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    suVar.a((int) j32);
                } else {
                    fu0Var.f385508a = suVar.getPosition() + j32;
                    z12 = true;
                    c(position4);
                    if (!z12 && this.f387140i != 2) {
                        return 1;
                    }
                    r52 = 1;
                    i14 = 0;
                }
                z12 = false;
                c(position4);
                if (!z12) {
                }
                r52 = 1;
                i14 = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0210 A[PHI: r3
  0x0210: PHI (r3v16 com.yandex.mobile.ads.exo.metadata.Metadata) = 
  (r3v10 com.yandex.mobile.ads.exo.metadata.Metadata)
  (r3v10 com.yandex.mobile.ads.exo.metadata.Metadata)
  (r3v11 com.yandex.mobile.ads.exo.metadata.Metadata)
  (r3v10 com.yandex.mobile.ads.exo.metadata.Metadata)
 binds: [B:106:0x0215, B:107:0x0217, B:177:0x0210, B:102:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252 A[LOOP:5: B:121:0x024f->B:123:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.yandex.mobile.ads.impl.gc.a r25) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kh0.a(com.yandex.mobile.ads.impl.gc$a):void");
    }
}
