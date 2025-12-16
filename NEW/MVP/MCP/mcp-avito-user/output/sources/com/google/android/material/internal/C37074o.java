package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R;
import j.X;

/* compiled from: ForegroundLinearLayout.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37074o extends LinearLayoutCompat {

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public Drawable f356833q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f356834r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f356835s;

    /* renamed from: t, reason: collision with root package name */
    public int f356836t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f356837u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f356838v;

    public C37074o(@j.N Context context, @j.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(@j.N Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f356833q;
        if (drawable != null) {
            if (this.f356838v) {
                this.f356838v = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z12 = this.f356837u;
                Rect rect = this.f356834r;
                if (z12) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i12 = this.f356836t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f356835s;
                Gravity.apply(i12, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    @X
    public final void drawableHotspotChanged(float f12, float f13) {
        super.drawableHotspotChanged(f12, f13);
        Drawable drawable = this.f356833q;
        if (drawable != null) {
            drawable.setHotspot(f12, f13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f356833q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f356833q.setState(getDrawableState());
    }

    @Override // android.view.View
    @j.P
    public Drawable getForeground() {
        return this.f356833q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f356836t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f356833q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        this.f356838v = z12 | this.f356838v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        this.f356838v = true;
    }

    @Override // android.view.View
    public void setForeground(@j.P Drawable drawable) {
        Drawable drawable2 = this.f356833q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f356833q);
            }
            this.f356833q = drawable;
            this.f356838v = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f356836t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i12) {
        if (this.f356836t != i12) {
            if ((8388615 & i12) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            this.f356836t = i12;
            if (i12 == 119 && this.f356833q != null) {
                this.f356833q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f356833q;
    }

    public C37074o(@j.N Context context, @j.P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, 0);
        this.f356834r = new Rect();
        this.f356835s = new Rect();
        this.f356836t = 119;
        this.f356837u = true;
        this.f356838v = false;
        int[] iArr = R.styleable.ForegroundLinearLayout;
        G.a(context, attributeSet, 0, 0);
        G.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f356836t = typedArrayObtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f356836t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f356837u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
