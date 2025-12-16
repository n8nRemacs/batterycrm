package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class c extends androidx.constraintlayout.widget.a {

    /* renamed from: j, reason: collision with root package name */
    public float f43679j;

    /* renamed from: k, reason: collision with root package name */
    public float f43680k;

    /* renamed from: l, reason: collision with root package name */
    public float f43681l;

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f43682m;

    /* renamed from: n, reason: collision with root package name */
    public float f43683n;

    /* renamed from: o, reason: collision with root package name */
    public float f43684o;

    /* renamed from: p, reason: collision with root package name */
    public float f43685p;

    /* renamed from: q, reason: collision with root package name */
    public float f43686q;

    /* renamed from: r, reason: collision with root package name */
    public float f43687r;

    /* renamed from: s, reason: collision with root package name */
    public float f43688s;

    /* renamed from: t, reason: collision with root package name */
    public float f43689t;

    /* renamed from: u, reason: collision with root package name */
    public float f43690u;

    /* renamed from: v, reason: collision with root package name */
    public View[] f43691v;

    /* renamed from: w, reason: collision with root package name */
    public float f43692w;

    /* renamed from: x, reason: collision with root package name */
    public float f43693x;

    @Override // androidx.constraintlayout.widget.a
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                typedArrayObtainStyledAttributes.getIndex(i12);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void o() {
        t();
        this.f43685p = Float.NaN;
        this.f43686q = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.b) getLayoutParams()).f44214r0;
        constraintWidget.S(0);
        constraintWidget.P(0);
        s();
        layout(((int) this.f43689t) - getPaddingLeft(), ((int) this.f43690u) - getPaddingTop(), getPaddingRight() + ((int) this.f43687r), getPaddingBottom() + ((int) this.f43688s));
        u();
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43682m = (ConstraintLayout) getParent();
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            View viewById = this.f43682m.getViewById(this.f44233b[i12]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void p(ConstraintLayout constraintLayout) {
        this.f43682m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f43681l = rotation;
        } else {
            if (Float.isNaN(this.f43681l)) {
                return;
            }
            this.f43681l = rotation;
        }
    }

    public final void s() {
        if (this.f43682m == null) {
            return;
        }
        if (Float.isNaN(this.f43685p) || Float.isNaN(this.f43686q)) {
            if (!Float.isNaN(this.f43679j) && !Float.isNaN(this.f43680k)) {
                this.f43686q = this.f43680k;
                this.f43685p = this.f43679j;
                return;
            }
            View[] viewArrK = k(this.f43682m);
            int left = viewArrK[0].getLeft();
            int top = viewArrK[0].getTop();
            int right = viewArrK[0].getRight();
            int bottom = viewArrK[0].getBottom();
            for (int i12 = 0; i12 < this.f44234c; i12++) {
                View view = viewArrK[i12];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f43687r = right;
            this.f43688s = bottom;
            this.f43689t = left;
            this.f43690u = top;
            if (Float.isNaN(this.f43679j)) {
                this.f43685p = (left + right) / 2;
            } else {
                this.f43685p = this.f43679j;
            }
            if (Float.isNaN(this.f43680k)) {
                this.f43686q = (top + bottom) / 2;
            } else {
                this.f43686q = this.f43680k;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        f();
    }

    @Override // android.view.View
    public void setPivotX(float f12) {
        this.f43679j = f12;
        u();
    }

    @Override // android.view.View
    public void setPivotY(float f12) {
        this.f43680k = f12;
        u();
    }

    @Override // android.view.View
    public void setRotation(float f12) {
        this.f43681l = f12;
        u();
    }

    @Override // android.view.View
    public void setScaleX(float f12) {
        this.f43683n = f12;
        u();
    }

    @Override // android.view.View
    public void setScaleY(float f12) {
        this.f43684o = f12;
        u();
    }

    @Override // android.view.View
    public void setTranslationX(float f12) {
        this.f43692w = f12;
        u();
    }

    @Override // android.view.View
    public void setTranslationY(float f12) {
        this.f43693x = f12;
        u();
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        f();
    }

    public final void t() {
        int i12;
        if (this.f43682m == null || (i12 = this.f44234c) == 0) {
            return;
        }
        View[] viewArr = this.f43691v;
        if (viewArr == null || viewArr.length != i12) {
            this.f43691v = new View[i12];
        }
        for (int i13 = 0; i13 < this.f44234c; i13++) {
            this.f43691v[i13] = this.f43682m.getViewById(this.f44233b[i13]);
        }
    }

    public final void u() {
        if (this.f43682m == null) {
            return;
        }
        if (this.f43691v == null) {
            t();
        }
        s();
        double radians = Float.isNaN(this.f43681l) ? 0.0d : Math.toRadians(this.f43681l);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f12 = this.f43683n;
        float f13 = f12 * fCos;
        float f14 = this.f43684o;
        float f15 = (-f14) * fSin;
        float f16 = f12 * fSin;
        float f17 = f14 * fCos;
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            View view = this.f43691v[i12];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f18 = right - this.f43685p;
            float f19 = bottom - this.f43686q;
            float f22 = (((f15 * f19) + (f13 * f18)) - f18) + this.f43692w;
            float f23 = (((f17 * f19) + (f18 * f16)) - f19) + this.f43693x;
            view.setTranslationX(f22);
            view.setTranslationY(f23);
            view.setScaleY(this.f43684o);
            view.setScaleX(this.f43683n);
            if (!Float.isNaN(this.f43681l)) {
                view.setRotation(this.f43681l);
            }
        }
    }
}
