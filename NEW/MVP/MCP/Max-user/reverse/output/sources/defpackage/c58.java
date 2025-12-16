package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public class c58 {
    public int a = -1;
    public RecyclerView b;
    public a c;
    public boolean d;
    public boolean e;
    public View f;
    public final gid g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public c58(Context context) {
        gid gidVar = new gid();
        gidVar.d = -1;
        gidVar.f = false;
        gidVar.g = 0;
        gidVar.a = 0;
        gidVar.b = 0;
        gidVar.c = Integer.MIN_VALUE;
        gidVar.e = null;
        this.g = gidVar;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            return 0;
        }
        xhd xhdVar = (xhd) view.getLayoutParams();
        return a(a.C(view) - ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin, a.F(view) + ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin, aVar.K(), aVar.n - aVar.L(), i);
    }

    public int c(View view, int i) {
        a aVar = this.c;
        if (aVar == null || !aVar.g()) {
            return 0;
        }
        xhd xhdVar = (xhd) view.getLayoutParams();
        return a(a.G(view) - ((ViewGroup.MarginLayoutParams) xhdVar).topMargin, a.A(view) + ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin, aVar.M(), aVar.o - aVar.J(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int e(int i) {
        return (int) Math.ceil(f(i) / 0.3356d);
    }

    public int f(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF g(int i) {
        Object obj = this.c;
        if (obj instanceof hid) {
            return ((hid) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + hid.class.getCanonicalName());
        return null;
    }

    public int h() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public final void i(int i, int i2) {
        PointF pointFG;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            m();
        }
        if (this.d && this.f == null && this.c != null && (pointFG = g(this.a)) != null) {
            float f = pointFG.x;
            if (f != 0.0f || pointFG.y != 0.0f) {
                recyclerView.w0((int) Math.signum(f), (int) Math.signum(pointFG.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        gid gidVar = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                l(this.f, recyclerView.r1, gidVar);
                gidVar.a(recyclerView);
                m();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            j(i, i2, recyclerView.r1, gidVar);
            boolean z = gidVar.d >= 0;
            gidVar.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.o1.b();
            }
        }
    }

    public void j(int i, int i2, iid iidVar, gid gidVar) {
        if (this.b.A0.x() == 0) {
            m();
            return;
        }
        int i3 = this.o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.o = i4;
        int i5 = this.p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFG = g(this.a);
            if (pointFG != null) {
                if (pointFG.x != 0.0f || pointFG.y != 0.0f) {
                    float f = pointFG.y;
                    float fSqrt = (float) Math.sqrt((f * f) + (r3 * r3));
                    float f2 = pointFG.x / fSqrt;
                    pointFG.x = f2;
                    float f3 = pointFG.y / fSqrt;
                    pointFG.y = f3;
                    this.k = pointFG;
                    this.o = (int) (f2 * 10000.0f);
                    this.p = (int) (f3 * 10000.0f);
                    gidVar.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (f(10000) * 1.2f), this.i);
                    return;
                }
            }
            gidVar.d = this.a;
            m();
        }
    }

    public void k() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.view.View r3, defpackage.iid r4, defpackage.gid r5) {
        /*
            r2 = this;
            android.graphics.PointF r4 = r2.k
            if (r4 == 0) goto L12
            float r4 = r4.x
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto Lc
            goto L12
        Lc:
            if (r4 <= 0) goto L10
            r4 = 1
            goto L13
        L10:
            r4 = -1
            goto L13
        L12:
            r4 = 0
        L13:
            int r4 = r2.b(r3, r4)
            int r0 = r2.h()
            int r3 = r2.c(r3, r0)
            int r0 = r4 * r4
            int r1 = r3 * r3
            int r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            int r0 = r2.e(r0)
            if (r0 <= 0) goto L37
            int r4 = -r4
            int r3 = -r3
            android.view.animation.DecelerateInterpolator r1 = r2.j
            r5.b(r4, r3, r0, r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c58.l(android.view.View, iid, gid):void");
    }

    public final void m() {
        if (this.e) {
            this.e = false;
            k();
            this.b.r1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            a aVar = this.c;
            if (aVar.e == this) {
                aVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
