package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yp8 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ zp8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp8(zp8 zp8Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = zp8Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        zp8 zp8Var = this.c;
        ColorStateList colorStateList2 = zp8Var.y0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (zp8Var.x0 != 0 && zp8Var.y0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{rf3.g(zp8Var.y0.getColorForState(iArr3, 0), zp8Var.x0), rf3.g(zp8Var.y0.getColorForState(iArr2, 0), zp8Var.x0), zp8Var.x0});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            zp8 zp8Var = this.c;
            Drawable rippleDrawable = null;
            if (zp8Var.getText().toString().contentEquals(textView.getText()) && zp8Var.x0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(zp8Var.x0);
                if (this.b != null) {
                    t35.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = hfh.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
