package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yue implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ i40 c;
    public final /* synthetic */ eve d;

    public yue(eve eveVar, View view, i40 i40Var) {
        this.d = eveVar;
        this.b = view;
        this.c = i40Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList = new ArrayList();
        eve eveVar = this.d;
        Iterator it = eveVar.Z.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View view = this.b;
            if (vfi.d(view, str) == null) {
                return false;
            }
            arrayList.add(vfi.d(view, str));
        }
        if (this.a) {
            return false;
        }
        this.a = true;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            cve.a(view2, new tv8(eveVar, view2, this.b, this, this.c, 2));
        }
        return false;
    }
}
