package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23434z extends RecyclerView.y {

    /* renamed from: j, reason: collision with root package name */
    public PointF f54211j;

    /* renamed from: k, reason: collision with root package name */
    public final DisplayMetrics f54212k;

    /* renamed from: m, reason: collision with root package name */
    public float f54214m;

    /* renamed from: h, reason: collision with root package name */
    public final LinearInterpolator f54209h = new LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public final DecelerateInterpolator f54210i = new DecelerateInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public boolean f54213l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f54215n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f54216o = 0;

    public C23434z(Context context) {
        this.f54212k = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void c(int i12, int i13, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (this.f53879b.f53787n.e0() == 0) {
            f();
            return;
        }
        int i14 = this.f54215n;
        int i15 = i14 - i12;
        if (i14 * i15 <= 0) {
            i15 = 0;
        }
        this.f54215n = i15;
        int i16 = this.f54216o;
        int i17 = i16 - i13;
        int i18 = i16 * i17 > 0 ? i17 : 0;
        this.f54216o = i18;
        if (i15 == 0 && i18 == 0) {
            PointF pointFA = a(this.f53878a);
            if (pointFA != null) {
                if (pointFA.x != 0.0f || pointFA.y != 0.0f) {
                    float f12 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f12 * f12) + (r3 * r3));
                    float f13 = pointFA.x / fSqrt;
                    pointFA.x = f13;
                    float f14 = pointFA.y / fSqrt;
                    pointFA.y = f14;
                    this.f54211j = pointFA;
                    this.f54215n = (int) (f13 * 10000.0f);
                    this.f54216o = (int) (f14 * 10000.0f);
                    aVar.b((int) (this.f54215n * 1.2f), (int) (this.f54216o * 1.2f), (int) (l(10000) * 1.2f), this.f54209h);
                    return;
                }
            }
            aVar.f53888d = this.f53878a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void d() {
        this.f54216o = 0;
        this.f54215n = 0;
        this.f54211j = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void e(View view, RecyclerView.y.a aVar) {
        int iH2 = h(view, m());
        int i12 = i(view, n());
        int iK2 = k((int) Math.sqrt((i12 * i12) + (iH2 * iH2)));
        if (iK2 > 0) {
            aVar.b(-iH2, -i12, iK2, this.f54210i);
        }
    }

    public int g(int i12, int i13, int i14, int i15, int i16) {
        if (i16 == -1) {
            return i14 - i12;
        }
        if (i16 != 0) {
            if (i16 == 1) {
                return i15 - i13;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i17 = i14 - i12;
        if (i17 > 0) {
            return i17;
        }
        int i18 = i15 - i13;
        if (i18 < 0) {
            return i18;
        }
        return 0;
    }

    public int h(View view, int i12) {
        RecyclerView.m mVar = this.f53880c;
        if (mVar == null || !mVar.I()) {
            return 0;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return g(RecyclerView.m.j0(view) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, RecyclerView.m.m0(view) + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.getPaddingLeft(), mVar.f53850p - mVar.getPaddingRight(), i12);
    }

    public int i(View view, int i12) {
        RecyclerView.m mVar = this.f53880c;
        if (mVar == null || !mVar.J()) {
            return 0;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return g(RecyclerView.m.n0(view) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, RecyclerView.m.h0(view) + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin, mVar.getPaddingTop(), mVar.f53851q - mVar.getPaddingBottom(), i12);
    }

    public float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i12) {
        return (int) Math.ceil(l(i12) / 0.3356d);
    }

    public int l(int i12) {
        float fAbs = Math.abs(i12);
        if (!this.f54213l) {
            this.f54214m = j(this.f54212k);
            this.f54213l = true;
        }
        return (int) Math.ceil(fAbs * this.f54214m);
    }

    public int m() {
        PointF pointF = this.f54211j;
        if (pointF != null) {
            float f12 = pointF.x;
            if (f12 != 0.0f) {
                return f12 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int n() {
        PointF pointF = this.f54211j;
        if (pointF != null) {
            float f12 = pointF.y;
            if (f12 != 0.0f) {
                return f12 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
