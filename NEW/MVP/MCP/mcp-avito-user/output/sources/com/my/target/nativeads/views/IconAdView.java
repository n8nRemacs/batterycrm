package com.my.target.nativeads.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39922y0;
import e11.C39924z;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class IconAdView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C39922y0 f365014b;

    public IconAdView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C39922y0 c39922y0 = new C39922y0(context);
        this.f365014b = c39922y0;
        C39924z.m(c39922y0, "nativeads_icon");
        addView(c39922y0);
    }

    @N
    public ImageView getImageView() {
        return this.f365014b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i17 = ((i14 - i12) - measuredWidth) / 2;
                    int i18 = ((i15 - i13) - measuredHeight) / 2;
                    childAt.layout(i17, i18, measuredWidth + i17, measuredHeight + i18);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int childCount = getChildCount();
        if (size == 0 && size2 == 0) {
            setMeasuredDimension(0, 0);
        }
        C39922y0 c39922y0 = this.f365014b;
        c39922y0.measure(View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
        int measuredWidth = c39922y0.getMeasuredWidth();
        int measuredHeight = c39922y0.getMeasuredHeight();
        if (mode2 != 1073741824) {
            size2 = measuredHeight;
        }
        if (mode != 1073741824) {
            size = measuredWidth;
        }
        if (childCount > 1) {
            for (int i14 = 1; i14 < childCount; i14++) {
                getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION));
            }
        }
        setMeasuredDimension(size, size2);
    }
}
