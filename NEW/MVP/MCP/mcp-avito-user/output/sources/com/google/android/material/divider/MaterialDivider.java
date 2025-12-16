package com.google.android.material.divider;

import BY0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.d;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.N;
import j.P;
import j.U;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class MaterialDivider extends View {

    /* renamed from: g, reason: collision with root package name */
    public static final int f356577g = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final k f356578b;

    /* renamed from: c, reason: collision with root package name */
    public int f356579c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public int f356580d;

    /* renamed from: e, reason: collision with root package name */
    public int f356581e;

    /* renamed from: f, reason: collision with root package name */
    public int f356582f;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@N Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.materialDividerStyle;
        int i13 = f356577g;
        super(a.a(context, attributeSet, i12, i13), attributeSet, i12);
        Context context2 = getContext();
        this.f356578b = new k();
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.MaterialDivider, i12, i13, new int[0]);
        this.f356579c = typedArrayD.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f356581e = typedArrayD.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f356582f = typedArrayD.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(c.b(typedArrayD, context2, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayD.recycle();
    }

    public int getDividerColor() {
        return this.f356580d;
    }

    @U
    public int getDividerInsetEnd() {
        return this.f356582f;
    }

    @U
    public int getDividerInsetStart() {
        return this.f356581e;
    }

    public int getDividerThickness() {
        return this.f356579c;
    }

    @Override // android.view.View
    public final void onDraw(@N Canvas canvas) {
        int width;
        int i12;
        super.onDraw(canvas);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = getLayoutDirection() == 1;
        int i13 = z12 ? this.f356582f : this.f356581e;
        if (z12) {
            width = getWidth();
            i12 = this.f356581e;
        } else {
            width = getWidth();
            i12 = this.f356582f;
        }
        int i14 = width - i12;
        k kVar = this.f356578b;
        kVar.setBounds(i13, 0, i14, getBottom() - getTop());
        kVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        int mode = View.MeasureSpec.getMode(i13);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i14 = this.f356579c;
            if (i14 > 0 && measuredHeight != i14) {
                measuredHeight = i14;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@InterfaceC42156l int i12) {
        if (this.f356580d != i12) {
            this.f356580d = i12;
            this.f356578b.n(ColorStateList.valueOf(i12));
            invalidate();
        }
    }

    public void setDividerColorResource(@InterfaceC42158n int i12) {
        setDividerColor(d.getColor(getContext(), i12));
    }

    public void setDividerInsetEnd(@U int i12) {
        this.f356582f = i12;
    }

    public void setDividerInsetEndResource(@InterfaceC42161q int i12) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i12));
    }

    public void setDividerInsetStart(@U int i12) {
        this.f356581e = i12;
    }

    public void setDividerInsetStartResource(@InterfaceC42161q int i12) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i12));
    }

    public void setDividerThickness(@U int i12) {
        if (this.f356579c != i12) {
            this.f356579c = i12;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@InterfaceC42161q int i12) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i12));
    }
}
