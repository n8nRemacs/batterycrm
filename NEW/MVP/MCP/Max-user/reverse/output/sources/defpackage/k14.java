package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class k14 extends mid {
    public static final int[] G0 = {-16239405, -16737808};
    public static final int[] H0 = {-11664148, -7436801};
    public final b14 E0;
    public final ii0 F0;

    public k14(Context context, b14 b14Var) {
        ii0 ii0Var = (ii0) bi0.a.getAccessor().c(155);
        r1b r1bVar = new r1b(context, 0);
        super(r1bVar);
        this.E0 = b14Var;
        this.F0 = ii0Var;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float f = 12;
        marginLayoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        r1bVar.setLayoutParams(marginLayoutParams);
    }
}
