package ru.ok.tamtam.photoeditor.view.colorselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e6d;
import defpackage.lf3;
import defpackage.nf3;

/* loaded from: classes2.dex */
public class ColorSelectorView extends RecyclerView {
    public final lf3 U1;
    public final int V1;

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = 0;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e6d.ColorSelectorView);
        this.V1 = typedArrayObtainStyledAttributes.getInt(e6d.ColorSelectorView_color_selector_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        getContext();
        int i = this.V1;
        setLayoutManager(new LinearLayoutManager(i == 0 ? 0 : 1, i == 0));
        lf3 lf3Var = new lf3(getContext(), this.V1);
        this.U1 = lf3Var;
        setAdapter(lf3Var);
    }

    public void setColors(int[] iArr) {
        lf3 lf3Var = this.U1;
        lf3Var.o = iArr;
        lf3Var.m();
    }

    public void setListener(nf3 nf3Var) {
        this.U1.t0 = nf3Var;
    }
}
