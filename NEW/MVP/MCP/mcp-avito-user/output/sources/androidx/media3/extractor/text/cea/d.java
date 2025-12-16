package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.a;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.s;
import androidx.media3.common.util.y;
import androidx.media3.common.util.z;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Cea708Decoder.java */
@J
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: g, reason: collision with root package name */
    public final z f51184g = new z();

    /* renamed from: h, reason: collision with root package name */
    public final y f51185h = new y();

    /* renamed from: i, reason: collision with root package name */
    public int f51186i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f51187j;

    /* renamed from: k, reason: collision with root package name */
    public final b[] f51188k;

    /* renamed from: l, reason: collision with root package name */
    public b f51189l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public List<androidx.media3.common.text.a> f51190m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public List<androidx.media3.common.text.a> f51191n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public c f51192o;

    /* renamed from: p, reason: collision with root package name */
    public int f51193p;

    /* compiled from: Cea708Decoder.java */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final androidx.media3.extractor.text.cea.c f51194c = new androidx.media3.extractor.text.cea.c();

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.text.a f51195a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51196b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f12, int i12, float f13, int i13, boolean z12, int i14, int i15) {
            a.c cVar = new a.c();
            cVar.f47839a = spannableStringBuilder;
            cVar.f47841c = alignment;
            cVar.f47843e = f12;
            cVar.f47844f = 0;
            cVar.f47845g = i12;
            cVar.f47846h = f13;
            cVar.f47847i = i13;
            cVar.f47850l = -3.4028235E38f;
            if (z12) {
                cVar.f47853o = i14;
                cVar.f47852n = true;
            }
            this.f51195a = cVar.a();
            this.f51196b = i15;
        }
    }

    /* compiled from: Cea708Decoder.java */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final int[] f51197A;

        /* renamed from: B, reason: collision with root package name */
        public static final boolean[] f51198B;

        /* renamed from: C, reason: collision with root package name */
        public static final int[] f51199C;

        /* renamed from: D, reason: collision with root package name */
        public static final int[] f51200D;

        /* renamed from: E, reason: collision with root package name */
        public static final int[] f51201E;

        /* renamed from: F, reason: collision with root package name */
        public static final int[] f51202F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f51203w = c(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f51204x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f51205y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f51206z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f51207a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f51208b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f51209c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f51210d;

        /* renamed from: e, reason: collision with root package name */
        public int f51211e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f51212f;

        /* renamed from: g, reason: collision with root package name */
        public int f51213g;

        /* renamed from: h, reason: collision with root package name */
        public int f51214h;

        /* renamed from: i, reason: collision with root package name */
        public int f51215i;

        /* renamed from: j, reason: collision with root package name */
        public int f51216j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f51217k;

        /* renamed from: l, reason: collision with root package name */
        public int f51218l;

        /* renamed from: m, reason: collision with root package name */
        public int f51219m;

        /* renamed from: n, reason: collision with root package name */
        public int f51220n;

        /* renamed from: o, reason: collision with root package name */
        public int f51221o;

        /* renamed from: p, reason: collision with root package name */
        public int f51222p;

        /* renamed from: q, reason: collision with root package name */
        public int f51223q;

        /* renamed from: r, reason: collision with root package name */
        public int f51224r;

        /* renamed from: s, reason: collision with root package name */
        public int f51225s;

        /* renamed from: t, reason: collision with root package name */
        public int f51226t;

        /* renamed from: u, reason: collision with root package name */
        public int f51227u;

        /* renamed from: v, reason: collision with root package name */
        public int f51228v;

        static {
            int iC2 = c(0, 0, 0, 0);
            f51204x = iC2;
            int iC3 = c(0, 0, 0, 3);
            f51205y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f51206z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f51197A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f51198B = new boolean[]{false, false, false, true, true, true, false};
            f51199C = new int[]{iC2, iC3, iC2, iC2, iC3, iC2, iC2};
            f51200D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f51201E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f51202F = new int[]{iC2, iC2, iC2, iC2, iC2, iC3, iC3};
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
                androidx.media3.common.util.C23110a.c(r4, r0)
                androidx.media3.common.util.C23110a.c(r5, r0)
                androidx.media3.common.util.C23110a.c(r6, r0)
                androidx.media3.common.util.C23110a.c(r7, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.d.b.c(int, int, int, int):int");
        }

        public final void a(char c12) {
            SpannableStringBuilder spannableStringBuilder = this.f51208b;
            if (c12 != '\n') {
                spannableStringBuilder.append(c12);
                return;
            }
            ArrayList arrayList = this.f51207a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f51222p != -1) {
                this.f51222p = 0;
            }
            if (this.f51223q != -1) {
                this.f51223q = 0;
            }
            if (this.f51224r != -1) {
                this.f51224r = 0;
            }
            if (this.f51226t != -1) {
                this.f51226t = 0;
            }
            while (true) {
                if ((!this.f51217k || arrayList.size() < this.f51216j) && arrayList.size() < 15) {
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f51208b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f51222p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f51222p, length, 33);
                }
                if (this.f51223q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f51223q, length, 33);
                }
                if (this.f51224r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f51225s), this.f51224r, length, 33);
                }
                if (this.f51226t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f51227u), this.f51226t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f51207a.clear();
            this.f51208b.clear();
            this.f51222p = -1;
            this.f51223q = -1;
            this.f51224r = -1;
            this.f51226t = -1;
            this.f51228v = 0;
            this.f51209c = false;
            this.f51210d = false;
            this.f51211e = 4;
            this.f51212f = false;
            this.f51213g = 0;
            this.f51214h = 0;
            this.f51215i = 0;
            this.f51216j = 15;
            this.f51217k = true;
            this.f51218l = 0;
            this.f51219m = 0;
            this.f51220n = 0;
            int i12 = f51204x;
            this.f51221o = i12;
            this.f51225s = f51203w;
            this.f51227u = i12;
        }

        public final void e(boolean z12, boolean z13) {
            int i12 = this.f51222p;
            SpannableStringBuilder spannableStringBuilder = this.f51208b;
            if (i12 != -1) {
                if (!z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f51222p, spannableStringBuilder.length(), 33);
                    this.f51222p = -1;
                }
            } else if (z12) {
                this.f51222p = spannableStringBuilder.length();
            }
            if (this.f51223q == -1) {
                if (z13) {
                    this.f51223q = spannableStringBuilder.length();
                }
            } else {
                if (z13) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f51223q, spannableStringBuilder.length(), 33);
                this.f51223q = -1;
            }
        }

        public final void f(int i12, int i13) {
            int i14 = this.f51224r;
            SpannableStringBuilder spannableStringBuilder = this.f51208b;
            if (i14 != -1 && this.f51225s != i12) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f51225s), this.f51224r, spannableStringBuilder.length(), 33);
            }
            if (i12 != f51203w) {
                this.f51224r = spannableStringBuilder.length();
                this.f51225s = i12;
            }
            if (this.f51226t != -1 && this.f51227u != i13) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f51227u), this.f51226t, spannableStringBuilder.length(), 33);
            }
            if (i13 != f51204x) {
                this.f51226t = spannableStringBuilder.length();
                this.f51227u = i13;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f51229a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51230b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51231c;

        /* renamed from: d, reason: collision with root package name */
        public int f51232d = 0;

        public c(int i12, int i13) {
            this.f51229a = i12;
            this.f51230b = i13;
            this.f51231c = new byte[(i13 * 2) - 1];
        }
    }

    public d(int i12, @P List<byte[]> list) {
        this.f51187j = i12 == -1 ? 1 : i12;
        if (list != null && list.size() == 1 && list.get(0).length == 1) {
            byte b12 = list.get(0)[0];
        }
        this.f51188k = new b[8];
        for (int i13 = 0; i13 < 8; i13++) {
            this.f51188k[i13] = new b();
        }
        this.f51189l = this.f51188k[0];
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.extractor.text.f
    public final void c(long j12) {
        this.f51238e = j12;
    }

    @Override // androidx.media3.extractor.text.cea.f
    public final androidx.media3.extractor.text.e e() {
        List<androidx.media3.common.text.a> list = this.f51190m;
        this.f51191n = list;
        list.getClass();
        return new g(list);
    }

    @Override // androidx.media3.extractor.text.cea.f
    public final void f(androidx.media3.extractor.text.h hVar) {
        ByteBuffer byteBuffer = hVar.f48323d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        z zVar = this.f51184g;
        zVar.D(iLimit, bArrArray);
        while (zVar.a() >= 3) {
            int iU2 = zVar.u();
            int i12 = iU2 & 3;
            boolean z12 = (iU2 & 4) == 4;
            byte bU2 = (byte) zVar.u();
            byte bU3 = (byte) zVar.u();
            if (i12 == 2 || i12 == 3) {
                if (z12) {
                    if (i12 == 3) {
                        i();
                        int i13 = (bU2 & 192) >> 6;
                        int i14 = this.f51186i;
                        if (i14 != -1 && i13 != (i14 + 1) % 4) {
                            k();
                            s.g();
                        }
                        this.f51186i = i13;
                        int i15 = bU2 & 63;
                        if (i15 == 0) {
                            i15 = 64;
                        }
                        c cVar = new c(i13, i15);
                        this.f51192o = cVar;
                        cVar.f51232d = 1;
                        cVar.f51231c[0] = bU3;
                    } else {
                        C23110a.b(i12 == 2);
                        c cVar2 = this.f51192o;
                        if (cVar2 == null) {
                            s.c();
                        } else {
                            byte[] bArr = cVar2.f51231c;
                            int i16 = cVar2.f51232d;
                            int i17 = i16 + 1;
                            cVar2.f51232d = i17;
                            bArr[i16] = bU2;
                            cVar2.f51232d = i16 + 2;
                            bArr[i17] = bU3;
                        }
                    }
                    c cVar3 = this.f51192o;
                    if (cVar3.f51232d == (cVar3.f51230b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.decoder.e
    public final void flush() {
        super.flush();
        this.f51190m = null;
        this.f51191n = null;
        this.f51193p = 0;
        this.f51189l = this.f51188k[0];
        k();
        this.f51192o = null;
    }

    @Override // androidx.media3.decoder.e
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // androidx.media3.extractor.text.cea.f
    public final boolean h() {
        return this.f51190m != this.f51191n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        int i12;
        int i13;
        boolean z12;
        int i14;
        char c12;
        c cVar = this.f51192o;
        if (cVar == null) {
            return;
        }
        int i15 = 2;
        boolean z13 = true;
        if (cVar.f51232d != (cVar.f51230b * 2) - 1) {
            int i16 = cVar.f51229a;
            s.b();
        }
        c cVar2 = this.f51192o;
        byte[] bArr = cVar2.f51231c;
        int i17 = cVar2.f51232d;
        y yVar = this.f51185h;
        yVar.j(i17, bArr);
        boolean z14 = false;
        while (true) {
            if (yVar.b() > 0) {
                int i18 = 3;
                int iG2 = yVar.g(3);
                int iG3 = yVar.g(5);
                int i19 = 7;
                if (iG2 == 7) {
                    yVar.n(i15);
                    iG2 = yVar.g(6);
                    if (iG2 < 7) {
                        s.g();
                    }
                }
                if (iG3 == 0) {
                    if (iG2 != 0) {
                        s.g();
                    }
                } else if (iG2 != this.f51187j) {
                    yVar.o(iG3);
                } else {
                    for (int iE2 = (iG3 * 8) + yVar.e(); yVar.e() < iE2; iE2 = i13) {
                        int iG4 = yVar.g(8);
                        if (iG4 != 16) {
                            if (iG4 <= 31) {
                                if (iG4 != 0) {
                                    if (iG4 == i18) {
                                        this.f51190m = j();
                                    } else if (iG4 != 8) {
                                        switch (iG4) {
                                            case 12:
                                                k();
                                                break;
                                            case 13:
                                                this.f51189l.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iG4 < 17 || iG4 > 23) {
                                                    if (iG4 < 24 || iG4 > 31) {
                                                        s.g();
                                                        break;
                                                    } else {
                                                        s.g();
                                                        yVar.n(16);
                                                        break;
                                                    }
                                                } else {
                                                    s.g();
                                                    yVar.n(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f51189l.f51208b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i14 = i15;
                                i12 = i18;
                                i13 = iE2;
                            } else if (iG4 <= 127) {
                                if (iG4 == 127) {
                                    this.f51189l.a((char) 9835);
                                } else {
                                    this.f51189l.a((char) (iG4 & 255));
                                }
                                i14 = i15;
                                i12 = i18;
                                i13 = iE2;
                                z14 = true;
                            } else {
                                if (iG4 <= 159) {
                                    b[] bVarArr = this.f51188k;
                                    switch (iG4) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i12 = i18;
                                            i13 = iE2;
                                            z12 = true;
                                            int i22 = iG4 - 128;
                                            if (this.f51193p != i22) {
                                                this.f51193p = i22;
                                                this.f51189l = bVarArr[i22];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i12 = i18;
                                            i13 = iE2;
                                            z12 = true;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (yVar.f()) {
                                                    b bVar = bVarArr[8 - i23];
                                                    bVar.f51207a.clear();
                                                    bVar.f51208b.clear();
                                                    bVar.f51222p = -1;
                                                    bVar.f51223q = -1;
                                                    bVar.f51224r = -1;
                                                    bVar.f51226t = -1;
                                                    bVar.f51228v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i12 = i18;
                                            i13 = iE2;
                                            for (int i24 = 1; i24 <= 8; i24++) {
                                                if (yVar.f()) {
                                                    bVarArr[8 - i24].f51210d = true;
                                                }
                                            }
                                            z12 = true;
                                            break;
                                        case 138:
                                            i12 = i18;
                                            i13 = iE2;
                                            for (int i25 = 1; i25 <= 8; i25++) {
                                                if (yVar.f()) {
                                                    bVarArr[8 - i25].f51210d = false;
                                                }
                                            }
                                            z12 = true;
                                            break;
                                        case 139:
                                            i12 = i18;
                                            i13 = iE2;
                                            for (int i26 = 1; i26 <= 8; i26++) {
                                                if (yVar.f()) {
                                                    bVarArr[8 - i26].f51210d = !r1.f51210d;
                                                }
                                            }
                                            z12 = true;
                                            break;
                                        case 140:
                                            i12 = i18;
                                            i13 = iE2;
                                            for (int i27 = 1; i27 <= 8; i27++) {
                                                if (yVar.f()) {
                                                    bVarArr[8 - i27].d();
                                                }
                                            }
                                            z12 = true;
                                            break;
                                        case 141:
                                            i12 = i18;
                                            i13 = iE2;
                                            yVar.n(8);
                                            z12 = true;
                                            break;
                                        case 142:
                                            i12 = i18;
                                            i13 = iE2;
                                            z12 = true;
                                            break;
                                        case 143:
                                            i12 = i18;
                                            i13 = iE2;
                                            k();
                                            z12 = true;
                                            break;
                                        case 144:
                                            i13 = iE2;
                                            if (!this.f51189l.f51209c) {
                                                yVar.n(16);
                                                i12 = 3;
                                                z12 = true;
                                                break;
                                            } else {
                                                yVar.g(4);
                                                yVar.g(2);
                                                yVar.g(2);
                                                boolean zF2 = yVar.f();
                                                boolean zF3 = yVar.f();
                                                i12 = 3;
                                                yVar.g(3);
                                                yVar.g(3);
                                                this.f51189l.e(zF2, zF3);
                                                z12 = true;
                                            }
                                        case 145:
                                            i13 = iE2;
                                            if (this.f51189l.f51209c) {
                                                int iC2 = b.c(yVar.g(2), yVar.g(2), yVar.g(2), yVar.g(2));
                                                int iC3 = b.c(yVar.g(2), yVar.g(2), yVar.g(2), yVar.g(2));
                                                yVar.n(2);
                                                b.c(yVar.g(2), yVar.g(2), yVar.g(2), 0);
                                                this.f51189l.f(iC2, iC3);
                                            } else {
                                                yVar.n(24);
                                            }
                                            i12 = 3;
                                            z12 = true;
                                            break;
                                        case 146:
                                            i13 = iE2;
                                            if (this.f51189l.f51209c) {
                                                yVar.n(4);
                                                int iG5 = yVar.g(4);
                                                yVar.n(2);
                                                yVar.g(6);
                                                b bVar2 = this.f51189l;
                                                if (bVar2.f51228v != iG5) {
                                                    bVar2.a('\n');
                                                }
                                                bVar2.f51228v = iG5;
                                            } else {
                                                yVar.n(16);
                                            }
                                            i12 = 3;
                                            z12 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            s.g();
                                            i12 = i18;
                                            i13 = iE2;
                                            z12 = true;
                                            break;
                                        case 151:
                                            i13 = iE2;
                                            if (this.f51189l.f51209c) {
                                                int iC4 = b.c(yVar.g(2), yVar.g(2), yVar.g(2), yVar.g(2));
                                                yVar.g(2);
                                                b.c(yVar.g(2), yVar.g(2), yVar.g(2), 0);
                                                yVar.f();
                                                yVar.f();
                                                yVar.g(2);
                                                yVar.g(2);
                                                int iG6 = yVar.g(2);
                                                yVar.n(8);
                                                b bVar3 = this.f51189l;
                                                bVar3.f51221o = iC4;
                                                bVar3.f51218l = iG6;
                                            } else {
                                                yVar.n(32);
                                            }
                                            i12 = 3;
                                            z12 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i28 = iG4 - 152;
                                            b bVar4 = bVarArr[i28];
                                            yVar.n(i15);
                                            boolean zF4 = yVar.f();
                                            boolean zF5 = yVar.f();
                                            yVar.f();
                                            int iG7 = yVar.g(i18);
                                            boolean zF6 = yVar.f();
                                            int iG8 = yVar.g(i19);
                                            int iG9 = yVar.g(8);
                                            int iG10 = yVar.g(4);
                                            int iG11 = yVar.g(4);
                                            yVar.n(i15);
                                            yVar.g(6);
                                            yVar.n(i15);
                                            int iG12 = yVar.g(3);
                                            i13 = iE2;
                                            int iG13 = yVar.g(3);
                                            bVar4.f51209c = true;
                                            bVar4.f51210d = zF4;
                                            bVar4.f51217k = zF5;
                                            bVar4.f51211e = iG7;
                                            bVar4.f51212f = zF6;
                                            bVar4.f51213g = iG8;
                                            bVar4.f51214h = iG9;
                                            bVar4.f51215i = iG10;
                                            int i29 = iG11 + 1;
                                            if (bVar4.f51216j != i29) {
                                                bVar4.f51216j = i29;
                                                while (true) {
                                                    ArrayList arrayList = bVar4.f51207a;
                                                    if ((zF5 && arrayList.size() >= bVar4.f51216j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iG12 != 0 && bVar4.f51219m != iG12) {
                                                bVar4.f51219m = iG12;
                                                int i32 = iG12 - 1;
                                                int i33 = b.f51199C[i32];
                                                boolean z15 = b.f51198B[i32];
                                                int i34 = b.f51206z[i32];
                                                int i35 = b.f51197A[i32];
                                                int i36 = b.f51205y[i32];
                                                bVar4.f51221o = i33;
                                                bVar4.f51218l = i36;
                                            }
                                            if (iG13 != 0 && bVar4.f51220n != iG13) {
                                                bVar4.f51220n = iG13;
                                                int i37 = iG13 - 1;
                                                int i38 = b.f51201E[i37];
                                                int i39 = b.f51200D[i37];
                                                bVar4.e(false, false);
                                                bVar4.f(b.f51203w, b.f51202F[i37]);
                                            }
                                            if (this.f51193p != i28) {
                                                this.f51193p = i28;
                                                this.f51189l = bVarArr[i28];
                                            }
                                            i12 = 3;
                                            z12 = true;
                                            break;
                                    }
                                } else {
                                    i12 = i18;
                                    i13 = iE2;
                                    z12 = true;
                                    if (iG4 <= 255) {
                                        this.f51189l.a((char) (iG4 & 255));
                                    } else {
                                        s.g();
                                        i14 = 2;
                                        i19 = 7;
                                    }
                                }
                                z14 = z12;
                                i14 = 2;
                                i19 = 7;
                            }
                            z12 = true;
                        } else {
                            i12 = i18;
                            i13 = iE2;
                            z12 = true;
                            int iG14 = yVar.g(8);
                            if (iG14 <= 31) {
                                i19 = 7;
                                if (iG14 > 7) {
                                    if (iG14 <= 15) {
                                        yVar.n(8);
                                    } else if (iG14 <= 23) {
                                        yVar.n(16);
                                    } else if (iG14 <= 31) {
                                        yVar.n(24);
                                    }
                                }
                            } else {
                                i19 = 7;
                                if (iG14 <= 127) {
                                    if (iG14 == 32) {
                                        this.f51189l.a(' ');
                                    } else if (iG14 == 33) {
                                        this.f51189l.a((char) 160);
                                    } else if (iG14 == 37) {
                                        this.f51189l.a((char) 8230);
                                    } else if (iG14 == 42) {
                                        this.f51189l.a((char) 352);
                                    } else if (iG14 == 44) {
                                        this.f51189l.a((char) 338);
                                    } else if (iG14 == 63) {
                                        this.f51189l.a((char) 376);
                                    } else if (iG14 == 57) {
                                        this.f51189l.a((char) 8482);
                                    } else if (iG14 == 58) {
                                        this.f51189l.a((char) 353);
                                    } else if (iG14 == 60) {
                                        this.f51189l.a((char) 339);
                                    } else if (iG14 != 61) {
                                        switch (iG14) {
                                            case 48:
                                                this.f51189l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f51189l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f51189l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f51189l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f51189l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f51189l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iG14) {
                                                    case 118:
                                                        this.f51189l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f51189l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f51189l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f51189l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f51189l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f51189l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f51189l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f51189l.a((char) 9472);
                                                        break;
                                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                        this.f51189l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f51189l.a((char) 9484);
                                                        break;
                                                    default:
                                                        s.g();
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f51189l.a((char) 8480);
                                    }
                                    z14 = true;
                                } else {
                                    if (iG14 > 159) {
                                        i14 = 2;
                                        c12 = 6;
                                        if (iG14 <= 255) {
                                            if (iG14 == 160) {
                                                this.f51189l.a((char) 13252);
                                            } else {
                                                s.g();
                                                this.f51189l.a('_');
                                            }
                                            z14 = true;
                                        } else {
                                            s.g();
                                        }
                                    } else if (iG14 <= 135) {
                                        yVar.n(32);
                                    } else if (iG14 <= 143) {
                                        yVar.n(40);
                                    } else if (iG14 <= 159) {
                                        i14 = 2;
                                        yVar.n(2);
                                        c12 = 6;
                                        yVar.n(yVar.g(6) * 8);
                                    }
                                    i18 = i12;
                                    i15 = i14;
                                    z13 = z12;
                                }
                            }
                            i14 = 2;
                        }
                        c12 = 6;
                        i18 = i12;
                        i15 = i14;
                        z13 = z12;
                    }
                }
            }
        }
        if (z14) {
            this.f51190m = j();
        }
        this.f51192o = null;
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
    public final java.util.List<androidx.media3.common.text.a> j() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.d.j():java.util.List");
    }

    public final void k() {
        for (int i12 = 0; i12 < 8; i12++) {
            this.f51188k[i12].d();
        }
    }

    @Override // androidx.media3.extractor.text.cea.f, androidx.media3.decoder.e
    public final /* bridge */ /* synthetic */ void release() {
    }
}
