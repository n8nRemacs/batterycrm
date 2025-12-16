package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC22740f;
import androidx.constraintlayout.motion.widget.C22737c;
import androidx.constraintlayout.motion.widget.C22741g;
import androidx.constraintlayout.motion.widget.F;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.motion.widget.w;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MotionEffect.java */
/* loaded from: classes.dex */
public class d extends q {
    @Override // androidx.constraintlayout.motion.widget.q
    public final void s(MotionLayout motionLayout, HashMap<View, p> map) {
        w wVar;
        View[] viewArrK = k((ConstraintLayout) getParent());
        if (viewArrK == null) {
            C22737c.a();
            return;
        }
        C22741g c22741g = new C22741g();
        C22741g c22741g2 = new C22741g();
        c22741g.g(Float.valueOf(0.0f), "alpha");
        c22741g2.g(Float.valueOf(0.0f), "alpha");
        c22741g.f43887a = 0;
        c22741g2.f43887a = 0;
        j jVar = new j();
        jVar.f43887a = 0;
        jVar.f43938o = 0;
        jVar.g(0, "percentX");
        jVar.g(0, "percentY");
        j jVar2 = new j();
        jVar2.f43887a = 0;
        jVar2.f43938o = 0;
        jVar2.g(1, "percentX");
        jVar2.g(1, "percentY");
        for (View view : viewArrK) {
            p pVar = map.get(view);
            if (pVar != null) {
                pVar.c();
                pVar.f();
                if (pVar.d() - pVar.g() <= 0.0f && (wVar = motionLayout.f43807b) != null) {
                    Iterator<F> it = wVar.f44069q.f43778b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            F next = it.next();
                            if (next.f43743a == 0) {
                                ArrayList<AbstractC22740f> arrayList = next.f43748f.f43928a.get(-1);
                                if (arrayList != null) {
                                    pVar.f44027w.addAll(arrayList);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
