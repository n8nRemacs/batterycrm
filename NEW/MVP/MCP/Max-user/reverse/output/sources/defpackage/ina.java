package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class ina extends ViewGroup implements u6g {
    public final Path a;
    public final Rect b;
    public final LinkedHashMap c;
    public hna d;
    public final BitSet o;
    public final int s0;
    public final int t0;
    public final yo8 u0;
    public final yo8 v0;
    public final w2b w0;

    public ina(Context context) {
        super(context, null);
        this.a = new Path();
        this.b = new Rect();
        this.c = new LinkedHashMap();
        this.d = new hna(0, false, false, false);
        BitSet bitSet = new BitSet(3);
        this.o = bitSet;
        this.s0 = 1;
        this.t0 = 2;
        yo8 yo8Var = new yo8(context);
        yo8Var.setId(zud.m0);
        yo8Var.setIcon(yud.h1);
        yo8Var.setFocusable(0);
        this.u0 = yo8Var;
        yo8 yo8Var2 = new yo8(context);
        yo8Var2.setId(zud.n0);
        yo8Var2.setIcon(yud.U);
        yo8Var2.setFocusable(0);
        float f = 20;
        yo8Var2.setLayoutParams(new ViewGroup.MarginLayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        this.v0 = yo8Var2;
        w2b w2bVar = new w2b(context);
        w2bVar.setId(zud.l0);
        w2bVar.setFocusable(0);
        this.w0 = w2bVar;
        addView(w2bVar);
        addView(yo8Var);
        addView(yo8Var2);
        bitSet.set(0, bitSet.size(), false);
    }

    private final void setupMention(boolean z) {
        BitSet bitSet = this.o;
        boolean z2 = false;
        bitSet.set(0, z);
        if (!z && this.d.b) {
            z2 = true;
        }
        bitSet.set(this.s0, z2);
        v1a v1aVar = a93.s0;
        yo8 yo8Var = this.u0;
        yo8Var.setBackgroundColor(v1aVar.y(yo8Var).b().a.n);
        v1aVar.y(yo8Var).getIcon();
        yo8Var.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z) {
        int i;
        this.o.set(this.s0, z && !this.d.c);
        boolean z2 = this.d.d;
        v1a v1aVar = a93.s0;
        yo8 yo8Var = this.v0;
        yeb yebVarY = v1aVar.y(yo8Var);
        if (z2) {
            i = yebVarY.getIcon().j;
        } else {
            yebVarY.getIcon();
            i = -1;
        }
        boolean z3 = this.d.d;
        yeb yebVarY2 = v1aVar.y(yo8Var);
        yo8Var.setBackgroundColor(z3 ? yebVarY2.b().a.h : yebVarY2.e().a);
        yo8Var.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof yo8) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), Math.min(rect.width(), rect.height()) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof w2b) {
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.o;
            yo8 yo8Var = bitSet.get(0) ? this.u0 : bitSet.get(this.s0) ? this.v0 : null;
            if (yo8Var != null) {
                Rect rect2 = new Rect(yo8Var.getLeft(), yo8Var.getTop(), yo8Var.getRight(), yo8Var.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (Math.min(rect2.width(), rect2.height()) / 2.0f) + kti.d(2 * vw4.d().getDisplayMetrics().density), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z, yeb yebVar) {
        int i;
        if (z) {
            i = yebVar.getIcon().j;
        } else {
            yebVar.getIcon();
            i = -1;
        }
        int i2 = z ? yebVar.b().a.h : yebVar.e().a;
        yo8 yo8Var = this.v0;
        yo8Var.setBackgroundColor(i2);
        yo8Var.setIconColor(i);
        int i3 = yebVar.b().a.n;
        yo8 yo8Var2 = this.u0;
        yo8Var2.setBackgroundColor(i3);
        yo8Var2.setIconColor(-1);
        this.w0.setAppearance(z ? r2b.c : r2b.a);
        invalidate();
    }

    public final void c(boolean z) {
        hna hnaVar = this.d;
        boolean z2 = hnaVar.c;
        this.d = hna.a(hnaVar, 0, false, z, false, 11);
        if (z2 != z) {
            setupMention(z);
        }
    }

    public final void d(boolean z) {
        hna hnaVar = this.d;
        boolean z2 = hnaVar.b;
        this.d = hna.a(hnaVar, 0, z, false, false, 13);
        if (z2 != z) {
            setupReaction(z);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iSave = canvas.save();
        canvas.clipPath((Path) obj);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int i5 = this.s0;
        BitSet bitSet = this.o;
        if (bitSet.get(i5)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            yo8 yo8Var = this.v0;
            m8j.e(this.v0, this, paddingStart2, paddingTop, yo8Var.getMeasuredWidth() + paddingStart3, yo8Var.getMeasuredHeight() + getPaddingTop());
            a(yo8Var);
            paddingStart += yo8Var.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            yo8 yo8Var2 = this.u0;
            m8j.e(this.u0, this, paddingStart4, paddingTop2, yo8Var2.getMeasuredWidth() + paddingStart5, yo8Var2.getMeasuredHeight() + getPaddingTop());
            a(yo8Var2);
            paddingStart += yo8Var2.getMeasuredWidth();
        }
        int i6 = paddingStart;
        if (bitSet.get(this.t0)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            w2b w2bVar = this.w0;
            m8j.e(this.w0, this, i6, paddingTop3, measuredWidth, w2bVar.getMeasuredHeight() + paddingTop4);
            a(w2bVar);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        BitSet bitSet = this.o;
        int i3 = bitSet.get(0) ? 0 : 8;
        yo8 yo8Var = this.u0;
        yo8Var.setVisibility(i3);
        int i4 = bitSet.get(this.s0) ? 0 : 8;
        yo8 yo8Var2 = this.v0;
        yo8Var2.setVisibility(i4);
        int i5 = this.t0;
        int i6 = bitSet.get(i5) ? 0 : 8;
        w2b w2bVar = this.w0;
        w2bVar.setVisibility(i6);
        float f = 20;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        if (bitSet.get(0)) {
            yo8Var.measure(View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f), 1073741824));
            measuredWidth = yo8Var.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (yo8Var2.getVisibility() == 0) {
            yo8Var2.measure(View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f), 1073741824));
            measuredWidth += yo8Var2.getMeasuredWidth();
        }
        if (bitSet.get(i5)) {
            w2bVar.measure(0, View.MeasureSpec.makeMeasureSpec(kti.d(f * vw4.d().getDisplayMetrics().density), 1073741824));
            measuredWidth += w2bVar.getMeasuredWidth();
        }
        setMeasuredDimension(measuredWidth, iD);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        b(this.d.d, yebVar);
        this.w0.f(yebVar);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
