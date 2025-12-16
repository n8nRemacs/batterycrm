package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kdb extends ViewGroup {
    public int a;
    public int b;
    public int c;
    public final Paint d;
    public final Object o;
    public final sf s0;
    public final ArrayList t0;
    public idb u0;
    public x52 v0;

    public kdb(Context context) {
        super(context);
        this.a = kti.d(28 * vw4.d().getDisplayMetrics().density);
        this.b = kti.d(10 * vw4.d().getDisplayMetrics().density);
        this.c = kti.d(2 * vw4.d().getDisplayMetrics().density);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        this.o = ipi.b(3, new p1b(context, 11));
        this.s0 = new sf(5, this);
        this.t0 = new ArrayList();
    }

    private final int getAvatarsWidth() {
        return (this.t0.size() * this.a) - ((r1.size() - 1) * this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2 = 2.0f;
        float f3 = this.a / 2.0f;
        float measuredHeight = (getMeasuredHeight() / 2.0f) - f3;
        float f4 = vw4.d().getDisplayMetrics().density * 0.0f;
        x52 x52Var = this.v0;
        float f5 = x52Var != null ? x52Var.s0 : 0.0f;
        float f6 = -f5;
        int iSaveLayer = canvas.saveLayer(f6, f6, getWidth() + f5, getHeight() + f5, null);
        ArrayList arrayList2 = this.t0;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            Drawable drawable = (Drawable) next;
            int iSave = canvas.save();
            canvas.translate(f4, measuredHeight);
            try {
                int i3 = this.a;
                int i4 = i3 - this.b;
                float f7 = i3 / f2;
                float f8 = i4;
                f4 += f8;
                x52 x52Var2 = this.v0;
                if (x52Var2 != null) {
                    Float f9 = (Float) ys.x(i, x52Var2.o);
                    float fFloatValue = f9 != null ? f9.floatValue() : 1.0f;
                    f = f2;
                    float f10 = this.a / f;
                    arrayList = arrayList2;
                    iSave = canvas.save();
                    canvas.scale(fFloatValue, fFloatValue, f10, f10);
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(iSave);
                    } finally {
                        canvas.restoreToCount(iSave);
                    }
                } else {
                    arrayList = arrayList2;
                    f = f2;
                    drawable.draw(canvas);
                }
                if (i != ve3.i(arrayList)) {
                    canvas.drawCircle(f8 + f3, f7, this.c + f3, this.d);
                }
                canvas.restoreToCount(iSave);
                i = i2;
                f2 = f;
                arrayList2 = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
        canvas.restoreToCount(iSaveLayer);
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getAvatarsCount() {
        return this.t0.size();
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x52 x52Var = this.v0;
        if (x52Var != null) {
            x52Var.d(getAvatarsCount());
        }
        x52 x52Var2 = this.v0;
        if (x52Var2 != null) {
            x52Var2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x52 x52Var = this.v0;
        if (x52Var != null) {
            x52Var.stop();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewJ = dqi.j(this.o);
        if (viewJ == null) {
            return;
        }
        int iC = u45.c(8, vw4.d().getDisplayMetrics().density, getAvatarsWidth());
        viewJ.layout(iC, (getMeasuredHeight() / 2) - (viewJ.getMeasuredHeight() / 2), viewJ.getMeasuredWidth() + iC, (viewJ.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int avatarsWidth = getAvatarsWidth();
        int iMax = this.a;
        View viewJ = dqi.j(this.o);
        if (viewJ != null) {
            float f = 8;
            int iQ = u45.q(f, vw4.d().getDisplayMetrics().density, size - avatarsWidth);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = iQ - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i4 = i3 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            if (i4 < 0) {
                i4 = 0;
            }
            viewJ.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            avatarsWidth = utb.j(f, vw4.d().getDisplayMetrics().density, viewJ.getMeasuredWidth(), avatarsWidth);
            iMax = Math.max(this.a, viewJ.getMeasuredHeight());
        }
        setMeasuredDimension(avatarsWidth, iMax);
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<imb> list) {
        ArrayList arrayList = this.t0;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        for (imb imbVar : list) {
            mc0 mc0Var = (mc0) imbVar.a;
            String str = (String) imbVar.b;
            gxa gxaVar = new gxa(getContext());
            gxaVar.setCallback(this.s0);
            int i = this.a;
            gxaVar.setBounds(0, 0, i, i);
            gxaVar.b(mc0Var, str);
            arrayList.add(gxaVar);
        }
        x52 x52Var = this.v0;
        if (x52Var != null) {
            if (list.isEmpty()) {
                x52Var.stop();
            } else {
                x52Var.d(list.size());
                x52Var.start();
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setListener(idb idbVar) {
        this.u0 = idbVar;
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setTitle(s5g s5gVar) {
        ?? r0 = this.o;
        if (s5gVar == null) {
            ((TextView) r0.getValue()).setText((CharSequence) null);
            ((TextView) r0.getValue()).setVisibility(8);
        } else {
            fqi.c(this, (View) r0.getValue(), -1);
            ((TextView) r0.getValue()).setText(s5gVar.b(getContext()));
            ((TextView) r0.getValue()).setVisibility(0);
        }
    }
}
