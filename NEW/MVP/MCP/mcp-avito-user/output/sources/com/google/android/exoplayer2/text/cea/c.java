package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.l;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.E;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes6.dex */
public final class c extends e {

    /* renamed from: g, reason: collision with root package name */
    public final F f346788g = new F();

    /* renamed from: h, reason: collision with root package name */
    public final E f346789h = new E();

    /* renamed from: i, reason: collision with root package name */
    public int f346790i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f346791j;

    /* renamed from: k, reason: collision with root package name */
    public final b[] f346792k;

    /* renamed from: l, reason: collision with root package name */
    public b f346793l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public List<com.google.android.exoplayer2.text.a> f346794m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public List<com.google.android.exoplayer2.text.a> f346795n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public C10601c f346796o;

    /* renamed from: p, reason: collision with root package name */
    public int f346797p;

    /* compiled from: Cea708Decoder.java */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.android.exoplayer2.text.cea.b f346798c = new com.google.android.exoplayer2.text.cea.b();

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.text.a f346799a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346800b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f12, int i12, float f13, int i13, boolean z12, int i14, int i15) {
            a.c cVar = new a.c();
            cVar.f346734a = spannableStringBuilder;
            cVar.f346736c = alignment;
            cVar.f346738e = f12;
            cVar.f346739f = 0;
            cVar.f346740g = i12;
            cVar.f346741h = f13;
            cVar.f346742i = i13;
            cVar.f346745l = -3.4028235E38f;
            if (z12) {
                cVar.f346748o = i14;
                cVar.f346747n = true;
            }
            this.f346799a = cVar.a();
            this.f346800b = i15;
        }
    }

    /* compiled from: Cea708Decoder.java */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final int[] f346801A;

        /* renamed from: B, reason: collision with root package name */
        public static final boolean[] f346802B;

        /* renamed from: C, reason: collision with root package name */
        public static final int[] f346803C;

        /* renamed from: D, reason: collision with root package name */
        public static final int[] f346804D;

        /* renamed from: E, reason: collision with root package name */
        public static final int[] f346805E;

        /* renamed from: F, reason: collision with root package name */
        public static final int[] f346806F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f346807w = c(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f346808x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f346809y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f346810z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f346811a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f346812b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f346813c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f346814d;

        /* renamed from: e, reason: collision with root package name */
        public int f346815e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f346816f;

        /* renamed from: g, reason: collision with root package name */
        public int f346817g;

        /* renamed from: h, reason: collision with root package name */
        public int f346818h;

        /* renamed from: i, reason: collision with root package name */
        public int f346819i;

        /* renamed from: j, reason: collision with root package name */
        public int f346820j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f346821k;

        /* renamed from: l, reason: collision with root package name */
        public int f346822l;

        /* renamed from: m, reason: collision with root package name */
        public int f346823m;

        /* renamed from: n, reason: collision with root package name */
        public int f346824n;

        /* renamed from: o, reason: collision with root package name */
        public int f346825o;

        /* renamed from: p, reason: collision with root package name */
        public int f346826p;

        /* renamed from: q, reason: collision with root package name */
        public int f346827q;

        /* renamed from: r, reason: collision with root package name */
        public int f346828r;

        /* renamed from: s, reason: collision with root package name */
        public int f346829s;

        /* renamed from: t, reason: collision with root package name */
        public int f346830t;

        /* renamed from: u, reason: collision with root package name */
        public int f346831u;

        /* renamed from: v, reason: collision with root package name */
        public int f346832v;

        static {
            int iC2 = c(0, 0, 0, 0);
            f346808x = iC2;
            int iC3 = c(0, 0, 0, 3);
            f346809y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f346810z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f346801A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f346802B = new boolean[]{false, false, false, true, true, true, false};
            f346803C = new int[]{iC2, iC3, iC2, iC2, iC3, iC2, iC2};
            f346804D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f346805E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f346806F = new int[]{iC2, iC2, iC2, iC2, iC2, iC3, iC3};
        }

        public b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                com.google.android.exoplayer2.util.C36585a.c(r4, r0)
                com.google.android.exoplayer2.util.C36585a.c(r5, r0)
                com.google.android.exoplayer2.util.C36585a.c(r6, r0)
                com.google.android.exoplayer2.util.C36585a.c(r7, r0)
                r0 = 0
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.c.b.c(int, int, int, int):int");
        }

        public final void a(char c12) {
            SpannableStringBuilder spannableStringBuilder = this.f346812b;
            if (c12 != '\n') {
                spannableStringBuilder.append(c12);
                return;
            }
            ArrayList arrayList = this.f346811a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f346826p != -1) {
                this.f346826p = 0;
            }
            if (this.f346827q != -1) {
                this.f346827q = 0;
            }
            if (this.f346828r != -1) {
                this.f346828r = 0;
            }
            if (this.f346830t != -1) {
                this.f346830t = 0;
            }
            while (true) {
                if ((!this.f346821k || arrayList.size() < this.f346820j) && arrayList.size() < 15) {
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f346812b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f346826p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f346826p, length, 33);
                }
                if (this.f346827q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f346827q, length, 33);
                }
                if (this.f346828r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f346829s), this.f346828r, length, 33);
                }
                if (this.f346830t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f346831u), this.f346830t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f346811a.clear();
            this.f346812b.clear();
            this.f346826p = -1;
            this.f346827q = -1;
            this.f346828r = -1;
            this.f346830t = -1;
            this.f346832v = 0;
            this.f346813c = false;
            this.f346814d = false;
            this.f346815e = 4;
            this.f346816f = false;
            this.f346817g = 0;
            this.f346818h = 0;
            this.f346819i = 0;
            this.f346820j = 15;
            this.f346821k = true;
            this.f346822l = 0;
            this.f346823m = 0;
            this.f346824n = 0;
            int i12 = f346808x;
            this.f346825o = i12;
            this.f346829s = f346807w;
            this.f346831u = i12;
        }

        public final void e(boolean z12, boolean z13) {
            int i12 = this.f346826p;
            SpannableStringBuilder spannableStringBuilder = this.f346812b;
            if (i12 != -1) {
                if (!z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f346826p, spannableStringBuilder.length(), 33);
                    this.f346826p = -1;
                }
            } else if (z12) {
                this.f346826p = spannableStringBuilder.length();
            }
            if (this.f346827q == -1) {
                if (z13) {
                    this.f346827q = spannableStringBuilder.length();
                }
            } else {
                if (z13) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f346827q, spannableStringBuilder.length(), 33);
                this.f346827q = -1;
            }
        }

        public final void f(int i12, int i13) {
            int i14 = this.f346828r;
            SpannableStringBuilder spannableStringBuilder = this.f346812b;
            if (i14 != -1 && this.f346829s != i12) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f346829s), this.f346828r, spannableStringBuilder.length(), 33);
            }
            if (i12 != f346807w) {
                this.f346828r = spannableStringBuilder.length();
                this.f346829s = i12;
            }
            if (this.f346830t != -1 && this.f346831u != i13) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f346831u), this.f346830t, spannableStringBuilder.length(), 33);
            }
            if (i13 != f346808x) {
                this.f346830t = spannableStringBuilder.length();
                this.f346831u = i13;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: com.google.android.exoplayer2.text.cea.c$c, reason: collision with other inner class name */
    public static final class C10601c {

        /* renamed from: a, reason: collision with root package name */
        public final int f346833a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f346834b;

        /* renamed from: c, reason: collision with root package name */
        public int f346835c = 0;

        public C10601c(int i12, int i13) {
            this.f346833a = i13;
            this.f346834b = new byte[(i13 * 2) - 1];
        }
    }

    public c(int i12, @P List<byte[]> list) {
        this.f346791j = i12 == -1 ? 1 : i12;
        if (list != null && list.size() == 1 && list.get(0).length == 1) {
            byte b12 = list.get(0)[0];
        }
        this.f346792k = new b[8];
        for (int i13 = 0; i13 < 8; i13++) {
            this.f346792k[i13] = new b();
        }
        this.f346793l = this.f346792k[0];
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.text.i
    public final void c(long j12) {
        this.f346841e = j12;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    public final h e() {
        List<com.google.android.exoplayer2.text.a> list = this.f346794m;
        this.f346795n = list;
        list.getClass();
        return new f(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    public final void f(l lVar) {
        ByteBuffer byteBuffer = lVar.f344205d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        F f12 = this.f346788g;
        f12.z(iLimit, bArrArray);
        while (f12.a() >= 3) {
            int iR2 = f12.r();
            int i12 = iR2 & 3;
            boolean z12 = (iR2 & 4) == 4;
            byte bR2 = (byte) f12.r();
            byte bR3 = (byte) f12.r();
            if (i12 == 2 || i12 == 3) {
                if (z12) {
                    if (i12 == 3) {
                        i();
                        int i13 = (bR2 & 192) >> 6;
                        int i14 = this.f346790i;
                        if (i14 != -1 && i13 != (i14 + 1) % 4) {
                            k();
                        }
                        this.f346790i = i13;
                        int i15 = bR2 & 63;
                        if (i15 == 0) {
                            i15 = 64;
                        }
                        C10601c c10601c = new C10601c(i13, i15);
                        this.f346796o = c10601c;
                        c10601c.f346835c = 1;
                        c10601c.f346834b[0] = bR3;
                    } else {
                        C36585a.b(i12 == 2);
                        C10601c c10601c2 = this.f346796o;
                        if (c10601c2 != null) {
                            byte[] bArr = c10601c2.f346834b;
                            int i16 = c10601c2.f346835c;
                            int i17 = i16 + 1;
                            c10601c2.f346835c = i17;
                            bArr[i16] = bR2;
                            c10601c2.f346835c = i16 + 2;
                            bArr[i17] = bR3;
                        }
                    }
                    C10601c c10601c3 = this.f346796o;
                    if (c10601c3.f346835c == (c10601c3.f346833a * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.e
    public final void flush() {
        super.flush();
        this.f346794m = null;
        this.f346795n = null;
        this.f346797p = 0;
        this.f346793l = this.f346792k[0];
        k();
        this.f346796o = null;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    public final boolean h() {
        return this.f346794m != this.f346795n;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.c.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.exoplayer2.text.a> j() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.c.j():java.util.List");
    }

    public final void k() {
        for (int i12 = 0; i12 < 8; i12++) {
            this.f346792k[i12].d();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.e
    public final /* bridge */ /* synthetic */ void release() {
    }
}
