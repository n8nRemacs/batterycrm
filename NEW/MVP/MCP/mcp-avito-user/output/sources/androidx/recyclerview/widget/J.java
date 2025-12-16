package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes10.dex */
public class J extends P {

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public I f53679d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public I f53680e;

    /* compiled from: PagerSnapHelper.java */
    public class a extends C23434z {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C23434z, androidx.recyclerview.widget.RecyclerView.y
        public final void e(View view, RecyclerView.y.a aVar) {
            J j12 = J.this;
            int[] iArrC = j12.c(j12.f53728a.getLayoutManager(), view);
            int i12 = iArrC[0];
            int i13 = iArrC[1];
            int iK2 = k(Math.max(Math.abs(i12), Math.abs(i13)));
            if (iK2 > 0) {
                aVar.b(i12, i13, iK2, this.f54210i);
            }
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final float j(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final int l(int i12) {
            return Math.min(100, super.l(i12));
        }
    }

    public static int i(@j.N View view, I i12) {
        return ((i12.e(view) / 2) + i12.g(view)) - ((i12.n() / 2) + i12.m());
    }

    @j.P
    public static View j(RecyclerView.m mVar, I i12) {
        int iE02 = mVar.e0();
        View view = null;
        if (iE02 == 0) {
            return null;
        }
        int iN2 = (i12.n() / 2) + i12.m();
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < iE02; i14++) {
            View viewD0 = mVar.d0(i14);
            int iAbs = Math.abs(((i12.e(viewD0) / 2) + i12.g(viewD0)) - iN2);
            if (iAbs < i13) {
                view = viewD0;
                i13 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.P
    @j.P
    public int[] c(@j.N RecyclerView.m mVar, @j.N View view) {
        int[] iArr = new int[2];
        if (mVar.I()) {
            iArr[0] = i(view, k(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.J()) {
            iArr[1] = i(view, l(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.P
    @j.P
    public final RecyclerView.y e(@j.N RecyclerView.m mVar) {
        if (mVar instanceof RecyclerView.y.b) {
            return new a(this.f53728a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.P
    @j.P
    public View f(RecyclerView.m mVar) {
        if (mVar.J()) {
            return j(mVar, l(mVar));
        }
        if (mVar.I()) {
            return j(mVar, k(mVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.P
    public int g(RecyclerView.m mVar, int i12, int i13) {
        PointF pointFO;
        int iO02 = mVar.o0();
        if (iO02 == 0) {
            return -1;
        }
        View view = null;
        I iL2 = mVar.J() ? l(mVar) : mVar.I() ? k(mVar) : null;
        if (iL2 == null) {
            return -1;
        }
        int iE02 = mVar.e0();
        boolean z12 = false;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i16 = 0; i16 < iE02; i16++) {
            View viewD0 = mVar.d0(i16);
            if (viewD0 != null) {
                int i17 = i(viewD0, iL2);
                if (i17 <= 0 && i17 > i15) {
                    view2 = viewD0;
                    i15 = i17;
                }
                if (i17 >= 0 && i17 < i14) {
                    view = viewD0;
                    i14 = i17;
                }
            }
        }
        boolean z13 = !mVar.I() ? i13 <= 0 : i12 <= 0;
        if (z13 && view != null) {
            return RecyclerView.m.t0(view);
        }
        if (!z13 && view2 != null) {
            return RecyclerView.m.t0(view2);
        }
        if (z13) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iT02 = RecyclerView.m.t0(view);
        int iO03 = mVar.o0();
        if ((mVar instanceof RecyclerView.y.b) && (pointFO = ((RecyclerView.y.b) mVar).o(iO03 - 1)) != null && (pointFO.x < 0.0f || pointFO.y < 0.0f)) {
            z12 = true;
        }
        int i18 = iT02 + (z12 == z13 ? -1 : 1);
        if (i18 < 0 || i18 >= iO02) {
            return -1;
        }
        return i18;
    }

    @j.N
    public final I k(@j.N RecyclerView.m mVar) {
        I i12 = this.f53680e;
        if (i12 == null || i12.f53676a != mVar) {
            this.f53680e = I.a(mVar);
        }
        return this.f53680e;
    }

    @j.N
    public final I l(@j.N RecyclerView.m mVar) {
        I i12 = this.f53679d;
        if (i12 == null || i12.f53676a != mVar) {
            this.f53679d = I.c(mVar);
        }
        return this.f53679d;
    }
}
