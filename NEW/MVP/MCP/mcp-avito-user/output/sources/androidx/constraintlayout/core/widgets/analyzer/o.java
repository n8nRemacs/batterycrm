package androidx.constraintlayout.core.widgets.analyzer;

import androidx.appcompat.app.r;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f43539f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f43540a;

    /* renamed from: b, reason: collision with root package name */
    public int f43541b;

    /* renamed from: c, reason: collision with root package name */
    public int f43542c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a> f43543d;

    /* renamed from: e, reason: collision with root package name */
    public int f43544e;

    /* compiled from: WidgetGroup.java */
    public class a {
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f43540a.size();
        if (this.f43544e != -1 && size > 0) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                o oVar = arrayList.get(i12);
                if (this.f43544e == oVar.f43541b) {
                    c(this.f43542c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.e eVar, int i12) {
        int iN2;
        int iN3;
        ArrayList<ConstraintWidget> arrayList = this.f43540a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).f43424V;
        eVar.t();
        dVar.e(eVar, false);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList.get(i13).e(eVar, false);
        }
        if (i12 == 0 && dVar.f43579D0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, eVar, arrayList, 0);
        }
        if (i12 == 1 && dVar.f43580E0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, eVar, arrayList, 1);
        }
        try {
            eVar.p();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        this.f43543d = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ConstraintWidget constraintWidget = arrayList.get(i14);
            a aVar = new a();
            new WeakReference(constraintWidget);
            androidx.constraintlayout.core.e.n(constraintWidget.f43412J);
            androidx.constraintlayout.core.e.n(constraintWidget.f43413K);
            androidx.constraintlayout.core.e.n(constraintWidget.f43414L);
            androidx.constraintlayout.core.e.n(constraintWidget.f43415M);
            androidx.constraintlayout.core.e.n(constraintWidget.f43416N);
            this.f43543d.add(aVar);
        }
        if (i12 == 0) {
            iN2 = androidx.constraintlayout.core.e.n(dVar.f43412J);
            iN3 = androidx.constraintlayout.core.e.n(dVar.f43414L);
            eVar.t();
        } else {
            iN2 = androidx.constraintlayout.core.e.n(dVar.f43413K);
            iN3 = androidx.constraintlayout.core.e.n(dVar.f43415M);
            eVar.t();
        }
        return iN3 - iN2;
    }

    public final void c(int i12, o oVar) {
        Iterator<ConstraintWidget> it = this.f43540a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ArrayList<ConstraintWidget> arrayList = oVar.f43540a;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            int i13 = oVar.f43541b;
            if (i12 == 0) {
                next.f43466s0 = i13;
            } else {
                next.f43468t0 = i13;
            }
        }
        this.f43544e = oVar.f43541b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i12 = this.f43542c;
        sb2.append(i12 == 0 ? "Horizontal" : i12 == 1 ? "Vertical" : i12 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strI = AK.c.i(this.f43541b, "] <", sb2);
        Iterator<ConstraintWidget> it = this.f43540a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            StringBuilder sbZ = r.z(strI, " ");
            sbZ.append(next.f43450k0);
            strI = sbZ.toString();
        }
        return r.q(strI, " >");
    }
}
