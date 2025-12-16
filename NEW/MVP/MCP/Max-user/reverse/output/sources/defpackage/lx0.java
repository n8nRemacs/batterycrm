package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lx0 extends View {
    public final TextPaint A0;
    public final TextPaint B0;
    public hx0 C0;
    public yw0 D0;
    public dx0 E0;
    public final Drawable F0;
    public final Drawable G0;
    public final Drawable H0;
    public final Drawable I0;
    public ColorStateList J0;
    public ColorStateList K0;
    public oj7 L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public final Size P0;
    public boolean Q0;
    public final GestureDetector R0;
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int o;
    public final int s0;
    public int t0;
    public ArrayList u0;
    public kz7 v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx0(Context context) {
        super(context, null);
        Continuation continuation = null;
        this.a = kti.d(40 * vw4.d().getDisplayMetrics().density);
        this.b = kti.d(2 * vw4.d().getDisplayMetrics().density);
        this.c = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.d = vw4.d().getDisplayMetrics().density * 6.0f;
        this.o = kti.d(20 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        this.u0 = new ArrayList();
        v1a v1aVar = a93.s0;
        v1aVar.y(this).getIcon();
        this.J0 = ColorStateList.valueOf(-1);
        this.K0 = ColorStateList.valueOf(v1aVar.y(this).getIcon().f);
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.R0 = new GestureDetector(context, new kx0(0, this));
        this.P0 = new Size(i9j.a(context).getWidth(), i9j.a(context).getHeight());
        int i = i7b.m;
        v1aVar.y(this).getIcon();
        this.F0 = cei.h(i, -1, context);
        int i2 = i7b.l;
        v1aVar.y(this).getIcon();
        this.G0 = cei.h(i2, -1, context);
        int i3 = i7b.b;
        v1aVar.y(this).getIcon();
        this.I0 = cei.h(i3, -1, context);
        int i4 = i7b.a;
        v1aVar.y(this).getIcon();
        this.H0 = cei.h(i4, -1, context);
        v1aVar.y(this).getText();
        this.A0 = b(-1);
        this.B0 = b(v1aVar.y(this).getText().e);
        this.w0 = a(v1aVar.y(this).a().i().a.a.a);
        this.x0 = a(v1aVar.y(this).a().G().b.m);
        if (this.Q0) {
            this.y0 = a(v1aVar.y(this).a().G().e.a.a.a.a);
            this.z0 = a(v1aVar.y(this).a().G().e.a.a.b);
        } else {
            this.y0 = a(v1aVar.y(this).a().i().a.a.c);
            this.z0 = a(v1aVar.y(this).a().i().a.a.c);
        }
        tqi.c(new er(3, continuation, 2), this);
    }

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    public final TextPaint b(int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i);
        wsf.j(this, textPaint, dpg.z);
        textPaint.setTextSize(vw4.d().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final boolean c(xr0 xr0Var) {
        return !xr0Var.e && this.Q0;
    }

    public final kz7 getKeyboard() {
        return this.v0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        int i2;
        if (this.u0.isEmpty()) {
            return;
        }
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            xr0 xr0Var = (xr0) it.next();
            n10 n10Var = xr0Var.b;
            yw0 yw0Var = xr0Var.a;
            float[] fArr = xr0Var.h;
            float f = n10Var.b;
            float f2 = n10Var.c;
            float f3 = n10Var.d;
            float f4 = n10Var.e;
            RectF rectF = this.N0;
            rectF.set(f, f2, f3, f4);
            if (yw0Var == this.D0) {
                if (c(xr0Var)) {
                    paint = this.z0;
                } else {
                    int i3 = yw0Var.c;
                    if (i3 != 0) {
                        int i4 = ix0.$EnumSwitchMapping$1[az1.v(i3)];
                    }
                    paint = this.y0;
                }
            } else if (c(xr0Var)) {
                paint = this.x0;
            } else {
                int i5 = ix0.$EnumSwitchMapping$1[az1.v(yw0Var.c)];
                paint = this.w0;
            }
            if (fArr != null) {
                Path path = this.M0;
                path.reset();
                float f5 = fArr[0];
                i = 5;
                float[] fArr2 = this.O0;
                fArr2[0] = f5;
                fArr2[1] = fArr[0];
                float f6 = fArr[1];
                fArr2[2] = f6;
                fArr2[3] = f6;
                float f7 = fArr[2];
                fArr2[4] = f7;
                fArr2[5] = f7;
                float f8 = fArr[3];
                fArr2[6] = f8;
                fArr2[7] = f8;
                path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                canvas.drawPath(path, paint);
            } else {
                i = 5;
                rectF.set(n10Var.b, n10Var.c, n10Var.d, n10Var.e);
                float f9 = this.d;
                canvas.drawRoundRect(rectF, f9, f9, paint);
            }
            v1a v1aVar = a93.s0;
            if (yw0Var.Z) {
                oj7 oj7Var = this.L0;
                if (oj7Var != null) {
                    if (c(xr0Var)) {
                        i2 = v1aVar.y(this).d().e.e.b;
                    } else if (xr0Var.e && this.Q0) {
                        v1aVar.y(this).d();
                        i2 = -1;
                    } else {
                        i2 = v1aVar.y(this).d().e.a.a;
                    }
                    oj7Var.b = new int[]{0, i2};
                    float f10 = n10Var.b;
                    float f11 = n10Var.d;
                    int i6 = this.o / 2;
                    float f12 = n10Var.c;
                    float f13 = n10Var.e;
                    oj7Var.setBounds(((int) ((f10 + f11) * 0.5f)) - i6, ((int) ((f12 + f13) * 0.5f)) - i6, ((int) ((f10 + f11) * 0.5f)) + i6, i6 + ((int) ((f12 + f13) * 0.5f)));
                }
                oj7 oj7Var2 = this.L0;
                if (oj7Var2 != null) {
                    oj7Var2.draw(canvas);
                }
            } else {
                String str = xr0Var.i;
                float f14 = (n10Var.b + n10Var.d) * 0.5f;
                float f15 = (n10Var.c + n10Var.e) * 0.5f;
                TextPaint textPaint = this.A0;
                float fAscent = f15 - ((textPaint.ascent() + textPaint.descent()) / 2);
                if (c(xr0Var)) {
                    textPaint = this.B0;
                }
                canvas.drawText(str, f14, fAscent, textPaint);
            }
            if (!this.Q0) {
                int i7 = (int) n10Var.d;
                int i8 = this.b;
                int i9 = i7 - i8;
                int i10 = this.s0;
                int i11 = i9 - i10;
                int i12 = ((int) n10Var.c) + i8;
                int i13 = i10 + i12;
                int iOrdinal = yw0Var.b.ordinal();
                Drawable drawable = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != i ? null : this.F0 : this.I0 : this.H0 : this.G0;
                if (drawable != null) {
                    drawable.setTintList(c(xr0Var) ? this.K0 : this.J0);
                    drawable.setBounds(i11, i12, i9, i13);
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) throws IOException {
        kz7 kz7Var = this.v0;
        if (this.u0.isEmpty() || kz7Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = ((yl7) kz7Var).a.size();
        int size2 = View.MeasureSpec.getSize(i);
        double d = size2;
        Size size3 = this.P0;
        if (d > Math.min(size3.getWidth(), size3.getHeight())) {
            size2 = (int) ((size3.getWidth() * size2) / size3.getHeight());
        }
        boolean z = this.Q0;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = z ? i4 : i3;
        int i6 = this.a;
        setMeasuredDimension(size2, ((i6 + i5) * size) - i5);
        int i7 = 0;
        n10 n10Var = ((xr0) this.u0.get(0)).b;
        if ((n10Var.b == 0.0f && n10Var.c == 0.0f && n10Var.d == 0.0f && n10Var.e == 0.0f) || this.t0 != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.u0;
            if (!this.Q0) {
                i4 = i3;
            }
            k kVar = new k(15, this);
            Iterator it = arrayList.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                xr0 xr0Var = (xr0) it.next();
                int i11 = xr0Var.c;
                boolean z2 = xr0Var.d;
                boolean z3 = xr0Var.g;
                if (i11 != -1) {
                    i10 = (measuredWidth - (i11 * i3)) / i11;
                    i8 = i7;
                }
                if (z3) {
                    i10 += i3;
                }
                n10 n10Var2 = xr0Var.b;
                float f = i8;
                float f2 = i9;
                int i12 = z2 ? i8 + measuredWidth : i8 + i10;
                int i13 = measuredWidth;
                int i14 = i9 + i6;
                Iterator it2 = it;
                n10Var2.b = f;
                n10Var2.c = f2;
                n10Var2.d = i12;
                n10Var2.e = i14;
                kVar.invoke(xr0Var);
                i8 = i8 + i10 + i3;
                if (z3) {
                    i9 = i14 + i4;
                }
                measuredWidth = i13;
                it = it2;
                i7 = 0;
            }
        }
        this.t0 = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            this.R0.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            kmb kmbVar = null;
            if (action == 0) {
                ArrayList arrayList = this.u0;
                kz7 kz7Var = this.v0;
                List list = kz7Var != null ? ((yl7) kz7Var).a : null;
                if (list == null) {
                    list = hd5.a;
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                lg8 lg8Var = lg8.Y;
                if (!arrayList.isEmpty() && !list.isEmpty()) {
                    int y = (int) (motionEvent.getY() / (measuredHeight / list.size()));
                    int size = list.size() - 1;
                    if (y > size) {
                        String name = yr0.class.getName();
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null && l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, name, ho7.g("Calculated wrong row index=", y, size, ", correct index="), null);
                        }
                        y = size;
                    }
                    ex0 ex0Var = (ex0) list.get(y);
                    if (!ex0Var.isEmpty()) {
                        int x = (int) (motionEvent.getX() / (measuredWidth / ex0Var.size()));
                        int size2 = ex0Var.size() - 1;
                        if (x > size2) {
                            String name2 = yr0.class.getName();
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                                l6bVar2.c(lg8Var, name2, ho7.g("Calculated wrong column index=", x, size2, ", correct index="), null);
                            }
                            x = size2;
                        }
                        kmbVar = new kmb(new dx0(y, x), ex0Var.get(x));
                    }
                }
                if (kmbVar == null) {
                    return true;
                }
                this.E0 = (dx0) kmbVar.a;
                this.D0 = (yw0) kmbVar.b;
                invalidate();
                return true;
            }
            if (action == 1 || action == 3) {
                this.D0 = null;
                this.E0 = null;
                invalidate();
                return false;
            }
        }
        return false;
    }

    public final void setClickListener(hx0 hx0Var) {
        this.C0 = hx0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof oj7) || super.verifyDrawable(drawable);
    }
}
