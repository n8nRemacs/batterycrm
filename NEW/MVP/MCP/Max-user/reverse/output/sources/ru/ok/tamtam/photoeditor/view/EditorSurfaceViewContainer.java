package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.p95;
import defpackage.r95;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class EditorSurfaceViewContainer extends FrameLayout implements p95 {
    public final View a;
    public final View b;
    public final r95 c;
    public boolean d;
    public final Rect o;
    public final Rect s0;

    public EditorSurfaceViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new Rect();
        this.s0 = new Rect();
        r95 r95Var = new r95(getContext());
        r95Var.a = new ArrayList();
        r95Var.d = new Matrix();
        r95Var.o = new Matrix();
        r95Var.u0 = new float[9];
        r95Var.v0 = 3.0f;
        r95Var.x0 = false;
        r95Var.b = new ScaleGestureDetector(r95Var.getContext(), r95Var);
        this.c = r95Var;
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.c.setBoundingListener(this);
        addView(this.c);
        this.a = new View(getContext());
        this.b = new View(getContext());
        this.a.setBackgroundColor(-872415232);
        this.b.setBackgroundColor(-872415232);
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        addView(this.a);
        addView(this.b);
    }

    public r95 getEditorSurfaceView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(i, i2, i3, i4);
        if (this.d) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int iMin = Math.min(i5, i6);
            int i7 = iMin / 2;
            int i8 = i5 / 2;
            int i9 = i6 / 2;
            if (iMin == i5) {
                int i10 = i9 - i7;
                this.a.layout(i, i10 - this.a.getMeasuredHeight(), i3, i10);
                this.b.layout(i, i9 + i7, i3, i4);
                return;
            }
            int measuredWidth = this.a.getMeasuredWidth();
            int i11 = i8 - i7;
            this.a.layout(i11 - measuredWidth, i2, i11, i4);
            int i12 = i8 + i7;
            this.b.layout(i12, i2, measuredWidth + i12, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.c.measure(i, i2);
        if (this.d) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int iMin = Math.min(size, size2);
            if (iMin == size) {
                int i3 = (size2 - iMin) / 2;
                this.a.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                this.b.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } else {
                int i4 = (size - iMin) / 2;
                this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
                this.b.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // defpackage.p95
    public void setDrawStickerEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        this.a.setVisibility(z ? 0 : 8);
        this.b.setVisibility(this.d ? 0 : 8);
    }
}
