package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* loaded from: classes2.dex */
public final class l44 extends FrameLayout implements u6g {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l44(ContextMenuPopupWindow contextMenuPopupWindow, LayoutInflater layoutInflater, Context context) {
        boolean z;
        super(context);
        this.a = contextMenuPopupWindow;
        setClickable(true);
        f8j.d(this, 300L, new j6(22, contextMenuPopupWindow));
        yy7[] yy7VarArr = ContextMenuPopupWindow.u0;
        q6c q6cVar = new q6c(layoutInflater.getContext(), contextMenuPopupWindow.z0());
        q6cVar.setId(ContextMenuPopupWindow.v0);
        Bundle bundle = contextMenuPopupWindow.getArgs().getBundle("actions");
        List listB = bundle != null ? g6j.b(bundle) : null;
        List list = hd5.a;
        listB = listB == null ? list : listB;
        if (listB.isEmpty()) {
            z = false;
        } else {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (((b44) it.next()).d != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        s5g s5gVar = (s5g) ((Parcelable) yvi.a(contextMenuPopupWindow.getArgs(), "header", s5g.class));
        int i = -2;
        if (s5gVar != null) {
            k44 k44Var = new k44(s5gVar, contextMenuPopupWindow, q6cVar.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f = 12;
            layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
            layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
            layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
            layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
            q6cVar.addView(k44Var, layoutParams);
        }
        Bundle bundle2 = contextMenuPopupWindow.getArgs().getBundle("actions");
        List listB2 = bundle2 != null ? g6j.b(bundle2) : null;
        for (b44 b44Var : listB2 != null ? listB2 : list) {
            int i2 = i;
            p6c p6cVar = new p6c(q6cVar.getContext(), contextMenuPopupWindow.z0());
            s5g s5gVar2 = b44Var.b;
            Integer num = b44Var.d;
            p6cVar.c(p6cVar, s5gVar2, b44Var.c, num != null, z);
            p6cVar.b(num, b44Var.e);
            f8j.d(p6cVar, 300L, new ub(contextMenuPopupWindow, 21, b44Var));
            q6cVar.addView(p6cVar, -1, i2);
            i = i2;
        }
        addView(q6cVar, new FrameLayout.LayoutParams(kti.d(250 * vw4.d().getDisplayMetrics().density), i, 51));
        onThemeChanged(ContextMenuPopupWindow.y0(contextMenuPopupWindow));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ContextMenuPopupWindow contextMenuPopupWindow = this.a;
        if (contextMenuPopupWindow.getArgs().getBoolean("dim")) {
            setBackgroundColor(ContextMenuPopupWindow.y0(contextMenuPopupWindow).b().f);
        }
    }
}
