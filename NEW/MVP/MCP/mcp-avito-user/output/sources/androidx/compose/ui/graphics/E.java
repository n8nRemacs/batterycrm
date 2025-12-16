package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BlendMode.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/E;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f39254a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39229b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39230c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39231d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39232e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39233f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f39234g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f39235h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f39236i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f39237j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f39238k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f39239l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final int f39240m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f39241n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f39242o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final int f39243p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final int f39244q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final int f39245r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final int f39246s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final int f39247t = 18;

    /* renamed from: u, reason: collision with root package name */
    public static final int f39248u = 19;

    /* renamed from: v, reason: collision with root package name */
    public static final int f39249v = 20;

    /* renamed from: w, reason: collision with root package name */
    public static final int f39250w = 21;

    /* renamed from: x, reason: collision with root package name */
    public static final int f39251x = 22;

    /* renamed from: y, reason: collision with root package name */
    public static final int f39252y = 23;

    /* renamed from: z, reason: collision with root package name */
    public static final int f39253z = 24;

    /* renamed from: A, reason: collision with root package name */
    public static final int f39225A = 25;

    /* renamed from: B, reason: collision with root package name */
    public static final int f39226B = 26;

    /* renamed from: C, reason: collision with root package name */
    public static final int f39227C = 27;

    /* renamed from: D, reason: collision with root package name */
    public static final int f39228D = 28;

    /* compiled from: BlendMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/E$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static int a() {
            return E.f39232e;
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String b(int i12) {
        return a(i12, 0) ? "Clear" : a(i12, f39230c) ? "Src" : a(i12, f39231d) ? "Dst" : a(i12, f39232e) ? "SrcOver" : a(i12, f39233f) ? "DstOver" : a(i12, f39234g) ? "SrcIn" : a(i12, f39235h) ? "DstIn" : a(i12, f39236i) ? "SrcOut" : a(i12, f39237j) ? "DstOut" : a(i12, f39238k) ? "SrcAtop" : a(i12, f39239l) ? "DstAtop" : a(i12, f39240m) ? "Xor" : a(i12, f39241n) ? "Plus" : a(i12, f39242o) ? "Modulate" : a(i12, f39243p) ? "Screen" : a(i12, f39244q) ? "Overlay" : a(i12, f39245r) ? "Darken" : a(i12, f39246s) ? "Lighten" : a(i12, f39247t) ? "ColorDodge" : a(i12, f39248u) ? "ColorBurn" : a(i12, f39249v) ? "HardLight" : a(i12, f39250w) ? "Softlight" : a(i12, f39251x) ? "Difference" : a(i12, f39252y) ? "Exclusion" : a(i12, f39253z) ? "Multiply" : a(i12, f39225A) ? "Hue" : a(i12, f39226B) ? "Saturation" : a(i12, f39227C) ? "Color" : a(i12, f39228D) ? "Luminosity" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f39254a == ((E) obj).f39254a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39254a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f39254a);
    }
}
