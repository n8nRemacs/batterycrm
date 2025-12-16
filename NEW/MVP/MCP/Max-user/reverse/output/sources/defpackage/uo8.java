package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public abstract class uo8 {
    public static final int a = kti.d(114 * vw4.d().getDisplayMetrics().density);
    public static final int b = kti.d(48 * vw4.d().getDisplayMetrics().density);

    public static final SimpleDraweeView a(Context context, k18 k18Var, t86 t86Var) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(wyc.oneme_location_map_logo_view);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        simpleDraweeView.setPadding(iD, iD2, iD, iD2);
        ((gr6) simpleDraweeView.getHierarchy()).h(tyd.f);
        b(simpleDraweeView, context, t86Var);
        f8j.d(simpleDraweeView, 300L, new kg6(context, 11, k18Var));
        return simpleDraweeView;
    }

    public static final void b(SimpleDraweeView simpleDraweeView, Context context, t86 t86Var) {
        String str = null;
        if (a93.s0.x(context).l()) {
            if (t86Var != null) {
                str = (String) t86Var.e;
            }
        } else if (t86Var != null) {
            str = (String) t86Var.d;
        }
        if (str == null || vmf.F(str)) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        c2c c2cVarA = zk6.a.a();
        if (str.isEmpty()) {
            c2cVarA.b = rf7.b(str);
        } else {
            c2cVarA.c(Uri.parse(str));
        }
        c2cVarA.i = simpleDraweeView.getController();
        simpleDraweeView.setController(c2cVarA.a());
        simpleDraweeView.setVisibility(0);
    }
}
