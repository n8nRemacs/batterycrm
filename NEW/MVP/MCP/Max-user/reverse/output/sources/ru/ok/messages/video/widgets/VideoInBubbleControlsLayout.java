package ru.ok.messages.video.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.rw4;

/* loaded from: classes2.dex */
public class VideoInBubbleControlsLayout extends LinearLayout {
    public final rw4 a;
    public final int b;

    public VideoInBubbleControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        rw4 rw4VarA = rw4.a();
        this.a = rw4VarA;
        this.b = rw4VarA.e;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                if (childAt.getLeft() < this.a.h) {
                    for (int i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt2 = getChildAt(i6);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                        int i7 = marginLayoutParams.leftMargin;
                        int i8 = this.b;
                        if (i7 > i8) {
                            marginLayoutParams.leftMargin = i8;
                        }
                        if (marginLayoutParams.rightMargin > i8) {
                            marginLayoutParams.rightMargin = i8;
                        }
                        childAt2.setLayoutParams(marginLayoutParams);
                    }
                    requestLayout();
                    return;
                }
                return;
            }
        }
    }
}
