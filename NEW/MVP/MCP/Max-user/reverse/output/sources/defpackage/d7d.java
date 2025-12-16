package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class d7d extends ConstraintLayout {
    public final awa F0;
    public int G0;
    public final wq8 H0;

    public d7d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(k1d.material_radial_view_group, this);
        wq8 wq8Var = new wq8();
        this.H0 = wq8Var;
        gkd gkdVar = new gkd(0.5f);
        s5i s5iVarE = wq8Var.a.a.e();
        s5iVarE.e = gkdVar;
        s5iVarE.f = gkdVar;
        s5iVarE.g = gkdVar;
        s5iVarE.h = gkdVar;
        wq8Var.setShapeAppearanceModel(s5iVarE.g());
        this.H0.k(ColorStateList.valueOf(-1));
        wq8 wq8Var2 = this.H0;
        WeakHashMap weakHashMap = hfh.a;
        setBackground(wq8Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.RadialViewGroup, i, 0);
        this.G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.RadialViewGroup_materialCircleRadius, 0);
        this.F0 = new awa(15, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = hfh.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            awa awaVar = this.F0;
            handler.removeCallbacks(awaVar);
            handler.post(awaVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        v();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            awa awaVar = this.F0;
            handler.removeCallbacks(awaVar);
            handler.post(awaVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.H0.k(ColorStateList.valueOf(i));
    }

    public abstract void v();
}
