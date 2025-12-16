package androidx.media3.common;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import okhttp3.internal.http2.Http2;

/* compiled from: Format.java */
/* renamed from: androidx.media3.common.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23108t implements InterfaceC23096j {

    /* renamed from: J, reason: collision with root package name */
    public static final C23108t f47703J = new b().a();

    /* renamed from: K, reason: collision with root package name */
    public static final String f47704K;

    /* renamed from: L, reason: collision with root package name */
    public static final String f47705L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f47706M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f47707N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f47708O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f47709P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f47710Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f47711R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f47712S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f47713T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f47714U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f47715V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f47716W;

    /* renamed from: X, reason: collision with root package name */
    public static final String f47717X;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f47718Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f47719Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f47720a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f47721b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f47722c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f47723d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f47724e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final String f47725f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f47726g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final String f47727h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final String f47728i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f47729j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final String f47730k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f47731l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final String f47732m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final String f47733n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final String f47734o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final String f47735p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47736q0;

    /* renamed from: A, reason: collision with root package name */
    public final int f47737A;

    /* renamed from: B, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47738B;

    /* renamed from: C, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47739C;

    /* renamed from: D, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47740D;

    /* renamed from: E, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47741E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47742F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47743G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47744H;

    /* renamed from: I, reason: collision with root package name */
    public int f47745I;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f47746b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f47747c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f47748d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47749e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47750f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47751g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47752h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47753i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f47754j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final Metadata f47755k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final String f47756l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final String f47757m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47758n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final List<byte[]> f47759o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final DrmInitData f47760p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final long f47761q;

    /* renamed from: r, reason: collision with root package name */
    public final int f47762r;

    /* renamed from: s, reason: collision with root package name */
    public final int f47763s;

    /* renamed from: t, reason: collision with root package name */
    public final float f47764t;

    /* renamed from: u, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47765u;

    /* renamed from: v, reason: collision with root package name */
    public final float f47766v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final byte[] f47767w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47768x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final C23101l f47769y;

    /* renamed from: z, reason: collision with root package name */
    public final int f47770z;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47704K = Integer.toString(0, 36);
        f47705L = Integer.toString(1, 36);
        f47706M = Integer.toString(2, 36);
        f47707N = Integer.toString(3, 36);
        f47708O = Integer.toString(4, 36);
        f47709P = Integer.toString(5, 36);
        f47710Q = Integer.toString(6, 36);
        f47711R = Integer.toString(7, 36);
        f47712S = Integer.toString(8, 36);
        f47713T = Integer.toString(9, 36);
        f47714U = Integer.toString(10, 36);
        f47715V = Integer.toString(11, 36);
        f47716W = Integer.toString(12, 36);
        f47717X = Integer.toString(13, 36);
        f47718Y = Integer.toString(14, 36);
        f47719Z = Integer.toString(15, 36);
        f47720a0 = Integer.toString(16, 36);
        f47721b0 = Integer.toString(17, 36);
        f47722c0 = Integer.toString(18, 36);
        f47723d0 = Integer.toString(19, 36);
        f47724e0 = Integer.toString(20, 36);
        f47725f0 = Integer.toString(21, 36);
        f47726g0 = Integer.toString(22, 36);
        f47727h0 = Integer.toString(23, 36);
        f47728i0 = Integer.toString(24, 36);
        f47729j0 = Integer.toString(25, 36);
        f47730k0 = Integer.toString(26, 36);
        f47731l0 = Integer.toString(27, 36);
        f47732m0 = Integer.toString(28, 36);
        f47733n0 = Integer.toString(29, 36);
        f47734o0 = Integer.toString(30, 36);
        f47735p0 = Integer.toString(31, 36);
        f47736q0 = new C23088b(5);
    }

    public C23108t(b bVar, a aVar) {
        this.f47746b = bVar.f47777a;
        this.f47747c = bVar.f47778b;
        this.f47748d = androidx.media3.common.util.M.G(bVar.f47779c);
        this.f47749e = bVar.f47780d;
        this.f47750f = bVar.f47781e;
        int i12 = bVar.f47782f;
        this.f47751g = i12;
        int i13 = bVar.f47783g;
        this.f47752h = i13;
        this.f47753i = i13 != -1 ? i13 : i12;
        this.f47754j = bVar.f47784h;
        this.f47755k = bVar.f47785i;
        this.f47756l = bVar.f47786j;
        this.f47757m = bVar.f47787k;
        this.f47758n = bVar.f47788l;
        List<byte[]> list = bVar.f47789m;
        this.f47759o = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = bVar.f47790n;
        this.f47760p = drmInitData;
        this.f47761q = bVar.f47791o;
        this.f47762r = bVar.f47792p;
        this.f47763s = bVar.f47793q;
        this.f47764t = bVar.f47794r;
        int i14 = bVar.f47795s;
        this.f47765u = i14 == -1 ? 0 : i14;
        float f12 = bVar.f47796t;
        this.f47766v = f12 == -1.0f ? 1.0f : f12;
        this.f47767w = bVar.f47797u;
        this.f47768x = bVar.f47798v;
        this.f47769y = bVar.f47799w;
        this.f47770z = bVar.f47800x;
        this.f47737A = bVar.f47801y;
        this.f47738B = bVar.f47802z;
        int i15 = bVar.f47771A;
        this.f47739C = i15 == -1 ? 0 : i15;
        int i16 = bVar.f47772B;
        this.f47740D = i16 != -1 ? i16 : 0;
        this.f47741E = bVar.f47773C;
        this.f47742F = bVar.f47774D;
        this.f47743G = bVar.f47775E;
        int i17 = bVar.f47776F;
        if (i17 != 0 || drmInitData == null) {
            this.f47744H = i17;
        } else {
            this.f47744H = 1;
        }
    }

    @androidx.media3.common.util.J
    public static String l(@j.P C23108t c23108t) {
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        if (c23108t == null) {
            return "null";
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("id=");
        sbR.append(c23108t.f47746b);
        sbR.append(", mimeType=");
        sbR.append(c23108t.f47757m);
        int i16 = c23108t.f47753i;
        if (i16 != -1) {
            sbR.append(", bitrate=");
            sbR.append(i16);
        }
        String str2 = c23108t.f47754j;
        if (str2 != null) {
            sbR.append(", codecs=");
            sbR.append(str2);
        }
        DrmInitData drmInitData = c23108t.f47760p;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i17 = 0; i17 < drmInitData.f47223e; i17++) {
                UUID uuid = drmInitData.f47220b[i17].f47225c;
                if (uuid.equals(C23097k.f47667b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C23097k.f47668c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C23097k.f47670e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C23097k.f47669d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C23097k.f47666a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbR.append(", drm=[");
            com.google.common.base.C.c(',').b(sbR, linkedHashSet.iterator());
            sbR.append(']');
        }
        int i18 = c23108t.f47762r;
        if (i18 != -1 && (i15 = c23108t.f47763s) != -1) {
            sbR.append(", res=");
            sbR.append(i18);
            sbR.append("x");
            sbR.append(i15);
        }
        C23101l c23101l = c23108t.f47769y;
        if (c23101l != null && (i12 = c23101l.f47677b) != -1 && (i13 = c23101l.f47678c) != -1 && (i14 = c23101l.f47679d) != -1) {
            sbR.append(", color=");
            if (i12 == -1 || i13 == -1 || i14 == -1) {
                str = "NA";
            } else {
                String str3 = i12 != -1 ? i12 != 6 ? i12 != 1 ? i12 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
                String str4 = i13 != -1 ? i13 != 1 ? i13 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
                String strA = C23101l.a(i14);
                int i19 = androidx.media3.common.util.M.f47887a;
                Locale locale = Locale.US;
                str = str3 + "/" + str4 + "/" + strA;
            }
            sbR.append(str);
        }
        float f12 = c23108t.f47764t;
        if (f12 != -1.0f) {
            sbR.append(", fps=");
            sbR.append(f12);
        }
        int i22 = c23108t.f47770z;
        if (i22 != -1) {
            sbR.append(", channels=");
            sbR.append(i22);
        }
        int i23 = c23108t.f47737A;
        if (i23 != -1) {
            sbR.append(", sample_rate=");
            sbR.append(i23);
        }
        String str5 = c23108t.f47748d;
        if (str5 != null) {
            sbR.append(", language=");
            sbR.append(str5);
        }
        String str6 = c23108t.f47747c;
        if (str6 != null) {
            sbR.append(", label=");
            sbR.append(str6);
        }
        int i24 = c23108t.f47749e;
        if (i24 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i24 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i24 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i24 & 2) != 0) {
                arrayList.add("forced");
            }
            sbR.append(", selectionFlags=[");
            com.google.common.base.C.c(',').b(sbR, arrayList.iterator());
            sbR.append("]");
        }
        int i25 = c23108t.f47750f;
        if (i25 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((1 & i25) != 0) {
                arrayList2.add("main");
            }
            if ((2 & i25) != 0) {
                arrayList2.add("alt");
            }
            if ((i25 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i25 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i25 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i25 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i25 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i25 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i25 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i25 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i25 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i25 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i25 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i25 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i25 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            sbR.append(", roleFlags=[");
            com.google.common.base.C.c(',').b(sbR, arrayList2.iterator());
            sbR.append("]");
        }
        return sbR.toString();
    }

    @androidx.media3.common.util.J
    public final b a() {
        return new b(this, null);
    }

    @androidx.media3.common.util.J
    public final int b() {
        int i12;
        int i13 = this.f47762r;
        if (i13 == -1 || (i12 = this.f47763s) == -1) {
            return -1;
        }
        return i13 * i12;
    }

    public final boolean equals(@j.P Object obj) {
        int i12;
        if (this == obj) {
            return true;
        }
        if (obj == null || C23108t.class != obj.getClass()) {
            return false;
        }
        C23108t c23108t = (C23108t) obj;
        int i13 = this.f47745I;
        if (i13 == 0 || (i12 = c23108t.f47745I) == 0 || i13 == i12) {
            return this.f47749e == c23108t.f47749e && this.f47750f == c23108t.f47750f && this.f47751g == c23108t.f47751g && this.f47752h == c23108t.f47752h && this.f47758n == c23108t.f47758n && this.f47761q == c23108t.f47761q && this.f47762r == c23108t.f47762r && this.f47763s == c23108t.f47763s && this.f47765u == c23108t.f47765u && this.f47768x == c23108t.f47768x && this.f47770z == c23108t.f47770z && this.f47737A == c23108t.f47737A && this.f47738B == c23108t.f47738B && this.f47739C == c23108t.f47739C && this.f47740D == c23108t.f47740D && this.f47741E == c23108t.f47741E && this.f47742F == c23108t.f47742F && this.f47743G == c23108t.f47743G && this.f47744H == c23108t.f47744H && Float.compare(this.f47764t, c23108t.f47764t) == 0 && Float.compare(this.f47766v, c23108t.f47766v) == 0 && androidx.media3.common.util.M.a(this.f47746b, c23108t.f47746b) && androidx.media3.common.util.M.a(this.f47747c, c23108t.f47747c) && androidx.media3.common.util.M.a(this.f47754j, c23108t.f47754j) && androidx.media3.common.util.M.a(this.f47756l, c23108t.f47756l) && androidx.media3.common.util.M.a(this.f47757m, c23108t.f47757m) && androidx.media3.common.util.M.a(this.f47748d, c23108t.f47748d) && Arrays.equals(this.f47767w, c23108t.f47767w) && androidx.media3.common.util.M.a(this.f47755k, c23108t.f47755k) && androidx.media3.common.util.M.a(this.f47769y, c23108t.f47769y) && androidx.media3.common.util.M.a(this.f47760p, c23108t.f47760p) && g(c23108t);
        }
        return false;
    }

    @androidx.media3.common.util.J
    public final boolean g(C23108t c23108t) {
        List<byte[]> list = this.f47759o;
        if (list.size() != c23108t.f47759o.size()) {
            return false;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!Arrays.equals(list.get(i12), c23108t.f47759o.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47745I == 0) {
            String str = this.f47746b;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f47747c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f47748d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f47749e) * 31) + this.f47750f) * 31) + this.f47751g) * 31) + this.f47752h) * 31;
            String str4 = this.f47754j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f47755k;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f47756l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f47757m;
            this.f47745I = ((((((((((((((((((((Float.floatToIntBits(this.f47766v) + ((((Float.floatToIntBits(this.f47764t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f47758n) * 31) + ((int) this.f47761q)) * 31) + this.f47762r) * 31) + this.f47763s) * 31)) * 31) + this.f47765u) * 31)) * 31) + this.f47768x) * 31) + this.f47770z) * 31) + this.f47737A) * 31) + this.f47738B) * 31) + this.f47739C) * 31) + this.f47740D) * 31) + this.f47741E) * 31) + this.f47742F) * 31) + this.f47743G) * 31) + this.f47744H;
        }
        return this.f47745I;
    }

    @androidx.media3.common.util.J
    public final Bundle j(boolean z12) {
        Bundle bundle = new Bundle();
        bundle.putString(f47704K, this.f47746b);
        bundle.putString(f47705L, this.f47747c);
        bundle.putString(f47706M, this.f47748d);
        bundle.putInt(f47707N, this.f47749e);
        bundle.putInt(f47708O, this.f47750f);
        bundle.putInt(f47709P, this.f47751g);
        bundle.putInt(f47710Q, this.f47752h);
        bundle.putString(f47711R, this.f47754j);
        if (!z12) {
            bundle.putParcelable(f47712S, this.f47755k);
        }
        bundle.putString(f47713T, this.f47756l);
        bundle.putString(f47714U, this.f47757m);
        bundle.putInt(f47715V, this.f47758n);
        int i12 = 0;
        while (true) {
            List<byte[]> list = this.f47759o;
            if (i12 >= list.size()) {
                break;
            }
            bundle.putByteArray(f47716W + "_" + Integer.toString(i12, 36), list.get(i12));
            i12++;
        }
        bundle.putParcelable(f47717X, this.f47760p);
        bundle.putLong(f47718Y, this.f47761q);
        bundle.putInt(f47719Z, this.f47762r);
        bundle.putInt(f47720a0, this.f47763s);
        bundle.putFloat(f47721b0, this.f47764t);
        bundle.putInt(f47722c0, this.f47765u);
        bundle.putFloat(f47723d0, this.f47766v);
        bundle.putByteArray(f47724e0, this.f47767w);
        bundle.putInt(f47725f0, this.f47768x);
        C23101l c23101l = this.f47769y;
        if (c23101l != null) {
            bundle.putBundle(f47726g0, c23101l.k());
        }
        bundle.putInt(f47727h0, this.f47770z);
        bundle.putInt(f47728i0, this.f47737A);
        bundle.putInt(f47729j0, this.f47738B);
        bundle.putInt(f47730k0, this.f47739C);
        bundle.putInt(f47731l0, this.f47740D);
        bundle.putInt(f47732m0, this.f47741E);
        bundle.putInt(f47734o0, this.f47742F);
        bundle.putInt(f47735p0, this.f47743G);
        bundle.putInt(f47733n0, this.f47744H);
        return bundle;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        return j(false);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f47746b);
        sb2.append(", ");
        sb2.append(this.f47747c);
        sb2.append(", ");
        sb2.append(this.f47756l);
        sb2.append(", ");
        sb2.append(this.f47757m);
        sb2.append(", ");
        sb2.append(this.f47754j);
        sb2.append(", ");
        sb2.append(this.f47753i);
        sb2.append(", ");
        sb2.append(this.f47748d);
        sb2.append(", [");
        sb2.append(this.f47762r);
        sb2.append(", ");
        sb2.append(this.f47763s);
        sb2.append(", ");
        sb2.append(this.f47764t);
        sb2.append(", ");
        sb2.append(this.f47769y);
        sb2.append("], [");
        sb2.append(this.f47770z);
        sb2.append(", ");
        return AK.c.i(this.f47737A, "])", sb2);
    }

    /* compiled from: Format.java */
    @androidx.media3.common.util.J
    /* renamed from: androidx.media3.common.t$b */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public int f47771A;

        /* renamed from: B, reason: collision with root package name */
        public int f47772B;

        /* renamed from: C, reason: collision with root package name */
        public int f47773C;

        /* renamed from: D, reason: collision with root package name */
        public int f47774D;

        /* renamed from: E, reason: collision with root package name */
        public int f47775E;

        /* renamed from: F, reason: collision with root package name */
        public int f47776F;

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f47777a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public String f47778b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public String f47779c;

        /* renamed from: d, reason: collision with root package name */
        public int f47780d;

        /* renamed from: e, reason: collision with root package name */
        public int f47781e;

        /* renamed from: f, reason: collision with root package name */
        public int f47782f;

        /* renamed from: g, reason: collision with root package name */
        public int f47783g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public String f47784h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public Metadata f47785i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public String f47786j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public String f47787k;

        /* renamed from: l, reason: collision with root package name */
        public int f47788l;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        public List<byte[]> f47789m;

        /* renamed from: n, reason: collision with root package name */
        @j.P
        public DrmInitData f47790n;

        /* renamed from: o, reason: collision with root package name */
        public long f47791o;

        /* renamed from: p, reason: collision with root package name */
        public int f47792p;

        /* renamed from: q, reason: collision with root package name */
        public int f47793q;

        /* renamed from: r, reason: collision with root package name */
        public float f47794r;

        /* renamed from: s, reason: collision with root package name */
        public int f47795s;

        /* renamed from: t, reason: collision with root package name */
        public float f47796t;

        /* renamed from: u, reason: collision with root package name */
        @j.P
        public byte[] f47797u;

        /* renamed from: v, reason: collision with root package name */
        public int f47798v;

        /* renamed from: w, reason: collision with root package name */
        @j.P
        public C23101l f47799w;

        /* renamed from: x, reason: collision with root package name */
        public int f47800x;

        /* renamed from: y, reason: collision with root package name */
        public int f47801y;

        /* renamed from: z, reason: collision with root package name */
        public int f47802z;

        public b() {
            this.f47782f = -1;
            this.f47783g = -1;
            this.f47788l = -1;
            this.f47791o = Long.MAX_VALUE;
            this.f47792p = -1;
            this.f47793q = -1;
            this.f47794r = -1.0f;
            this.f47796t = 1.0f;
            this.f47798v = -1;
            this.f47800x = -1;
            this.f47801y = -1;
            this.f47802z = -1;
            this.f47773C = -1;
            this.f47774D = -1;
            this.f47775E = -1;
            this.f47776F = 0;
        }

        public final C23108t a() {
            return new C23108t(this, null);
        }

        public b(C23108t c23108t, a aVar) {
            this.f47777a = c23108t.f47746b;
            this.f47778b = c23108t.f47747c;
            this.f47779c = c23108t.f47748d;
            this.f47780d = c23108t.f47749e;
            this.f47781e = c23108t.f47750f;
            this.f47782f = c23108t.f47751g;
            this.f47783g = c23108t.f47752h;
            this.f47784h = c23108t.f47754j;
            this.f47785i = c23108t.f47755k;
            this.f47786j = c23108t.f47756l;
            this.f47787k = c23108t.f47757m;
            this.f47788l = c23108t.f47758n;
            this.f47789m = c23108t.f47759o;
            this.f47790n = c23108t.f47760p;
            this.f47791o = c23108t.f47761q;
            this.f47792p = c23108t.f47762r;
            this.f47793q = c23108t.f47763s;
            this.f47794r = c23108t.f47764t;
            this.f47795s = c23108t.f47765u;
            this.f47796t = c23108t.f47766v;
            this.f47797u = c23108t.f47767w;
            this.f47798v = c23108t.f47768x;
            this.f47799w = c23108t.f47769y;
            this.f47800x = c23108t.f47770z;
            this.f47801y = c23108t.f47737A;
            this.f47802z = c23108t.f47738B;
            this.f47771A = c23108t.f47739C;
            this.f47772B = c23108t.f47740D;
            this.f47773C = c23108t.f47741E;
            this.f47774D = c23108t.f47742F;
            this.f47775E = c23108t.f47743G;
            this.f47776F = c23108t.f47744H;
        }
    }
}
