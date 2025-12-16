package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public abstract class qj0 extends LinearLayout implements u6g {
    public qj0(Context context) {
        super(context, null, 0);
        setOrientation(1);
        int iD = kti.d(14 * vw4.d().getDisplayMetrics().density);
        setPadding(iD, iD, iD, iD);
        v1a v1aVar = a93.s0;
        dm7 dm7Var = new dm7(vw4.d().getDisplayMetrics().density * 2.0f, vw4.d().getDisplayMetrics().density * 24.0f, v1aVar.y(this).a().G().f.c);
        dm7Var.h.O(dm7Var, dm7.j[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, v1aVar.y(this).a().G().b.x));
        setBackground(dm7Var);
    }

    public void onThemeChanged(yeb yebVar) {
        Drawable background = getBackground();
        dm7 dm7Var = background instanceof dm7 ? (dm7) background : null;
        if (dm7Var != null) {
            v1a v1aVar = a93.s0;
            int i = v1aVar.y(this).a().G().f.c;
            cm7 cm7Var = dm7Var.i;
            yy7[] yy7VarArr = dm7.j;
            cm7Var.O(dm7Var, yy7VarArr[1], Integer.valueOf(i));
            dm7Var.h.O(dm7Var, yy7VarArr[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, v1aVar.y(this).a().G().b.x));
        }
    }
}
