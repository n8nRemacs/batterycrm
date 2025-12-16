package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class br5 extends vhd implements aid {
    public static final int[] M0 = {R.attr.state_pressed};
    public static final int[] N0 = new int[0];
    public final RecyclerView C0;
    public final ValueAnimator J0;
    public int K0;
    public final ue L0;
    public final int X;
    public final StateListDrawable Y;
    public final Drawable Z;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int o;
    public final int s0;
    public final int t0;
    public int u0;
    public int v0;
    public float w0;
    public int x0;
    public int y0;
    public float z0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean D0 = false;
    public boolean E0 = false;
    public int F0 = 0;
    public int G0 = 0;
    public final int[] H0 = new int[2];
    public final int[] I0 = new int[2];

    public br5(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J0 = valueAnimatorOfFloat;
        this.K0 = 0;
        ue ueVar = new ue(18, this);
        this.L0 = ueVar;
        rf5 rf5Var = new rf5(1, this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.Y = stateListDrawable2;
        this.Z = drawable2;
        this.o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.X = Math.max(i, drawable.getIntrinsicWidth());
        this.s0 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.t0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new w52(this));
        valueAnimatorOfFloat.addUpdateListener(new wk0(4, this));
        RecyclerView recyclerView2 = this.C0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.p0(this);
            this.C0.r0(this);
            this.C0.s0(rf5Var);
            this.C0.removeCallbacks(ueVar);
        }
        this.C0 = recyclerView;
        recyclerView.j(this);
        this.C0.l(this);
        this.C0.m(rf5Var);
    }

    public static int l(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // defpackage.aid
    public final void a(MotionEvent motionEvent) {
        if (this.F0 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.G0 = 1;
                    this.z0 = (int) motionEvent.getX();
                } else if (zJ) {
                    this.G0 = 2;
                    this.w0 = (int) motionEvent.getY();
                }
                m(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.F0 == 2) {
            this.w0 = 0.0f;
            this.z0 = 0.0f;
            m(1);
            this.G0 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.F0 == 2) {
            n();
            int i = this.G0;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.I0;
                iArr[0] = i2;
                int i3 = this.A0 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.y0 - fMax) >= 2.0f) {
                    int iL = l(this.z0, fMax, iArr, this.C0.computeHorizontalScrollRange(), this.C0.computeHorizontalScrollOffset(), this.A0);
                    if (iL != 0) {
                        this.C0.scrollBy(iL, 0);
                    }
                    this.z0 = fMax;
                }
            }
            if (this.G0 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.H0;
                iArr2[0] = i2;
                int i4 = this.B0 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.v0 - fMax2) < 2.0f) {
                    return;
                }
                int iL2 = l(this.w0, fMax2, iArr2, this.C0.computeVerticalScrollRange(), this.C0.computeVerticalScrollOffset(), this.B0);
                if (iL2 != 0) {
                    this.C0.scrollBy(0, iL2);
                }
                this.w0 = fMax2;
            }
        }
    }

    @Override // defpackage.aid
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.F0;
        if (i != 1) {
            return i == 2;
        }
        boolean zJ = j(motionEvent.getX(), motionEvent.getY());
        boolean zI = i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zJ && !zI) {
            return false;
        }
        if (zI) {
            this.G0 = 1;
            this.z0 = (int) motionEvent.getX();
        } else if (zJ) {
            this.G0 = 2;
            this.w0 = (int) motionEvent.getY();
        }
        m(2);
        return true;
    }

    @Override // defpackage.aid
    public final void e(boolean z) {
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int i = this.A0;
        RecyclerView recyclerView2 = this.C0;
        if (i != recyclerView2.getWidth() || this.B0 != recyclerView2.getHeight()) {
            this.A0 = recyclerView2.getWidth();
            this.B0 = recyclerView2.getHeight();
            m(0);
            return;
        }
        if (this.K0 != 0) {
            if (this.D0) {
                int i2 = this.A0;
                int i3 = this.o;
                int i4 = i2 - i3;
                int i5 = this.v0;
                int i6 = this.u0;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.X;
                int i9 = this.B0;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = hfh.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.E0) {
                int i10 = this.B0;
                int i11 = this.s0;
                int i12 = i10 - i11;
                int i13 = this.y0;
                int i14 = this.x0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.Y;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.A0;
                int i17 = this.t0;
                Drawable drawable2 = this.Z;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 < this.B0 - this.s0) {
            return false;
        }
        int i = this.y0;
        int i2 = this.x0;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean j(float f, float f2) {
        WeakHashMap weakHashMap = hfh.a;
        int layoutDirection = this.C0.getLayoutDirection();
        int i = this.o;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.A0 - i) {
            return false;
        }
        int i2 = this.v0;
        int i3 = this.u0 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void m(int i) {
        ue ueVar = this.L0;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.F0 != 2) {
            stateListDrawable.setState(M0);
            this.C0.removeCallbacks(ueVar);
        }
        if (i == 0) {
            this.C0.invalidate();
        } else {
            n();
        }
        if (this.F0 == 2 && i != 2) {
            stateListDrawable.setState(N0);
            this.C0.removeCallbacks(ueVar);
            this.C0.postDelayed(ueVar, 1200);
        } else if (i == 1) {
            this.C0.removeCallbacks(ueVar);
            this.C0.postDelayed(ueVar, 1500);
        }
        this.F0 = i;
    }

    public final void n() {
        int i = this.K0;
        ValueAnimator valueAnimator = this.J0;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.K0 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
