package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import java.util.WeakHashMap;

/* compiled from: FlowLayout.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37073n extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public int f356829b;

    /* renamed from: c, reason: collision with root package name */
    public int f356830c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356831d;

    /* renamed from: e, reason: collision with root package name */
    public int f356832e;

    public boolean a() {
        return this.f356831d;
    }

    public int getItemSpacing() {
        return this.f356830c;
    }

    public int getLineSpacing() {
        return this.f356829b;
    }

    public int getRowCount() {
        return this.f356832e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f356832e = 0;
            return;
        }
        this.f356832e = 1;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z13 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i14 - i12) - paddingLeft;
        int measuredWidth = paddingRight;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                if (!this.f356831d && measuredWidth2 > i16) {
                    i17 = this.f356829b + paddingTop;
                    this.f356832e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f356832e - 1));
                int i19 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z13) {
                    childAt.layout(i16 - measuredWidth3, i17, (i16 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f356830c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i13);
        int i17 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i17 - getPaddingRight();
        int i18 = paddingTop;
        int i19 = 0;
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i12, i13);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = marginLayoutParams.leftMargin;
                    i15 = marginLayoutParams.rightMargin;
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                int i23 = paddingLeft2;
                if (childAt.getMeasuredWidth() + paddingLeft2 + i16 <= paddingRight || a()) {
                    paddingLeft = i23;
                } else {
                    paddingLeft = getPaddingLeft();
                    i18 = this.f356829b + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i16;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (measuredWidth > i19) {
                    i19 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i16 + i15 + this.f356830c + paddingLeft;
                if (i22 == getChildCount() - 1) {
                    i19 += i15;
                }
                paddingLeft2 = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i19;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i14 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i14 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i14) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i12) {
        this.f356830c = i12;
    }

    public void setLineSpacing(int i12) {
        this.f356829b = i12;
    }

    public void setSingleLine(boolean z12) {
        this.f356831d = z12;
    }
}
