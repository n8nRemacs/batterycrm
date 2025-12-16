package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class x14 extends mid {
    public static final int[] G0 = {-16239405, -16737808};
    public static final int[] H0 = {-11664148, -7436801};
    public final b14 E0;
    public final ii0 F0;

    public x14(Context context, b14 b14Var) {
        ii0 ii0Var = (ii0) bi0.a.getAccessor().c(155);
        v7b v7bVar = new v7b(context);
        super(v7bVar);
        this.E0 = b14Var;
        this.F0 = ii0Var;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float f = 12;
        marginLayoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        v7bVar.setLayoutParams(marginLayoutParams);
        v7bVar.setOnTouchListener(new ml1(1, this));
    }
}
