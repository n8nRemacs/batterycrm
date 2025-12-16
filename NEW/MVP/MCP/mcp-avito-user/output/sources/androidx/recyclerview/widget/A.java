package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes10.dex */
public class A extends P {

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public I f53648d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public I f53649e;

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
    public int[] c(@j.N RecyclerView.m mVar, @j.N View view) {
        int[] iArr = new int[2];
        if (mVar.I()) {
            I iK2 = k(mVar);
            iArr[0] = ((iK2.e(view) / 2) + iK2.g(view)) - ((iK2.n() / 2) + iK2.m());
        } else {
            iArr[0] = 0;
        }
        if (mVar.J()) {
            I iL2 = l(mVar);
            iArr[1] = ((iL2.e(view) / 2) + iL2.g(view)) - ((iL2.n() / 2) + iL2.m());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.P
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
        int iO02;
        View viewF;
        int iT02;
        int i14;
        PointF pointFO;
        int i15;
        int i16;
        if (!(mVar instanceof RecyclerView.y.b) || (iO02 = mVar.o0()) == 0 || (viewF = f(mVar)) == null || (iT02 = RecyclerView.m.t0(viewF)) == -1 || (pointFO = ((RecyclerView.y.b) mVar).o(iO02 - 1)) == null) {
            return -1;
        }
        if (mVar.I()) {
            i15 = i(mVar, k(mVar), i12, 0);
            if (pointFO.x < 0.0f) {
                i15 = -i15;
            }
        } else {
            i15 = 0;
        }
        if (mVar.J()) {
            i16 = i(mVar, l(mVar), 0, i13);
            if (pointFO.y < 0.0f) {
                i16 = -i16;
            }
        } else {
            i16 = 0;
        }
        if (mVar.J()) {
            i15 = i16;
        }
        if (i15 == 0) {
            return -1;
        }
        int i17 = iT02 + i15;
        int i18 = i17 >= 0 ? i17 : 0;
        return i18 >= iO02 ? i14 : i18;
    }

    public final int i(RecyclerView.m mVar, I i12, int i13, int i14) {
        int[] iArrD = d(i13, i14);
        int iE02 = mVar.e0();
        float f12 = 1.0f;
        if (iE02 != 0) {
            View view = null;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i17 = 0; i17 < iE02; i17++) {
                View viewD0 = mVar.d0(i17);
                int iT02 = RecyclerView.m.t0(viewD0);
                if (iT02 != -1) {
                    if (iT02 < i16) {
                        view = viewD0;
                        i16 = iT02;
                    }
                    if (iT02 > i15) {
                        view2 = viewD0;
                        i15 = iT02;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(i12.d(view), i12.d(view2)) - Math.min(i12.g(view), i12.g(view2));
                if (iMax != 0) {
                    f12 = (iMax * 1.0f) / ((i15 - i16) + 1);
                }
            }
        }
        if (f12 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrD[0]) > Math.abs(iArrD[1]) ? iArrD[0] : iArrD[1]) / f12);
    }

    @j.N
    public final I k(@j.N RecyclerView.m mVar) {
        I i12 = this.f53649e;
        if (i12 == null || i12.f53676a != mVar) {
            this.f53649e = I.a(mVar);
        }
        return this.f53649e;
    }

    @j.N
    public final I l(@j.N RecyclerView.m mVar) {
        I i12 = this.f53648d;
        if (i12 == null || i12.f53676a != mVar) {
            this.f53648d = I.c(mVar);
        }
        return this.f53648d;
    }
}
