package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g1f extends PopupWindow {
    public final ArrayList a;
    public final wu7 b;

    public g1f(Context context, boolean z, ArrayList arrayList, wu7 wu7Var) {
        boolean z2;
        this.a = arrayList;
        this.b = wu7Var;
        setHeight(-2);
        setWidth(kti.d(250 * vw4.d().getDisplayMetrics().density));
        setElevation(vw4.d().getDisplayMetrics().density * 12.0f);
        setOutsideTouchable(true);
        setFocusable(true);
        q6c q6cVar = new q6c(context, z);
        if (arrayList.isEmpty()) {
            z2 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((f1f) it.next()).d != null) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            f1f f1fVar = (f1f) it2.next();
            p6c p6cVar = new p6c(context, z);
            s5g s5gVar = f1fVar.b;
            Integer num = f1fVar.d;
            p6cVar.c(p6cVar, s5gVar, f1fVar.c, num != null, z2);
            p6cVar.b(num, f1fVar.e);
            f8j.d(p6cVar, 300L, new wfe(this, 9, f1fVar));
            q6cVar.addView(p6cVar, -1, -2);
        }
        setContentView(q6cVar);
    }
}
