package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.internal.H;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: d0, reason: collision with root package name */
    public static final int f355794d0 = R.style.Widget_MaterialComponents_Toolbar;

    /* renamed from: e0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f355795e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: V, reason: collision with root package name */
    @P
    public Integer f355796V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f355797W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f355798a0;

    /* renamed from: b0, reason: collision with root package name */
    @P
    public ImageView.ScaleType f355799b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public Boolean f355800c0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@N Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.toolbarStyle;
        int i13 = f355794d0;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        Context context2 = getContext();
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.MaterialToolbar, i12, i13, new int[0]);
        if (typedArrayD.hasValue(R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.f355797W = typedArrayD.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.f355798a0 = typedArrayD.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i14 = typedArrayD.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i14 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f355795e0;
            if (i14 < scaleTypeArr.length) {
                this.f355799b0 = scaleTypeArr[i14];
            }
        }
        if (typedArrayD.hasValue(R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.f355800c0 = Boolean.valueOf(typedArrayD.getBoolean(R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            kVar.n(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            kVar.j(context2);
            kVar.m(C22823h0.l(this));
            setBackground(kVar);
        }
    }

    @P
    public ImageView.ScaleType getLogoScaleType() {
        return this.f355799b0;
    }

    @P
    @InterfaceC42156l
    public Integer getNavigationIconTint() {
        return this.f355796V;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i12) {
        Menu menu = getMenu();
        boolean z12 = menu instanceof androidx.appcompat.view.menu.h;
        if (z12) {
            ((androidx.appcompat.view.menu.h) menu).w();
        }
        super.m(i12);
        if (z12) {
            ((androidx.appcompat.view.menu.h) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z12, i12, i13, i14, i15);
        int i16 = 0;
        ImageView imageView2 = null;
        if (this.f355797W || this.f355798a0) {
            Comparator<View> comparator = H.f356731a;
            ArrayList arrayListA = H.a(this, getTitle());
            TextView textView = arrayListA.isEmpty() ? null : (TextView) Collections.min(arrayListA, H.f356731a);
            ArrayList arrayListA2 = H.a(this, getSubtitle());
            TextView textView2 = arrayListA2.isEmpty() ? null : (TextView) Collections.max(arrayListA2, H.f356731a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i17 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i18 = 0; i18 < getChildCount(); i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i17 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i17 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f355797W && textView != null) {
                    y(textView, pair);
                }
                if (this.f355798a0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Comparator<View> comparator2 = H.f356731a;
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i16 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i16++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f355800c0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f355799b0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.shape.m.b(this, f12);
    }

    public void setLogoAdjustViewBounds(boolean z12) {
        Boolean bool = this.f355800c0;
        if (bool == null || bool.booleanValue() != z12) {
            this.f355800c0 = Boolean.valueOf(z12);
            requestLayout();
        }
    }

    public void setLogoScaleType(@N ImageView.ScaleType scaleType) {
        if (this.f355799b0 != scaleType) {
            this.f355799b0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@P Drawable drawable) {
        if (drawable != null && this.f355796V != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f355796V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@InterfaceC42156l int i12) {
        this.f355796V = Integer.valueOf(i12);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z12) {
        if (this.f355798a0 != z12) {
            this.f355798a0 = z12;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z12) {
        if (this.f355797W != z12) {
            this.f355797W = z12;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i12 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i13 = measuredWidth2 + i12;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i12, 0), Math.max(i13 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i12 += iMax;
            i13 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i13 - i12, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i12, textView.getTop(), i13, textView.getBottom());
    }
}
