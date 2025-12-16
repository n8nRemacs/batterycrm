package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class bt7 extends vhd implements yhd {
    public int A0;
    public RecyclerView B0;
    public VelocityTracker D0;
    public ArrayList E0;
    public ArrayList F0;
    public ao6 H0;
    public zs7 I0;
    public Rect K0;
    public long L0;
    public float X;
    public float Y;
    public float Z;
    public float d;
    public float o;
    public float s0;
    public float t0;
    public float u0;
    public final at7 w0;
    public int y0;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public mid c = null;
    public int v0 = -1;
    public int x0 = 0;
    public final ArrayList z0 = new ArrayList();
    public final ue C0 = new ue(28, this);
    public View G0 = null;
    public final l91 J0 = new l91(1, this);

    public bt7(at7 at7Var) {
        this.w0 = at7Var;
    }

    public static boolean q(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.yhd
    public final void b(View view) {
        s(view);
        mid midVarT = this.B0.T(view);
        if (midVarT == null) {
            return;
        }
        mid midVar = this.c;
        if (midVar != null && midVarT == midVar) {
            t(null, 0);
            return;
        }
        n(midVarT, false);
        if (this.a.remove(midVarT.a)) {
            this.w0.a(this.B0, midVarT);
        }
    }

    @Override // defpackage.yhd
    public final void d(View view) {
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        rect.setEmpty();
    }

    @Override // defpackage.vhd
    public final void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            p(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        mid midVar = this.c;
        int i = this.x0;
        at7 at7Var = this.w0;
        at7Var.getClass();
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xs7 xs7Var = (xs7) arrayList.get(i2);
            mid midVar2 = xs7Var.e;
            float f4 = xs7Var.a;
            float f5 = xs7Var.c;
            if (f4 == f5) {
                xs7Var.i = midVar2.a.getTranslationX();
            } else {
                xs7Var.i = utb.i(f5, f4, xs7Var.m, f4);
            }
            float f6 = xs7Var.b;
            float f7 = xs7Var.d;
            if (f6 == f7) {
                xs7Var.j = midVar2.a.getTranslationY();
            } else {
                xs7Var.j = utb.i(f7, f6, xs7Var.m, f6);
            }
            int iSave = canvas.save();
            at7Var.h(canvas, recyclerView, xs7Var.e, xs7Var.i, xs7Var.j, xs7Var.f, false);
            canvas.restoreToCount(iSave);
        }
        if (midVar != null) {
            int iSave2 = canvas.save();
            at7Var.h(canvas, recyclerView, midVar, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            p(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        mid midVar = this.c;
        this.w0.getClass();
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xs7 xs7Var = (xs7) arrayList.get(i);
            int iSave = canvas.save();
            View view = xs7Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (midVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            xs7 xs7Var2 = (xs7) arrayList.get(i2);
            boolean z2 = xs7Var2.l;
            if (z2 && !xs7Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.B0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        l91 l91Var = this.J0;
        if (recyclerView2 != null) {
            recyclerView2.p0(this);
            this.B0.r0(l91Var);
            this.B0.q0(this);
            ArrayList arrayList = this.z0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                xs7 xs7Var = (xs7) arrayList.get(0);
                xs7Var.g.cancel();
                this.w0.a(this.B0, xs7Var.e);
            }
            arrayList.clear();
            this.G0 = null;
            VelocityTracker velocityTracker = this.D0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.D0 = null;
            }
            zs7 zs7Var = this.I0;
            if (zs7Var != null) {
                zs7Var.a = false;
                this.I0 = null;
            }
            if (this.H0 != null) {
                this.H0 = null;
            }
        }
        this.B0 = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.X = resources.getDimension(cwc.item_touch_helper_swipe_escape_velocity);
            this.Y = resources.getDimension(cwc.item_touch_helper_swipe_escape_max_velocity);
            this.A0 = ViewConfiguration.get(this.B0.getContext()).getScaledTouchSlop();
            this.B0.j(this);
            this.B0.l(l91Var);
            this.B0.k(this);
            this.I0 = new zs7(this);
            this.H0 = new ao6(this.B0.getContext(), this.I0);
        }
    }

    public final int j(mid midVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.Z > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.D0;
        at7 at7Var = this.w0;
        if (velocityTracker != null && this.v0 > -1) {
            float f = this.Y;
            at7Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.D0.getXVelocity(this.v0);
            float yVelocity = this.D0.getYVelocity(this.v0);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= at7Var.d(this.X) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fE = at7Var.e() * this.B0.getWidth();
        if ((i & i2) == 0 || Math.abs(this.Z) <= fE) {
            return 0;
        }
        return i2;
    }

    public final void l(int i, int i2, MotionEvent motionEvent) {
        View viewO;
        if (this.c == null && i == 2 && this.x0 != 2) {
            at7 at7Var = this.w0;
            if (at7Var.g() && this.B0.getScrollState() != 1) {
                a layoutManager = this.B0.getLayoutManager();
                int i3 = this.v0;
                mid midVarT = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.d;
                    float y = motionEvent.getY(iFindPointerIndex) - this.o;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.A0;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.f()) && ((fAbs2 <= fAbs || !layoutManager.g()) && (viewO = o(motionEvent)) != null))) {
                        midVarT = this.B0.T(viewO);
                    }
                }
                if (midVarT == null) {
                    return;
                }
                RecyclerView recyclerView = this.B0;
                int i4 = at7Var.c;
                int i5 = at7Var.b;
                int i6 = (i5 << 8) | i5 | i4 | (i4 << 16);
                WeakHashMap weakHashMap = hfh.a;
                int iB = (at7.b(i6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iB == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.d;
                float f3 = y2 - this.o;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.A0;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iB & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iB & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iB & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iB & 2) == 0) {
                            return;
                        }
                    }
                    this.s0 = 0.0f;
                    this.Z = 0.0f;
                    this.v0 = motionEvent.getPointerId(0);
                    t(midVarT, 1);
                }
            }
        }
    }

    public final int m(mid midVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.s0 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.D0;
        at7 at7Var = this.w0;
        if (velocityTracker != null && this.v0 > -1) {
            float f = this.Y;
            at7Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.D0.getXVelocity(this.v0);
            float yVelocity = this.D0.getYVelocity(this.v0);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= at7Var.d(this.X) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fE = at7Var.e() * this.B0.getHeight();
        if ((i & i2) == 0 || Math.abs(this.s0) <= fE) {
            return 0;
        }
        return i2;
    }

    public final void n(mid midVar, boolean z) {
        ArrayList arrayList = this.z0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xs7 xs7Var = (xs7) arrayList.get(size);
            if (xs7Var.e == midVar) {
                xs7Var.k |= z;
                if (!xs7Var.l) {
                    xs7Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        mid midVar = this.c;
        if (midVar != null) {
            View view = midVar.a;
            if (q(view, x, y, this.t0 + this.Z, this.u0 + this.s0)) {
                return view;
            }
        }
        ArrayList arrayList = this.z0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xs7 xs7Var = (xs7) arrayList.get(size);
            View view2 = xs7Var.e.a;
            if (q(view2, x, y, xs7Var.i, xs7Var.j)) {
                return view2;
            }
        }
        return this.B0.H(x, y);
    }

    public final void p(float[] fArr) {
        if ((this.y0 & 12) != 0) {
            fArr[0] = (this.t0 + this.Z) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.y0 & 3) != 0) {
            fArr[1] = (this.u0 + this.s0) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void r(mid midVar) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.B0.isLayoutRequested() && this.x0 == 2) {
            at7 at7Var = this.w0;
            at7Var.getClass();
            int i5 = (int) (this.t0 + this.Z);
            int i6 = (int) (this.u0 + this.s0);
            View view = midVar.a;
            if (Math.abs(i6 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i5 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.E0;
                if (arrayList2 == null) {
                    this.E0 = new ArrayList();
                    this.F0 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.F0.clear();
                }
                int iRound = Math.round(this.t0 + this.Z);
                int iRound2 = Math.round(this.u0 + this.s0);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i7 = (iRound + width) / 2;
                int i8 = (iRound2 + height) / 2;
                a layoutManager = this.B0.getLayoutManager();
                int iX = layoutManager.x();
                int i9 = 0;
                while (i9 < iX) {
                    View viewW = layoutManager.w(i9);
                    if (viewW == view) {
                        i = i9;
                    } else {
                        i = i9;
                        if (viewW.getBottom() >= iRound2 && viewW.getTop() <= height && viewW.getRight() >= iRound && viewW.getLeft() <= width) {
                            mid midVarT = this.B0.T(viewW);
                            int iAbs5 = Math.abs(i7 - ((viewW.getRight() + viewW.getLeft()) / 2));
                            int iAbs6 = Math.abs(i8 - ((viewW.getBottom() + viewW.getTop()) / 2));
                            int i10 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            i2 = i5;
                            int size = this.E0.size();
                            i3 = i6;
                            i4 = iRound;
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < size) {
                                int i13 = size;
                                if (i10 <= ((Integer) this.F0.get(i11)).intValue()) {
                                    break;
                                }
                                i12++;
                                i11++;
                                size = i13;
                            }
                            this.E0.add(i12, midVarT);
                            this.F0.add(i12, Integer.valueOf(i10));
                        }
                        i9 = i + 1;
                        i5 = i2;
                        i6 = i3;
                        iRound = i4;
                    }
                    i2 = i5;
                    i3 = i6;
                    i4 = iRound;
                    i9 = i + 1;
                    i5 = i2;
                    i6 = i3;
                    iRound = i4;
                }
                int i14 = i5;
                int i15 = i6;
                ArrayList arrayList3 = this.E0;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i14;
                int height2 = view.getHeight() + i15;
                int left2 = i14 - view.getLeft();
                int top2 = i15 - view.getTop();
                int size2 = arrayList3.size();
                mid midVar2 = null;
                int i16 = -1;
                int i17 = 0;
                while (i17 < size2) {
                    mid midVar3 = (mid) arrayList3.get(i17);
                    if (left2 <= 0 || (right = midVar3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (midVar3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i16) {
                            i16 = iAbs4;
                            midVar2 = midVar3;
                        }
                    }
                    if (left2 < 0 && (left = midVar3.a.getLeft() - i14) > 0 && midVar3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i16) {
                        i16 = iAbs3;
                        midVar2 = midVar3;
                    }
                    if (top2 < 0 && (top = midVar3.a.getTop() - i15) > 0 && midVar3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i16) {
                        i16 = iAbs2;
                        midVar2 = midVar3;
                    }
                    if (top2 > 0 && (bottom = midVar3.a.getBottom() - height2) < 0 && midVar3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i16) {
                        i16 = iAbs;
                        midVar2 = midVar3;
                    }
                    i17++;
                    arrayList3 = arrayList;
                }
                if (midVar2 == null) {
                    this.E0.clear();
                    this.F0.clear();
                    return;
                }
                View view2 = midVar2.a;
                int iF = midVar2.f();
                midVar.f();
                if (at7Var.i(midVar, midVar2)) {
                    RecyclerView recyclerView = this.B0;
                    a layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager)) {
                        if (layoutManager2.f()) {
                            if (a.C(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.x0(iF);
                            }
                            if (a.F(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.x0(iF);
                            }
                        }
                        if (layoutManager2.g()) {
                            if (a.G(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.x0(iF);
                            }
                            if (a.A(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.x0(iF);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.d("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.S0();
                    linearLayoutManager.m1();
                    int iN = a.N(view);
                    int iN2 = a.N(view2);
                    char c = iN < iN2 ? (char) 1 : (char) 65535;
                    if (linearLayoutManager.u) {
                        if (c == 1) {
                            linearLayoutManager.o1(iN2, linearLayoutManager.r.h() - (linearLayoutManager.r.d(view) + linearLayoutManager.r.f(view2)));
                            return;
                        } else {
                            linearLayoutManager.o1(iN2, linearLayoutManager.r.h() - linearLayoutManager.r.c(view2));
                            return;
                        }
                    }
                    if (c == 65535) {
                        linearLayoutManager.o1(iN2, linearLayoutManager.r.f(view2));
                    } else {
                        linearLayoutManager.o1(iN2, linearLayoutManager.r.c(view2) - linearLayoutManager.r.d(view));
                    }
                }
            }
        }
    }

    public final void s(View view) {
        if (view == this.G0) {
            this.G0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.mid r22, int r23) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt7.t(mid, int):void");
    }

    public final void u(mid midVar) {
        RecyclerView recyclerView = this.B0;
        at7 at7Var = this.w0;
        int i = at7Var.c;
        int i2 = at7Var.b;
        int i3 = (i2 << 8) | i2 | i | (i << 16);
        WeakHashMap weakHashMap = hfh.a;
        if ((at7.b(i3, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (midVar.a.getParent() != this.B0) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.D0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.D0 = VelocityTracker.obtain();
        this.s0 = 0.0f;
        this.Z = 0.0f;
        t(midVar, 2);
    }

    public final void v(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.Z = f;
        this.s0 = y - this.o;
        if ((i & 4) == 0) {
            this.Z = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.Z = Math.min(0.0f, this.Z);
        }
        if ((i & 1) == 0) {
            this.s0 = Math.max(0.0f, this.s0);
        }
        if ((i & 2) == 0) {
            this.s0 = Math.min(0.0f, this.s0);
        }
    }
}
