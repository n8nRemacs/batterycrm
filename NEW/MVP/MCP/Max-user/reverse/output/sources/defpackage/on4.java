package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class on4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ un4 c;

    public /* synthetic */ on4(un4 un4Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = un4Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    un4 un4Var = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        un4Var.m.remove(arrayList);
                        break;
                    } else {
                        tn4 tn4Var = (tn4) it.next();
                        mid midVar = tn4Var.a;
                        int i = tn4Var.b;
                        int i2 = tn4Var.c;
                        int i3 = tn4Var.d;
                        int i4 = tn4Var.e;
                        un4Var.getClass();
                        View view = midVar.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        un4Var.p.add(midVar);
                        viewPropertyAnimatorAnimate.setDuration(un4Var.f()).setListener(new qn4(un4Var, midVar, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    un4 un4Var2 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        un4Var2.l.remove(arrayList2);
                        break;
                    } else {
                        mid midVar2 = (mid) it2.next();
                        un4Var2.getClass();
                        View view2 = midVar2.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        un4Var2.o.add(midVar2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(un4Var2.c).setListener(new pn4(un4Var2, midVar2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
