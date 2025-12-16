package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class tx3 extends vhd implements u6g {
    public Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final Rect b;
    public final Object c;
    public final Object d;
    public final Object o;

    public tx3(r6a r6aVar, s6a s6aVar) {
        this.a = 3;
        this.d = r6aVar;
        this.o = s6aVar;
        this.X = (Drawable) r6aVar.invoke();
        this.b = new Rect();
        this.Y = new int[]{R.attr.state_checked};
        this.c = new int[]{-16842912};
    }

    public static boolean j(int i, Integer num, Integer num2) {
        int i2 = udb.r;
        if (i != i2) {
            return false;
        }
        if (num != null && num.intValue() == i2) {
            return false;
        }
        return num2 == null || num2.intValue() != i2;
    }

    public static final void l(tx3 tx3Var, Canvas canvas) {
        Path path = (Path) tx3Var.X;
        RectF rectF = (RectF) tx3Var.d;
        float[] fArr = (float[]) tx3Var.o;
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(path, (Paint) tx3Var.Y);
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ys.q(fArr, 0.0f);
    }

    public static final void m(tx3 tx3Var) {
        RectF rectF = (RectF) tx3Var.d;
        float f = rectF.left;
        Rect rect = tx3Var.b;
        rectF.left = Math.min(f, rect.left);
        rectF.top = Math.min(rectF.top, rect.top);
        rectF.right = Math.max(rectF.right, rect.right);
        rectF.bottom = Math.max(rectF.bottom, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    @Override // defpackage.vhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.iid r9) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx3.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, iid):void");
    }

    @Override // defpackage.vhd
    public void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        tx3 tx3Var = this;
        switch (tx3Var.a) {
            case 2:
                float[] fArr = (float[]) tx3Var.o;
                RectF rectF = (RectF) tx3Var.d;
                rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
                float f = vw4.d().getDisplayMetrics().density * 16.0f;
                phd adapter = recyclerView.getAdapter();
                y0f y0fVar = adapter instanceof y0f ? (y0f) adapter : null;
                if (y0fVar != null) {
                    iv ivVar = y0fVar.d;
                    int childCount = recyclerView.getChildCount();
                    char c = 0;
                    int i = 0;
                    while (i < childCount) {
                        View childAt = recyclerView.getChildAt(i);
                        int iR = RecyclerView.R(childAt);
                        if (iR == -1) {
                            break;
                        } else {
                            ((mc5) tx3Var.c).h(tx3Var.b, childAt, iR);
                            t98 t98Var = (t98) ue3.J(iR - 1, ivVar.f);
                            Integer numValueOf = t98Var != null ? Integer.valueOf(t98Var.getK0()) : null;
                            int iL = y0fVar.l(iR);
                            t98 t98Var2 = (t98) ue3.J(iR + 1, ivVar.f);
                            Integer numValueOf2 = t98Var2 != null ? Integer.valueOf(t98Var2.getK0()) : null;
                            int i2 = udb.r;
                            if ((iL == i2 && ((numValueOf == null || numValueOf.intValue() != i2) && numValueOf2 != null && numValueOf2.intValue() == i2)) || j(iL, numValueOf, numValueOf2)) {
                                fArr[c] = f;
                                fArr[1] = f;
                                fArr[2] = f;
                                fArr[3] = f;
                                rectF.set(r14.left, r14.top, r14.right, r14.bottom);
                            }
                            if ((iL == i2 && numValueOf != null && numValueOf.intValue() == i2 && (numValueOf2 == null || numValueOf2.intValue() != i2)) || j(iL, numValueOf, numValueOf2)) {
                                m(this);
                                fArr[4] = f;
                                fArr[5] = f;
                                fArr[6] = f;
                                fArr[7] = f;
                                l(this, canvas);
                            } else if (iL == i2 && numValueOf != null && numValueOf.intValue() == i2 && numValueOf2 != null && numValueOf2.intValue() == i2) {
                                m(this);
                            }
                            i++;
                            c = 0;
                            tx3Var = this;
                        }
                    }
                    if (rectF.height() > 0.0f) {
                        l(this, canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vhd
    public void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                int i = 0;
                while (true) {
                    if (!(i < recyclerView.getChildCount())) {
                        return;
                    }
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iR = RecyclerView.R(childAt);
                    if (((i8a) this.X).d(iR)) {
                        ((mc5) this.c).v(this.b, childAt, iR);
                        canvas2 = canvas;
                        canvas2.drawLine(r6.left + iD, r6.centerY(), r6.right - iD, r6.centerY(), (Paint) this.Y);
                    } else {
                        canvas2 = canvas;
                    }
                    i = i2;
                    canvas = canvas2;
                }
            case 1:
                TextPaint textPaint = (TextPaint) this.Y;
                int i3 = 0;
                while (true) {
                    if (!(i3 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i4 = i3 + 1;
                    View childAt2 = recyclerView.getChildAt(i3);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iR2 = RecyclerView.R(childAt2);
                    if (iR2 != -1 && i(iR2)) {
                        String str = (String) ((em6) this.X).invoke(Integer.valueOf(iR2));
                        ((mc5) this.c).v(this.b, childAt2, iR2);
                        canvas.drawText(str, r7.left, textPaint.descent() + u45.c(10, vw4.d().getDisplayMetrics().density, r7.top), textPaint);
                    }
                    i3 = i4;
                }
                break;
            case 2:
            default:
                return;
            case 3:
                int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
                int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                canvas.save();
                Rect rect = this.b;
                recyclerView.getDrawingRect(rect);
                canvas.clipRect(rect);
                int i5 = 0;
                while (true) {
                    if (!(i5 < recyclerView.getChildCount())) {
                        canvas.restore();
                        return;
                    }
                    int i6 = i5 + 1;
                    View childAt3 = recyclerView.getChildAt(i5);
                    if (childAt3 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iR3 = RecyclerView.R(childAt3);
                    RecyclerView.V(rect, childAt3);
                    if (((Boolean) ((s6a) this.o).invoke(Integer.valueOf(iR3))).booleanValue()) {
                        ((Drawable) this.X).setState((int[]) this.Y);
                    } else {
                        ((Drawable) this.X).setState((int[]) this.c);
                    }
                    Drawable drawable = (Drawable) this.X;
                    drawable.setAlpha(kti.d(childAt3.getAlpha() * 255));
                    int i7 = rect.right - iD2;
                    int i8 = rect.top;
                    drawable.setBounds(i7 - iD3, i8 + iD2, i7, i8 + iD3 + iD2);
                    drawable.draw(canvas);
                    i5 = i6;
                }
        }
    }

    public boolean i(int i) {
        b0i b0iVar = (b0i) this.o;
        if (i <= 0 || b0iVar.j() <= 0) {
            return false;
        }
        zea zeaVarJ = b0iVar.J(i - 1);
        Integer numValueOf = zeaVarJ != null ? Integer.valueOf(zeaVarJ.c) : null;
        return !fni.a(numValueOf, b0iVar.J(i) != null ? Integer.valueOf(r4.c) : null);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        switch (this.a) {
            case 0:
                ((Paint) this.Y).setColor(yebVar.i().b.b);
                break;
            case 1:
                TextPaint textPaint = (TextPaint) this.Y;
                t5g t5gVar = dpg.k;
                RecyclerView recyclerView = (RecyclerView) this.d;
                t5g.c(t5gVar, recyclerView.getContext(), textPaint, null, null, 12);
                textPaint.setColor(a93.s0.y(recyclerView).getText().i);
                break;
            case 2:
                ((Paint) this.Y).setColor(yebVar.b().h);
                break;
            default:
                this.X = (Drawable) ((r6a) this.d).invoke();
                break;
        }
    }

    public tx3(yeb yebVar) {
        this.a = 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.Y = paint;
        this.d = new RectF();
        this.b = new Rect();
        this.o = new float[8];
        this.X = new Path();
        this.c = new mc5(18);
        onThemeChanged(yebVar);
    }

    public tx3(RecyclerView recyclerView, b0i b0iVar, em6 em6Var) {
        this.a = 1;
        this.d = recyclerView;
        this.o = b0iVar;
        this.X = em6Var;
        this.b = new Rect();
        this.Y = new TextPaint();
        onThemeChanged(a93.s0.y(recyclerView));
        this.c = new mc5(18);
    }

    public tx3(r5j r5jVar, yeb yebVar, sx3 sx3Var) {
        this.a = 0;
        this.d = r5jVar;
        this.o = sx3Var;
        this.b = new Rect();
        i8a i8aVar = vo7.a;
        this.X = new i8a();
        Paint paint = new Paint();
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 0.5f);
        this.Y = paint;
        this.c = new mc5(18);
        onThemeChanged(yebVar);
    }
}
