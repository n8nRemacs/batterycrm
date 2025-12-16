package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import defpackage.yf5;

/* loaded from: classes2.dex */
public class RecyclerAutofitGridView extends yf5 {
    public int h2;
    public int i2;
    public int j2;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (2 == getContext().getResources().getConfiguration().orientation) {
            this.j2 = 8;
        } else {
            this.j2 = 4;
        }
        getContext();
        setLayoutManager(new GridLayoutManager(this.j2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && this.h2 > 0) {
            int iMax = Math.max(2, getMeasuredWidth() / this.h2);
            int i3 = this.j2;
            if (iMax > i3) {
                iMax = i3;
            }
            ((GridLayoutManager) layoutManager).B1(iMax);
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || this.i2 <= 0) {
            return;
        }
        int iMax2 = Math.max(2, getMeasuredWidth() / this.i2);
        int i4 = this.j2;
        if (iMax2 > i4) {
            iMax2 = i4;
        }
        ((StaggeredGridLayoutManager) layoutManager).k1(iMax2);
    }

    public void setColumnWidth(int i) {
        this.h2 = i;
        requestLayout();
    }

    public void setMaxColumns(int i) {
        this.j2 = i;
    }

    public void setStaggeredColumnWidth(int i) {
        this.i2 = i;
        requestLayout();
    }
}
