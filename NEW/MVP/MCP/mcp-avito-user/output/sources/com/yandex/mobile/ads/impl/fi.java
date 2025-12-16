package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.vm;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes8.dex */
public final class fi extends gi {

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f385330g = new pr0();

    /* renamed from: h, reason: collision with root package name */
    private final or0 f385331h = new or0();

    /* renamed from: i, reason: collision with root package name */
    private int f385332i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final int f385333j;

    /* renamed from: k, reason: collision with root package name */
    private final b[] f385334k;

    /* renamed from: l, reason: collision with root package name */
    private b f385335l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private List<vm> f385336m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private List<vm> f385337n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private c f385338o;

    /* renamed from: p, reason: collision with root package name */
    private int f385339p;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f385340c = new A(2);

        /* renamed from: a, reason: collision with root package name */
        public final vm f385341a;

        /* renamed from: b, reason: collision with root package name */
        public final int f385342b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f12, int i12, float f13, int i13, boolean z12, int i14, int i15) {
            vm.a aVarD = new vm.a().a(spannableStringBuilder).b(alignment).a(0, f12).a(i12).b(f13).b(i13).d(-3.4028235E38f);
            if (z12) {
                aVarD.d(i14);
            }
            this.f385341a = aVarD.a();
            this.f385342b = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f385342b, aVar.f385342b);
        }
    }

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f385343A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f385344B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f385345C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f385346D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f385347E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f385348F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f385349w = a(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f385350x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f385351y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f385352z;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f385353a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f385354b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f385355c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f385356d;

        /* renamed from: e, reason: collision with root package name */
        private int f385357e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f385358f;

        /* renamed from: g, reason: collision with root package name */
        private int f385359g;

        /* renamed from: h, reason: collision with root package name */
        private int f385360h;

        /* renamed from: i, reason: collision with root package name */
        private int f385361i;

        /* renamed from: j, reason: collision with root package name */
        private int f385362j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f385363k;

        /* renamed from: l, reason: collision with root package name */
        private int f385364l;

        /* renamed from: m, reason: collision with root package name */
        private int f385365m;

        /* renamed from: n, reason: collision with root package name */
        private int f385366n;

        /* renamed from: o, reason: collision with root package name */
        private int f385367o;

        /* renamed from: p, reason: collision with root package name */
        private int f385368p;

        /* renamed from: q, reason: collision with root package name */
        private int f385369q;

        /* renamed from: r, reason: collision with root package name */
        private int f385370r;

        /* renamed from: s, reason: collision with root package name */
        private int f385371s;

        /* renamed from: t, reason: collision with root package name */
        private int f385372t;

        /* renamed from: u, reason: collision with root package name */
        private int f385373u;

        /* renamed from: v, reason: collision with root package name */
        private int f385374v;

        static {
            int iA2 = a(0, 0, 0, 0);
            f385350x = iA2;
            int iA3 = a(0, 0, 0, 3);
            f385351y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f385352z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f385343A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f385344B = new boolean[]{false, false, false, true, true, true, false};
            f385345C = new int[]{iA2, iA3, iA2, iA2, iA3, iA2, iA2};
            f385346D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f385347E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f385348F = new int[]{iA2, iA2, iA2, iA2, iA2, iA3, iA3};
        }

        public b() {
            h();
        }

        public final void a(boolean z12) {
            this.f385356d = z12;
        }

        public final void b(int i12, int i13) {
            this.f385367o = i12;
            this.f385364l = i13;
        }

        public final SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f385354b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f385368p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f385368p, length, 33);
                }
                if (this.f385369q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f385369q, length, 33);
                }
                if (this.f385370r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f385371s), this.f385370r, length, 33);
                }
                if (this.f385372t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f385373u), this.f385372t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f385353a.clear();
            this.f385354b.clear();
            this.f385368p = -1;
            this.f385369q = -1;
            this.f385370r = -1;
            this.f385372t = -1;
            this.f385374v = 0;
        }

        public final boolean e() {
            return this.f385355c;
        }

        public final boolean f() {
            return !this.f385355c || (this.f385353a.isEmpty() && this.f385354b.length() == 0);
        }

        public final boolean g() {
            return this.f385356d;
        }

        public final void h() {
            d();
            this.f385355c = false;
            this.f385356d = false;
            this.f385357e = 4;
            this.f385358f = false;
            this.f385359g = 0;
            this.f385360h = 0;
            this.f385361i = 0;
            this.f385362j = 15;
            this.f385363k = true;
            this.f385364l = 0;
            this.f385365m = 0;
            this.f385366n = 0;
            int i12 = f385350x;
            this.f385367o = i12;
            this.f385371s = f385349w;
            this.f385373u = i12;
        }

        public final void a(boolean z12, boolean z13, int i12, boolean z14, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f385355c = true;
            this.f385356d = z12;
            this.f385363k = z13;
            this.f385357e = i12;
            this.f385358f = z14;
            this.f385359g = i13;
            this.f385360h = i14;
            this.f385361i = i16;
            int i19 = i15 + 1;
            if (this.f385362j != i19) {
                this.f385362j = i19;
                while (true) {
                    if ((!z13 || this.f385353a.size() < this.f385362j) && this.f385353a.size() < 15) {
                        break;
                    } else {
                        this.f385353a.remove(0);
                    }
                }
            }
            if (i17 != 0 && this.f385365m != i17) {
                this.f385365m = i17;
                int i22 = i17 - 1;
                int i23 = f385345C[i22];
                boolean z15 = f385344B[i22];
                int i24 = f385352z[i22];
                int i25 = f385343A[i22];
                int i26 = f385351y[i22];
                this.f385367o = i23;
                this.f385364l = i26;
            }
            if (i18 == 0 || this.f385366n == i18) {
                return;
            }
            this.f385366n = i18;
            int i27 = i18 - 1;
            int i28 = f385347E[i27];
            int i29 = f385346D[i27];
            a(false, false);
            a(f385349w, f385348F[i27]);
        }

        @j.P
        public final a b() {
            Layout.Alignment alignment;
            float f12;
            float f13;
            if (f()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f385353a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f385353a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) c());
            int i13 = this.f385364l;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                if (i13 != 3) {
                    StringBuilder sbA = Cif.a("Unexpected justification value: ");
                    sbA.append(this.f385364l);
                    throw new IllegalArgumentException(sbA.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f385358f) {
                f12 = this.f385360h / 99.0f;
                f13 = this.f385359g / 99.0f;
            } else {
                f12 = this.f385360h / 209.0f;
                f13 = this.f385359g / 74.0f;
            }
            float f14 = (f12 * 0.9f) + 0.05f;
            float f15 = (f13 * 0.9f) + 0.05f;
            int i14 = this.f385361i;
            int i15 = i14 / 3;
            int i16 = i15 == 0 ? 0 : i15 == 1 ? 1 : 2;
            int i17 = i14 % 3;
            int i18 = i17 == 0 ? 0 : i17 == 1 ? 1 : 2;
            int i19 = this.f385367o;
            return new a(spannableStringBuilder, alignment2, f15, i16, f14, i18, i19 != f385350x, i19, this.f385357e);
        }

        public final void a(boolean z12, boolean z13) {
            if (this.f385368p != -1) {
                if (!z12) {
                    this.f385354b.setSpan(new StyleSpan(2), this.f385368p, this.f385354b.length(), 33);
                    this.f385368p = -1;
                }
            } else if (z12) {
                this.f385368p = this.f385354b.length();
            }
            if (this.f385369q == -1) {
                if (z13) {
                    this.f385369q = this.f385354b.length();
                }
            } else {
                if (z13) {
                    return;
                }
                this.f385354b.setSpan(new UnderlineSpan(), this.f385369q, this.f385354b.length(), 33);
                this.f385369q = -1;
            }
        }

        public final void a(int i12, int i13) {
            if (this.f385370r != -1 && this.f385371s != i12) {
                this.f385354b.setSpan(new ForegroundColorSpan(this.f385371s), this.f385370r, this.f385354b.length(), 33);
            }
            if (i12 != f385349w) {
                this.f385370r = this.f385354b.length();
                this.f385371s = i12;
            }
            if (this.f385372t != -1 && this.f385373u != i13) {
                this.f385354b.setSpan(new BackgroundColorSpan(this.f385373u), this.f385372t, this.f385354b.length(), 33);
            }
            if (i13 != f385350x) {
                this.f385372t = this.f385354b.length();
                this.f385373u = i13;
            }
        }

        public final void a(int i12) {
            if (this.f385374v != i12) {
                a('\n');
            }
            this.f385374v = i12;
        }

        public final void a() {
            int length = this.f385354b.length();
            if (length > 0) {
                this.f385354b.delete(length - 1, length);
            }
        }

        public final void a(char c12) {
            if (c12 == '\n') {
                this.f385353a.add(c());
                this.f385354b.clear();
                if (this.f385368p != -1) {
                    this.f385368p = 0;
                }
                if (this.f385369q != -1) {
                    this.f385369q = 0;
                }
                if (this.f385370r != -1) {
                    this.f385370r = 0;
                }
                if (this.f385372t != -1) {
                    this.f385372t = 0;
                }
                while (true) {
                    if ((!this.f385363k || this.f385353a.size() < this.f385362j) && this.f385353a.size() < 15) {
                        return;
                    } else {
                        this.f385353a.remove(0);
                    }
                }
            } else {
                this.f385354b.append(c12);
            }
        }

        public static int a(int i12, int i13, int i14, int i15) {
            db.a(i12, 4);
            db.a(i13, 4);
            db.a(i14, 4);
            db.a(i15, 4);
            return Color.argb(i15 != 2 ? i15 != 3 ? 255 : 0 : 127, i12 > 1 ? 255 : 0, i13 > 1 ? 255 : 0, i14 > 1 ? 255 : 0);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f385375a;

        /* renamed from: b, reason: collision with root package name */
        public final int f385376b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f385377c;

        /* renamed from: d, reason: collision with root package name */
        int f385378d = 0;

        public c(int i12, int i13) {
            this.f385375a = i12;
            this.f385376b = i13;
            this.f385377c = new byte[(i13 * 2) - 1];
        }
    }

    public fi(int i12, @j.P List<byte[]> list) {
        this.f385333j = i12 == -1 ? 1 : i12;
        if (list != null) {
            jk.a(list);
        }
        this.f385334k = new b[8];
        for (int i13 = 0; i13 < 8; i13++) {
            this.f385334k[i13] = new b();
        }
        this.f385335l = this.f385334k[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void i() {
        boolean z12;
        c cVar = this.f385338o;
        if (cVar == null) {
            return;
        }
        if (cVar.f385378d != (cVar.f385376b * 2) - 1) {
            StringBuilder sbA = Cif.a("DtvCcPacket ended prematurely; size is ");
            sbA.append((this.f385338o.f385376b * 2) - 1);
            sbA.append(", but current index is ");
            sbA.append(this.f385338o.f385378d);
            sbA.append(" (sequence number ");
            sbA.append(this.f385338o.f385375a);
            sbA.append(");");
            ka0.a("Cea708Decoder", sbA.toString());
        }
        or0 or0Var = this.f385331h;
        c cVar2 = this.f385338o;
        or0Var.a(cVar2.f385378d, cVar2.f385377c);
        boolean z13 = false;
        while (true) {
            if (this.f385331h.b() > 0) {
                int iB2 = this.f385331h.b(3);
                int iB3 = this.f385331h.b(5);
                if (iB2 == 7) {
                    this.f385331h.d(2);
                    iB2 = this.f385331h.b(6);
                    if (iB2 < 7) {
                        j90.a("Invalid extended service number: ", iB2, "Cea708Decoder");
                    }
                }
                if (iB3 == 0) {
                    if (iB2 != 0) {
                        ka0.d("Cea708Decoder", "serviceNumber is non-zero (" + iB2 + ") when blockSize is 0");
                    }
                } else if (iB2 != this.f385333j) {
                    this.f385331h.e(iB3);
                } else {
                    int iE2 = (iB3 * 8) + this.f385331h.e();
                    while (this.f385331h.e() < iE2) {
                        int iB4 = this.f385331h.b(8);
                        if (iB4 == 16) {
                            int iB5 = this.f385331h.b(8);
                            if (iB5 > 31) {
                                if (iB5 <= 127) {
                                    if (iB5 == 32) {
                                        this.f385335l.a(' ');
                                    } else if (iB5 == 33) {
                                        this.f385335l.a((char) 160);
                                    } else if (iB5 == 37) {
                                        this.f385335l.a((char) 8230);
                                    } else if (iB5 == 42) {
                                        this.f385335l.a((char) 352);
                                    } else if (iB5 == 44) {
                                        this.f385335l.a((char) 338);
                                    } else if (iB5 == 63) {
                                        this.f385335l.a((char) 376);
                                    } else if (iB5 == 57) {
                                        this.f385335l.a((char) 8482);
                                    } else if (iB5 == 58) {
                                        this.f385335l.a((char) 353);
                                    } else if (iB5 == 60) {
                                        this.f385335l.a((char) 339);
                                    } else if (iB5 != 61) {
                                        switch (iB5) {
                                            case 48:
                                                this.f385335l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f385335l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f385335l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f385335l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f385335l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f385335l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iB5) {
                                                    case 118:
                                                        this.f385335l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f385335l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f385335l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f385335l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f385335l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f385335l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f385335l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f385335l.a((char) 9472);
                                                        break;
                                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                        this.f385335l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f385335l.a((char) 9484);
                                                        break;
                                                    default:
                                                        j90.a("Invalid G2 character: ", iB5, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f385335l.a((char) 8480);
                                    }
                                } else if (iB5 <= 159) {
                                    if (iB5 <= 135) {
                                        this.f385331h.d(32);
                                    } else if (iB5 <= 143) {
                                        this.f385331h.d(40);
                                    } else if (iB5 <= 159) {
                                        this.f385331h.d(2);
                                        this.f385331h.d(this.f385331h.b(6) * 8);
                                    }
                                } else if (iB5 > 255) {
                                    j90.a("Invalid extended command: ", iB5, "Cea708Decoder");
                                } else if (iB5 == 160) {
                                    this.f385335l.a((char) 13252);
                                } else {
                                    j90.a("Invalid G3 character: ", iB5, "Cea708Decoder");
                                    this.f385335l.a('_');
                                }
                                z13 = true;
                            } else if (iB5 > 7) {
                                if (iB5 <= 15) {
                                    this.f385331h.d(8);
                                } else if (iB5 <= 23) {
                                    this.f385331h.d(16);
                                } else if (iB5 <= 31) {
                                    this.f385331h.d(24);
                                }
                            }
                        } else if (iB4 > 31) {
                            if (iB4 > 127) {
                                if (iB4 <= 159) {
                                    switch (iB4) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z12 = false;
                                            int i12 = iB4 - 128;
                                            if (this.f385339p != i12) {
                                                this.f385339p = i12;
                                                this.f385335l = this.f385334k[i12];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z12 = false;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (this.f385331h.f()) {
                                                    this.f385334k[8 - i13].d();
                                                }
                                            }
                                            break;
                                        case 137:
                                            z12 = false;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (this.f385331h.f()) {
                                                    this.f385334k[8 - i14].a(true);
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (this.f385331h.f()) {
                                                    this.f385334k[8 - i15].a(false);
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (this.f385331h.f()) {
                                                    this.f385334k[8 - i16].a(!r2.g());
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (this.f385331h.f()) {
                                                    this.f385334k[8 - i17].h();
                                                }
                                            }
                                            break;
                                        case 141:
                                            this.f385331h.d(8);
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            for (int i18 = 0; i18 < 8; i18++) {
                                                this.f385334k[i18].h();
                                            }
                                            break;
                                        case 144:
                                            if (this.f385335l.e()) {
                                                this.f385331h.b(4);
                                                this.f385331h.b(2);
                                                this.f385331h.b(2);
                                                boolean zF2 = this.f385331h.f();
                                                boolean zF3 = this.f385331h.f();
                                                this.f385331h.b(3);
                                                this.f385331h.b(3);
                                                this.f385335l.a(zF2, zF3);
                                                break;
                                            } else {
                                                this.f385331h.d(16);
                                                break;
                                            }
                                        case 145:
                                            if (this.f385335l.e()) {
                                                int iA2 = b.a(this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2));
                                                int iA3 = b.a(this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2));
                                                this.f385331h.d(2);
                                                b.a(this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2), 0);
                                                this.f385335l.a(iA2, iA3);
                                                break;
                                            } else {
                                                this.f385331h.d(24);
                                                break;
                                            }
                                        case 146:
                                            if (this.f385335l.e()) {
                                                this.f385331h.d(4);
                                                int iB6 = this.f385331h.b(4);
                                                this.f385331h.d(2);
                                                this.f385331h.b(6);
                                                this.f385335l.a(iB6);
                                                break;
                                            } else {
                                                this.f385331h.d(16);
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            j90.a("Invalid C1 command: ", iB4, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f385335l.e()) {
                                                int iA4 = b.a(this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2));
                                                this.f385331h.b(2);
                                                b.a(this.f385331h.b(2), this.f385331h.b(2), this.f385331h.b(2), 0);
                                                this.f385331h.f();
                                                this.f385331h.f();
                                                this.f385331h.b(2);
                                                this.f385331h.b(2);
                                                int iB7 = this.f385331h.b(2);
                                                this.f385331h.d(8);
                                                this.f385335l.b(iA4, iB7);
                                                break;
                                            } else {
                                                this.f385331h.d(32);
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i19 = iB4 - 152;
                                            b bVar = this.f385334k[i19];
                                            this.f385331h.d(2);
                                            boolean zF4 = this.f385331h.f();
                                            boolean zF5 = this.f385331h.f();
                                            this.f385331h.f();
                                            int iB8 = this.f385331h.b(3);
                                            boolean zF6 = this.f385331h.f();
                                            int iB9 = this.f385331h.b(7);
                                            int iB10 = this.f385331h.b(8);
                                            int iB11 = this.f385331h.b(4);
                                            int iB12 = this.f385331h.b(4);
                                            this.f385331h.d(2);
                                            this.f385331h.b(6);
                                            this.f385331h.d(2);
                                            bVar.a(zF4, zF5, iB8, zF6, iB9, iB10, iB12, iB11, this.f385331h.b(3), this.f385331h.b(3));
                                            if (this.f385339p != i19) {
                                                this.f385339p = i19;
                                                this.f385335l = this.f385334k[i19];
                                                break;
                                            }
                                            break;
                                    }
                                    z13 = true;
                                } else {
                                    z12 = false;
                                    if (iB4 <= 255) {
                                        this.f385335l.a((char) (iB4 & 255));
                                    } else {
                                        j90.a("Invalid base command: ", iB4, "Cea708Decoder");
                                    }
                                }
                                z13 = true;
                            } else if (iB4 == 127) {
                                this.f385335l.a((char) 9835);
                            } else {
                                this.f385335l.a((char) (iB4 & 255));
                            }
                            z13 = true;
                        } else if (iB4 != 0) {
                            if (iB4 == 3) {
                                this.f385336m = j();
                            } else if (iB4 != 8) {
                                switch (iB4) {
                                    case 12:
                                        for (int i22 = 0; i22 < 8; i22++) {
                                            this.f385334k[i22].h();
                                        }
                                        break;
                                    case 13:
                                        this.f385335l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iB4 < 17 || iB4 > 23) {
                                            if (iB4 < 24 || iB4 > 31) {
                                                j90.a("Invalid C0 command: ", iB4, "Cea708Decoder");
                                                break;
                                            } else {
                                                j90.a("Currently unsupported COMMAND_P16 Command: ", iB4, "Cea708Decoder");
                                                this.f385331h.d(16);
                                                break;
                                            }
                                        } else {
                                            j90.a("Currently unsupported COMMAND_EXT1 Command: ", iB4, "Cea708Decoder");
                                            this.f385331h.d(8);
                                            break;
                                        }
                                }
                            } else {
                                this.f385335l.a();
                            }
                        }
                    }
                }
            }
        }
        if (z13) {
            this.f385336m = j();
        }
        this.f385338o = null;
    }

    private List<vm> j() {
        a aVarB;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 8; i12++) {
            if (!this.f385334k[i12].f() && this.f385334k[i12].g() && (aVarB = this.f385334k[i12].b()) != null) {
                arrayList.add(aVarB);
            }
        }
        Collections.sort(arrayList, a.f385340c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList2.add(((a) arrayList.get(i13)).f385341a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.gi
    public final void b(x71 x71Var) {
        ByteBuffer byteBuffer = x71Var.f390951c;
        byteBuffer.getClass();
        this.f385330g.a(byteBuffer.limit(), byteBuffer.array());
        while (this.f385330g.a() >= 3) {
            int iT2 = this.f385330g.t();
            int i12 = iT2 & 3;
            Object[] objArr = (iT2 & 4) == 4;
            byte bT2 = (byte) this.f385330g.t();
            byte bT3 = (byte) this.f385330g.t();
            if (i12 == 2 || i12 == 3) {
                if (objArr != false) {
                    if (i12 == 3) {
                        i();
                        int i13 = (bT2 & 192) >> 6;
                        int i14 = this.f385332i;
                        if (i14 != -1 && i13 != (i14 + 1) % 4) {
                            for (int i15 = 0; i15 < 8; i15++) {
                                this.f385334k[i15].h();
                            }
                            StringBuilder sbA = Cif.a("Sequence number discontinuity. previous=");
                            sbA.append(this.f385332i);
                            sbA.append(" current=");
                            sbA.append(i13);
                            ka0.d("Cea708Decoder", sbA.toString());
                        }
                        this.f385332i = i13;
                        int i16 = bT2 & 63;
                        if (i16 == 0) {
                            i16 = 64;
                        }
                        c cVar = new c(i13, i16);
                        this.f385338o = cVar;
                        byte[] bArr = cVar.f385377c;
                        int i17 = cVar.f385378d;
                        cVar.f385378d = i17 + 1;
                        bArr[i17] = bT3;
                    } else {
                        db.a(i12 == 2);
                        c cVar2 = this.f385338o;
                        if (cVar2 == null) {
                            ka0.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f385377c;
                            int i18 = cVar2.f385378d;
                            bArr2[i18] = bT2;
                            cVar2.f385378d = i18 + 2;
                            bArr2[i18 + 1] = bT3;
                        }
                    }
                    c cVar3 = this.f385338o;
                    if (cVar3.f385378d == (cVar3.f385376b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gi
    public final t71 c() {
        List<vm> list = this.f385336m;
        this.f385337n = list;
        list.getClass();
        return new hi(list);
    }

    @Override // com.yandex.mobile.ads.impl.gi, com.yandex.mobile.ads.impl.sn
    public final void flush() {
        super.flush();
        this.f385336m = null;
        this.f385337n = null;
        this.f385339p = 0;
        this.f385335l = this.f385334k[0];
        for (int i12 = 0; i12 < 8; i12++) {
            this.f385334k[i12].h();
        }
        this.f385338o = null;
    }

    @Override // com.yandex.mobile.ads.impl.gi
    public final boolean h() {
        return this.f385336m != this.f385337n;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final /* bridge */ /* synthetic */ void release() {
    }
}
