package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.d7g;
import defpackage.dvc;
import defpackage.er8;
import defpackage.hfh;
import defpackage.iti;
import defpackage.jni;
import defpackage.m5d;
import defpackage.r9j;
import defpackage.t35;
import defpackage.veh;
import defpackage.vf9;
import defpackage.vs6;
import defpackage.wq8;
import defpackage.z5d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int m1 = m5d.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] n1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer h1;
    public boolean i1;
    public boolean j1;
    public ImageView.ScaleType k1;
    public Boolean l1;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        int i = dvc.toolbarStyle;
        int i2 = m1;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = d7g.d(context2, attributeSet, z5d.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayD.hasValue(z5d.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(z5d.MaterialToolbar_navigationIconTint, -1));
        }
        this.i1 = typedArrayD.getBoolean(z5d.MaterialToolbar_titleCentered, false);
        this.j1 = typedArrayD.getBoolean(z5d.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayD.getInt(z5d.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = n1;
            if (i3 < scaleTypeArr.length) {
                this.k1 = scaleTypeArr[i3];
            }
        }
        if (typedArrayD.hasValue(z5d.MaterialToolbar_logoAdjustViewBounds)) {
            this.l1 = Boolean.valueOf(typedArrayD.getBoolean(z5d.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : r9j.b(background);
        if (colorStateListValueOf != null) {
            wq8 wq8Var = new wq8();
            wq8Var.k(colorStateListValueOf);
            wq8Var.i(context2);
            WeakHashMap weakHashMap = hfh.a;
            wq8Var.j(veh.i(this));
            setBackground(wq8Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.k1;
    }

    public Integer getNavigationIconTint() {
        return this.h1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof vf9;
        if (z) {
            ((vf9) menu).w();
        }
        super.m(i);
        if (z) {
            ((vf9) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof wq8) {
            iti.c(this, (wq8) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.i1 || this.j1) {
            ArrayList arrayListE = jni.e(this, getTitle());
            boolean zIsEmpty = arrayListE.isEmpty();
            vs6 vs6Var = jni.a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListE, vs6Var);
            ArrayList arrayListE2 = jni.e(this, getSubtitle());
            TextView textView2 = arrayListE2.isEmpty() ? null : (TextView) Collections.max(arrayListE2, vs6Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.i1 && textView != null) {
                    y(textView, pair);
                }
                if (this.j1 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.l1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.k1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof wq8) {
            ((wq8) background).j(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.l1;
        if (bool == null || bool.booleanValue() != z) {
            this.l1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.k1 != scaleType) {
            this.k1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.h1 != null) {
            drawable = drawable.mutate();
            t35.g(drawable, this.h1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.h1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.i1 != z) {
            this.i1 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
