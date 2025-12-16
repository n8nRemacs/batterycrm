package e11;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.Display;

/* renamed from: e11.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39906t {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final SparseIntArray f394842a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public final float f394843b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f394818c = a();

    /* renamed from: d, reason: collision with root package name */
    public static final int f394819d = a();

    /* renamed from: e, reason: collision with root package name */
    public static final int f394820e = a();

    /* renamed from: f, reason: collision with root package name */
    public static final int f394821f = a();

    /* renamed from: g, reason: collision with root package name */
    public static final int f394822g = a();

    /* renamed from: h, reason: collision with root package name */
    public static final int f394823h = a();

    /* renamed from: i, reason: collision with root package name */
    public static final int f394824i = a();

    /* renamed from: j, reason: collision with root package name */
    public static final int f394825j = a();

    /* renamed from: k, reason: collision with root package name */
    public static final int f394826k = a();

    /* renamed from: l, reason: collision with root package name */
    public static final int f394827l = a();

    /* renamed from: m, reason: collision with root package name */
    public static final int f394828m = a();

    /* renamed from: n, reason: collision with root package name */
    public static final int f394829n = a();

    /* renamed from: o, reason: collision with root package name */
    public static final int f394830o = a();

    /* renamed from: p, reason: collision with root package name */
    public static final int f394831p = a();

    /* renamed from: q, reason: collision with root package name */
    public static final int f394832q = a();

    /* renamed from: r, reason: collision with root package name */
    public static final int f394833r = a();

    /* renamed from: s, reason: collision with root package name */
    public static final int f394834s = a();

    /* renamed from: t, reason: collision with root package name */
    public static final int f394835t = a();

    /* renamed from: u, reason: collision with root package name */
    public static final int f394836u = a();

    /* renamed from: v, reason: collision with root package name */
    public static final int f394837v = a();

    /* renamed from: w, reason: collision with root package name */
    public static final int f394838w = a();

    /* renamed from: x, reason: collision with root package name */
    public static final int f394839x = a();

    /* renamed from: y, reason: collision with root package name */
    public static final int f394840y = a();

    /* renamed from: z, reason: collision with root package name */
    public static final int f394841z = a();

    /* renamed from: A, reason: collision with root package name */
    public static final int f394793A = a();

    /* renamed from: B, reason: collision with root package name */
    public static final int f394794B = a();

    /* renamed from: C, reason: collision with root package name */
    public static final int f394795C = a();

    /* renamed from: D, reason: collision with root package name */
    public static final int f394796D = a();

    /* renamed from: E, reason: collision with root package name */
    public static final int f394797E = a();

    /* renamed from: F, reason: collision with root package name */
    public static final int f394798F = a();

    /* renamed from: G, reason: collision with root package name */
    public static final int f394799G = a();

    /* renamed from: H, reason: collision with root package name */
    public static final int f394800H = a();

    /* renamed from: I, reason: collision with root package name */
    public static final int f394801I = a();

    /* renamed from: J, reason: collision with root package name */
    public static final int f394802J = a();

    /* renamed from: K, reason: collision with root package name */
    public static final int f394803K = a();

    /* renamed from: L, reason: collision with root package name */
    public static final int f394804L = a();

    /* renamed from: M, reason: collision with root package name */
    public static final int f394805M = a();

    /* renamed from: N, reason: collision with root package name */
    public static final int f394806N = a();

    /* renamed from: O, reason: collision with root package name */
    public static final int f394807O = a();

    /* renamed from: P, reason: collision with root package name */
    public static final int f394808P = a();

    /* renamed from: Q, reason: collision with root package name */
    public static final int f394809Q = a();

    /* renamed from: R, reason: collision with root package name */
    public static final int f394810R = a();

    /* renamed from: S, reason: collision with root package name */
    public static final int f394811S = a();

    /* renamed from: T, reason: collision with root package name */
    public static final int f394812T = a();

    /* renamed from: U, reason: collision with root package name */
    public static final int f394813U = a();

    /* renamed from: V, reason: collision with root package name */
    public static final int f394814V = a();

    /* renamed from: W, reason: collision with root package name */
    public static final int f394815W = a();

    /* renamed from: X, reason: collision with root package name */
    public static final int f394816X = a();

    /* renamed from: Y, reason: collision with root package name */
    public static int f394817Y = 0;

    public C39906t(@j.N Context context) {
        int i12;
        float f12;
        Display display;
        C39924z c39924z = new C39924z(context);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
            display.getRealMetrics(displayMetrics);
        }
        int i13 = displayMetrics.heightPixels;
        if (i13 <= 0 || (i12 = displayMetrics.widthPixels) <= 0) {
            this.f394843b = 1.0f;
            c(c39924z);
            return;
        }
        float f13 = displayMetrics.density;
        float fMin = Math.min(i12 / f13, i13 / f13);
        if (fMin >= 720.0f) {
            f12 = 2.0f;
        } else {
            if (fMin < 600.0f) {
                this.f394843b = 1.0f;
                c(c39924z);
            }
            f12 = 1.2f;
        }
        this.f394843b = f12;
        c(c39924z);
    }

    public static int a() {
        int i12 = f394817Y;
        f394817Y = i12 + 1;
        return i12;
    }

    public final void b(int i12, int i13) {
        this.f394842a.put(i12, (int) (i13 * this.f394843b));
    }

    public final void c(@j.N C39924z c39924z) {
        b(f394818c, c39924z.a(200));
        b(f394819d, c39924z.a(1));
        float f12 = 4;
        b(f394820e, c39924z.a(f12));
        b(f394821f, 1);
        b(f394822g, 18);
        float f13 = 16;
        b(f394823h, c39924z.a(f13));
        float f14 = 8;
        b(f394824i, c39924z.a(f14));
        float f15 = 6;
        b(f394825j, c39924z.a(f15));
        float f16 = 2;
        b(f394826k, c39924z.a(f16));
        b(f394827l, c39924z.a(48));
        b(f394828m, c39924z.a(f15));
        b(f394829n, c39924z.a(f15));
        b(f394830o, c39924z.a(14));
        b(f394831p, c39924z.a(20));
        b(f394832q, c39924z.a(27));
        b(f394833r, 22);
        b(f394834s, 2);
        b(f394835t, 16);
        b(f394836u, 3);
        b(f394837v, 16);
        b(f394838w, c39924z.a(f15));
        b(f394839x, c39924z.a(f16));
        b(f394840y, 1);
        b(f394841z, c39924z.a(3));
        b(f394794B, 16);
        b(f394815W, 14);
        b(f394793A, 1);
        b(f394795C, 2);
        b(f394796D, 2);
        float f17 = 32;
        b(f394797E, c39924z.a(f17));
        b(f394798F, c39924z.a(f13));
        b(f394800H, c39924z.a(f16));
        b(f394801I, 16);
        b(f394803K, 16);
        b(f394804L, 2);
        b(f394805M, 14);
        b(f394802J, 22);
        b(f394808P, 16);
        b(f394809Q, 16);
        b(f394806N, c39924z.a(f12));
        b(f394807O, c39924z.a(f14));
        b(f394810R, c39924z.a(100));
        b(f394811S, c39924z.a(f17));
        b(f394812T, c39924z.a(136));
        b(f394813U, c39924z.a(156));
        b(f394799G, c39924z.a(24));
        b(f394814V, c39924z.a(10));
        b(f394816X, c39924z.a(40));
    }
}
