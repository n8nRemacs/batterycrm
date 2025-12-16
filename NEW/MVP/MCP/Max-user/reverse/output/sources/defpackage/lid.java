package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class lid implements Runnable {
    public boolean X;
    public final /* synthetic */ RecyclerView Y;
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean o;

    public lid(RecyclerView recyclerView) {
        this.Y = recyclerView;
        ys7 ys7Var = RecyclerView.S1;
        this.d = ys7Var;
        this.o = false;
        this.X = false;
        this.c = new OverScroller(recyclerView.getContext(), ys7Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.Y;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        ys7 ys7Var = RecyclerView.S1;
        if (interpolator != ys7Var) {
            this.d = ys7Var;
            this.c = new OverScroller(recyclerView.getContext(), ys7Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.o) {
            this.X = true;
            return;
        }
        RecyclerView recyclerView = this.Y;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = hfh.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.Y;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.S1;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.Y;
        int[] iArr = recyclerView.D1;
        if (recyclerView.A0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.X = false;
        this.o = true;
        recyclerView.s();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iR = RecyclerView.r(i5, recyclerView.V0, recyclerView.X0, recyclerView.getWidth());
            int iR2 = RecyclerView.r(i6, recyclerView.W0, recyclerView.Y0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.D1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.y(iR, iR2, 1, iArr2, null)) {
                iR -= iArr[0];
                iR2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.q(iR, iR2);
            }
            if (recyclerView.z0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.w0(iR, iR2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iR - i7;
                int i10 = iR2 - i8;
                c58 c58Var = recyclerView.A0.e;
                if (c58Var != null && !c58Var.d && c58Var.e) {
                    int iB = recyclerView.r1.b();
                    if (iB == 0) {
                        c58Var.m();
                    } else if (c58Var.a >= iB) {
                        c58Var.a = iB - 1;
                        c58Var.i(i7, i8);
                    } else {
                        c58Var.i(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iR;
                i2 = iR2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.C0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.D1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.z(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.A(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            c58 c58Var2 = recyclerView.A0.e;
            if ((c58Var2 == null || !c58Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.C();
                        if (recyclerView.V0.isFinished()) {
                            recyclerView.V0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.D();
                        if (recyclerView.X0.isFinished()) {
                            recyclerView.X0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.W0.isFinished()) {
                            recyclerView.W0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.Y0.isFinished()) {
                            recyclerView.Y0.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = hfh.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.Q1) {
                    w93 w93Var = recyclerView.q1;
                    int[] iArr4 = w93Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    w93Var.d = 0;
                }
            } else {
                b();
                wq6 wq6Var = recyclerView.p1;
                if (wq6Var != null) {
                    wq6Var.a(recyclerView, i3, i4);
                }
            }
        }
        c58 c58Var3 = recyclerView.A0.e;
        if (c58Var3 != null && c58Var3.d) {
            c58Var3.i(0, 0);
        }
        this.o = false;
        if (!this.X) {
            recyclerView.setScrollState(0);
            recyclerView.a(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = hfh.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
