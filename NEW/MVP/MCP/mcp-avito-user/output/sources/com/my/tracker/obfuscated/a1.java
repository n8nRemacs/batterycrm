package com.my.tracker.obfuscated;

import android.location.Location;
import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.C37834h;
import com.my.tracker.obfuscated.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class a1 implements h0.a {

    /* renamed from: a, reason: collision with root package name */
    protected final a f365377a;

    /* renamed from: b, reason: collision with root package name */
    protected final s f365378b;

    /* renamed from: c, reason: collision with root package name */
    protected final k f365379c;

    /* renamed from: d, reason: collision with root package name */
    protected final m f365380d;

    /* renamed from: e, reason: collision with root package name */
    protected final n f365381e;

    /* renamed from: f, reason: collision with root package name */
    protected final r f365382f;

    /* renamed from: g, reason: collision with root package name */
    protected final l f365383g;

    /* renamed from: h, reason: collision with root package name */
    final List<p> f365384h;

    /* renamed from: i, reason: collision with root package name */
    protected final ByteArrayOutputStream f365385i;

    /* renamed from: j, reason: collision with root package name */
    protected final ByteArrayOutputStream f365386j;

    /* renamed from: k, reason: collision with root package name */
    protected String f365387k;

    /* renamed from: l, reason: collision with root package name */
    byte[] f365388l;

    /* renamed from: m, reason: collision with root package name */
    protected Map<String, String> f365389m;

    /* renamed from: n, reason: collision with root package name */
    protected long f365390n;

    /* renamed from: o, reason: collision with root package name */
    protected long f365391o;

    /* renamed from: p, reason: collision with root package name */
    int f365392p;

    public static final class a extends p {

        /* renamed from: b, reason: collision with root package name */
        final C10793a f365393b;

        /* renamed from: c, reason: collision with root package name */
        String f365394c;

        /* renamed from: d, reason: collision with root package name */
        String f365395d;

        /* renamed from: e, reason: collision with root package name */
        String f365396e;

        /* renamed from: f, reason: collision with root package name */
        String f365397f;

        /* renamed from: com.my.tracker.obfuscated.a1$a$a, reason: collision with other inner class name */
        public static final class C10793a {

            /* renamed from: a, reason: collision with root package name */
            String f365398a;

            /* renamed from: b, reason: collision with root package name */
            long f365399b = -1;

            public void a(ByteArrayOutputStream byteArrayOutputStream) {
                c1.a(1, this.f365398a, byteArrayOutputStream);
                long j12 = this.f365399b;
                if (j12 != -1) {
                    c1.a(2, j12, (OutputStream) byteArrayOutputStream);
                }
            }
        }

        public a() {
            super(21);
            this.f365393b = new C10793a();
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f365393b.a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                c1.a(31, byteArrayOutputStream2, byteArrayOutputStream);
            }
            c1.a(1, this.f365394c, byteArrayOutputStream);
            c1.a(2, this.f365395d, byteArrayOutputStream);
            c1.a(3, this.f365396e, byteArrayOutputStream);
            c1.a(4, this.f365397f, byteArrayOutputStream);
        }
    }

    public static final class b extends i {

        /* renamed from: b, reason: collision with root package name */
        final int f365400b;

        /* renamed from: c, reason: collision with root package name */
        final int f365401c;

        /* renamed from: d, reason: collision with root package name */
        final int f365402d;

        /* renamed from: e, reason: collision with root package name */
        final int f365403e;

        /* renamed from: f, reason: collision with root package name */
        final int f365404f;

        /* renamed from: g, reason: collision with root package name */
        final int f365405g;

        /* renamed from: h, reason: collision with root package name */
        final int f365406h;

        /* renamed from: i, reason: collision with root package name */
        final int f365407i;

        /* renamed from: j, reason: collision with root package name */
        final int f365408j;

        /* renamed from: k, reason: collision with root package name */
        final int f365409k;

        /* renamed from: l, reason: collision with root package name */
        final int f365410l;

        /* renamed from: m, reason: collision with root package name */
        final int f365411m;

        public b(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25) {
            super(32);
            this.f365400b = i12;
            this.f365401c = i13;
            this.f365402d = i14;
            this.f365403e = i15;
            this.f365404f = i16;
            this.f365405g = i17;
            this.f365406h = i18;
            this.f365407i = i19;
            this.f365408j = i22;
            this.f365409k = i23;
            this.f365410l = i24;
            this.f365411m = i25;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            i.a(1, this.f365400b, (OutputStream) byteArrayOutputStream);
            i.a(2, this.f365401c, (OutputStream) byteArrayOutputStream);
            i.a(3, this.f365402d, (OutputStream) byteArrayOutputStream);
            i.a(4, this.f365403e, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365404f, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365405g, (OutputStream) byteArrayOutputStream);
            i.a(7, this.f365406h, (OutputStream) byteArrayOutputStream);
            i.a(8, this.f365407i, (OutputStream) byteArrayOutputStream);
            i.a(9, this.f365408j, (OutputStream) byteArrayOutputStream);
            i.a(10, this.f365409k, (OutputStream) byteArrayOutputStream);
            i.a(11, this.f365410l, (OutputStream) byteArrayOutputStream);
            i.a(12, this.f365411m, (OutputStream) byteArrayOutputStream);
        }
    }

    public static final class c extends e {

        /* renamed from: g, reason: collision with root package name */
        final int f365412g;

        /* renamed from: h, reason: collision with root package name */
        final int f365413h;

        /* renamed from: i, reason: collision with root package name */
        final int f365414i;

        /* renamed from: j, reason: collision with root package name */
        final int f365415j;

        /* renamed from: k, reason: collision with root package name */
        final int f365416k;

        public c(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            super(33, str, str2, i16, i17, i18);
            this.f365412g = i12;
            this.f365413h = i13;
            this.f365414i = i14;
            this.f365415j = i15;
            this.f365416k = i19;
        }

        @Override // com.my.tracker.obfuscated.a1.e, com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.a(byteArrayOutputStream, byteArrayOutputStream2);
            i.a(3, this.f365412g, (OutputStream) byteArrayOutputStream);
            i.a(4, this.f365413h, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365414i, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365415j, (OutputStream) byteArrayOutputStream);
            i.a(10, this.f365416k, (OutputStream) byteArrayOutputStream);
        }
    }

    public static final class d extends e {

        /* renamed from: g, reason: collision with root package name */
        final int f365417g;

        /* renamed from: h, reason: collision with root package name */
        final int f365418h;

        /* renamed from: i, reason: collision with root package name */
        final int f365419i;

        /* renamed from: j, reason: collision with root package name */
        final int f365420j;

        /* renamed from: k, reason: collision with root package name */
        final int f365421k;

        public d(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            super(34, str, str2, i16, i17, i18);
            this.f365417g = i12;
            this.f365418h = i13;
            this.f365419i = i14;
            this.f365420j = i15;
            this.f365421k = i19;
        }

        @Override // com.my.tracker.obfuscated.a1.e, com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.a(byteArrayOutputStream, byteArrayOutputStream2);
            i.a(3, this.f365417g, (OutputStream) byteArrayOutputStream);
            i.a(4, this.f365418h, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365419i, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365420j, (OutputStream) byteArrayOutputStream);
            i.a(10, this.f365421k, (OutputStream) byteArrayOutputStream);
        }
    }

    public static abstract class e extends i {

        /* renamed from: b, reason: collision with root package name */
        final String f365422b;

        /* renamed from: c, reason: collision with root package name */
        final String f365423c;

        /* renamed from: d, reason: collision with root package name */
        final int f365424d;

        /* renamed from: e, reason: collision with root package name */
        final int f365425e;

        /* renamed from: f, reason: collision with root package name */
        final int f365426f;

        public e(int i12, String str, String str2, int i13, int i14, int i15) {
            super(i12);
            this.f365422b = str;
            this.f365423c = str2;
            this.f365424d = i13;
            this.f365425e = i14;
            this.f365426f = i15;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            c1.a(1, this.f365422b, byteArrayOutputStream);
            c1.a(2, this.f365423c, byteArrayOutputStream);
            i.a(7, this.f365424d, (OutputStream) byteArrayOutputStream);
            i.a(8, this.f365425e, (OutputStream) byteArrayOutputStream);
            i.a(9, this.f365426f, (OutputStream) byteArrayOutputStream);
        }
    }

    public static final class f extends e {

        /* renamed from: g, reason: collision with root package name */
        final long f365427g;

        /* renamed from: h, reason: collision with root package name */
        final int f365428h;

        /* renamed from: i, reason: collision with root package name */
        final int f365429i;

        /* renamed from: j, reason: collision with root package name */
        final int f365430j;

        public f(String str, String str2, long j12, int i12, int i13, int i14, int i15, int i16, int i17) {
            super(37, str, str2, i15, i16, i17);
            this.f365427g = j12;
            this.f365428h = i12;
            this.f365429i = i13;
            this.f365430j = i14;
        }

        @Override // com.my.tracker.obfuscated.a1.e, com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.a(byteArrayOutputStream, byteArrayOutputStream2);
            i.a(3, this.f365427g, byteArrayOutputStream);
            i.a(4, this.f365428h, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365429i, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365430j, (OutputStream) byteArrayOutputStream);
        }
    }

    public static final class g extends e {

        /* renamed from: g, reason: collision with root package name */
        final int f365431g;

        /* renamed from: h, reason: collision with root package name */
        final int f365432h;

        /* renamed from: i, reason: collision with root package name */
        final int f365433i;

        /* renamed from: j, reason: collision with root package name */
        final int f365434j;

        public g(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            super(36, str, str2, i16, i17, i18);
            this.f365431g = i12;
            this.f365432h = i13;
            this.f365433i = i14;
            this.f365434j = i15;
        }

        @Override // com.my.tracker.obfuscated.a1.e, com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.a(byteArrayOutputStream, byteArrayOutputStream2);
            i.a(3, this.f365431g, (OutputStream) byteArrayOutputStream);
            i.a(4, this.f365432h, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365433i, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365434j, (OutputStream) byteArrayOutputStream);
        }
    }

    public static final class h extends e {

        /* renamed from: g, reason: collision with root package name */
        final int f365435g;

        /* renamed from: h, reason: collision with root package name */
        final int f365436h;

        /* renamed from: i, reason: collision with root package name */
        final int f365437i;

        /* renamed from: j, reason: collision with root package name */
        final int f365438j;

        public h(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            super(35, str, str2, i16, i17, i18);
            this.f365435g = i12;
            this.f365436h = i13;
            this.f365437i = i14;
            this.f365438j = i15;
        }

        @Override // com.my.tracker.obfuscated.a1.e, com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.a(byteArrayOutputStream, byteArrayOutputStream2);
            i.a(3, this.f365435g, (OutputStream) byteArrayOutputStream);
            i.a(4, this.f365436h, (OutputStream) byteArrayOutputStream);
            i.a(5, this.f365437i, (OutputStream) byteArrayOutputStream);
            i.a(6, this.f365438j, (OutputStream) byteArrayOutputStream);
        }
    }

    public static abstract class i extends p {
        public i(int i12) {
            super(i12);
        }

        public static void a(int i12, int i13, OutputStream outputStream) {
            if (C37847v.a(i13)) {
                c1.b(i12, i13, outputStream);
            }
        }

        public static void a(int i12, long j12, OutputStream outputStream) {
            if (C37847v.a(j12)) {
                c1.a(i12, j12, outputStream);
            }
        }
    }

    public static final class j extends p {

        /* renamed from: b, reason: collision with root package name */
        final String f365439b;

        /* renamed from: c, reason: collision with root package name */
        final String f365440c;

        /* renamed from: d, reason: collision with root package name */
        final int f365441d;

        /* renamed from: e, reason: collision with root package name */
        final int f365442e;

        /* renamed from: f, reason: collision with root package name */
        final int f365443f;

        public j(String str, String str2, int i12, int i13, int i14) {
            super(28);
            this.f365439b = str;
            this.f365440c = str2;
            this.f365441d = i12;
            this.f365442e = i13;
            this.f365443f = i14;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            c1.a(1, this.f365440c, byteArrayOutputStream);
            c1.a(2, this.f365439b, byteArrayOutputStream);
            c1.b(3, this.f365441d, byteArrayOutputStream);
            c1.b(5, this.f365442e, byteArrayOutputStream);
            c1.b(6, this.f365443f, byteArrayOutputStream);
        }
    }

    public static final class k extends p {

        /* renamed from: b, reason: collision with root package name */
        final a f365444b;

        /* renamed from: c, reason: collision with root package name */
        int f365445c;

        /* renamed from: d, reason: collision with root package name */
        String f365446d;

        /* renamed from: e, reason: collision with root package name */
        String f365447e;

        /* renamed from: f, reason: collision with root package name */
        String f365448f;

        /* renamed from: g, reason: collision with root package name */
        String f365449g;

        /* renamed from: h, reason: collision with root package name */
        String f365450h;

        /* renamed from: i, reason: collision with root package name */
        String f365451i;

        /* renamed from: j, reason: collision with root package name */
        String f365452j;

        /* renamed from: k, reason: collision with root package name */
        int f365453k;

        /* renamed from: l, reason: collision with root package name */
        int f365454l;

        /* renamed from: m, reason: collision with root package name */
        int f365455m;

        /* renamed from: n, reason: collision with root package name */
        int f365456n;

        /* renamed from: o, reason: collision with root package name */
        float f365457o;

        /* renamed from: p, reason: collision with root package name */
        float f365458p;

        /* renamed from: q, reason: collision with root package name */
        float f365459q;

        /* renamed from: r, reason: collision with root package name */
        String f365460r;

        /* renamed from: s, reason: collision with root package name */
        int f365461s;

        /* renamed from: t, reason: collision with root package name */
        int f365462t;

        /* renamed from: u, reason: collision with root package name */
        long f365463u;

        /* renamed from: v, reason: collision with root package name */
        long f365464v;

        /* renamed from: w, reason: collision with root package name */
        int f365465w;

        /* renamed from: x, reason: collision with root package name */
        int f365466x;

        /* renamed from: y, reason: collision with root package name */
        String f365467y;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f365468a;

            /* renamed from: b, reason: collision with root package name */
            String f365469b;

            /* renamed from: d, reason: collision with root package name */
            String f365471d;

            /* renamed from: c, reason: collision with root package name */
            int f365470c = -1;

            /* renamed from: e, reason: collision with root package name */
            int f365472e = -1;

            public void a(ByteArrayOutputStream byteArrayOutputStream) {
                c1.a(1, this.f365468a, byteArrayOutputStream);
                c1.a(2, this.f365469b, byteArrayOutputStream);
                int i12 = this.f365470c;
                if (i12 != -1) {
                    c1.b(3, i12, byteArrayOutputStream);
                }
                c1.a(4, this.f365471d, byteArrayOutputStream);
                int i13 = this.f365472e;
                if (i13 != -1) {
                    c1.b(5, i13, byteArrayOutputStream);
                }
            }
        }

        public k() {
            super(23);
            this.f365444b = new a();
            this.f365445c = -1;
            this.f365453k = -1;
            this.f365454l = -1;
            this.f365455m = -1;
            this.f365456n = -1;
            this.f365457o = Float.NaN;
            this.f365458p = Float.NaN;
            this.f365459q = Float.NaN;
            this.f365461s = -1;
            this.f365462t = -1;
            this.f365463u = -1L;
            this.f365464v = -1L;
            this.f365465w = -1;
            this.f365466x = -1;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f365444b.a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                c1.a(31, byteArrayOutputStream2, byteArrayOutputStream);
            }
            int i12 = this.f365445c;
            if (i12 != -1) {
                c1.b(1, i12, byteArrayOutputStream);
            }
            c1.a(2, this.f365446d, byteArrayOutputStream);
            c1.a(3, this.f365447e, byteArrayOutputStream);
            c1.a(4, this.f365448f, byteArrayOutputStream);
            c1.a(5, this.f365449g, byteArrayOutputStream);
            c1.a(6, this.f365450h, byteArrayOutputStream);
            c1.a(7, this.f365451i, byteArrayOutputStream);
            c1.a(8, this.f365452j, byteArrayOutputStream);
            int i13 = this.f365453k;
            if (i13 != -1) {
                c1.b(9, i13, byteArrayOutputStream);
            }
            int i14 = this.f365454l;
            if (i14 > -1) {
                c1.b(10, i14, byteArrayOutputStream);
            }
            int i15 = this.f365455m;
            if (i15 > -1) {
                c1.b(11, i15, byteArrayOutputStream);
            }
            int i16 = this.f365456n;
            if (i16 > -1) {
                c1.b(12, i16, byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f365457o)) {
                c1.a(13, this.f365457o, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f365458p)) {
                c1.a(14, this.f365458p, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f365459q)) {
                c1.a(15, this.f365459q, (OutputStream) byteArrayOutputStream);
            }
            c1.a(16, this.f365460r, byteArrayOutputStream);
            int i17 = this.f365461s;
            if (i17 > -1) {
                c1.b(17, i17, byteArrayOutputStream);
            }
            int i18 = this.f365462t;
            if (i18 > -1) {
                c1.b(18, i18, byteArrayOutputStream);
            }
            long j12 = this.f365463u;
            if (j12 > -1) {
                c1.a(19, j12, (OutputStream) byteArrayOutputStream);
            }
            long j13 = this.f365464v;
            if (j13 > -1) {
                c1.a(20, j13, (OutputStream) byteArrayOutputStream);
            }
            int i19 = this.f365465w;
            if (i19 != -1) {
                c1.b(23, i19, byteArrayOutputStream);
            }
            int i22 = this.f365466x;
            if (i22 > -1) {
                c1.b(24, i22, byteArrayOutputStream);
            }
            c1.a(25, this.f365467y, byteArrayOutputStream);
        }
    }

    public static final class l extends p {

        /* renamed from: b, reason: collision with root package name */
        int f365473b;

        /* renamed from: c, reason: collision with root package name */
        double f365474c;

        /* renamed from: d, reason: collision with root package name */
        double f365475d;

        /* renamed from: e, reason: collision with root package name */
        double f365476e;

        /* renamed from: f, reason: collision with root package name */
        double f365477f;

        /* renamed from: g, reason: collision with root package name */
        long f365478g;

        public l() {
            super(26);
            this.f365473b = -1;
            this.f365474c = Double.NaN;
            this.f365475d = Double.NaN;
            this.f365476e = Double.NaN;
            this.f365477f = Double.NaN;
            this.f365478g = -1L;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            if (!Double.isNaN(this.f365474c)) {
                c1.a(1, this.f365474c, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f365475d)) {
                c1.a(2, this.f365475d, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f365476e)) {
                c1.a(3, this.f365476e, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f365477f)) {
                c1.a(4, this.f365477f, byteArrayOutputStream);
            }
            long j12 = this.f365478g;
            if (j12 > -1) {
                c1.a(5, j12, (OutputStream) byteArrayOutputStream);
            }
            int i12 = this.f365473b;
            if (i12 != -1) {
                c1.b(6, i12, byteArrayOutputStream);
            }
        }
    }

    public static final class m extends p {

        /* renamed from: b, reason: collision with root package name */
        String f365479b;

        /* renamed from: c, reason: collision with root package name */
        String f365480c;

        /* renamed from: d, reason: collision with root package name */
        String f365481d;

        public m() {
            super(24);
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            c1.a(1, this.f365479b, byteArrayOutputStream);
            c1.a(2, this.f365480c, byteArrayOutputStream);
            c1.a(3, this.f365481d, byteArrayOutputStream);
        }
    }

    public static final class n extends p {

        /* renamed from: b, reason: collision with root package name */
        int f365482b;

        /* renamed from: c, reason: collision with root package name */
        int f365483c;

        /* renamed from: d, reason: collision with root package name */
        String f365484d;

        /* renamed from: e, reason: collision with root package name */
        String f365485e;

        /* renamed from: f, reason: collision with root package name */
        String f365486f;

        /* renamed from: g, reason: collision with root package name */
        String f365487g;

        /* renamed from: h, reason: collision with root package name */
        String f365488h;

        /* renamed from: i, reason: collision with root package name */
        byte[] f365489i;

        public n() {
            super(25);
            this.f365482b = -1;
            this.f365483c = -1;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i12 = this.f365482b;
            if (i12 != -1) {
                c1.b(1, i12, byteArrayOutputStream);
            }
            int i13 = this.f365483c;
            if (i13 != -1) {
                c1.b(7, i13, byteArrayOutputStream);
            }
            c1.a(2, this.f365484d, byteArrayOutputStream);
            c1.a(3, this.f365485e, byteArrayOutputStream);
            c1.a(4, this.f365486f, byteArrayOutputStream);
            c1.a(5, this.f365487g, byteArrayOutputStream);
            c1.a(6, this.f365488h, byteArrayOutputStream);
            c1.a(8, this.f365489i, byteArrayOutputStream);
        }
    }

    public static final class o extends p {

        /* renamed from: b, reason: collision with root package name */
        final C37834h.a f365490b;

        public o(C37834h.a aVar) {
            super(31);
            this.f365490b = aVar;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            c1.a(1, this.f365490b.f365653a, byteArrayOutputStream);
            c1.a(2, this.f365490b.f365654b, (OutputStream) byteArrayOutputStream);
        }
    }

    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        final int f365491a;

        public p(int i12) {
            this.f365491a = i12;
        }

        public abstract void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2);

        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, OutputStream outputStream) {
            a(byteArrayOutputStream, byteArrayOutputStream2);
            if (byteArrayOutputStream.size() <= 0) {
                return;
            }
            c1.a(this.f365491a, byteArrayOutputStream, outputStream);
        }
    }

    public static abstract class q extends p {
        public q() {
            super(-1);
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public final void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, OutputStream outputStream) throws IOException {
            a(byteArrayOutputStream, byteArrayOutputStream2);
            outputStream.write(byteArrayOutputStream.toByteArray());
        }
    }

    public static final class r extends p {

        /* renamed from: b, reason: collision with root package name */
        int f365492b;

        /* renamed from: c, reason: collision with root package name */
        int f365493c;

        /* renamed from: d, reason: collision with root package name */
        int f365494d;

        /* renamed from: e, reason: collision with root package name */
        int f365495e;

        /* renamed from: f, reason: collision with root package name */
        int f365496f;

        /* renamed from: g, reason: collision with root package name */
        int f365497g;

        /* renamed from: h, reason: collision with root package name */
        int f365498h;

        /* renamed from: i, reason: collision with root package name */
        int f365499i;

        /* renamed from: j, reason: collision with root package name */
        int f365500j;

        /* renamed from: k, reason: collision with root package name */
        int f365501k;

        /* renamed from: l, reason: collision with root package name */
        int f365502l;

        /* renamed from: m, reason: collision with root package name */
        int f365503m;

        /* renamed from: n, reason: collision with root package name */
        int f365504n;

        /* renamed from: o, reason: collision with root package name */
        int f365505o;

        public r() {
            super(27);
            this.f365492b = -1;
            this.f365493c = -1;
            this.f365494d = -1;
            this.f365495e = -1;
            this.f365496f = -1;
            this.f365497g = -1;
            this.f365498h = -1;
            this.f365499i = -1;
            this.f365500j = -1;
            this.f365501k = -1;
            this.f365502l = -1;
            this.f365503m = -1;
            this.f365504n = -1;
            this.f365505o = -1;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i12 = this.f365492b;
            if (i12 > -1) {
                c1.b(1, i12, byteArrayOutputStream);
            }
            int i13 = this.f365493c;
            if (i13 != -1) {
                c1.b(2, i13, byteArrayOutputStream);
            }
            int i14 = this.f365494d;
            if (i14 != -1) {
                c1.b(3, i14, byteArrayOutputStream);
            }
            int i15 = this.f365495e;
            if (i15 != -1) {
                c1.b(4, i15, byteArrayOutputStream);
            }
            int i16 = this.f365496f;
            if (i16 > -1) {
                c1.b(5, i16, byteArrayOutputStream);
            }
            int i17 = this.f365497g;
            if (i17 > -1) {
                c1.b(6, i17, byteArrayOutputStream);
            }
            int i18 = this.f365498h;
            if (i18 != -1) {
                c1.b(7, i18, byteArrayOutputStream);
            }
            int i19 = this.f365499i;
            if (i19 != -1) {
                c1.b(8, i19, byteArrayOutputStream);
            }
            int i22 = this.f365500j;
            if (i22 != -1) {
                c1.b(9, i22, byteArrayOutputStream);
            }
            int i23 = this.f365501k;
            if (i23 != -1) {
                c1.b(11, i23, byteArrayOutputStream);
            }
            int i24 = this.f365502l;
            if (i24 != -1) {
                c1.b(12, i24, byteArrayOutputStream);
            }
            int i25 = this.f365503m;
            if (i25 != -1) {
                c1.b(13, i25, byteArrayOutputStream);
            }
            int i26 = this.f365504n;
            if (i26 != -1) {
                c1.b(14, i26, byteArrayOutputStream);
            }
            int i27 = this.f365505o;
            if (i27 != -1) {
                c1.b(15, i27, byteArrayOutputStream);
            }
        }
    }

    public static final class s extends p {

        /* renamed from: b, reason: collision with root package name */
        int f365506b;

        /* renamed from: c, reason: collision with root package name */
        int f365507c;

        /* renamed from: d, reason: collision with root package name */
        String[] f365508d;

        /* renamed from: e, reason: collision with root package name */
        String[] f365509e;

        /* renamed from: f, reason: collision with root package name */
        String[] f365510f;

        /* renamed from: g, reason: collision with root package name */
        String[] f365511g;

        /* renamed from: h, reason: collision with root package name */
        String[] f365512h;

        /* renamed from: i, reason: collision with root package name */
        String[] f365513i;

        /* renamed from: j, reason: collision with root package name */
        String[] f365514j;

        public s() {
            super(22);
            this.f365506b = -1;
            this.f365507c = -1;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i12 = this.f365506b;
            if (i12 != -1) {
                c1.b(1, i12, byteArrayOutputStream);
            }
            int i13 = this.f365507c;
            if (i13 > -1) {
                c1.b(2, i13, byteArrayOutputStream);
            }
            c1.a(3, this.f365508d, byteArrayOutputStream);
            c1.a(4, this.f365509e, byteArrayOutputStream);
            c1.a(5, this.f365510f, byteArrayOutputStream);
            c1.a(6, this.f365511g, byteArrayOutputStream);
            c1.a(7, this.f365512h, byteArrayOutputStream);
            c1.a(8, this.f365513i, byteArrayOutputStream);
            c1.a(9, this.f365514j, byteArrayOutputStream);
        }
    }

    public static final class t extends p {

        /* renamed from: b, reason: collision with root package name */
        final String f365515b;

        /* renamed from: c, reason: collision with root package name */
        final String f365516c;

        /* renamed from: d, reason: collision with root package name */
        final int f365517d;

        public t(String str, String str2, int i12) {
            super(29);
            this.f365515b = str;
            this.f365516c = str2;
            this.f365517d = i12;
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            c1.a(1, this.f365516c, byteArrayOutputStream);
            c1.a(2, this.f365515b, byteArrayOutputStream);
            c1.b(3, this.f365517d, byteArrayOutputStream);
        }
    }

    public a1(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        a aVar = new a();
        this.f365377a = aVar;
        s sVar = new s();
        this.f365378b = sVar;
        k kVar = new k();
        this.f365379c = kVar;
        m mVar = new m();
        this.f365380d = mVar;
        n nVar = new n();
        this.f365381e = nVar;
        r rVar = new r();
        this.f365382f = rVar;
        l lVar = new l();
        this.f365383g = lVar;
        this.f365384h = C37838l.a(aVar, sVar, kVar, mVar, nVar, rVar, lVar);
        this.f365390n = -1L;
        this.f365391o = -1L;
        this.f365392p = -1;
        this.f365385i = byteArrayOutputStream;
        this.f365386j = byteArrayOutputStream2;
    }

    public static a1 a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        return new a1(byteArrayOutputStream, byteArrayOutputStream2);
    }

    public void b() {
        this.f365382f.f365498h = 0;
    }

    public void c() {
        this.f365382f.f365503m = 0;
    }

    public void d() {
        this.f365382f.f365501k = 0;
    }

    public void e() {
        this.f365382f.f365502l = 0;
    }

    public void f() {
        this.f365382f.f365499i = 0;
    }

    public void g() {
        this.f365382f.f365500j = 0;
    }

    public void h() {
        this.f365382f.f365504n = 0;
    }

    public void i() {
        this.f365382f.f365505o = 0;
    }

    public void j() {
        this.f365382f.f365494d = 0;
    }

    public void k() {
        this.f365382f.f365495e = 0;
    }

    public void l() {
        this.f365382f.f365493c = 0;
    }

    public void m(int i12) {
        if (i12 == 1) {
            this.f365379c.f365453k = i12;
        }
    }

    public void n(int i12) {
        this.f365379c.f365465w = i12;
    }

    public void o(int i12) {
        this.f365379c.f365466x = i12;
    }

    public void p(int i12) {
        this.f365379c.f365454l = i12;
    }

    public void q(String str) {
        this.f365379c.f365446d = str;
    }

    public void r(String str) {
        this.f365381e.f365486f = str;
    }

    public void s(String str) {
        this.f365381e.f365487g = str;
    }

    public void t(String str) {
        this.f365381e.f365485e = str;
    }

    public void u(String str) {
        this.f365381e.f365488h = str;
    }

    public void v(String str) {
        this.f365379c.f365448f = str;
    }

    @Override // com.my.tracker.obfuscated.h0.a
    public String a() {
        return "application/octet-stream";
    }

    public void b(float f12) {
        this.f365379c.f365457o = f12;
    }

    public void c(float f12) {
        this.f365379c.f365458p = f12;
    }

    public void d(int i12) {
        this.f365378b.f365507c = i12;
    }

    public void e(int i12) {
        this.f365379c.f365462t = i12;
    }

    public void f(int i12) {
        this.f365379c.f365461s = i12;
    }

    public void g(int i12) {
        this.f365381e.f365483c = i12;
    }

    public void h(int i12) {
        this.f365392p = i12;
    }

    public void i(int i12) {
        this.f365379c.f365456n = i12;
    }

    public void j(int i12) {
        this.f365378b.f365506b = i12;
    }

    public void k(int i12) {
        this.f365379c.f365455m = i12;
    }

    public void l(int i12) {
        this.f365379c.f365445c = i12;
    }

    public void m(String str) {
        this.f365380d.f365479b = str;
    }

    public void n(String str) {
        this.f365380d.f365480c = str;
    }

    public void o(String str) {
        this.f365380d.f365481d = str;
    }

    public void p(String str) {
        this.f365379c.f365447e = str;
    }

    public void a(float f12) {
        this.f365379c.f365459q = f12;
    }

    public void b(int i12) {
        this.f365382f.f365497g = i12;
    }

    public void c(int i12) {
        this.f365382f.f365492b = i12;
    }

    public void d(long j12) {
        this.f365391o = j12;
    }

    public void e(String str) {
        this.f365377a.f365397f = str;
    }

    public void f(String str) {
        this.f365377a.f365394c = str;
    }

    public void g(String str) {
        this.f365379c.f365450h = str;
    }

    public void h(String str) {
        this.f365379c.f365451i = str;
    }

    public void i(String str) {
        this.f365379c.f365467y = str;
    }

    public void j(String str) {
        this.f365379c.f365449g = str;
    }

    public void k(String str) {
        this.f365379c.f365460r = str;
    }

    public void l(String str) {
        this.f365379c.f365452j = str;
    }

    public void a(int i12) {
        this.f365382f.f365496f = i12;
    }

    public void b(long j12) {
        this.f365379c.f365463u = j12;
    }

    public void c(long j12) {
        this.f365390n = j12;
    }

    public void d(String str) {
        this.f365377a.f365396e = str;
    }

    public void e(String[] strArr) {
        this.f365378b.f365513i = strArr;
    }

    public void f(String[] strArr) {
        this.f365378b.f365514j = strArr;
    }

    public void g(String[] strArr) {
        this.f365378b.f365509e = strArr;
    }

    public void a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25) {
        this.f365384h.add(new b(i12, i13, i14, i15, i16, i17, i18, i19, i22, i23, i24, i25));
    }

    public void b(String str) {
        this.f365377a.f365395d = str;
    }

    public void c(String str) {
        this.f365387k = str;
    }

    public void d(String[] strArr) {
        this.f365378b.f365508d = strArr;
    }

    public void a(int i12, String str) {
        n nVar = this.f365381e;
        nVar.f365482b = i12;
        nVar.f365484d = str;
    }

    public void b(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f365384h.add(new h(str, str2, i12, i13, i14, i15, i16, i17, i18));
    }

    public void c(String[] strArr) {
        this.f365378b.f365511g = strArr;
    }

    public void a(long j12) {
        this.f365379c.f365464v = j12;
    }

    public void b(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f365384h.add(new d(str, str2, i12, i13, i14, i15, i16, i17, i18, i19));
    }

    public void a(Location location, int i12) {
        this.f365383g.f365475d = location.getLongitude();
        this.f365383g.f365474c = location.getLatitude();
        this.f365383g.f365477f = location.getAccuracy();
        this.f365383g.f365476e = location.getSpeed();
        this.f365383g.f365478g = c2.b(location.getTime());
        this.f365383g.f365473b = i12;
    }

    public void b(String str, boolean z12) {
        k.a aVar = this.f365379c.f365444b;
        aVar.f365471d = str;
        aVar.f365472e = z12 ? 1 : 0;
    }

    @Override // com.my.tracker.obfuscated.h0.a
    public void a(OutputStream outputStream) throws IOException {
        c1.a(1, MyTracker.VERSION, outputStream);
        c1.a(2, this.f365387k, outputStream);
        long j12 = this.f365390n;
        if (j12 > -1) {
            c1.a(3, j12, outputStream);
        }
        long j13 = this.f365391o;
        if (j13 > -1) {
            c1.a(4, j13, outputStream);
        }
        int i12 = this.f365392p;
        if (i12 > -1) {
            c1.b(5, i12, outputStream);
        }
        byte[] bArr = this.f365388l;
        if (bArr != null) {
            outputStream.write(bArr);
        }
        Map<String, String> map = this.f365389m;
        if (map != null && !map.isEmpty()) {
            String str = this.f365389m.get("android_id");
            if (str != null) {
                a(str);
            }
            String str2 = this.f365389m.get("mac");
            if (str2 != null) {
                k(str2);
            }
            m0.a(43, this.f365389m, this.f365385i, outputStream);
        }
        for (p pVar : this.f365384h) {
            this.f365385i.reset();
            this.f365386j.reset();
            pVar.a(this.f365385i, this.f365386j, outputStream);
        }
    }

    public void b(byte[] bArr) {
        this.f365381e.f365489i = bArr;
    }

    public void a(String str) {
        this.f365379c.f365444b.f365468a = str;
    }

    public void b(String[] strArr) {
        this.f365378b.f365510f = strArr;
    }

    public void a(String str, int i12) {
        a.C10793a c10793a = this.f365377a.f365393b;
        c10793a.f365398a = str;
        c10793a.f365399b = i12;
    }

    public void a(String str, String str2, int i12) {
        this.f365384h.add(new t(str, str2, i12));
    }

    public void a(String str, String str2, int i12, int i13, int i14) {
        this.f365384h.add(new j(str, str2, i12, i13, i14));
    }

    public void a(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f365384h.add(new g(str, str2, i12, i13, i14, i15, i16, i17, i18));
    }

    public void a(String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f365384h.add(new c(str, str2, i12, i13, i14, i15, i16, i17, i18, i19));
    }

    public void a(String str, String str2, long j12, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f365384h.add(new f(str, str2, j12, i12, i13, i14, i15, i16, i17));
    }

    public void a(String str, boolean z12) {
        k.a aVar = this.f365379c.f365444b;
        aVar.f365469b = str;
        aVar.f365470c = z12 ? 1 : 0;
    }

    public void a(List<C37834h.a> list) {
        Iterator<C37834h.a> it = list.iterator();
        while (it.hasNext()) {
            this.f365384h.add(new o(it.next()));
        }
    }

    public void a(Map<String, String> map) {
        this.f365389m = map;
    }

    public void a(byte[] bArr) {
        this.f365388l = bArr;
    }

    public void a(String[] strArr) {
        this.f365378b.f365512h = strArr;
    }
}
