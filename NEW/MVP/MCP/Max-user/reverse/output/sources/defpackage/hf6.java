package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class hf6 {
    public static final String A0;
    public static final hf6 Q = new hf6(new ff6());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final gf3 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final wg7 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final ty9 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final y45 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public hf6(ff6 ff6Var) throws MissingResourceException {
        boolean z;
        String str;
        this.a = ff6Var.a;
        String strV = zxg.V(ff6Var.d);
        this.d = strV;
        if (ff6Var.c.isEmpty() && ff6Var.b != null) {
            this.c = wg7.m(new r08(strV, ff6Var.b));
            this.b = ff6Var.b;
        } else if (!ff6Var.c.isEmpty() && ff6Var.b == null) {
            wg7 wg7Var = ff6Var.c;
            this.c = wg7Var;
            Iterator it = wg7Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((r08) wg7Var.get(0)).b;
                    break;
                }
                r08 r08Var = (r08) it.next();
                if (TextUtils.equals(r08Var.a, strV)) {
                    str = r08Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (ff6Var.c.isEmpty() && ff6Var.b == null) {
            z = true;
            hsi.g(z);
            this.c = ff6Var.c;
            this.b = ff6Var.b;
        } else {
            for (int i = 0; i < ff6Var.c.size(); i++) {
                if (((r08) ff6Var.c.get(i)).b.equals(ff6Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            hsi.g(z);
            this.c = ff6Var.c;
            this.b = ff6Var.b;
        }
        this.e = ff6Var.e;
        hsi.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", ff6Var.g == 0 || (ff6Var.f & 32768) != 0);
        this.f = ff6Var.f;
        this.g = ff6Var.g;
        int i2 = ff6Var.h;
        this.h = i2;
        int i3 = ff6Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = ff6Var.j;
        this.l = ff6Var.k;
        this.m = ff6Var.l;
        this.n = ff6Var.m;
        this.o = ff6Var.n;
        this.p = ff6Var.o;
        List list = ff6Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        y45 y45Var = ff6Var.q;
        this.r = y45Var;
        this.s = ff6Var.r;
        this.t = ff6Var.s;
        this.u = ff6Var.t;
        this.v = ff6Var.u;
        this.w = ff6Var.v;
        this.x = ff6Var.w;
        this.y = ff6Var.x;
        int i4 = ff6Var.y;
        this.z = i4 == -1 ? 0 : i4;
        float f = ff6Var.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = ff6Var.A;
        this.C = ff6Var.B;
        this.D = ff6Var.C;
        this.E = ff6Var.D;
        this.F = ff6Var.E;
        this.G = ff6Var.F;
        this.H = ff6Var.G;
        int i5 = ff6Var.H;
        this.I = i5 == -1 ? 0 : i5;
        int i6 = ff6Var.I;
        this.J = i6 != -1 ? i6 : 0;
        this.K = ff6Var.J;
        this.L = ff6Var.K;
        this.M = ff6Var.L;
        this.N = ff6Var.M;
        int i7 = ff6Var.N;
        if (i7 != 0 || y45Var == null) {
            this.O = i7;
        } else {
            this.O = 1;
        }
    }

    public static String d(hf6 hf6Var) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        if (hf6Var == null) {
            return "null";
        }
        int i3 = hf6Var.e;
        wg7 wg7Var = hf6Var.c;
        String str4 = hf6Var.d;
        int i4 = hf6Var.G;
        int i5 = hf6Var.F;
        int i6 = hf6Var.E;
        float f = hf6Var.y;
        gf3 gf3Var = hf6Var.D;
        float f2 = hf6Var.A;
        int i7 = hf6Var.x;
        int i8 = hf6Var.w;
        int i9 = hf6Var.v;
        int i10 = hf6Var.u;
        y45 y45Var = hf6Var.r;
        String str5 = hf6Var.k;
        int i11 = hf6Var.j;
        String str6 = hf6Var.m;
        int i12 = hf6Var.f;
        d47 d47Var = new d47(String.valueOf(','), 1);
        StringBuilder sbM = az1.m("id=");
        sbM.append(hf6Var.a);
        sbM.append(", mimeType=");
        sbM.append(hf6Var.n);
        if (str6 != null) {
            sbM.append(", container=");
            sbM.append(str6);
        }
        if (i11 != -1) {
            sbM.append(", bitrate=");
            sbM.append(i11);
        }
        if (str5 != null) {
            sbM.append(", codecs=");
            sbM.append(str5);
        }
        if (y45Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i13 = 0;
            while (i13 < y45Var.d) {
                UUID uuid = y45Var.a[i13].b;
                if (uuid.equals(cy0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(cy0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(cy0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(cy0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(cy0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    i2 = i13;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i13 = i2 + 1;
                }
                i2 = i13;
                i13 = i2 + 1;
            }
            sbM.append(", drm=[");
            d47Var.a(sbM, linkedHashSet.iterator());
            sbM.append(']');
        }
        if (i10 != -1 && i9 != -1) {
            sbM.append(", res=");
            sbM.append(i10);
            sbM.append("x");
            sbM.append(i9);
        }
        if (i8 != -1 && i7 != -1) {
            sbM.append(", decRes=");
            sbM.append(i8);
            sbM.append("x");
            sbM.append(i7);
        }
        double d = f2;
        int i14 = nz4.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = zxg.a;
            sbM.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (gf3Var != null) {
            int i15 = gf3Var.f;
            int i16 = gf3Var.e;
            if ((i16 != -1 && i15 != -1) || gf3Var.f()) {
                sbM.append(", color=");
                if (gf3Var.f()) {
                    String strC = gf3.c(gf3Var.a);
                    String strB = gf3.b(gf3Var.b);
                    String strE = gf3.e(gf3Var.c);
                    String str8 = zxg.a;
                    Locale locale = Locale.US;
                    str2 = strC + "/" + strB + "/" + strE;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i16 == -1 || i15 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i16 + "/" + i15;
                }
                sbM.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbM.append(", fps=");
            sbM.append(f);
        }
        if (i6 != -1) {
            sbM.append(", maxSubLayers=");
            sbM.append(i6);
        }
        if (i5 != -1) {
            sbM.append(", channels=");
            sbM.append(i5);
        }
        if (i4 != -1) {
            sbM.append(", sample_rate=");
            sbM.append(i4);
        }
        if (str4 != null) {
            sbM.append(", language=");
            sbM.append(str4);
        }
        if (!wg7Var.isEmpty()) {
            sbM.append(", labels=[");
            d47Var.a(sbM, lqi.d(new os5(14), wg7Var).iterator());
            sbM.append("]");
        }
        if (i3 != 0) {
            sbM.append(", selectionFlags=[");
            String str9 = zxg.a;
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i3 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i3 & 2) != 0) {
                arrayList.add("forced");
            }
            d47Var.a(sbM, arrayList.iterator());
            sbM.append("]");
        }
        if (i12 != 0) {
            sbM.append(", roleFlags=[");
            String str10 = zxg.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i12;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            d47Var.a(sbM, arrayList2.iterator());
            sbM.append("]");
        } else {
            i = i12;
        }
        if ((i & 32768) != 0) {
            sbM.append(", auxiliaryTrackType=");
            int i17 = hf6Var.g;
            String str11 = zxg.a;
            if (i17 == 0) {
                str = "undefined";
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM.append(str);
        }
        return sbM.toString();
    }

    public final ff6 a() {
        ff6 ff6Var = new ff6();
        ff6Var.a = this.a;
        ff6Var.b = this.b;
        ff6Var.c = this.c;
        ff6Var.d = this.d;
        ff6Var.e = this.e;
        ff6Var.f = this.f;
        ff6Var.h = this.h;
        ff6Var.i = this.i;
        ff6Var.j = this.k;
        ff6Var.k = this.l;
        ff6Var.l = this.m;
        ff6Var.m = this.n;
        ff6Var.n = this.o;
        ff6Var.o = this.p;
        ff6Var.p = this.q;
        ff6Var.q = this.r;
        ff6Var.r = this.s;
        ff6Var.s = this.t;
        ff6Var.t = this.u;
        ff6Var.u = this.v;
        ff6Var.v = this.w;
        ff6Var.w = this.x;
        ff6Var.x = this.y;
        ff6Var.y = this.z;
        ff6Var.z = this.A;
        ff6Var.A = this.B;
        ff6Var.B = this.C;
        ff6Var.C = this.D;
        ff6Var.D = this.E;
        ff6Var.E = this.F;
        ff6Var.F = this.G;
        ff6Var.G = this.H;
        ff6Var.H = this.I;
        ff6Var.I = this.J;
        ff6Var.J = this.K;
        ff6Var.K = this.L;
        ff6Var.L = this.M;
        ff6Var.M = this.N;
        ff6Var.N = this.O;
        return ff6Var;
    }

    public final int b() {
        int i;
        int i2 = this.u;
        if (i2 == -1 || (i = this.v) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(hf6 hf6Var) {
        List list = this.q;
        if (list.size() != hf6Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) hf6Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final hf6 e(hf6 hf6Var) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == hf6Var) {
            return this;
        }
        int iH = xz9.h(this.n);
        String str3 = hf6Var.a;
        ty9 ty9VarB = hf6Var.l;
        wg7 wg7Var = hf6Var.c;
        int i3 = hf6Var.M;
        int i4 = hf6Var.N;
        String str4 = hf6Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (wg7Var.isEmpty()) {
            wg7Var = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = hf6Var.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = hf6Var.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = hf6Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strV = zxg.v(iH, hf6Var.k);
            if (zxg.i0(strV).length == 1) {
                str5 = strV;
            }
        }
        ty9 ty9Var = this.l;
        if (ty9Var != null) {
            ty9VarB = ty9Var.b(ty9VarB);
        }
        float f = this.y;
        if (f == -1.0f && iH == 2) {
            f = hf6Var.y;
        }
        int i7 = this.e | hf6Var.e;
        int i8 = this.f | hf6Var.f;
        y45 y45Var = hf6Var.r;
        ArrayList arrayList = new ArrayList();
        wg7 wg7Var2 = wg7Var;
        if (y45Var != null) {
            String str6 = y45Var.c;
            w45[] w45VarArr = y45Var.a;
            int length = w45VarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                w45 w45Var = w45VarArr[i10];
                int i11 = length;
                if (w45Var.o != null) {
                    arrayList.add(w45Var);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        y45 y45Var2 = this.r;
        if (y45Var2 != null) {
            if (str2 == null) {
                str2 = y45Var2.c;
            }
            int size = arrayList.size();
            w45[] w45VarArr2 = y45Var2.a;
            String str7 = str2;
            int length2 = w45VarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                w45 w45Var2 = w45VarArr2[i13];
                int i14 = length2;
                if (w45Var2.o != null) {
                    UUID uuid = w45Var2.b;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(w45Var2);
                            break;
                        }
                        i = size;
                        if (((w45) arrayList.get(i15)).b.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        y45 y45Var3 = arrayList.isEmpty() ? null : new y45(str2, arrayList);
        ff6 ff6VarA = a();
        ff6VarA.a = str3;
        ff6VarA.b = str4;
        ff6VarA.c = wg7.j(wg7Var2);
        ff6VarA.d = str;
        ff6VarA.e = i7;
        ff6VarA.f = i8;
        ff6VarA.h = i5;
        ff6VarA.i = i6;
        ff6VarA.j = str5;
        ff6VarA.k = ty9VarB;
        ff6VarA.q = y45Var3;
        ff6VarA.x = f;
        ff6VarA.L = i3;
        ff6VarA.M = i16;
        return new hf6(ff6VarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || hf6.class != obj.getClass()) {
            return false;
        }
        hf6 hf6Var = (hf6) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = hf6Var.P) == 0 || i2 == i) && this.e == hf6Var.e && this.f == hf6Var.f && this.g == hf6Var.g && this.h == hf6Var.h && this.i == hf6Var.i && this.o == hf6Var.o && this.s == hf6Var.s && this.u == hf6Var.u && this.v == hf6Var.v && this.w == hf6Var.w && this.x == hf6Var.x && this.z == hf6Var.z && this.C == hf6Var.C && this.E == hf6Var.E && this.F == hf6Var.F && this.G == hf6Var.G && this.H == hf6Var.H && this.I == hf6Var.I && this.J == hf6Var.J && this.K == hf6Var.K && this.M == hf6Var.M && this.N == hf6Var.N && this.O == hf6Var.O && Float.compare(this.y, hf6Var.y) == 0 && Float.compare(this.A, hf6Var.A) == 0 && Objects.equals(this.a, hf6Var.a) && Objects.equals(this.b, hf6Var.b) && this.c.equals(hf6Var.c) && Objects.equals(this.k, hf6Var.k) && Objects.equals(this.m, hf6Var.m) && Objects.equals(this.n, hf6Var.n) && Objects.equals(this.d, hf6Var.d) && Arrays.equals(this.B, hf6Var.B) && Objects.equals(this.l, hf6Var.l) && Objects.equals(this.D, hf6Var.D) && Objects.equals(this.r, hf6Var.r) && c(hf6Var);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ty9 ty9Var = this.l;
            int iHashCode5 = (iHashCode4 + (ty9Var == null ? 0 : ty9Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return ho7.j(sb, this.G, "])");
    }
}
