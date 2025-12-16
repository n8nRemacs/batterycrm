package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ueh implements View.OnApplyWindowInsetsListener {
    public g4i a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ zua c;

    public ueh(View view, zua zuaVar) {
        this.b = view;
        this.c = zuaVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        g4i g4iVarH = g4i.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        zua zuaVar = this.c;
        if (i < 30) {
            veh.a(windowInsets, this.b);
            if (g4iVarH.equals(this.a)) {
                return zuaVar.I(view, g4iVarH).g();
            }
        }
        this.a = g4iVarH;
        g4i g4iVarI = zuaVar.I(view, g4iVarH);
        if (i >= 30) {
            return g4iVarI.g();
        }
        WeakHashMap weakHashMap = hfh.a;
        teh.c(view);
        return g4iVarI.g();
    }
}
