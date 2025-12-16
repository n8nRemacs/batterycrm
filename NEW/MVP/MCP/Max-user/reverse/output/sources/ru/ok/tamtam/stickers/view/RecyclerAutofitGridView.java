package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.kd5;
import defpackage.ky6;
import defpackage.phd;

/* loaded from: classes2.dex */
public class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager U1;
    public int V1;
    public int W1;
    public View X1;
    public final kd5 Y1;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = 5;
        this.Y1 = new kd5(5, this);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.V1);
        this.U1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void F0() {
        if (this.X1 == null) {
            return;
        }
        phd adapter = getAdapter();
        this.X1.setVisibility((adapter == null || adapter.j() <= 0) ? 0 : 8);
    }

    public int getSpanCount() {
        return this.V1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.W1 > 0) {
            this.U1.B1(Math.max(1, getMeasuredWidth() / this.W1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(phd phdVar) {
        phd adapter = getAdapter();
        kd5 kd5Var = this.Y1;
        if (adapter != null) {
            adapter.B(kd5Var);
        }
        super.setAdapter(phdVar);
        if (this.X1 != null) {
            if (phdVar != null) {
                phdVar.z(kd5Var);
            }
            F0();
        }
    }

    public void setColumnWidth(int i) {
        this.W1 = i;
        requestLayout();
    }

    public void setDefaultColumns(int i) {
        this.V1 = i;
        this.U1.B1(i);
        setLayoutManager(null);
        setLayoutManager(this.U1);
    }

    public void setEmptyView(View view) {
        this.X1 = view;
        phd adapter = getAdapter();
        if (adapter != null) {
            adapter.z(this.Y1);
        }
        F0();
    }

    public void setSpanSizeLookup(ky6 ky6Var) {
        this.U1.K = ky6Var;
    }
}
